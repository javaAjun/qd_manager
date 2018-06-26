package com.palmble.qd_manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.palmble.qd_manager.dal")
@SpringBootApplication(scanBasePackages = "com.palmble.qd_manager")
public class QdApp 
{
   public static void main(String[] args) throws Exception {
	SpringApplication.run(QdApp.class, args);
}

}
