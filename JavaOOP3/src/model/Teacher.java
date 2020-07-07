package model;

//teacher is a Nguoi
public class Teacher extends Nguoi {
	private String faculty;

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void info() {
		super.info();
		System.out.println(this.faculty);
	}

	public void input() {
		// viet tuong tu student
	}

}
