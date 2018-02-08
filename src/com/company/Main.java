package com.company;

/*If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program
        will show "Not allowed”. (use a switch case for this)*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti un numar de la 0 la 9: ");
        int numberFromUser = 0;
        try {
            numberFromUser = scan.nextInt();
        } catch (java.util.InputMismatchException a ) {
            System.out.println("Nu ati introdus un numar.");;
        }

        switch (numberFromUser){
            case 1: numberFromUser=0;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 2:numberFromUser=1;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 3:numberFromUser=2;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 4:numberFromUser=3;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 5:numberFromUser=4;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 6:numberFromUser=5;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 7:numberFromUser=6;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 8:numberFromUser=7;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            case 9:numberFromUser=8;
                System.out.println("Numarul introdus este: " + numberFromUser);
                break;
            default: System.out.println("Error!");
        }
    }
}
