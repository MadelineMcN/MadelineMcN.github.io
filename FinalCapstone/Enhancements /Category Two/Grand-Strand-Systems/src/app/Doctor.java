package app;

public class Doctor {

    //Initialize Doctor variables
    private String firstName;
    private String lastName;
    private String description;
    private String doctor;

    //Set Doctor variables insidse Doctor object
    public Doctor(String doctorId,String fName,String lName,String desc){
        if (doctorId == null || doctorId.length() > 10) {
            throw new IllegalArgumentException("Error: Invalid doctor id");
        }
        else {
            this.doctor = doctorId;
            this.setFirstName(fName);
            this.setLastName(lName);
            this.setDescription(desc);
        }
    }
    //Setting method to set first name in Doctor service class
    public void setFirstName(String fName) {
        if(fName == null || fName.length() > 10) {
            throw new IllegalArgumentException("Error: First Name too long or null");
        }
        else {
            this.firstName = fName;
        }
    }

    //Setting method to set last name in Doctor service class
    public void setLastName(String lName) {
        if (lName == null || lName.length() > 10) {
            throw new IllegalArgumentException("Error: Last Name too long or null");
        }
        else {
            this.lastName = lName;
        }
    }

    //Setting method to set description in Doctor service class
    public void setDescription(String description) {
        if( description == null || description.length() > 50) {
            throw new IllegalArgumentException("Error: Invalid Text");
        }
        else {
            this.description = description;
        }
    }

    //Getting method to get first name for CRUD operations in service
    public String getFirstName() {
        return this.firstName;
    }

    //Getting method to get last name for CRUD operations in service
    public String getLastName() {
        return this.lastName;
    }

    //Getting method to get description for CRUD operations in service
    public String Description() {
        return this.description;
    }

}



