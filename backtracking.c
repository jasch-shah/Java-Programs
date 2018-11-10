//#include <bits/stdc++.h>
#include<stdio.h>
#include<stdlib.h>
#define N 4


void printSolution(int board[N][N]){
	static int k = 1;
	printf("%d-\n",k++);
	for(int i = 0;i<N;i++)
	{
		for(int j = 0;j<N;j++)
			printf("%d ", board[i][j]);
		printf("\n");
	}
	printf("\n");
}

//check if queen can be placed or not 

bool isSafe(int board[N][N], int row, int col)
{
	int i, j;
	//check this row on left
	for(i = 0;i<col;i++)
		if (board[row][i])
			return false;		
			

	//check upper diagonal on left side
	for(i = row,j = col; i >=0 && j>=0;i--,j--)
		if(board[i][j])
			return false;

	//check lowest diagonal on left side
	for(i = row, j = col; j>=0 && i<N;i++, j--)
	if(board[i][j])
		return false;

	return true;
						
		
}

//recursive method to solve n queens problem
bool solveNQueens(int board[N][N], int col)
{
	if(col == N)
	{
		printSolution(board);
		return true;

	}

	bool res = false;
	for(int i = 0;i<N;i++)
	{
		//check if queen can be placed at board[i][col]
		if(isSafe(board, i, col))
		{
			//place queen at this loc
			board[i][col] = 1;
			//make if any placement is possible
			res = solveNQueens(board, col+1) || res;

			//if placing doesn't give solution then remove queen from that loc
			board[i][col] = 0;	//backtrack

		}
	}
	return res;
}

//sove using backtracking
void solveNQ()
{
	int board[N][N];
	memset(board, 0, sizeof(board));
	if(solveNQueens(board, 0) == false)
	{
		printf("Solution does not exist");
		return ;
	}
	return ;

}

int main()
{
	solveNQ();
	return 0;
}