import java.util.Random;
import java.util.Scanner;
public class MontyHallSim {

	public static void main(String[] args) {
		Scanner sims = new Scanner(System.in);
		System.out.println("how many times(between 10 and 10000) will you run the simulation:");
		int sim=sims.nextInt();
		while(sim<10||sim>10000)
		{
			Scanner sims1 = new Scanner(System.in);
			System.out.println("how many times(between 10 and 10000 will you run the simulation:");
			sim=sims.nextInt();
		}
		Scanner notScanner1 = new Scanner(System.in);
		System.out.println("will you switch or stay:");
		String answer = notScanner1.nextLine();
		while(!answer.equals("switch")&&!answer.equals("stay"))
		{
			Scanner notScanner2 = new Scanner(System.in);
			System.out.println("will you switch or stay:");
			answer = notScanner2.nextLine();
		}
		double win=0.0;
		double loss=0.0;
		for(int i=0; i<sim;i++)
		{
			Random doors2 = new Random(); 
	        int car = doors2.nextInt(3)+1; 
	        int goat1 = doors2.nextInt(3)+1;
	        while(goat1==car)
	        {
	        	goat1 = doors2.nextInt(3)+1;
	        }
	        int goat2 = doors2.nextInt(3)+1;
	        while(goat2 ==car||goat2==goat1)
	        {
	        	goat2 = doors2.nextInt(3)+1;
	        }
	        int guess = doors2.nextInt(3)+1;
	        if (goat1==guess)
	        {
	        	int openDoor=goat2;
	        }
	        else if(goat2==guess)
	        {
	        	int openDoor=goat1;
	        }
	        else 
	        {
	        	int openDoor=goat1;
	        }
	        if(answer.equals("switch"))
	        {
	        	if (guess==goat1)
	        	{
	        		guess=car;
	        	}
	        	else if(guess==goat2)
	        	{
	        		guess=car;	
	        	}
	        	else
	        	{
	        		guess=goat2;
	        	}

	        }
	        if(guess==car)
	        {
	        	System.out.println("won");
	        	win+=1;
	        	System.out.println("win"+ win);
	        }
	        else
	        {
	        	System.out.println("lost");
	        	loss+=1;
	        	System.out.println("loss"+loss);
	        }
		}
		double total = win + loss;
		double stats = win/total;
		System.out.println("you won " + stats + "% of times");
	}



	}


