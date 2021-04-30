package kodlamaio;

public class Instructor extends User {
	private String [] category;
	private String courseName;
	private String courseDetail;
	private double price;
	
	public String[] getCategory() {
		return category;
	}
	public void setCategory(String[] category) {
		this.category = category;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDetail() {
		return courseDetail;
	}
	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
