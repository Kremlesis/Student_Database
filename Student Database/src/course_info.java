
public class course_info implements CourseGrade_{
	private String title,num,grade;
	
	course_info(String ti, String nu, String gra)
	{
		title=ti;
		num=nu;
		grade = gra;
	}
//	private GradeInfo_ temp1 = new info_grade(GradeInfo_.LetterGrade.valueOf(grade));
	public String coursetitle() {return title;}   	 // Returns course title 
	   public String coursenum() {return num;}   	 // Returns course code, e.g., COL106 
	  
	   public String coursegrade() {return grade; }
	   
	   public GradeInfo_ grade() {return new info_grade(GradeInfo_.LetterGrade.valueOf(grade));}
	

}
