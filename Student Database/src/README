#Student Database

1) student_info
This class implements Student_ interface. It contains data such as name,entry number,hostel, department
num of courses whose credit is given, credits, cgpa , number of courses opted and a linked list for the
courses which this particular student has taken.

The functions which are given in interface are exactly implemented according to the comment lines in the 
question. add functions add an object of type CourseGrade_ in the list of courses of that student and 
simultaneously update the cgpa, credits and the number of courses. As the grade function was added later 
i made a lettergrade variable which corresponds to I grade. The cgpa is rounded of to two decimal places.
And only for I grade the credits are not counted.
num_course function returns the number of courses opted by the student(independent of grade).

name() - I have created and tested a function name() which returns the name of the student.
entryNo() - I have created and tested a function entryNo() which returns the entry number of the student.
hostel() - I have created and tested a function hostel() which returns the name of the hostel of the student.
department() - I have created and tested a function department() which returns the name of the department of the student.
completedCredits() - I have created and tested a function which returns the credits completed by the student.
cgpa() - I have created and tested a function which returns the cgpa of the student in string format rounded of to two decimal places.
add(CourseGrade_ ) - I have created and tested a function which takes a course of a student as a parameter and then update student’s info as follows - 
It increases the number of courses of student by 1 
Add the course to the course list of student
Update the completed credits and cgpa of the student according to the grade obtained in that course.
num_course () - I have created and tested a function which returns the number of courses done by the student.
Iterator<CourseGrade_> courseList() - I have created and tested a function which returns the iterator for iterating over the list of courses of the student.  

2) Node
This is the building block of linked list. It has data of generic type T and a reference to point to
another node. All the functions are implemented exactly as given in interface. 
A change_next function is also there to change the value of next for a node but havent used it anywhere.
value () - I have created and tested a function which returns the data of the generic type.
after() -  I have created and tested a function which returns the Node which is next to the current node.
change_next() -  I have created and tested a function which changes the next node of the current node by the specified node passed as parameter.

3)myIterator
Thia class is for general objects. I have used this to iterate over linked lists of type Student_ and
CourseGrade_. It has two variables currData and nextData. For any initial node given currData is null 
and nextData that node. hasNext checks if there is any element after the current element. 
Next function updates currData to its next value and returns that next value. As currData started
from null all the elements of the linked list are covered.
now function returns the node for the current data but isnt used.
hasNext() -  I have created and tested a function which returns whether there is a node after the current node or not.
next() -  I have created and tested a function which returns the value stored in the next node of the current node and simultaneously updates the current node to the next node and next node to its node.
now() -  I have created and tested a function which returns the current node.

4) LL 
Nodes - head 
int - size
count returns the size of the linked list
add function adds the new element at the head of the list just like a stack and size is updated.
head_ret function returns the head of the linked list.
Iterator returns an iterator for all positions of the list.
count() -  I have created and tested a function which returns the size of the linked list.
add() -  I have created and tested a function which makes a new node having data which is passed as the parameter and then adds this node to the head of the linked list.It updates the size of the list and returns the head of the list.
head_ret() -  I have created and tested a function which returns the head of the list.
positions() -  I have created and tested a function which returns an iterator for traversing over the list.


5) iterator
This is similar to myIterator but the only difference is that its return type is Position_<T> and
not T. It returns a node instead of value in next function.
hasNext() -  I have created and tested a function which returns whether there is a node after the current node or not.
next() -  I have created and tested a function which returns next node of the current node and simultaneously updates the current node to the next node and next node to its node.
now() -  I have created and tested a function which returns the current node.


6) info_grade 
This is the implementation of GradeInfo_
gradepoint calculates the cg for that course
ret returns the grade in that course in lettergrade form
ret() -  I have created and tested a function which returns the grade in that course in lettergrade form.
gradepoint() -  I have created and tested a function which returns the corresponding cgpa in that course.


7) Hostel , Departments , Course
Data - name, list of students in that entity with the size of the list also.
add function adds the student to the linked list of this entity and updates the size.
name returns the name of the entity.
Iterator returns the iterator for the students linked list
stud_size returns the number of students in that entity.
Course only has an additional function which returns the course code(eg COL106)
name() - I have created and tested a function which returns the name of that entity.
add() - I have created and tested a function which adds the student object passed as a parameter to the list of students of that entity.
stud_size() -  I have created and tested a function which returns the size of the student list of that entity.
studentList() - I have created and tested a function which returns an iterator for iterating over the list of students in that entity.

