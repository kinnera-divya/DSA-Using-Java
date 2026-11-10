package com.codegnan.app.javaapp.array;

public class SumOfEachColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {
		            {10, 20, 30},
		            {40, 50, 60},
		            {70, 80, 90}
		        };

		        for (int j = 0; j < 3; j++) {

		            int sum = 0;

		            for (int i = 0; i < 3; i++) {

		                sum = sum + a[i][j];
		            }

		            System.out.println("Column " + (j + 1) + " sum = " + sum);
		        }

	}

}
