
import java.util.Iterator;
import java.io.*;

public class Course implements Entity_ {
	private String name1;
	public String title;
	private LL<Student_> list_of_students = new LL<Student_>();
	private int size;
	
	Course(String name2 , String title2)
	{
		title=title2;
		size=0;
		name1 = name2;
	}
	
	public void add(Student_ s)
	{
		size++;
		list_of_students.add(s);
	}
	
	public int damn_size()
	{
		return size;
	}
	public String title()
	{
		return title;
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
