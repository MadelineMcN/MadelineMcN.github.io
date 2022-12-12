package app;

public class Task {
	
	private String taskId;
    private String taskName;
    private String taskDescription;


    //creates task object for data structure
    public Task(String id, String name, String description) {

		//Does not create object & throws exeption if Id is not valid
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
    
	//sets task name in task object
    public void setTaskName(String name) {
    	if (name == null || name.length() > 20) {
    	      throw new IllegalArgumentException("Error:Task name is invalid.");
    	} 
    	else {
    	      this.taskName = name;
    	    }
    }
    
	//sets task description in task object
    public void setDescription(String desc) {
    	if (desc == null || desc.length() > 50) {
    		throw new IllegalArgumentException("Error: Invalid Description");
    
    	}
    	else {
    		this.taskDescription = desc;
    	}
    }

	//sets task id in task object
    public void setTaskId(String id) {
    	if (id == null || id.length() > 10) {
    	      throw new IllegalArgumentException("Error: Invalid task id");
    	} 
    	else {
    	      this.taskId = id;
    	      }
    	}
    
	//retrieves task id from data structure
    public String getTaskId() {
    	return taskId;
    }
    
	//retrieves task name from data structure
    public String getTaskName() {
    	return taskName;
    
    }

	//retrieves task description from data structure
    public String getTaskDescription() {
    	return taskDescription;
    }
    
    
    }
