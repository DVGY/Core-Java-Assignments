/*Write a program to print following pattern?
Input : n = 5
Output: 
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * * 
        * 

*/





/*import java.util.Scanner;

/*class a14{
	public static void main(String args[]){
	//Scanner sc = new Scanner(System.in);
	int i,n=5;

	for(i=0;i<n;i++)
	{
		for(int j =n; j>i ;j--)
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
}*/




class a14{
	public static void main(String args[]){
	int i,j,k,n=5;

	for(i=5;i>0;i--)
	  {

		for(j=5;j>=i;j--)
		{
			System.out.print(" ");
		}

		for(k=1;k<(2*i-1);k++)
		{
			System.out.print("*");
		}
		System.out.println("*");
	  }		
	
	}

}













