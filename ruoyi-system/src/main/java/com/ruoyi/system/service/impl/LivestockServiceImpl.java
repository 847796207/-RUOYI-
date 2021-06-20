package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LivestockMapper;
import com.ruoyi.system.domain.Livestock;
import com.ruoyi.system.service.ILivestockService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
@Service
public class LivestockServiceImpl implements ILivestockService 
{
    @Autowired
    private LivestockMapper livestockMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Livestock selectLivestockById(Integer id)
    {
        return livestockMapper.selectLivestockById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param livestock 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Livestock> selectLivestockList(Livestock livestock)
    {
        return livestockMapper.selectLivestockList(livestock);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param livestock 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLivestock(Livestock livestock)
    {
        return livestockMapper.insertLivestock(livestock);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param livestock 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLivestock(Livestock livestock)
    {
        return livestockMapper.updateLivestock(livestock);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLivestockByIds(String ids)
    {
        return livestockMapper.deleteLivestockByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteLivestockById(Integer id)
    {
        return livestockMapper.deleteLivestockById(id);
    }
}
