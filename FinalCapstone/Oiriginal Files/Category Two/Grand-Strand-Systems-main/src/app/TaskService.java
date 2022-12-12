package app;

import java.util.ArrayList;

public class TaskService {
	//array list of tasks
	ArrayList<Task> tasks;
	
	public TaskService() {
		tasks = new ArrayList<>();
	}
	
	//Add Tasks vis Unique Id
	public boolean addTask(Task newTask) {
		boolean contains = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(newTask.getTaskId())) {
				contains = true;
				break;
			}
		}
		if (!contains) {
		 tasks.add(newTask);
		 return true;
			
		} else {
			throw new IllegalArgumentException("Task id is a duplicate");
		}
	}
	
	//Deletes Task via task id
	public boolean deleteTask(String taskId) {
		boolean deleted = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				tasks.remove(task);
				deleted = true;
				break;
			}
		}
		return deleted;
	}
	
	//Update Name via task Id
	public boolean updateTaskName (String taskId, String newName) {
		boolean updated = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				task.setTaskName(newName);
				updated = true;
				break;
			}
		}
		return updated;
	}
	
	
	//Update Description via task Id
	public boolean updateDescription (String taskId, String newDescr) {
		boolean updated = false;
		for (Task task : tasks) {
			if (task.getTaskId().equals(taskId)) {
				task.setDescription(newDescr);
				updated = true;
				break;
			}
	}
return updated;
	}
}