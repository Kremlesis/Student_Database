
import java.util.Iterator;
import java.io.*;


public class Assignment1 {
	private static LL<student_info> ans1 = new LL<student_info>();
	private static LL<Hostel> ans2 = new LL<Hostel>();
	private static LL<Departments> ans3 = new LL<Departments>();
	private static LL<Course> ans4 = new LL<Course>();
	
	  public static void sortStringBubble( String[] arr, int n )
      {        String temp; 
		  
		        // Sorting strings using bubble sort 
		        for (int j = 0; j < n - 1; j++) 
		        { 
		            for (int i = j + 1; i < n; i++)  
		            { 
		                if ((arr[j].compareTo(arr[i])) > 0) 
		                { 
		                    temp = arr[j]; 
		                    arr[j] = arr[i]; 
		                    arr[i] = temp; 
		                } 
		            } 
		        } 
		    
      } 
	private static void getData(String a, String b) throws IOException
	{
			File f1=new File(a);
		//File f1 = new File(System.getProperty("user.dir")+"/"+"student.txt");
		  //Creation of File Descriptor for input file
	      String[] words=null;  //Intialize the word Array
	      FileReader fr = new FileReader(f1);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      String[] damn= new String[4];
	      int count=0;
	     
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	    	  count=0;
	         words=s.split(" ");  //Split the word using space
	          for (String word : words) 
	          {
	                damn[count] = word;
	                count++;
	          }

		      student_info demp1 = new student_info(damn[0],damn[1],damn[2],damn[3]);
		      ans1.add(demp1);
		      
		      Iterator<Position_<Hostel>> iter1 = ans2.positions();
		      boolean flag = true;
		      int counter=0;
		      while(iter1.hasNext() && flag)
		      {
		    	  Hostel x1 = (iter1.next()).value(); 
		    	  String x = x1.name();
		    	  if(x.equals(damn[3]))
		    	  {
		    		  x1.add(demp1);
		    		  flag=false;
		    	  }
		    	  
		      }
		      if(flag)
		      {
		    	  Hostel h1 = new Hostel(damn[3]);
		    	  h1.add(demp1);
		    	  ans2.add(h1);
		      }
		      flag=true;
		      Iterator<Position_<Departments>> iter2 = ans3.positions();
		      while(iter2.hasNext() && flag)
		      {
		    	  Departments d1 = (iter2.next()).value(); 
		    	  String d = d1.name();
		    	  if(d.equals(damn[2]))
		    	  {
		    		  d1.add(demp1);
		    		  flag=false;
		    	  }
		    	  
		      }
		      if(flag)
		      {
		    	  Departments d1 = new Departments(damn[2]);
		    	  d1.add(demp1);
		    	  ans3.add(d1);
		      }
		      
	      }
	      br.close();
	      
	      ////////////////////////////////////////////
	      ///////////////////////////////////////////
	      ///////////////////////////////////////////
	      //////////////////////////////////////////
	      
	/*      Iterator<Position_<Hostel>> it = ans2.positions();
	      
	      while(it.hasNext())
	      {
	    	  Hostel dumm = it.next().value();
	    	  System.out.println(dumm.name());
	    	  Iterator<Student_> it23 = dumm.studentList();
		      
		      while(it23.hasNext())
		      {
		    	  Student_ dumm2 = it23.next();
		    	  System.out.println(dumm2.entryNo ());
		      }
	      }
	  */
	      //  System.out.println(((it.next()).value()).entryNo());
	      
	      
	      ////////////////////////////////////////////////
	      /////////////////////////////////////////////////
	      /////////////////////////////////////////////////
	      ////////////////////////////////////////////////////
	      
	      File f2=new File(b);
			//File f1 = new File(System.getProperty("user.dir")+"/"+"student.txt");
			  //Creation of File Descriptor for input file
		      String[] words2=null;  //Intialize the word Array
		      FileReader fr2 = new FileReader(f2);  //Creation of File Reader object
		      BufferedReader br2 = new BufferedReader(fr2); //Creation of BufferedReader object
		      String s2;     
		      String[] damn2= new String[4];
		      count=0;
		     
