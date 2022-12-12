package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import app.Task;

class TaskTest {
	
	
	//happy path, task is created
	@Test
	void testTaskCreated() {
		Task task = new Task("12345", "Testing", "test description");
		assertTrue(task.getTaskId().equals("12345"));
		assertTrue(task.getTaskName().equals("Testing"));
		assertTrue(task.getTaskDescription().equals("test description"));
	}
	
	//task id can not be longer than 10 characters
		@Test
		void testIdCharLimit() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task("44455566677788999", "Testing", "test notes"); 
			});
		}
	
	
	//task id can not be null
		@Test
		void testIdNullCheck() {
			Assertions.assertThrows(IllegalArgumentException.class, () -> {
				new Task(null, "Name", "test notes"); 
			});
		}
			
	
	
	//name can not be longer than 20 characters
		  @Test
		  void testNameCharLimitTest() {
			  Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("1234", "Really really long name test", "test notes"); 
				});
		   
		  }
	
	//name can not be null
		  @Test
		  void testNameNull() {
			  Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("Yikes", null, "test notes"); 
				});
			  
		  }
	
	//description can not be longer than 50 characters
		  @Test
		  void testDescriptionCharLimit() {
			  Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("Yikes", "testing", "Description can not being any longer that 50 characters and can not be null. Otherwise an exception is thrown that reads the error message"); 
				}); 
		  }
	
	
	//description can not be null
		  @Test
		  void testDescriptionNull() {
			  Assertions.assertThrows(IllegalArgumentException.class, () -> {
					new Task("Yikes", "testing", null); 
				});
		  }

}
