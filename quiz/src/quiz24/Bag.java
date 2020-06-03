package quiz24;

import java.util.Arrays;

public class Bag implements IBag {

	private String[] arr = new String[100];
	private int index;
	
	
	public void insert(String item) {
		arr[index]=item;
		index++;
	}


	public void print() {
		for(int i=0;i<index;i++) {			
			System.out.println(arr[i]);
		}
	}


	public int search(String item) {
		for(int i=0;i<index;i++) {
			if(arr[i].equals(item)) {
				return i;
			}
		}
		return -1;
	}

	public boolean delete(String item) {
		for(int i=0;i<index;i++) {
			if(arr[i].equals(item)) {
				for(int j=i;j<index-1;j++) {
					arr[j]=arr[j+1];
				}
				index--;
				return true;
			}
		}
		return false;
	}

}
