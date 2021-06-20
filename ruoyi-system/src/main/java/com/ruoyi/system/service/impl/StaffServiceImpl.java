package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StaffMapper;
import com.ruoyi.system.domain.Staff;
import com.ruoyi.system.service.IStaffService;
import com.ruoyi.common.core.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-05-13
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public Staff selectStaffById(Long id)
    {
        return staffMapper.selectStaffById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param staff 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Staff> selectStaffList(Staff staff)
    {
        return staffMapper.selectStaffList(staff);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param staff 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertStaff(Staff staff)
    {
        return staffMapper.insertStaff(staff);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param staff 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateStaff(Staff staff)
    {
        return staffMapper.updateStaff(staff);
    }

    /**
     * 删除【请填写功能名称】对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStaffByIds(String ids)
    {
        return staffMapper.deleteStaffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    @Override
    public int deleteStaffById(Long id)
    {
        return staffMapper.deleteStaffById(id);
    }
}
