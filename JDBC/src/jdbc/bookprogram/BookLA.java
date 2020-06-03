package jdbc.bookprogram;

public class BookLA {

	public String id; 
	public String name;
	public int lend_no;
	public String lend_date;
	public int lend_count;

	public BookLA() {
		
	}
	
	public BookLA(String id, String name, int lend_no, String lend_date, int lend_count) {
		super();
		this.id = id;
		this.name = name;
		this.lend_no = lend_no;
		this.lend_date = lend_date;
		this.lend_count = lend_count;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLend_no() {
		return lend_no;
	}
	public void setLend_no(int lend_no) {
		this.lend_no = lend_no;
	}
	public String getLend_date() {
		return lend_date;
	}
	public void setLend_date(String lend_date) {
		this.lend_date = lend_date;
	}
	public int getLend_count() {
		return lend_count;
	}
	public void setLend_count(int lend_count) {
		this.lend_count = lend_count;
	}
	
	
	
}
