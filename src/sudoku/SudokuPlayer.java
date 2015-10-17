package sudoku;

import java.util.ArrayList;

public class SudokuPlayer {
			
		private int numCol = 9;
		private int numRow = 9;
		private int[][] sudokuProblem = new int[this.numRow][this.numCol];
		private ArrayList<Integer> poss = new ArrayList<Integer>();
		
		public SudokuPlayer(int[][] sudokuProblem) {
			this.sudokuProblem = sudokuProblem;
		}
		
		public int[][] ordinarySolve() {

			/* main loop */
			while (checkIfSolved(this.sudokuProblem)){
				for (int i=0;i<this.numRow;i++){
					for (int j=0;j<this.numCol;j++) {
						
						// check if values need to be found
						if (this.sudokuProblem[i][j]==0) {
							for (int n=1;n<10;n++) {
								if (checkRow(i,n)&&checkCol(j,n)&&checkBox(i,j,n)){
									boolean t = this.poss.add(n);
									if (!t) {
										System.out.println("Possible number coudln't be added to ArrayList");
									}
								}														
							}
							/* fill in only solution */
							if ((!this.poss.isEmpty()) && (this.poss.size()==1)) {
								this.sudokuProblem[i][j] = this.poss.get(0);
								this.poss.clear();
							} else {
								this.poss.clear();
							}
						} else {
							System.out.println("skip value");
						}
						
					}
				}
			}
			
			System.out.println("Done");
			return this.sudokuProblem;
			
		}
		
		private boolean checkRow(int row, int num) {
			boolean check = true;
			
			for (int i=0;i<this.numRow;i++){
				if (this.sudokuProblem[row][i]==num) {
					check = false;
				}
			}
			
			return check;
		}  
		
		private boolean checkCol(int col, int num) {
			boolean check = true;
			
			for (int i=0;i<this.numCol;i++){
				if (this.sudokuProblem[i][col]==num) {
					check = false;
				}
			}
			
			return check;
		}
		
		private boolean checkBox(int row, int col, int num) {
			int rowBox = 0;
			int colBox = 0;
			boolean check = true;
			
			// condition box
			if ((0 <= row) && (row <= 2)) {
				rowBox = 3;
				if ((0 <= col) && (col <= 2)) {
					colBox = 3;
				} else if ((3 <= col) && (col <= 5)) {
					colBox = 6;
				} else if ((6 <= col) && (col <= 8)) {
					colBox = 9;
				} else {
					System.out.println("column index out of range");
				}				
			} else if (3 <= row && row <= 5) {
				rowBox = 6;
				if ((0 <= col) && (col <= 2)) {
					colBox = 3;
				} else if ((3 <= col) && (col <= 5)) {
					colBox = 6;
				} else if ((6 <= col) && (col <= 8)) {
					colBox = 9;
				} else {
					System.out.println("column index out of range");
				}
				
			} else if (6 <= row && row <= 8) {
				rowBox = 9;
				if ((0 <= col) && (col <= 2)) {
					colBox = 3;
				} else if ((3 <= col) && (col <= 5)) {
					colBox = 6;
				} else if ((6 <= col) && (col <= 8)) {
					colBox = 9;
				} else {
					System.out.println("column index out of range");
				}
				
			} else {
				System.out.println("row index out of range");
			}
			
			for (int i = (rowBox-3); i<rowBox; i++) {
				for (int j = (colBox-3); j<colBox; j++) {
					if (this.sudokuProblem[i][j]==num) {
						check = false;
					}
				}
			}
			
			return check;
		}
		
		private boolean checkIfSolved(int[][] sudokuProblem) {
			boolean check = false;
			
			for (int i=0;i<this.numCol;i++) {
				for (int j=0;j<this.numCol;j++) {
					if (sudokuProblem[i][j]==0) {
						check = true;
					}
				}
			}
			return check;
		}

}
