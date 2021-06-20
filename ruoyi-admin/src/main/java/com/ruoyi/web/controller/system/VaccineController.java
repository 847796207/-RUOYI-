package com.ruoyi.web.controller.system;

import java.util.List;
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
import com.ruoyi.system.domain.Vaccine;
import com.ruoyi.system.service.IVaccineService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2021-05-29
 */
@Controller
@RequestMapping("/system/vaccine")
public class VaccineController extends BaseController
{
    private String prefix = "system/vaccine";

    @Autowired
    private IVaccineService vaccineService;

    @RequiresPermissions("system:vaccine:view")
    @GetMapping()
    public String vaccine()
    {
        return prefix + "/vaccine";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:vaccine:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Vaccine vaccine)
    {
        startPage();
        List<Vaccine> list = vaccineService.selectVaccineList(vaccine);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:vaccine:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Vaccine vaccine)
    {
        List<Vaccine> list = vaccineService.selectVaccineList(vaccine);
        ExcelUtil<Vaccine> util = new ExcelUtil<Vaccine>(Vaccine.class);
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
    @RequiresPermissions("system:vaccine:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Vaccine vaccine)
    {
        return toAjax(vaccineService.insertVaccine(vaccine));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Vaccine vaccine = vaccineService.selectVaccineById(id);
        mmap.put("vaccine", vaccine);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:vaccine:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Vaccine vaccine)
    {
        return toAjax(vaccineService.updateVaccine(vaccine));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:vaccine:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vaccineService.deleteVaccineByIds(ids));
    }
}
