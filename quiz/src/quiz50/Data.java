package quiz50;

import java.util.ArrayList;
import java.util.List;

public class Data {

	private List<String> data = new ArrayList<>();
	
	
	

	private String r;
	private String s;
	private String y;
	private String m;
	private String p;
	
	
	public Data() {
		
	}
	
	


	public Data(String r, String s, String y, String m, String p) {
		super();
		this.r = r;
		this.s = s;
		this.y = y;
		this.m = m;
		this.p = p;
	}
	
	
	public List<String> getData() {
		return data;
	}


	public void setData(List<String> data) {
		this.data = data;
	}


	@Override
	public String toString() {
		return "Data [r=" + r + ", s=" + s + ", y=" + y + ", m=" + m + ", p=" + p + "]";
	}


	public String getR() {
		return r;
	}


	public void setR(String r) {
		this.r = r;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public String getY() {
		return y;
	}


	public void setY(String y) {
		this.y = y;
	}


	public String getM() {
		return m;
	}


	public void setM(String m) {
		this.m = m;
	}


	public String getP() {
		return p;
	}


	public void setP(String p) {
		this.p = p;
	}
	
	
	
	
	
	
}
