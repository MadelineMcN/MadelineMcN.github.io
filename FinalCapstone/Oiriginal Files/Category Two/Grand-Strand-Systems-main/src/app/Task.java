package app;

public class Task {
	
	private String taskId;
    private String taskName;
    private String taskDescription;
    
    public Task(String id, String name, String description) {
    	if (id == null || id.length() > 10) {
  	      throw new IllegalArgumentException("Error: Invalid task id");
    	}
    	if (description == null || description.length() > 50) {
    		throw new IllegalArgumentException("Error: Invalid Description");
    	}
    	
    	if (name == null || name.length() > 20) {
  	      throw new IllegalArgumentException("Error:Task name is invalid.");
    	}
   
    	this.setTaskId(id);
    	this.setTaskName(name);
    	this.setDescription(description);
    }
    
    public void setTaskName(String name) {
    	if (name == null || name.length() > 20) {
    	      throw new IllegalArgumentException("Error:Task name is invalid.");
    	} 
    	else {
    	      this.taskName = name;
    	    }
    }
    
    public void setDescription(String desc) {
    	if (desc == null || desc.length() > 50) {
    		throw new IllegalArgumentException("Error: Invalid Description");
    
    	}
    	else {
    		this.taskDescription = desc;
    	}
    }

    public void setTaskId(String id) {
    	if (id == null || id.length() > 10) {
    	      throw new IllegalArgumentException("Error: Invalid task id");
    	} 
    	else {
    	      this.taskId = id;
    	      }
    	}
    
    public String getTaskId() {
    	return taskId;
    }
    
    public String getTaskName() {
    	return taskName;
    
    }
    public String getTaskDescription() {
    	return taskDescription;
    }
    
    
    }