		      while((s2=br2.readLine())!=null)   //Reading Content from the file
		      {
		    	  count=0;
		         words2=s2.split(" ");  //Split the word using space
		          for (String word : words2) 
		          {
		        	  if(count>3)
		        		  damn2[3]+= " "+word;
		        	  else
		        		  damn2[count] = word;
		                count++;
		          }
		      
		          CourseGrade_ grade1 = new course_info(damn2[3],damn2[1],damn2[2]);
		         
		          String dum_eno = damn2[0];
		          
		          Iterator<Position_<student_info>> iter100 = ans1.positions();
			      
			      while(iter100.hasNext())
			      {
			    	  student_info dumm_student = (iter100.next()).value();
			    	  if(dum_eno.equals(dumm_student.entryNo()))
			    	  {
			    		  dumm_student.add(grade1);
			    		  Iterator<Position_<Course>> iter11 = ans4.positions();
					      boolean flag = true;
					      while(iter11.hasNext() && flag)
					      {
					    	  Course x1 = (iter11.next()).value(); 
					    	  String x = x1.name();
					    	  if(x.equals(damn2[3]))
					    	  {
					    		  x1.add(dumm_student);
					    		  flag=false;
					    	  }
					    	  
					      }
					      if(flag)
					      {
					    	  Course h1 = new Course(damn2[3],damn2[1]);
					    	  h1.add(dumm_student);
					    	  ans4.add(h1);
					      }
					      break;
			    	  }  
			      }
		          
			     
		          
		      }
		      br2.close();
		      
		      ////////////////////////////////////////////
		      /////////////////////////////////////////////
		      /////////////////////////////////////////////
		      /////////////////////////////////////////////
		      
