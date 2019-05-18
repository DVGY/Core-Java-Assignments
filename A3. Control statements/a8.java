/*Write a program to print Fibonacci Series?
Description : Fibonacci series is in the form of 0, 1, 1, 2, 3, 5, 8, 13, 21,...... 
Hint: To find this series we add two previous terms/digits and get next term/number*/

class a8{
	public static void main(String args[]){
	long  term1 =0,term2 =1;
	long  term3 =1;
	System.out.print(term1+", "+term2);
	for(int i =100; i>0;i-- )
	{
		term3 = term1 + term2;
		term1 = term2;
		term2 = term3;

		System.out.print(", "+term3);
				
	}
	
	
    }
	
}


