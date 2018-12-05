
import java.util.List;

/** Class representing a university  */
public class University implements Serializable  {
    //Id of the university
    String id;
    
    //Name of the university
    String name;
    
    //Location of the university
    String location;
    
    //List of degrees offered by the university
    List<Degree> degreeList;

    //Getters and setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public List<Degree> getDegreeList() {
        return degreeList;
    }
    public void setDegreeList(List<Degree> degreeList) {
        this.degreeList = degreeList;
    }
}