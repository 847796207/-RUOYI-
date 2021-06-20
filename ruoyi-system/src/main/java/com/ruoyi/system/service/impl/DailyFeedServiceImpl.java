package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.DailyFeedMapper;
import com.ruoyi.system.domain.DailyFeed;
import com.ruoyi.system.service.IDailyFeedService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
@Service
public class DailyFeedServiceImpl implements IDailyFeedService 
{
    @Autowired
    private DailyFeedMapper dailyFeedMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public DailyFeed selectDailyFeedById(Long id)
    {
        return dailyFeedMapper.selectDailyFeedById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<DailyFeed> selectDailyFeedList(DailyFeed dailyFeed)
    {
        return dailyFeedMapper.selectDailyFeedList(dailyFeed);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertDailyFeed(DailyFeed dailyFeed)
    {
        return dailyFeedMapper.insertDailyFeed(dailyFeed);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param dailyFeed 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateDailyFeed(DailyFeed dailyFeed)
    {
        return dailyFeedMapper.updateDailyFeed(dailyFeed);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteDailyFeedByIds(String ids)
    {
        return dailyFeedMapper.deleteDailyFeedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteDailyFeedById(Long id)
    {
        return dailyFeedMapper.deleteDailyFeedById(id);
    }
}
