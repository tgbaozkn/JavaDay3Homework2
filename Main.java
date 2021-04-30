package kodlamaio;

public class Main {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.name = "Tu�ba ";
		student.surname = "�zkan";
		student.id = 1 ;
		student.setStartCourse(true);
		student.setlesson("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		
		Instructor instructor = new Instructor();
		String[] category = {"T�m�", "Programlama"};
		instructor.id = 1;
		instructor.name = "Engin";
		instructor.surname = "Demiro�";
		instructor.setCourseDetail("2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.");
		instructor.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
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
