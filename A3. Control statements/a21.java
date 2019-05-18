/*

(Find the highest score) Write a program that prompts the user to enter the number
of students and each student’s name and score, and finally displays the name
of the student with the highest score.

*/



import java.util.Scanner;

class a21{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int highestScore =0;
	int score,n;
	String studentName,name=" ";
	System.out.println("Enter number of students you want to enter: ");
 	n = sc.nextInt();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter student "+ (i+1) +" name: ");
		studentName = sc.next();
		
		System.out.println("Enter student "+ (i+1)+ " Score: ");
		score = sc.nextInt();
		
		if(score>highestScore)
		{
			highestScore = score;
			name = studentName;
		}
			
	}
	System.out.println("Student name is: "+ name+" Highest score is "+ highestScore);


	}


}
