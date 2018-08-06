package calculator;

public class Calculator {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int addResult = cal.add(5,6);
		
		if(addResult == 11)
			System.out.println("덧셈결과가 올바릅니다.");
		else
			System.out.println("덧셈결과가 틀렸습니다.");
		
		/////////////////////////////////////////////
		
		int minusResult = cal.minus(6, 4);
		if(minusResult == 2)
			System.out.println("뺄셈결과가 올바릅니다.");
		else
			System.out.println("뺄셈결과가 틀렸습니다.");
		
		/////////////////////////////////////////////
		//mul : 곱하기 , div : 나누기
		
		int mulResult = cal.mul(4, 3);
		if(mulResult == 12) 
			System.out.println("곱셈결과가 올바릅니다.");
		else
			System.out.println("곱셈결과가 틀렸습니다.");
		
		double divResult = cal.div(6, 3);
		if(divResult == 2.0) 
			System.out.println("나눗셈결과가 올바릅니다.");
		else
			System.out.println("나눗셈결과가 틀렸습니다.");
		
		divResult = cal.div(6, 0);
		if(divResult == 2.0) 			
			System.out.println("나눗셈결과가 올바릅니다.");
		else
			System.out.println("나눗셈결과가 틀렸습니다.");
		
		
	}
	
	
	
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	public int minus(int param1, int param2) {
		return param1 - param2;
	}
	
	public int mul(int param1, int param2) {
		return param1 * param2;
	}
	
	public double div(int param1, int param2) {
		if(param2==0)
			return 0;
		else
			return param1 / param2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
