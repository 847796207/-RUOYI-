package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Vaccine;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2021-05-29
 */
public interface VaccineMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public Vaccine selectVaccineById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vaccine 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Vaccine> selectVaccineList(Vaccine vaccine);

    /**
     * 新增【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    public int insertVaccine(Vaccine vaccine);

    /**
     * 修改【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    public int updateVaccine(Vaccine vaccine);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteVaccineById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVaccineByIds(String[] ids);
}
