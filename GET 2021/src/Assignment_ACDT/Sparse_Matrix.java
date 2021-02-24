package Assignment_ACDT;

import java.util.Arrays;
import java.util.Scanner;

public class Sparse_Matrix {
	
	static Scanner scanner  = new Scanner(System.in);
	
	private int row,col,len;
	private int maxElement;
	private int[][] sparseArray;
	
	Sparse_Matrix(int r, int c)
	{
		row =r;
		col=c;
		len=0;
	}
	
	public void setSparseArraySize(int n)
	{
		maxElement= n;
		sparseArray= new int[maxElement][3];
	}
	private void insert(int r,int c,int val)
	{
		sparseArray[len][0] = r;
		sparseArray[len][1] = c;
		sparseArray[len][2] = val;
		len++;
	}

	private int[][] getSparseArray()
	{
		return sparseArray;
	}
	
	private void transposeArray(int[][] arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[i][0];
			arr[i][0] = arr[i][1];
			arr[i][1] = temp;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
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

		Sparse_Matrix obj= new Sparse_Matrix(row, col);
		obj.setSparseArraySize(count);
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
		
		int[][] sparseArray= obj.getSparseArray();
		obj.transposeArray(sparseArray);
		
		
	}

}
