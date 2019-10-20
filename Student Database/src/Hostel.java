
import java.util.Iterator;
import java.io.*;

public class Hostel implements Entity_ {
	private String name1;
	private LL<Student_> list_of_students = new LL<Student_>();
	private int student_size;
	
	Hostel(String name2)
	{
		name1 = name2;
		student_size=0;
	}
	
	public void add(Student_ s)
	{
		list_of_students.add(s);
		student_size++;
	}
	
	public String name()
	{
		return name1;
	}
	public Iterator<Student_> studentList()
	{
		 myIterator<Student_> damn2 = new myIterator<Student_> ((Node<Student_>)list_of_students.head_ret());
		  return damn2;
	}
	
	public int stud_size()
	{
		return student_size;
	}
}
