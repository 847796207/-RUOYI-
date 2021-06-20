package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.DailyFeed;
import com.ruoyi.system.service.IDailyFeedService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
@Controller
@RequestMapping("/system/feed")
public class DailyFeedController extends BaseController {
    private String prefix = "system/feed";

    @Autowired
    private IDailyFeedService dailyFeedService;

    @RequiresPermissions("system:feed:view")
    @GetMapping()
    public String feed() {
        return prefix + "/feed";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:feed:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(DailyFeed dailyFeed) {
        startPage();
        List<DailyFeed> list = dailyFeedService.selectDailyFeedList(dailyFeed);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:feed:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DailyFeed dailyFeed) {
        List<DailyFeed> list = dailyFeedService.selectDailyFeedList(dailyFeed);
        ExcelUtil<DailyFeed> util = new ExcelUtil<DailyFeed>(DailyFeed.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:feed:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(DailyFeed dailyFeed) {
        return toAjax(dailyFeedService.insertDailyFeed(dailyFeed));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        DailyFeed dailyFeed = dailyFeedService.selectDailyFeedById(id);
        mmap.put("dailyFeed", dailyFeed);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:feed:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(DailyFeed dailyFeed) {
        return toAjax(dailyFeedService.updateDailyFeed(dailyFeed));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:feed:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(dailyFeedService.deleteDailyFeedByIds(ids));
    }



    @PostMapping("/chart")
    @ResponseBody
    public List<DailyFeed> graph(DailyFeed dailyFeed) {
        List<DailyFeed> list = dailyFeedService.selectDailyFeedList(dailyFeed);
        return list;
    }
}