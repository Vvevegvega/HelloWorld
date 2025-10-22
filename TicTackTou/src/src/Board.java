package src;

import java.util.Random;
import java.util.Scanner;

public class Board {
	private char[][] board;
	private Random random;
	private Scanner scanner;
	private int currentTurn;
	private int endTurn;
	private int currentPlayer;
	private boolean line;
	
	public Board() {
		this.board = new char[3][3];
		this.random = new Random();
		this.scanner = new Scanner(System.in);
		this.currentTurn = 0;
		this.endTurn = 3*3;
		this.line = false;
		this.currentPlayer = random.nextInt(2);
		
		fillBoardWithBlanks();
	}

	private void fillBoardWithBlanks() {
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[0].length; j++) {
				board[i][j] = ' ';
			}
		}
	}
	
	public void printBoard() {
		for(int i = 0 ; i < board.length ; i++) {
			System.out.print(" ");
			for(int j = 0 ; j < board[0].length; j++) {
				if(j != 0) {
					System.out.print("| ");
				}
				System.out.print(board[i][j] + " ");
			}
			System.out.println("");
			if(i != board.length-1) {
				printHorizontalLine();
			}

		}
	}
	
	private void printHorizontalLine() {
		for(int i = 0 ; i < board.length ; i++) {
			System.out.print("——— ");
		}
		System.out.println();
	}

	public void machineTurn() {
		int row, col;
		do {
			row = random.nextInt(board.length);
			col = random.nextInt(board[0].length);
		}while(board[row][col] != ' ');
		
		board[row][col] = 'x';
		checkLine(row, col, 'x');
	}

	public void userTurn() {
		int row, col;
		do {
			System.out.println("Enter Row:");
			row = scanner.nextInt();
			System.out.println("Enter Column:");
			col = scanner.nextInt();
		}while(row >= board.length || row <0 
				|| col >= board[0].length || col < 0
				|| board[row][col] != ' ');

		board[row][col] = 'o';
		checkLine(row, col, 'o');
	}
	
	private void checkLine(int row, int col, char c) {
		int charsForLine = board.length;
		int equalCharsInLine;
		int counter;
		
		if(line != true) {
		//Vertical
			equalCharsInLine = 0;
			for(int i = 0; i < board.length ; i++) {
				if(board[i][col] == c) {
					equalCharsInLine++;
				}
			}
			if(equalCharsInLine == charsForLine) {
				line = true;
			}
			
		//Horizontal
			equalCharsInLine = 0;
			for(int i = 0; i < board.length ; i++) {
				if(board[row][i] == c) {
					equalCharsInLine++;
				}
			}
			if(equalCharsInLine == charsForLine) {
				line = true;
			}
			
		//Diagonal1
			equalCharsInLine = 0;
			counter = 0;
			do {
				if(board[row+counter][col+counter] == c) {
					equalCharsInLine++;
				}
				counter++;
			}while((row + counter) < board.length &&
					(col + counter) < board[0].length);
			
			counter = 0;
			do {
				if(board[row-counter][col-counter] == c) {
					equalCharsInLine++;
				}
				counter++;
			}while((row - counter) >= 0 &&
					(col - counter) >= 0);
			equalCharsInLine --;
			if(equalCharsInLine == charsForLine) {
				line = true;
			}
			
		//Diagonal2
			equalCharsInLine = 0;
			counter = 0;
			do {
				if(board[row+counter][col-counter] == c) {
					equalCharsInLine++;
				}
				counter++;
			}while((row + counter) < board.length &&
					(col - counter) >= 0);
			
			counter = 0;
			do {
				if(board[row-counter][col+counter] == c) {
					equalCharsInLine++;
				}
				counter++;
			}while((row - counter) >= 0 &&
					(col + counter) < board[0].length);
			equalCharsInLine --;
			if(equalCharsInLine == charsForLine) {
				line = true;
			}
		}
		
	}

	public boolean notFinished() {
		return !(currentTurn == endTurn || line);
	}

	public void playTurn() {
		currentTurn++;
		switch(currentPlayer) {
			case 0:{
				System.out.println("Player's turn:");
				userTurn();
				currentPlayer = 1;
				break;
			}
			case 1:{
				System.out.println("Machine's turn:");
				machineTurn();
				currentPlayer = 0;
				break;
			}
			default:{
				throw new RuntimeException("Turn select is broken");
			}
		}
	}
}
