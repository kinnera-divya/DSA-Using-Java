package com.codegnan.app.javaapp.array;

public class SumOfSecondaryDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] a = {
		            {10, 20, 30},
		            {40, 50, 60},
		            {70, 80, 90}
		        };

		        int sum = 0;

		        for (int i = 0; i < 3; i++) {

		            sum = sum + a[i][2 - i];
		        }

		        System.out.println("Secondary diagonal sum = " + sum);

	}

}
