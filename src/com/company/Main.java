package com.company;

/*If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed, otherwise, program
        will show "Not allowed”. (use a switch case for this)*/

public class Main {

    public static void main(String[] args) {

//message for user:
        System.out.println("Introduceti un numar de la 0 la 9: ");

        ReturnNumber number = new ReturnNumber();
        try {
            number.returnNumber();
        } catch (java.util.InputMismatchException ss) {
            System.out.println("Nu ati introdus o cifra.");
        }
    }
}
