package com.iyunhe.test;

import static org.junit.jupiter.api.Assertions.*;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.jupiter.api.Test;

class Test3 {

	@Test
	void test() {
		
		
ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
		
		//通过流程驱动创建对应的service
		
		po.getRepositoryService().createDeployment().name("报销单审批流程").addClasspathResource("MyProcess.bpmn").addClasspathResource("MyProcess.png").deploy();
		
		
		
		
	}

}
