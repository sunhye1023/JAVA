package jdbc.bookprogram;

public class ManagerVO {

	public String name;
	public String id;
	public String grade;
	
	public ManagerVO() {
		
	}

	public ManagerVO(String name, String id, String grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	};
	
	
	
	
}
