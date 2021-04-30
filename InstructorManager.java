package kodlamaio;

public class InstructorManager extends UserManager{

	public void CreateaCourse(Instructor instructor) {
		System.out.println("You created" + instructor.getCourseName()+"course");
		System.out.println("Your course's details here : "+ instructor.getCourseDetail());
		if(instructor.getPrice() == 0) {
			System.out.println("Your course is free !");
		}
		else {
		System.out.println("You sell this course " + instructor.getPrice() + "TL");
		}
	}
		
	public void GiveaHomework(Instructor instructor) {
		System.out.println("Dear"+ instructor.name +", write the homework to your students!");
		
	}
	
}
