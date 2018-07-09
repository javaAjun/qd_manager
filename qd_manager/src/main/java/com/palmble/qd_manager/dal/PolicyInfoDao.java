package com.palmble.qd_manager.dal;

import java.util.List;
import java.util.Map;

import com.palmble.qd_manager.model.PolicyInfo;

public interface PolicyInfoDao{
    
    int insert(PolicyInfo policyInfo);
    
    int insertFully(PolicyInfo policyInfo);
    
    int deleteById(Long id);
    
    int updateById(PolicyInfo policyInfo);

    int updateFullyById(PolicyInfo policyInfo);
    
    PolicyInfo getById(Long id);
    
    //int startRow, int pageSize, object2map
    List<PolicyInfo> find(Map<String, Object> params);

    int count(Map<String, Object> params);

}