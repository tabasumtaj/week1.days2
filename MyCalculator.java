package week1.day2;

public class MyCalculator {
	public static void main(String[] args){
		
	    Calculator calobj = new Calculator();
	    
		int addNumbers = calobj.addNumbers(5,10,15);
		System.out.println(addNumbers);
		
		
		int subNumbers = calobj.subNumbers(8, 3);
		System.out.println(subNumbers);
		
		double mulNumbers = calobj.mulNumbers(6, 7);
				System.out.println(mulNumbers);
				
		float divideNumbers = calobj.divideNumbers(48, 6);	
				System.out.println(divideNumbers);
		}
}
