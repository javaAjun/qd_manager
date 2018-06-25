package com.palmble.qd_manager.service;

import com.palmble.qd_manager.model.PolicyInfo;

public interface PolicyService {
	PolicyInfo selectByPrimaryKey(Long id);
}
