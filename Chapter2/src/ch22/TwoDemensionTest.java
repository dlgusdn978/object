package ch22;

public class TwoDemensionTest {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3},{1,2,3,4}};
		
		int i, j;
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.println(i + "행" + j + "열의 값은 " + arr[i][j]);	
			}
		}
	}
}
