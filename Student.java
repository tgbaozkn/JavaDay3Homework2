package kodlamaio;

public class Student extends User{
	private boolean startCourse;
	private String lesson;
	
	
	public String getlesson() {
		return lesson;
	}
	public void setlesson(String lesson) {
		this.lesson = lesson;
	}
	public boolean isStartCourse() {
		return startCourse;
	}
	public void setStartCourse(boolean startCourse) {
		this.startCourse = startCourse;
	}
	
	
	
}
