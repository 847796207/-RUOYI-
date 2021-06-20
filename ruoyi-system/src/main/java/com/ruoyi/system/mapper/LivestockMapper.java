package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Livestock;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
public interface LivestockMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Livestock selectLivestockById(Integer id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param livestock 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Livestock> selectLivestockList(Livestock livestock);

    /**
     * 新增【请填写功能名称】
     * 
     * @param livestock 【请填写功能名称】
     * @return 结果
     */
    public int insertLivestock(Livestock livestock);

    /**
     * 修改【请填写功能名称】
     * 
     * @param livestock 【请填写功能名称】
     * @return 结果
     */
    public int updateLivestock(Livestock livestock);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteLivestockById(Integer id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLivestockByIds(String[] ids);
}
