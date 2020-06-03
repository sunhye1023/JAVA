package jdbc.bookprogram;

public interface InterMember {

	public void minsert(); //member클래스 정보
	public void minfo(); //id,pw,name,List(book_info) (책이름, 빌린날짜 반납날짜(빌린날짜+7))
	public void mupdate(); //member클래스 정보
	public void mdelete(); //member클래스 정보
	
	public void lendapplication(); //lend (id, book rental date)
	public void lendinfo();
	public void retu(); //re (id, book rental date, book return date)
	
	public void managerinsert();
	public void managerinfo();
	public void managerupdate();
	public void managerdelete();
	
	
}
