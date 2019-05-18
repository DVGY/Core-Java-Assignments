import java.util.Scanner;


/* 5. Write a program to print following pattern?
Enter nubmer of rows: 5

          *
        * * *
      * * * * *
    * * * * * * *
  * * * * * * * * *
    * * * * * * *
      * * * * *
        * * *
          *
*/

class a15 {
    public static void printChars(int n,char c){
        for (int i=0;i<n;i++){
            System.out.print(c);
        }
    }
    public static void main(String[] args)
    {
        int n, c, k, space;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        n=s.nextInt();
        space = n - 1;
        for (k = 1; k<=n; k++){
            printChars(space,' ');
            space--;
            printChars(2*k-1,'*');
            System.out.println("");
        }
        space = 1;
        for (k = 1; k<= n - 1; k++){
            printChars(space,' ');
            space++;
            printChars(2*(n-k)-1, '*');
            System.out.println("");
        }
    }
}




/*class a15{
	public static void main(String args[]){
	int i,j,k,rows;
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter number of rows: ");
	rows = sc.nextInt();
	
	for(i= 0;i<rows;i++)
	{
		for(j=rows;j>=i;j--)
		{
			System.out.print(" ");
		}

		for(k=0;k<(2*i-1);k++)
		{
			System.out.print("*");
		}
		System.out.println("");

	}




	for(i=rows;i>0;i--)
	  {

		for(j=rows;j>=i;j--)
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

}*/

