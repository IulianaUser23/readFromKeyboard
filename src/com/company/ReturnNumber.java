package com.company;

import java.util.Scanner;

/**
 * Created by User on 08.02.2018.
 */
public class ReturnNumber {

    public void returnNumber() {
        Scanner scan = new Scanner(System.in);
        int numberFromUser = -1;


            numberFromUser = scan.nextInt();



        switch (numberFromUser) {
            case 0:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 1:
                System.out.println("Cifra introdusaeste: " + numberFromUser);
                break;
            case 2:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 3:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 4:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 5:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 6:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 7:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 8:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            case 9:
                System.out.println("Cifra introdusa este: " + numberFromUser);
                break;
            default:
                System.out.println("Eroare - valoare in afara itervalului 0-9 ");
        }
    }
}

