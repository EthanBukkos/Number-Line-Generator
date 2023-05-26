public class Grid{

private int r;
private int c;
private int[][] grid = new int [r][c];



	
public void setGrid(int grid [][]){
	this.grid  = grid;
}

public int getGrid(){
	for(int i = 0; i<=r; i++)
		for (int j = 0; i<=c; i++)
		grid[i][j] = (i+1) * (j+1);
		
	for(int x[] : grid){
		for(int y : x) {
			System.out.println(y);
		}
	}
	return 1;
}
}
	
	


