/* Write a program that solves the following equation and displays the value for x and y:

					3.4x + 50.2y = 44.5
					2.1x + .55y = 5.9 */

//ALSO CRAMERS RULE CAN BE USED


class a9{
	public static void main(String args[])
	{
		//double[][] matrixA = new double[1][1];		
		//char[][] matrixX = new char[1][0];
		//double[][] matrixB = new double[1][0];	
	
		
		double[][] matrixA= {{ 3.4,50.2},{2.1,.55}};		
		char[][] matrixX= {{'x'},{'y'}};
		double[][] matrixB= {{44.5},{5.9}};
		double detA = 1/( (matrixA[0][0] * matrixA[1][1]) - (matrixA[0][1]*matrixA[1][0]) );
		double swapScalarA[][] = { 
					{matrixA[1][1],-matrixA[1][0]} ,
					    {- matrixA[0][1],matrixA[0][0]}
				      }; 
		double[][] result = {{0},{0}};		

		//System.out.println(detA);

		System.out.println("Inverse of matrix is: ");		 

		for(int i = 0; i<=1;i++)
		{
			for(int j =0; j<=1;j++)
			{
				swapScalarA[i][j] = detA * swapScalarA[i][j];
			}
			System.out.println("\n");
		}		

	
		for(int i = 0; i<=1;i++)
		{
			for(int j =0; j<=1;j++)
			{
				System.out.print(swapScalarA[i][j]+"     ");
			}
			System.out.println("\n");
		}


		for(int i =0;i <=1; i++)
		{
			for(int j =0; j<1;j++)
			{
				for(int k =0;k<=1;k++)
				result[i][j]= result[i][j] + (swapScalarA[i][k]* matrixB[k][j]);

			}
		}
		
		
				System.out.print("Value of x: "+result[0][0]+"\n Value of y: "+result[1][0]);
			




		System.out.println("");
		
	}

}
