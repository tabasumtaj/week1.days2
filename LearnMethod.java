package week1.day2;

public class LearnMethod {
	
	public static void main(String[] arg){
		
		LearnMethod learnobj = new LearnMethod();
		learnobj.printCarName();
		
		int getcarRegNumber = learnobj.getcarRegNumber();
				System.out.println(getcarRegNumber);
				
		String getcarVarient = learnobj.getcarVarient();
		System.out.println(getcarVarient);
		
		int multiplyTwoNumbers = learnobj.multiplyTwoNumbers(6, 12);
		System.out.println(multiplyTwoNumbers); 
	}
	
	public void printCarName()
	{
		System.out.println("Swift dezire");
	}

	public int getcarRegNumber()
	{
		int regNumber = 2334;
		return regNumber;
		
	}
	public String getcarVarient(){
		return "petrol";
	}
	
	public int multiplyTwoNumbers(int x, int y){
		
		return x*y;
		
	}
}
