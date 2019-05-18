/*
(Find the two highest scores) Write a program that prompts the user to enter the
number of students and each student’s name and score, and finally displays the
student with the highest score and the student with the second-highest score.

*/



import java.util.Scanner;

class a22{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int highestScore =0;
	int secondHighestScore =0 ;
	int score,n;
	String studentName,name=" ";
	System.out.println("Enter number of students you want to enter: ");
 	n = sc.nextInt();

	for(int i=0;i<n;i++)
	{
		System.out.println("Enter student "+ (i+1) +" Name: ");
		studentName = sc.next();
		
		System.out.println("Enter student "+ (i+1) +" Score: ");
		score = sc.nextInt();
		
		if(score>highestScore)
		{
			highestScore = score;
			name = studentName;
		}
		
		if(score<=highestScore && score>secondHighestScore)
		{
			secondHighest = score;
		}
			
	}
	System.out.println("Student name is: "+ name+" Highest score is "+ highestScore);


	}


}
