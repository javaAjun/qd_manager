package com.palmble.qd_manager.service.impl;

import org.springframework.stereotype.Service;

import com.palmble.qd_manager.dal.PolicyInfoMapper;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	private PolicyInfoMapper policyInfoMapper;

	public PolicyInfo selectByPrimaryKey(Long id) {
		return policyInfoMapper.selectByPrimaryKey(id);
	}
}
