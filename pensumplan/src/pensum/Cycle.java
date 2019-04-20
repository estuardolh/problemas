package pensum;

public class Cycle {
	public String name;
	public Course[] courses;
	
	public Cycle(String name, Course[] courses) {
		super();
		this.name = name;
		this.courses = courses;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
