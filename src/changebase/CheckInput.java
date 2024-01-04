/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package changebase;

public class CheckInput {

    public boolean checkBinary(String inputString) {
        return inputString.matches("[01]+");
    }

    public boolean checkDecimal(String inputString) {
        return inputString.matches("\\d+");
    }

    public boolean checkHexadecimal(String inputString) {
        return inputString.matches("[0-9A-Fa-f]+");
    }

    public boolean checkBase(String inputString) {
        return inputString.matches("[123]");
    }
//    public static void main(String[] args) {
//        System.out.println(checkBinary("10a001"));
//    }
}
