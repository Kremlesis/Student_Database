
import java.util.Iterator;
import java.io.*;

public class Departments implements Entity_ {
	private String name1;
	private LL<Student_> list_of_students = new LL<Student_>();
	private int size_stud;
	
	Departments(String name2)
	{
		name1 = name2;
		size_stud=0;
	}
	
	public void add(Student_ s)
	{
		list_of_students.add(s);
		size_stud++;
	}
	
	public int s_stud()
	{
		return size_stud;
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
}
