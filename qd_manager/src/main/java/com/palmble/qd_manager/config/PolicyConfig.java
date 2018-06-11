package com.palmble.qd_manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

import com.palmble.qd_manager.xhpos.StandardPolicy;
import com.palmble.qd_manager.xhpos.StandardPolicyPortType;

@Configuration
@EnableWs
public class PolicyConfig {

	@Bean
	 public StandardPolicyPortType initPolicy() {
		StandardPolicy standardPolicy=new StandardPolicy();
		StandardPolicyPortType standardPolicyPortType=standardPolicy.getPort(StandardPolicyPortType.class);
		return standardPolicyPortType;
	}
}
