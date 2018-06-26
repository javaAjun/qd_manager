package com.palmble.qd_manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palmble.qd_manager.dal.PolicyInfoMapper;
import com.palmble.qd_manager.model.PolicyInfo;
import com.palmble.qd_manager.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {
	
	@Autowired
	private PolicyInfoMapper policyInfoMapper;

	public PolicyInfo selectByPrimaryKey(Long id) {
		return policyInfoMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<PolicyInfo> getAllPolict() {
		return policyInfoMapper.getAllPolicy();
	}
}
