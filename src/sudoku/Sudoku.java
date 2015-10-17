package sudoku;

public class Sudoku {

	public static void main(String[] args) {	
		/* This code solves a sudoku problem. It is a very simple solver, which only
		 * checks if any digit already appears in its row, column and box. This also 
		 * means, that not every sudoku problem out there can be solved.*/
		
		SudokuProblem sudokuProblem = new SudokuProblem();
		int[][] p = sudokuProblem.defaultSudokuProblemEasy();
		SudokuPlayer sudokuPlayer = new SudokuPlayer(p);
		int[][] pSolved = sudokuPlayer.ordinarySolve();
		
		sudokuProblem.displaySudokuProblem(pSolved);
		
	}

}