		     Iterator<Position_<Course>> itit = ans4.positions();
	/*	      
		      while(itit.hasNext())
		      {
		    	  Course dumm = itit.next().value();
		    	  System.out.println(dumm.name());
		    	  Iterator<Student_> it23 = dumm.studentList();
			      
			      while(it23.hasNext())
			      {
			    	  Student_ dumm2 = it23.next();
			    	  System.out.println(dumm2.cgpa()+" "+dumm2.entryNo());
			      }
		      }
*/
	}
	
	private static void answerQueries(String c) throws IOException
	{
		File f1=new File(c);
		//File f1 = new File(System.getProperty("user.dir")+"/"+"student.txt");
		  //Creation of File Descriptor for input file
	      String[] words=null;  //Intialize the word Array
	      FileReader fr = new FileReader(f1);  //Creation of File Reader object
	      BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
	      String s;     
	      String[] damn= new String[3];
	      int count=0;
	      String final_ans="";
	      while((s=br.readLine())!=null)   //Reading Content from the file
	      {
	    	  count=0;
	         words=s.split(" ");  //Split the word using space
	          for (String word : words) 
	          {
	                damn[count] = word;
	                count++;
	          }
	          
	          if(damn[0].equals("COURSETITLE"))
	          {
	        	  
	        	  Iterator<Position_<Course>> itit = ans4.positions();
			      
			      while(itit.hasNext())
			      {
			    	  Course dumm = itit.next().value();
			    	//  System.out.println(dumm.title);
			    	  if((dumm.title).equals(damn[1]))
			    	  {
			    		  //System.out.println(dumm.name());
			    		  final_ans = dumm.name() +"\n" + final_ans;
			    		  break;
			    	  }
				      
				      
			      }
	          }
	          
	          else if(damn[0].equals("SHARE"))
	          {
	        	  Iterator<Position_<Hostel>> iter1 = ans2.positions();
			      boolean flag = true;
			      int size;
			      Hostel x1= new Hostel("");
			      while(iter1.hasNext() && flag)
			      {
			    	   x1 = (iter1.next()).value(); 
			    	  String x = x1.name();
			    	  if(x.equals(damn[2]))
			    		  flag=false; 
			      }
			      
			      if(!flag)
			      {
			    	  size = x1.stud_size();
			    	  String [] stud_list = new String[size-1];
			    	  Iterator<Student_> myIter = x1.studentList();
			    	  int cnt=0;
			    	  while(myIter.hasNext())
				      {
				    	   Student_ dum_par = myIter.next();
				    	   String eNo = dum_par.entryNo();
				    	   
				    	   if(!(eNo.equals(damn[1])))
				    	   {
				    		   stud_list[cnt] = eNo;
				    		   cnt++;
				    	   }
				      }
			    	  sortStringBubble(stud_list,size-1);
			    	  String damdam="";
			    	  for(int i=0;i<size-1;i++)
			    	  {
			    		//  System.out.print(stud_list[i] + " ");
			    		  if(i == size-2)
			    			  damdam+= stud_list[i];
			    		  else
			    		  damdam += stud_list[i] + " ";
			    	  }
			    	  	final_ans = damdam + "\n" + final_ans;
			    	  //System.out.println();
			      }
			      else
			      {
			    	  Iterator<Position_<Departments>> myiter2 = ans3.positions();
				      Departments x11= new Departments("");
				      while(myiter2.hasNext() && flag)
				      {
				    	   x11 = (myiter2.next()).value(); 
				    	  String x = x11.name();
				    	  if(x.equals(damn[2]))
				    		  flag=false; 
				      }
				      
				      if(!flag)
				      {
				    	  size = x11.s_stud();
				    	  String [] stud_list = new String[size-1];
				    	  Iterator<Student_> myIter3 = x11.studentList();
				    	  int cnt=0;
				    	  while(myIter3.hasNext())
					      {
					    	   Student_ dum_par = myIter3.next();
					    	   String eNo = dum_par.entryNo();
					    	   
					    	   if(!(eNo.equals(damn[1])))
					    	   {
					    		   stud_list[cnt] = eNo;
					    		   cnt++;
					    	   }
					      }
				    	  sortStringBubble(stud_list,size-1);
				    	  String damdam="";
				    	  for(int i=0;i<size-1;i++)
				    	  {
				    		//  System.out.print(stud_list[i] + " ");
				    		  if(i == size-2)
				    			  damdam+= stud_list[i];
				    		  else
				    		  damdam += stud_list[i] + " ";
				    	  }
				    	  	final_ans = damdam + "\n" + final_ans;
				    	  //System.out.println();
				      }
				      
				      else
				      {
				    	  Iterator<Position_<Course>> damn_iter = ans4.positions();
					      Course var= new Course("","");
					      while(damn_iter.hasNext() && flag)
					      {
					    	   var = (damn_iter.next()).value(); 
					    	  String x = var.name();
					    	  if(x.equals(damn[2]))
					    		  flag=false; 
					      }
					      
					    	  size = var.damn_size();
					    	  String [] stud_list = new String[size-1];
					    	  Iterator<Student_> damn_iter2 = var.studentList();
					    	  int cnt=0;
					    	  while(damn_iter2.hasNext())
						      {
						    	   Student_ dum_par = damn_iter2.next();
						    	   String eNo = dum_par.entryNo();
						    	   
						    	   if(!(eNo.equals(damn[1])))
						    	   {
						    		   stud_list[cnt] = eNo;
						    		   cnt++;
						    	   }
						      }
					    	  sortStringBubble(stud_list,size-1);
					    	  String damdam="";
					    	  for(int i=0;i<size-1;i++)
					    	  {
					    		//  System.out.print(stud_list[i] + " ");
					    		  if(i==size-2)
					    			  damdam+= stud_list[i];
					    		  else
					    		  damdam += stud_list[i] + " ";
					    	  }
					    	  	final_ans = damdam + "\n" + final_ans;
					    	  //System.out.println();
				      }
			      }
	          }
	          
	          else
	          {
	        	  	Iterator<Position_<student_info>> itit = ans1.positions();
			      
			      while(itit.hasNext())
			      {
			    	  student_info dumm = itit.next().value();
			    	//  System.out.println(dumm.title);
			    	  if((dumm.entryNo()).equals(damn[1]))
			    	  {
			    		  int size = dumm.num_course();
			    		  String[] course_str = new String[size];
			    		  
			    		  Iterator<CourseGrade_> myIter3 = dumm.courseList();
				    	  int cnt=0;
				    	  while(myIter3.hasNext())
					      {
					    	   CourseGrade_ dum_par = myIter3.next();
					    	   String what = "";
					    	   info_grade dum1 = (info_grade)(dum_par.grade());
					    	   GradeInfo_.LetterGrade dummy1 = dum1.grade_in_course;
					    	   
					    	   switch(dummy1)
					    	   {
					    	   case A: what = "A"; break;
					    	   case Aminus: what = "Aminus"; break;
					    	   case B: what = "B"; break;
					    	   case Bminus : what = "Bminus"; break;
					    	   case C: what = "C"; break;
					    	   case Cminus: what = "Cminus"; break;
					    	   case D: what = "D"; break;
					    	   case E: what = "E"; break;
					    	   case F: what ="F"; break;
					    	   case I: what = "I";break;
					    	   }
					    	   
					    	   
					    	   course_str[cnt] = dum_par.coursenum() + " " + what;
					    	   cnt++;
					      }
				    	  
				    	  sortStringBubble(course_str,size);
				    	  String dum2="";
				    	 // System.out.print(dumm.entryNo() + " " + dumm.name() + " " + dumm.department() + " " + dumm.hostel() + " " + dumm.cgpa() + " " );
			    		  dum2 = dumm.entryNo() + " " + dumm.name() + " " + dumm.department() + " " + dumm.hostel() + " " + dumm.cgpa() + " ";
				    	  for(int i=0;i<size;i++)
				    	  {
				    		  //System.out.print(course_str[i] + " ");
				    		  if(i== size-1)
				    			  dum2+= course_str[i];
				    		  else
				    		  dum2 += course_str[i]+ " ";
				    	  }
				    	  final_ans = dum2 + "\n" + final_ans;
				    	 // System.out.println();
			    		  
			    		  break;
			    	  }
				      
				      
			      }
	          }

	      }
	      br.close();
	      System.out.println(final_ans);
	}
	
	
	public static void main(String[] args) throws IOException
	{
		 
		getData(args[0] ,args[1]);
		answerQueries(args[2]);
	}

}
//https://www.geeksforgeeks.org/enum-in-java/
//http://candidjava.com/tutorial/program-to-search-word-in-a-file/
// https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java