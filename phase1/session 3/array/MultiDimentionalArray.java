package com.simplilearn.array;

public class MultiDimentionalArray {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//lets store elements in matrix
		int array[][]= {{1,2,4},{3,4,5},{9,7,4}};
		
		
//		for(int row=0;row<3;row++)
//		{
//			for(int col=0;col<3;col++)
//			{
//				System.out.println("Enter Element");
//				array[row][col]=sc.nextInt();
//			}
//		}
		
		System.out.println("Let's Print elements");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+"\t");
			}
			
			System.out.println();
		}
	}

}
