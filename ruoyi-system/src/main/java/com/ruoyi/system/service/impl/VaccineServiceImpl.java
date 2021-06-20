package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VaccineMapper;
import com.ruoyi.system.domain.Vaccine;
import com.ruoyi.system.service.IVaccineService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-29
 */
@Service
public class VaccineServiceImpl implements IVaccineService 
{
    @Autowired
    private VaccineMapper vaccineMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Vaccine selectVaccineById(Long id)
    {
        return vaccineMapper.selectVaccineById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param vaccine 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Vaccine> selectVaccineList(Vaccine vaccine)
    {
        return vaccineMapper.selectVaccineList(vaccine);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVaccine(Vaccine vaccine)
    {
        return vaccineMapper.insertVaccine(vaccine);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param vaccine 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVaccine(Vaccine vaccine)
    {
        return vaccineMapper.updateVaccine(vaccine);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVaccineByIds(String ids)
    {
        return vaccineMapper.deleteVaccineByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteVaccineById(Long id)
    {
        return vaccineMapper.deleteVaccineById(id);
    }
}
