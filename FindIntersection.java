package week1.day2;

public class FindIntersection {
	public static void main(String[] args){
		int[] firstNumber={3,2,11,4,6,7};
		int[] secondNumber={1,2,8,4,9,7};
		//int i,j;
		int length1 = firstNumber.length;
		int length2 = secondNumber.length;
		for (int i =0 ; i < length1;i++){
		
		for(int j=0 ;j< length2;j++)
		{
			
		if(firstNumber[i]==secondNumber[j])
		{
			System.out.println(secondNumber[j]);
					}
		}
		}
	}

}
