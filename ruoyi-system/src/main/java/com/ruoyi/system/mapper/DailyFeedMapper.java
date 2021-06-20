package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.DailyFeed;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
public interface DailyFeedMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public DailyFeed selectDailyFeedById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<DailyFeed> selectDailyFeedList(DailyFeed dailyFeed);

    /**
     * 新增【请填写功能名称】
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 结果
     */
    public int insertDailyFeed(DailyFeed dailyFeed);

    /**
     * 修改【请填写功能名称】
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 结果
     */
    public int updateDailyFeed(DailyFeed dailyFeed);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteDailyFeedById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteDailyFeedByIds(String[] ids);
}
