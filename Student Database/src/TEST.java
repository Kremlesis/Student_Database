
public class TEST {
	public static void main(String[] args)
	{
		LL<Number> lis = new LL<Number>();
		for(int i=0;i<10;i++)
			lis.add(i);
		
		//lis.print_list();
		//GradeInfo_.LetterGrade c = GradeInfo_.LetterGrade.valueOf("A");
		
		course_info dum = new course_info("col", "106", "I");
		System.out.println(dum.coursetitle());
		info_grade dum1 = (info_grade)(dum.grade());
		System.out.println(dum1.gradepoint(dum1.ret()));

		System.out.println(dum1.ret() == GradeInfo_.LetterGrade.valueOf("I"));
		//System.out.println(info_grade.gradepoint(c));
		
	
	}

}
