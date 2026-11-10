package com.codegnan.app.javaapp.array;

public class CommonElements {

	public static void main(String[] args) {
		

        int[] a = {10, 20, 30, 40};
        int[] b = {20, 30, 50, 60};
        int[] c = {20, 30, 70, 80};

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                for (int k = 0; k < c.length; k++) {

                    if (a[i] == b[j] && b[j] == c[k]) {
                        System.out.println(a[i]);
                        break;
                    }
                }
            }
        }

	}

}
