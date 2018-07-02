package com.palmble.qd_manager.service;

import java.util.List;

import com.palmble.qd_manager.model.PolicyInfo;

public interface PolicyService {
	PolicyInfo selectByPrimaryKey(Long id);
    int deleteByPrimaryKey(Long id);

    int insert(PolicyInfo record);

    int insertSelective(PolicyInfo record);

    int updateByPrimaryKeySelective(PolicyInfo record);

    int updateByPrimaryKey(PolicyInfo record);
	List<PolicyInfo> getAllPolicy();
}
