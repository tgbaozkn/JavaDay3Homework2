package kodlamaio;

public class UserManager {
	public UserManager() {
		String [] courses = {"Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)","Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)","Programlamaya Giri� i�in Temel Kurs"};
		System.out.println("Sign in or Sign up , Courses are here : ");
		for (String course : courses) {
			System.out.println(course);
		}
		System.out.println("\n ***************** \n");
	}
    public void logintoKodlamaio(User user) {
     System.out.println("Welcome!"+ user.name + " "+ user.surname + ", If you are a student choose one of these courses , If you are a teacher create a course or give a homework!");
     
     
    }
}
