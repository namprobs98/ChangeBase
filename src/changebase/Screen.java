/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase;

import java.util.Scanner;

/**
 *
 * @author Slime nightmare
 */
public class Screen {

    Scanner sc = new Scanner(System.in);
    CheckInput check = new CheckInput();

    public int chooseInputBase() {

        System.out.println("1. Bin\n"
                + "2. Dec\n"
                + "3. Hex"
        );
        System.out.print("Choose base input(1,2,3): ");
        String stringBaseInput = sc.nextLine();
        boolean loop = true;
        while (loop) {
            if (check.checkBase(stringBaseInput)) {
                loop = false;
            } else {
                System.out.print("please choose base only enter 1 or 2 or 3: ");
                stringBaseInput = sc.nextLine();
                loop = true;
            }
        }
        int baseInput = Integer.parseInt(stringBaseInput);
        System.out.println("______________________");
        return baseInput;
    }

    public int chooseOutputBase() {
        System.out.println("1. Bin\n"
                + "2. Dec\n"
                + "3. Hex"
        );
        System.out.print("Choose base output(1,2,3): ");
        String stringBaseOutput = sc.nextLine();
        boolean loop = true;
        while (loop) {
            if (check.checkBase(stringBaseOutput)) {
                loop = false;
            } else {
                System.out.print("please choose base only enter 1 or 2 or 3: ");
                stringBaseOutput = sc.nextLine();
                loop = true;
            }
        }
        int baseOutput = Integer.parseInt(stringBaseOutput);
        System.out.println("______________________");
        return baseOutput;
    }

    public String enterInputNumber(int baseInput) {
        System.out.print("Enter input number: ");
        String inputNumber = sc.nextLine();

        switch (baseInput) {
            case 1:
                boolean loop = true;
                while (loop) {
                    if (check.checkBinary(inputNumber)) {
                        loop = false;
                        return inputNumber;
                    } else {
                        System.out.print("please enter binary number: ");
                        inputNumber = sc.nextLine();
                        loop = true;
                    }
                }
                break;

            case 2:
                loop = true;
                while (loop) {
                    if (check.checkDecimal(inputNumber)) {
                        loop = false;
                        return inputNumber;
                    } else {
                        System.out.print("please enter decimal number: ");
                        inputNumber = sc.nextLine();
                        loop = true;
                    }
                }
                break;

            case 3:
                loop = true;
                while (loop) {
                    if (check.checkHexadecimal(inputNumber)) {
                        loop = false;
                        return inputNumber;
                    } else {
                        System.out.print("please enter hexadecimal number: ");
                        inputNumber = sc.nextLine();
                        loop = true;
                    }
                }
                break;
        }
        return inputNumber;
    }

    public void outputvalue(int inputBase, int outputBase, String inputValue) {
        ChangeBase change = new ChangeBase();
        String outputNumber = change.changeBase(inputBase, outputBase, inputValue);
        System.out.println("output: " + outputNumber);
    }
}
