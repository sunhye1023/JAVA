package jdbc.bookprogram;

public class BookVO {

	public int no;
	public String type;
	public String position;
	public String name;
	public String writer;
	public String publisher;
	public String state;
	public int count;
	
	public BookVO() {
		
	}

	public BookVO(int no, String type, String position, String name, String writer, String publisher, String state,
			int count) {
		super();
		this.no = no;
		this.type = type;
		this.position = position;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.state = state;
		this.count = count;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
