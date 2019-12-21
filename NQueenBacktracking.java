import java.util.*;
import java.lang.*;
public class Solution {

    
    static boolean isPossible(int n,int row,int col,int[][] board){

// Same Column
  for(int i=row-1;i>=0;i--){
    if(board[i][col] == 1){
      return false;
    }
  }
//Upper Left Diagonal
  for(int i=row-1,j=col-1;i>=0 && j>=0 ; i--,j--){
    if(board[i][j] ==1){
      return false;
    }
  }

  // Upper Right Diagonal

  for(int i=row-1,j=col+1;i>=0 && j<n ; i--,j++){
    if(board[i][j] == 1){
      return false;
    }
  }

  return true;
}
static void nQueenHelper(int n,int row,int[][] board){
    if(row==n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
        }
        System.out.println();
    }
     for(int j=0;j<n;j++){

    if(isPossible(n,row,j,board)){
      board[row][j] = 1;
      nQueenHelper(n,row+1,board);
      board[row][j] = 0;
    }
  }
  return;
}
static void placeNQueens(int n){
    int[][] board=new int[n][n];
  nQueenHelper(n,0,board);

}
}
