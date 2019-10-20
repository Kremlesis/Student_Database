
public class info_grade implements GradeInfo_{

		public LetterGrade grade_in_course;
		info_grade(LetterGrade a) {grade_in_course = a;}
		 public static int gradepoint(LetterGrade grade)// Returns the points earned for each letter grade
			{

				if (grade == LetterGrade.A) return 10;

				else if (grade == LetterGrade.Aminus) return 9;

				else if (grade == LetterGrade.B) return 8;

				else if (grade == LetterGrade.Bminus) return 7;

				else if (grade == LetterGrade.C) return 6;

				else if (grade == LetterGrade.Cminus) return 5;

				else if (grade == LetterGrade.D) return 4;

				else return 0;

			}
		 public LetterGrade ret()
		 {
			 return grade_in_course;
		 }

}