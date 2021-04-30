package kodlamaio;

public class Main {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Tuðba ";
		student.surname = "Özkan";
		student.id = 1 ;
		student.setStartCourse(true);
		student.setlesson("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		
		
		Instructor instructor = new Instructor();
		String[] category = {"Tümü", "Programlama"};
		instructor.id = 1;
		instructor.name = "Engin";
		instructor.surname = "Demiroð";
		instructor.setCourseDetail("2 ay sürecek ücretsiz ve profesyonel bir programla, sýfýrdan yazýlým geliþtirme öðreniyoruz.");
		instructor.setCourseName("Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)");
		instructor.setCategory(category);
		instructor.setPrice(0);
		
		StudentManager studentmanager = new StudentManager();
		studentmanager.logintoKodlamaio(student);
		studentmanager.CourseDetail(student, instructor);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.logintoKodlamaio(instructor);
		instructorManager.CreateaCourse(instructor);
		instructorManager.GiveaHomework(instructor);
		
		

	}

	


}
