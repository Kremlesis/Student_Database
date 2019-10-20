import java.util.Iterator;
import java.io.*;

public interface Entity_ { // Entities Classes Hostel, Dept, and Course all have this functionality. 
   public String name();               
   public Iterator<Student_> studentList();        // Returns all students of this entity
}