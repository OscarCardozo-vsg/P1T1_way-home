package usta.fis;

//AUTHOR: Oscar javier Cardozo Diaz
//DATE: 16/03/2021
//DESCRIPTION: This software show a variable than input the user.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----------");
        System.out.println("SoftInputNum V1.0");
        System.out.println("Maker: Oscar Javier Cardozo Diaz");
        System.out.println("------------");
        Scanner keyboard = new Scanner(System.in);

        int v_number1, v_number2, v_sum;
        System.out.println("input the first number: ");
        v_number1= keyboard.nextInt();
        System.out.println("input the second number: ");
        v_number2= keyboard.nextInt();
        v_sum = v_number1+v_number2;
        System.out.println("The total sum is: "+v_sum);
    }
}
