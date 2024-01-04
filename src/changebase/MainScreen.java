/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package changebase;

/**
 *
 * @author Slime nightmare
 */
public class MainScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Step1: Choose base input
        Screen scr = new Screen();
        int baseInput = scr.chooseInputBase();
        //Step2: Choose base output
        int baseOutput = scr.chooseOutputBase();
        //Step3: Enter input
        String inputNumber = scr.enterInputNumber(baseInput);
        //Step4: Show output number
        scr.outputvalue(baseInput, baseOutput, inputNumber);
        
    }

}
