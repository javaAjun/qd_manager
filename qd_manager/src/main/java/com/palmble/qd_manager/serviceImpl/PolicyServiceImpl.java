package com.palmble.qd_manager.serviceImpl;

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
	public int deleteByPrimaryKey(Long id) {
		return policyInfoMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(PolicyInfo record) {
		return policyInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(PolicyInfo record) {
		return policyInfoMapper.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(PolicyInfo record) {
		return policyInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(PolicyInfo record) {
		return policyInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<PolicyInfo> getAllPolicy() {
		return policyInfoMapper.getAllPolicy();
	}
}
