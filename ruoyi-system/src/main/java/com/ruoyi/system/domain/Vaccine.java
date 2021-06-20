package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 vaccine
 * 
 * @author ruoyi
 * @date 2021-05-29
 */
public class Vaccine extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Long id;

    /** 疫苗种类 */
    @Excel(name = "疫苗种类")
    private String vaccine;

    /** 接种人 */
    @Excel(name = "接种人")
    private String staffName;

    /** 禽畜耳标 */
    @Excel(name = "禽畜耳标")
    private String stockNumber;

    /** 接种时间 */
    @Excel(name = "接种时间")
    private String time;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setVaccine(String vaccine) 
    {
        this.vaccine = vaccine;
    }

    public String getVaccine() 
    {
        return vaccine;
    }
    public void setStaffName(String staffName) 
    {
        this.staffName = staffName;
    }

    public String getStaffName() 
    {
        return staffName;
    }
    public void setStockNumber(String stockNumber) 
    {
        this.stockNumber = stockNumber;
    }

    public String getStockNumber() 
    {
        return stockNumber;
    }
    public void setTime(String time) 
    {
        this.time = time;
    }

    public String getTime() 
    {
        return time;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vaccine", getVaccine())
            .append("staffName", getStaffName())
            .append("stockNumber", getStockNumber())
            .append("time", getTime())
            .toString();
    }
}
