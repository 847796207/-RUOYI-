package com.ruoyi.web.controller.system;

import java.util.List;

import com.ruoyi.system.domain.DailyFeed;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Livestock;
import com.ruoyi.system.service.ILivestockService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
@Controller
@RequestMapping("/system/livestock")
public class LivestockController extends BaseController
{
    private String prefix = "system/livestock";

    @Autowired
    private ILivestockService livestockService;

    @RequiresPermissions("system:livestock:view")
    @GetMapping()
    public String livestock()
    {
        return prefix + "/livestock";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:livestock:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Livestock livestock)
    {
        startPage();
        List<Livestock> list = livestockService.selectLivestockList(livestock);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:livestock:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Livestock livestock)
    {
        List<Livestock> list = livestockService.selectLivestockList(livestock);
        ExcelUtil<Livestock> util = new ExcelUtil<Livestock>(Livestock.class);
        return util.exportExcel(list, "【请填写功能名称】数据");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:livestock:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Livestock livestock)
    {
        return toAjax(livestockService.insertLivestock(livestock));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Livestock livestock = livestockService.selectLivestockById(id);
        mmap.put("livestock", livestock);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:livestock:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Livestock livestock)
    {
        return toAjax(livestockService.updateLivestock(livestock));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:livestock:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(livestockService.deleteLivestockByIds(ids));
    }

    /**
     * 查看详细
     */
    @RequiresPermissions("system:livestock:detail")
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, ModelMap mmap)
    {
        Livestock livestock = livestockService.selectLivestockById(id);
        mmap.put("livestock", livestock);
        return prefix + "/detail";
}
    @PostMapping("/clean")
    @ResponseBody
    public AjaxResult clean()
    {
        return success();
    }


    @PostMapping("/graph_livestock")
    @ResponseBody

    public List<Livestock> DrawGraph(Livestock livestock) {
        List<Livestock> list = livestockService.selectLivestockList(livestock);
        return list;
    }
    @PostMapping("/graph_livestock2")
    @ResponseBody

    public List<Livestock> DrawGraph2(Livestock livestock) {
        List<Livestock> list = livestockService.selectLivestockList(livestock);
        return list;
    }
    @PostMapping("/graph_livestock3")
    @ResponseBody

    public List<Livestock> DrawGraph3(Livestock livestock) {
        List<Livestock> list = livestockService.selectLivestockList(livestock);
        return list;
    }

}



