
import java.util.List;

/** Class modelling a degree programme */
public class Degree {
    //Id of degree programme
    String id;
    
    //Title of degree programme
    String title;
    
    //Description of degree programme
    String description;
    
    //List of students enrolled in a degree.
    List<Student> studentList;
    
    //Staff member in charge of degree.
    Staff programmeLeader;
    
 
    //Getters and setters
    public void setId(String id) {
        this.id = id;    
    }
    public String getId() {    
        return id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public List<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    public Staff getProgrammeLeader() {
        return programmeLeader;
    }
    public void setProgrammeLeader(Staff programmeLeader) {
        this.programmeLeader = programmeLeader;
    }
}


