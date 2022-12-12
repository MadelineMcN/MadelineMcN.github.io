package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Task;
import app.TaskService;

class TaskServiceTest {
	TaskService taskService = new TaskService();
	Task task = new Task("12345", "Testing", "test description");

	//Adds task
	@Test
	void testTaskServiceAdd() {
		assertEquals(true, taskService.addTask(task));
		
	}
	
	//Adds multiple tasks
	@Test
	void testTaskServiceMultipleTasks() {
		Task task1 = new Task("54321", "Task Name", "notes n such");
		taskService.addTask(task);
		assertEquals(true, taskService.addTask(task1));
		
		
	}
	
	//updates name
	@Test
	void testTaskServiceUpdateName() {
		taskService.addTask(task);
		assertEquals(true, taskService.updateTaskName("12345", "New name"));
	
		
	}
	
	//incorrect id - update name, assert false
	@Test
	void testTaskServiceUpdateNameWrongId() {
		taskService.addTask(task);
		assertEquals(false, taskService.updateTaskName("1234567", "New name"));
	

	}
	
	
	//updates description
	@Test
	void testTaskServiceUpdateDescription() {
		taskService.addTask(task);
		assertEquals(true, taskService.updateDescription("12345", "New Description"));
	}
	
	//incorrect id - update description, assert false
	@Test
	void testTaskServiceUpdateDescriptionWrongId() {
		taskService.addTask(task);
		assertEquals(false, taskService.updateDescription("123456", "New Description"));
	}
	
	
	
	//verifies no duplicate id when adding
	@Test
	void testTaskServiceNoDuplicateIds() {
		taskService.addTask(task);
		Task newTask = new Task("12345", "Name One", "Description One");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			taskService.addTask(newTask);
		});
	}
	
	//Delete Task
	@Test
	void testTaskServiceDeleteTask() {
		taskService.addTask(task);
		assertEquals(true, taskService.deleteTask("12345"));
	}
	

}