8) course_info 
title returns the course code
name returns the course name
coursegrade returns the grade in string format although this is not used.
grade returns the GradeInfo_ type grade
coursetitle() - I have created and tested a function which returns the course title of that course.
coursegrade() -  I have created and tested a function which returns the grade obtained in that course in string form.
coursenum() -  I have created and tested a function which returns the course number of that course.
grade() -  I have created and tested a function which returns an object of class GradeInfo_ having the grade in that course.

9) Assignment1
Has a list of all students, all hostels, all courses and all departments.
The array is sorted using bubble sort which is done on array. The whole data is stored in an
array. Time complexity of this is O(n2).

getData is for storing data of students. 
It first reads the student info file and create a list of students with their basic info.
Then if this students hostel already occur in the list of all hostels, this student is added to list of
students of that hostel, else this hostel is added as a new node to the list of all hostels and then this
student is added to that hostel's list. same for department.

Then course file is read.
First that student is found by searching its entry number in the list of all students. Then the details
of the course is added in that student's class. Also we check for the existence of this course in the
list of all courses, if exist this student is added to the list of that particular course else this course
is added to the list of all courses and then this student is added to that course's list.

AnswerQueries is for answering the questions.
It checks for words like COURSETITLE, SHARE, INFO
COURSETITLE - searches in the list of all courses and returns using name function.
INFO - The details of the student are printed. For sorted order of courses, bubble sort is applied
on the string which has both name and grade like "COL106 A" , "COL215 A". This is done so because 
a student cant have two grades in the same course. Ease in implementing.

SHARE - Searches the list of hostels, departments and courses to find a match. Then the entry number
of students in that entry number are stored in a string array(excluding the entry number given). then
this array is sorted.

To print the whole file in reverse order a final_ans string is used which takes care of this.
At any stage final_ans = new_string+ "\n" + final_ans
this gives the output in the desired manner.


sortStringBubble() - I have created and tested a function which takes input as the array of String and its size and sorts the array in lexographical order. It proceeds by swapping consecutive elements so that the last element of the array is the largest element. Time complexity is O(n2) as after each iteration one element at the right side of the array gets fixed.It returns an array sorted lexographically.
getData() - I have created and tested a function which reads two files containing info of student and courses taken by the students. After reading the student info file i create a new object of student and update its info like name,entryNo, etc which are the parameters passed in the constructor. Then this student object is added to list of all students. Then
I check the hostel of the student. If it exists in the allHostel list i add this student object to the student’s list of that hostel.
If it doesnt exist i make a new node of Hostel type and add it to the allHostel list. Then i add this student to the students list of this hostel.
I do the same thing for department of the student.

Then i read the second file containing the courses information.
First i find the student object whose entry number is provided by iterating over the allStudents, after that i update the student’s information like credits, cgpa using the add function. Then using the course info provided i check in the allCourses if that course is present or not. If the course is present then i add this student in the list of students of that course. If not then i create a new node for this course and add it to the list of allCourses and then add this student to the list of students of this course

getData takes two files as parameters containing information about students and courses and updates the corresponding objects. It doesnt return or output anything it justs updates the info.


answerQueries() - I have created and tested a function which answers the queries of the user.
COURSETITLE - First i would iterate over the list of courses to find a course whose code matches with the code given in the input. Then using the name() function i print the name of the course.
SHARE - I don’t know specifically what entity is the last string is of. So i iterate over allHostel , allDepartment, allCourses list to find the match. Then i iterate over the list of students of that entity using the Iterator<T> and store the entry number of the student in an array of String. I don’t include the entry number which is specified in the input. Then i sort the array using bubble sort function which i have mentioned earlier.
INFO - I iterate over the list of allStudents to find the student whose info is asked. I match using the entry number provided. Then i try to make an array containing the courses(string of course_name + grade) of that student. I concatenate course name and grade because a student cant have two grades for the same course. Using a switch case I convert the lettergrade type grade of the student to string. Then i store it in the array. After iterating through all the courses i bubble sort the array to obtain a lexicographical order of courses. Then first i store the basic info of student like name,entry number,etc in a string and then add the course list string at its back.    
As the question requires me to print the output in reverse order i.e first query output at last. I use a string final_ans which takes of this. 
final_ans = new_string+ "\n" + final_ans. The value which is already in final ans first gets shifted down by one position using ‘\n’ then i add the new string on top of that.
answerQueries take the file as the input and then outputs the information as required in the question.


I used references for syntax -
As i didnt know java so i refered to these sites for syntax.  
1) https://www.geeksforgeeks.org/enum-in-java/ 
How to use enum

2) http://candidjava.com/tutorial/program-to-search-word-in-a-file/
How to read a file in java

3)https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
Syntax to round off to two decimal digits

SIMARPREET SINGH SALUJA
2018CS10393
