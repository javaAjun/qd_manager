package com.palmble.qd_manager.service;

import java.util.List;

import com.palmble.qd_manager.model.PolicyInfo;

public interface PolicyService {
	PolicyInfo selectByPrimaryKey(Long id);

	List<PolicyInfo> getAllPolict();
}
