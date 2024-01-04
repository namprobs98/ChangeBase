/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase;

import sun.security.util.Length;

/**
 *
 * @author Slime nightmare
 */
public class ChangeBase {

    public String changeBase(int inputBase, int outputBase, String inputNumber) {
        String outputNumber = null;
        if (inputBase == outputBase) {
            outputNumber = inputNumber;
        } else if (inputBase == 1 && outputBase == 2) {
            outputNumber = changeBinToDec(inputNumber);
        } else if (inputBase == 1 && outputBase == 3) {
            outputNumber = changeBinToHex(inputNumber);
        } else if (inputBase == 2 && outputBase == 1) {
            outputNumber = changeBinToDec(inputNumber);
        } else if (inputBase == 2 && outputBase == 3) {
            outputNumber = changeBinToDec(inputNumber);
        } else if (inputBase == 3 && outputBase == 1) {
            outputNumber = changeBinToDec(inputNumber);
        } else if (inputBase == 3 && outputBase == 2) {
            outputNumber = changeBinToDec(inputNumber);
        }
        outputNumber = changeHexToDec(inputNumber);
        return outputNumber;
    }

    public String changeBinToDec(String inputNumber) {
        char[] arrayNumber = inputNumber.toCharArray();
        int outputNumber = 0;
        for (int index = 0; index < arrayNumber.length; index++) {
            int numberParseInt = Character.getNumericValue(arrayNumber[index]);
            outputNumber += numberParseInt * Math.pow(2, arrayNumber.length - index - 1);
        }
        return outputNumber + "";
    }

    public static String changeBinToHex(String inputNumber) {
        String changeInput = inputNumber;
        String outputNumber = null;
        while (changeInput.length() % 4 != 0) {
            // Đảm bảo độ dài của chuỗi nhị phân là bội số của 4
            changeInput = "0" + changeInput;
        }
        System.out.println("output change: "+ changeInput);
        char[] arrayNumber = changeInput.toCharArray();
        System.out.println("length arr: "+arrayNumber.length);
        for (int index = 0; index +4 < arrayNumber.length ; index+=4) {
            int binToNumber = 0;
            System.out.println("binToNumber = "+ binToNumber);
            System.out.println("index = "+index);
            for (int secondIndex = index; secondIndex < index + 4; secondIndex++) {
                System.out.println("2index = " + secondIndex);
                int numberParseInt = Character.getNumericValue(arrayNumber[secondIndex]);
                binToNumber += numberParseInt * Math.pow(2, index + 3 - secondIndex);
            }
            
            if (binToNumber<10) {
                    outputNumber = binToNumber + outputNumber;
            }
            else if(binToNumber == 10){
                    outputNumber = "A" + outputNumber;
            }
            else if(binToNumber == 11){
                    outputNumber = "B" + outputNumber;
            }
            else if(binToNumber == 12){
                    outputNumber = "C" + outputNumber;
            }
            else if(binToNumber == 13){
                    outputNumber = "D" + outputNumber;
            }
            else if(binToNumber == 14){
                    outputNumber = "E" + outputNumber;
            }
            else if(binToNumber == 15){
                    outputNumber = "F" + outputNumber;
            }
        }
        
        return outputNumber;
    }
    public static void main(String[] args) {
        System.out.println("output:  "+ changeBinToHex("11001"));
    }

    public String changeDecToBin(String inputNumber) {
        return "";
    }

    public String changeDecToHex(String inputNumber) {
        return "";
    }

    public String changeHexToBin(String inputNumber) {
        return "";
    }

    public String changeHexToDec(String inputNumber) {
        char[] arrayNumber = inputNumber.toCharArray();
        int outputNumber = 0;

        for (int index = 0; index < arrayNumber.length; index++) {
            int numberParseInt = 0;
            if (Character.isDigit(arrayNumber[index])) {
                numberParseInt = Character.getNumericValue(arrayNumber[index]);
            } else if (arrayNumber[index] == 'a' || arrayNumber[index] == 'A') {
                numberParseInt = 10;
            } else if (arrayNumber[index] == 'b' || arrayNumber[index] == 'B') {
                numberParseInt = 11;
            } else if (arrayNumber[index] == 'c' || arrayNumber[index] == 'C') {
                numberParseInt = 12;
            } else if (arrayNumber[index] == 'd' || arrayNumber[index] == 'D') {
                numberParseInt = 13;
            } else if (arrayNumber[index] == 'e' || arrayNumber[index] == 'E') {
                numberParseInt = 14;
            } else if (arrayNumber[index] == 'f' || arrayNumber[index] == 'F') {
                numberParseInt = 15;
            }
            outputNumber += numberParseInt * Math.pow(16, arrayNumber.length - index - 1);
        }
        return outputNumber + "";
    }
}