package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 daily_feed
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
public class DailyFeed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feedNumber;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String feedTime;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String food;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String newWeight;

    public void setFeedNumber(String feedNumber) 
    {
        this.feedNumber = feedNumber;
    }

    public String getFeedNumber() 
    {
        return feedNumber;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setFeedTime(String feedTime) 
    {
        this.feedTime = feedTime;
    }

    public String getFeedTime() 
    {
        return feedTime;
    }
    public void setFood(String food) 
    {
        this.food = food;
    }

    public String getFood() 
    {
        return food;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNewWeight(String newWeight) 
    {
        this.newWeight = newWeight;
    }

    public String getNewWeight() 
    {
        return newWeight;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("feedNumber", getFeedNumber())
            .append("name", getName())
            .append("feedTime", getFeedTime())
            .append("food", getFood())
            .append("id", getId())
            .append("newWeight", getNewWeight())
            .toString();
    }
}
