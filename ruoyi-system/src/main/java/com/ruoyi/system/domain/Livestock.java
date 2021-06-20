package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 livestock
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
public class Livestock extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 编号 */
    private Integer id;

    /** 体重 */
    @Excel(name = "体重")
    private String weight;

    /** 所属区域 */
    @Excel(name = "所属区域")
    private String regin;

    /** 种类 */
    @Excel(name = "种类")
    private String category;

    /** 喂养情况 */
    @Excel(name = "喂养情况")
    private String feed;

    /** 图像地址 */
    @Excel(name = "图像地址")
    private String avater;

    /** 电子耳标 */
    @Excel(name = "电子耳标")
    private String number;

    /** 原产地 */
    @Excel(name = "原产地")
    private String origin;

    /** 疫苗 */
    @Excel(name = "原产地")
    private String vaccine;

    public void setId(Integer id) 
    {
        this.id = id;
    }

    public Integer getId() 
    {
        return id;
    }
    public void setWeight(String weight) 
    {
        this.weight = weight;
    }

    public String getWeight() 
    {
        return weight;
    }
    public void setRegin(String regin) 
    {
        this.regin = regin;
    }

    public String getRegin() 
    {
        return regin;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setFeed(String feed) 
    {
        this.feed = feed;
    }

    public String getFeed() 
    {
        return feed;
    }
    public void setAvater(String avater) 
    {
        this.avater = avater;
    }

    public String getAvater() 
    {
        return avater;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
    {
        return number;
    }
    public void setOrigin(String origin) 
    {
        this.origin = origin;
    }

    public String getOrigin() 
    {
        return origin;
    }

    public void setVaccine(String vaccine)
    {
        this.vaccine = vaccine;
    }

    public String getVaccine()
    {
        return vaccine;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("weight", getWeight())
            .append("regin", getRegin())
            .append("category", getCategory())
            .append("feed", getFeed())
            .append("avater", getAvater())
            .append("number", getNumber())
            .append("origin", getOrigin())
                .append("vaccine", getVaccine())
            .toString();
    }
}
