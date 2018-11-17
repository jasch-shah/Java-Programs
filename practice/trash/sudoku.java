import java.util.*;

public class sudoku{
	private static int maxPos = Integer.MIN_VALUE;

	public static void solve(int[][] board,int n){
		List<Integer> row = new ArrayList<>(),col = new ArrayList<>();
		for(int i = 0;i<n;i++)
			for(int j = 0;j<n;j++)
				if(board[i][j] == 0){
					row.add(i);
					col.add(j);
				}
		if(solveUtil(board,n,row.toArray(new Integer[]{}),col.toArray(new Integer[]{}),0))	
			printBoard(board,n);
		else
		System.out.println("No solution exist for given configuration");		
	}

	private static void printBoard(int[][] board,int n){
		for(int i=0;i<n;i++)
			System.out.println(Arrays.toString(board[i]));
	}

	private static boolean solveUtil(int[][] board,int n,Integer[] row,Integer[] col,int pos){
		if(pos > maxPos) maxPos = pos;
		if(pos == row.length) return true;
		assert board[row[pos]][col[pos]] == 0;
		for(int i = 1;i<=9;i++){
			if(isSafe(board,n,row[pos],col[pos],i)){
				board[row[pos]][col[pos]] = i;
				if(solveUtil(board,n,row,col,pos+1)) return true;
				board[row[pos]][col[pos]] = 0;

			}
		}
		return false;
	}
	private static boolean isSafe(int[][] board,int n,int row,int col,int val){
		assert board[row][col] == 0;
		int startRow = row/ 3 * 3,endRow = startRow + 3,startCol = col / 3 * 3,endcol = startCol + 3;
		for(int i = startRow;i<endRow;i++)
			for(int j = startCol;j<endcol;j++){
				if(board[i][j] == val) return false;
			}
			for(int i = 0;i<n;i++)
				if(board[row][i] == val) return false;

			for(int i = 0;i<n;i++)
				if(board[i][col] == val) return false;
			return true;
	}

	public static void main(String[] args) {
    int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                    {5, 2, 0, 0, 0, 0, 0, 0, 0},
                    {0, 8, 7, 0, 0, 0, 0, 3, 1},
                    {0, 0, 3, 0, 1, 0, 0, 8, 0},
                    {9, 0, 0, 8, 6, 3, 0, 0, 5},
                    {0, 5, 0, 0, 9, 0, 6, 0, 0},
                    {1, 3, 0, 0, 0, 0, 2, 5, 0},
                    {0, 0, 0, 0, 0, 0, 0, 7, 4},
                    {0, 0, 5, 2, 0, 6, 3, 0, 0}};
    solve(grid, 9);
    System.out.println(maxPos);
  }
}