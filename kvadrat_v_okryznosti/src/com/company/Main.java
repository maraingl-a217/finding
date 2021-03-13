package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
	int i, res, res_1;

        System.out.print("Enter radius: ");
        i = num.nextInt();
        res = 2*i;
        res_1 = res*res;
        System.out.print("S = " + res_1);


    }
}
