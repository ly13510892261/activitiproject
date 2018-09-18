package com.iyunhe.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.task.Task;
import org.junit.Test;

public class test03 {

	
	//部署流程
	@Test
	public void test() {
	ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		//通过流程驱动创建对应的service
		po.getRepositoryService().createDeployment().name("报销单审批流程").addClasspathResource("MyProcess.bpmn").
		addClasspathResource("MyProcess.png").deploy();	
	}
	
	
	//启动流程
	@Test
	public void test1() {
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
			po.getRuntimeService().startProcessInstanceByKey("myprocess");
		
		
		}
	
	//根据处理人查询相关任务就是根据审批的那个人查询审批任务
	@Test
	public void test2() {
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
			List<Task> task=po.getTaskService().createTaskQuery().taskAssignee("武则天").list();
		
			for (Task task2 : task) {
				//5004
				System.out.println("任务id"+task2.getId());
				System.out.println("实例化id"+task2.getProcessInstanceId());
			}
			
			
			
		}
	
	
	//完成任务(根据任务id来查询)
	@Test
	public void test3() {
		
		ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
		
			
		po.getTaskService().complete("7502");
		}
	
	
	//完成任务(根据实例id来查询)
		@Test
		public void test4() {
			
			ProcessEngine  po=ProcessEngines.getDefaultProcessEngine();
			
				
			po.getRuntimeService().createProcessInstanceQuery().processInstanceId("2501");
			}

}
