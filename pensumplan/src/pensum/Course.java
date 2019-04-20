package pensum;

public class Course {
	public String code;
	public String name;
	public int credits;
	public String[] requires;
	public int min;
	
	public Course(String code, String name, int credits, String[] requires, int min) {
		super();
		this.code = code;
		this.name = name;
		this.credits = credits;
		this.requires = requires;
		this.min = min;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String[] getRequires() {
		return requires;
	}
	public void setRequires(String[] requires) {
		this.requires = requires;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	
}
