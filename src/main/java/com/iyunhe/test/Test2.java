package com.iyunhe.test;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.junit.jupiter.api.Test;


public class Test2 {

	
	
	//��������
	@Test
	void test() {
		
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
		
		//ͨ����������������Ӧ��service
		
		po.getRepositoryService().createDeployment().name("��������������").addClasspathResource("MyProcess.bpmn").addClasspathResource("MyProcess.png").deploy();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
