import java.util.*;

class NumberGuess
{
	public static void main(String args[])
	{
		boolean play =false;
		
		while(play==false)
		{
		
		System.out.println("\n----Welcome !! To the Number Guessing Game----\n ");
		System.out.println("Guess Number 1 to 100 and you will have 10 Turns");
		Scanner sc = new Scanner(System.in);
		int right_guess = (int)Math.round(Math.random()*100);
		int user_guess ;
		int turns = 1;
		int i;
		boolean win = false;

		while(win==false)
		{
			
			user_guess = sc.nextInt();
			if(right_guess==user_guess)
			{
		        win=true;
			}
			else if(turns > 10)
			{
				System.out.println("You loose!! Right Guess : "+right_guess);
				return;
			}
			else if(right_guess < user_guess)
			{
				System.out.println("Guess is''LOW'' Available turn is : "+turns);
				turns++;
			}
			else if(right_guess > user_guess)
			{
				System.out.println("Guess is ''HIGH'' Available turn is : "+turns);
				turns++;
			}
		}

	            System.out.println("You  winner!!");
		        System.out.println("Right Guess : "+right_guess);
		        System.out.println("Score is    : "+(11-turns)*10);
		        System.out.println("for Play enter 1");
		        System.out.println("for Exit enter 2");
		        i=sc.nextInt();
		        if(i==1) play=false;
		        else play=true;
		}
		}
}