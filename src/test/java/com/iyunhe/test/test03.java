package com.iyunhe.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;
import org.junit.Test;

public class test03 {

	
	//��������
	@Test
	public void test() {
	ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		//ͨ����������������Ӧ��service
		po.getRepositoryService().createDeployment().name("��������������").addClasspathResource("MyProcess.bpmn").
		addClasspathResource("MyProcess.png").deploy();	
	}
	
	
	//��������
	@Test
	public void test1() {
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
			po.getRuntimeService().startProcessInstanceByKey("myprocess");
		
		
		}
	
	//���ݴ����˲�ѯ���������Ǹ����������Ǹ��˲�ѯ��������
	@Test
	public void test2() {
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
			List<Task> task=po.getTaskService().createTaskQuery().taskAssignee("������").list();
		
			for (Task task2 : task) {
				//5004
				System.out.println("����id"+task2.getId());
				System.out.println("ʵ����id"+task2.getProcessInstanceId());
			}
			
			
			
		}
	
	
	//�������(��������id����ѯ)
	@Test
	public void test3() {
		
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
			
		po.getTaskService().complete("7502");
		}
	
	
	//�������(����ʵ��id����ѯ)
		@Test
		public void test4() {
			
			ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
			
				
			po.getRuntimeService().createProcessInstanceQuery().processInstanceId("2501");
			}

}
