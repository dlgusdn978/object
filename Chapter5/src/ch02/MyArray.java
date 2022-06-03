package ch02;

public class MyArray {
	//¹Ì¿Ï¼º
	
	
	
	
	int[] intArr;
	int count;
	
	public int ARRAY_SIZE; 
	public static final int ERROR_NUM = -99999999;
	public MyArray() {
		count =0;
		ARRAY_SIZE =10;
		intArr = new int[ARRAY_SIZE];
	}
	public MyArray(int size) {
		count =0;
		ARRAY_SIZE =size;
		intArr = new int[size];
	}
	public void addElement(int num) {
		if(count>= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	public void insertElement(int position, int num) {
		int i;
		if(position<0 || position>count) {
			return;
		}
	}
	public int removeElement(int position) {
		return position;
		
	}
	public int getSize() {
		return count;
	}
	public boolean isEmpty() {
		return false;
		
	}
}
