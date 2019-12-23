
public class Solution {
    static void printSol(int[][] sol,int n){
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++){
                System.out.print(sol[i][j] + " ");
            }
            
        } 
        System.out.println(); 
    }
	
	static boolean isPossible(int[][] maze,int x,int y){
        int n=maze.length;        
        return(x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
             
    }
	static void findPath(int[][] maze,int n,int x,int y,int[][] sol){
        
        if(x==n-1 && y==n-1){
            sol[x][y]=1;
            printSol(sol,n);
        sol[x][y]=0;
            return;
        }
        if(x>=n || x<0 || y>=n || y<0 || maze[x][y] ==0 || sol[x][y] ==1){
            return;
        }
        sol[x][y]=1;
        
        findPath(maze,n, x-1, y , sol);
        findPath(maze,n, x + 1, y, sol);
        findPath(maze,n, x, y - 1, sol);
        findPath(maze,n,x, y + 1, sol);
    
        sol[x][y] = 0;    
              
    }
	public static void ratInAMaze(int maze[][]){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Print output as specified in the question
	 */
      
      int n=maze.length;
      int[][] sol=new int[n][n];
      findPath(maze,n,0,0,sol); 
     
      
       		
	}

	
	
}
