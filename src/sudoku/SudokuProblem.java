package sudoku;

public class SudokuProblem {

	private int numRow = 9;
	private int numCol = 9;
	private int[][] sudokuPorblem = new int[this.numRow][this.numCol];
	
	public SudokuProblem() {
	}
	
	public SudokuProblem(int[][] sudokuPorblem) {	
		this.sudokuPorblem = sudokuPorblem;
	}
	
	public int[][] getSudokuPorblem() {
		return sudokuPorblem;
	}

	public void setSudokuPorblem(int[][] sudokuPorblem) {
		this.sudokuPorblem = sudokuPorblem;
	}
	
	public int[][] defaultSudokuProblem() {
		sudokuPorblem[0][4] = 2;
		sudokuPorblem[0][8] = 5;
		sudokuPorblem[1][1] = 9;
		sudokuPorblem[1][6] = 8;
		sudokuPorblem[1][7] = 7;
		sudokuPorblem[2][4] = 8;
		sudokuPorblem[2][6] = 6;
		sudokuPorblem[2][7] = 2;
		sudokuPorblem[3][0] = 2;
		sudokuPorblem[3][2] = 9;
		sudokuPorblem[4][0] = 5;
		sudokuPorblem[4][3] = 4;
		sudokuPorblem[4][5] = 8;
		sudokuPorblem[4][8] = 1;
		sudokuPorblem[5][6] = 4;
		sudokuPorblem[5][8] = 7;
		sudokuPorblem[6][1] = 7;
		sudokuPorblem[6][2] = 6;
		sudokuPorblem[6][4] = 9;
		sudokuPorblem[7][1] = 2;
		sudokuPorblem[7][2] = 1;
		sudokuPorblem[7][7] = 5;
		sudokuPorblem[8][0] = 8;
		sudokuPorblem[8][4] = 4;
		
		return this.sudokuPorblem;
	}
	
	public int[][] defaultSudokuProblemEasy() {
		sudokuPorblem[0][0] = 5;
		sudokuPorblem[0][1] = 3;
		sudokuPorblem[0][4] = 7;
		sudokuPorblem[1][0] = 6;
		sudokuPorblem[1][3] = 1;
		sudokuPorblem[1][4] = 9;
		sudokuPorblem[1][5] = 5;
		sudokuPorblem[2][1] = 9;
		sudokuPorblem[2][2] = 8;
		sudokuPorblem[2][7] = 6;
		sudokuPorblem[3][0] = 8;
		sudokuPorblem[3][4] = 6;
		sudokuPorblem[3][8] = 3;
		sudokuPorblem[4][0] = 4;
		sudokuPorblem[4][3] = 8;
		sudokuPorblem[4][5] = 3;
		sudokuPorblem[4][8] = 1;
		sudokuPorblem[5][0] = 7;
		sudokuPorblem[5][4] = 2;
		sudokuPorblem[5][8] = 6;
		sudokuPorblem[6][1] = 6;
		sudokuPorblem[6][6] = 2;
		sudokuPorblem[6][7] = 8;
		sudokuPorblem[7][3] = 4;
		sudokuPorblem[7][4] = 1;
		sudokuPorblem[7][5] = 9;
		sudokuPorblem[7][8] = 5;
		sudokuPorblem[8][4] = 8;
		sudokuPorblem[8][7] = 7;
		sudokuPorblem[8][8] = 9;
		
		return this.sudokuPorblem;
	}
	
	public void displaySudokuProblem(int[][] sudokoProblem) {
		for (int i=0;i<this.numRow;i++) {
			for (int j=0;j<this.numCol;j++) {
				if ((j % this.numCol) == (this.numCol-1)) {
					System.out.println(sudokoProblem[i][j]);
				} else {
					System.out.print(sudokoProblem[i][j]+" ");
					
				}
			}
		}
		
	}
	
}
