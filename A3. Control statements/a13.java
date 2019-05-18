//import java.util.Scanner;

/* Write a program to print star pattern?
Input n= 5;
Output:  
	*
       * *
      * * *
     * * * *
    * * * * *    
*/


class a13{
	public static void main(String args[]){
	//Scanner sc = new Scanner(System.in);
	int i;

	for(i=0;i<5;i++)
	{
		for(int j =0; j<5 ;j++)
		{
			System.out.print(" ");
		}


		for(int k =0; k<=i ;k++)
		{
			System.out.print("* ");
		}
		System.out.println("");


	} 	

	}
}
