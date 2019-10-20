
import java.util.Iterator;
import java.io.*;

public class student_info implements Student_ {
	private String name,entryNo,hostel,dep;
	private int credit=0,num_of_courses=0;
	private float cgpa;
	private LL<CourseGrade_> list_of_courses = new LL<CourseGrade_>();
	private int course_num;
	
	student_info(String e, String nam, String depc , String hos)
	{
		course_num=0;
		name=nam;
		entryNo= e;
		dep=depc;
		hostel=hos;
	}
	
	public String name() { return name; }               	// Returns student's name
	   public String entryNo() { return entryNo; }            	// Returns student's entry number
	   public String hostel() {return hostel;}             	// Returns student's hostel name
	   public String department() {return dep;}         	// Returns student's department name
	   public String completedCredits() {return String.valueOf(3*num_of_courses); }    	// Returns student's credits earned
	   public String cgpa()  { 	return String.valueOf(cgpa); }
	
	// ASSUMNING E F TO BE PASSED.
	   
	  public void add(CourseGrade_ C)
	  {
		  course_num++;
		  list_of_courses.add(C);
		  info_grade dum1 = (info_grade)(C.grade());
		  int cg_in_course = (dum1.gradepoint(dum1.ret()));
		  
		  GradeInfo_.LetterGrade damn = GradeInfo_.LetterGrade.valueOf("I");
		  if(damn.equals(dum1.grade_in_course))
			  num_of_courses+=0;
		
		  else
			  num_of_courses+=1;
		  credit+= cg_in_course;
		  if(num_of_courses >0)
		  cgpa = (float)credit/num_of_courses;
		  cgpa = (float) Math.round(cgpa * 100) / 100;
	  }
	  public int num_course()
	  {
		  return course_num;
	  }
	  
	  public Iterator<CourseGrade_> courseList()
	  {
		  myIterator<CourseGrade_> damn2 = new myIterator<CourseGrade_> ((Node<CourseGrade_>)list_of_courses.head_ret());
		  return damn2;
	  }

}
