package Assignment_ACDT;

import java.util.Scanner;

public class Sparse_Matrix {
	
	static Scanner scanner  = new Scanner(System.in);
	
	private int row,col,len;
	private int maxElement;
	private int[][] sparseArray;
	
	Sparse_Matrix(int r, int c, int count)
	{
		row =r;
		col=c;
		len=0;
		maxElement= count;
		sparseArray= new int[maxElement][3];
	}
	private void insert(int r,int c,int val)
	{
		sparseArray[len][0] = r;
		sparseArray[len][1] = c;
		sparseArray[len][2] = val;
		len++;
	}

	private void display()
	{
		/*System.out.println(maxElement);*/
		
		for(int i=0;i<sparseArray.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sparseArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		
		int[][] arr = new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j] = scanner.nextInt();
			}
		}
		
		int count =0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]!=0)
				{
					count++;
				}
			}
		}

		Sparse_Matrix obj= new Sparse_Matrix(row, col, count);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]!=0)
				{
					obj.insert(i, j,arr[i][j]);
				}
			}
		}
		obj.display();
	}

}
