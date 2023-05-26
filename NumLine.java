import java.util.*;

public class NumLine{
		
	private int r, c;
	
	public void SetNumLine(int r, int c){
		this.r=r;
		this.c=c;
	}
		
	public int getNumLine(){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of x axis: ");
		r = sc.nextInt();
		System.out.print("Enter size of y axis: ");
		c = sc.nextInt();
		
		
		for(int i=(0+c);i>=1;i--){
			for(int j = 0; j < c; j++)
			{
				System.out.print("\t");
			}
				System.out.print(i+"\n\n\n");
		}
			for(int i=(0-r);i<=0;i++){
				System.out.print(i+"\t");
			}
			for(int i=1;i<=r;i++){
				System.out.print(i+"\t");
			}
			System.out.print("\n\n\n");
			for(int i=-1;i>=(-c);i--){
				for(int j=0; j < c; j++)
				{
					System.out.print("\t");
				}
			System.out.print(i+"\n\n\n");
		}			
		return -1;
	}
}
