package kodlamaio;

public class StudentManager extends UserManager{
     public void CourseDetail(Student student , Instructor instructor)
{
    	 System.out.println(student.name + " "+ student.surname + ", you are taking " + student.getlesson() + "by " + instructor.name + " " + instructor.surname);
    	 System.out.println("This course  is about " + instructor.getCourseDetail());
}
}
