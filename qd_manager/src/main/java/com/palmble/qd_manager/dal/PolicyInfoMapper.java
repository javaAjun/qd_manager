package com.palmble.qd_manager.dal;

import com.palmble.qd_manager.model.PolicyInfo;

public interface PolicyInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PolicyInfo record);

    int insertSelective(PolicyInfo record);

    PolicyInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PolicyInfo record);

    int updateByPrimaryKey(PolicyInfo record);
}