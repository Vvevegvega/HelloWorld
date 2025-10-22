package src;

public class App {
	private Board board;
	
	public App() {
		this.board = new Board();
		
		do {
			board.printBoard();
			board.playTurn();
		}while(board.notFinished());
		board.printBoard();
	}
	
	public static void main(String args[]) {
		new App();
	}
}
