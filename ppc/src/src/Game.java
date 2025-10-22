package src;

import java.util.Random;
import java.util.Scanner;

public class Game {
	
	private enum rpc{rock, paper, scisors}
	private Scanner scan;
	private String ans, robotAns;
	private Random ran = new Random();
	
	public Game() {
		this.scan = new Scanner(System.in);
		this.ans = "";
		this.robotAns = "";
	}
	
	public void play() {
		do {
			getPlayerAns();
			System.out.println("----------------------------");
			System.out.println("Player 1: " + ans);
			getrobotAns();
			System.out.println("Player 2: " +robotAns);
			
		}while(ans.equals(robotAns));
		
	}

	private void getrobotAns() {
		int aux = ran.nextInt(3);
		
		switch(aux) {
		case 0:
			robotAns = rpc.rock.name();
			break;
		case 1:
			robotAns = rpc.paper.name();
			break;
		case 2:
			robotAns = rpc.scisors.name();
			break;
		default:
			break;
		}
		
	}

	private void getPlayerAns() {
		System.out.println("Rock, Paper or Scisor?:");
		ans = scan.nextLine().toLowerCase();	
		
		switch(ans) {
		case "rock":
		case "r":
			ans = rpc.rock.name();
			break;
		case "paper":
		case "p":
			ans = rpc.paper.name();
			break;
		case "scisors":
		case "s":
		default:
			ans = rpc.scisors.name();
			break;
		}
	}

	public boolean playAgain() { 
		System.out.println("Do you want to play again?");
		System.out.println("(Yes) (No)");
		
		String ans = scan.nextLine().toLowerCase();
		
		switch(ans) {
		case "yes":
		case "y":
			return true;
		case "no":
		case "n":
			return false;
		default:
			return false;
		}
	}
}
