package ch14;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.subtract(num1,num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));//인터페이스여서 바로 호출해서 쓸 수 있음. 인스턴스 선언 없이.
	}
}
