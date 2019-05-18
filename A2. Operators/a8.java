/* (Print a table) Write a program that displays the following table. Cast floatingpoint
numbers into integers.

a 		b 		pow(a, b)
1 		2 		1
2 		3 		8
3 		4 		81
4 		5 		1024
5 		6 		15625s


*/

class a8{
	public static void main(String args[]){
	float a,b;
	a=1;b=2;
	System.out.println("a"+"\t"+"b"+"\t"+"pow(a,b)");
	for(int i= 0; i<5;i++)
	{
		
	
	System.out.println((int)a+"\t"+(int)b+"\t"+ (int)Math.pow(a,b));
	a++;
	b++;
	
	}
	

	}

}
