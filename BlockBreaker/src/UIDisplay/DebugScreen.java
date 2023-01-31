package UIDisplay;

import Screens.BuildContext;
import Screens.Screen;

import java.util.Scanner;

public class DebugScreen extends Screen {
    @Override
    public void build(BuildContext context) {
        System.out.println("\n****************************************************************************************************************************************\n");
        System.out.print("Below are the tests that can be run for debugging purposes:\n------------------------------------------------------\n\n" + CoreFunctions.debuggingCommandList() + "\nEnter command: ");
        String command = new Scanner(System.in).nextLine();

        while(!command.equalsIgnoreCase("return")){
            while (isInvalidCommand(command)) {
                alertInvalidCommand();
                command = getInput(true);
            }

            if (command.equalsIgnoreCase("recoverability")) {
                System.out.println("Test " + (recoverabilityTest() ? "passed" : "failed") + ".");
            } else if (command.equalsIgnoreCase("predictability")) {
                System.out.println("Test " + (predictabilityTest() ? "passed" : "failed") + ".");
            }

            if(!command.equalsIgnoreCase("return")){
                command = getInput(false);
            }
        }

        context.ROUTE.pop();
    }

    /**
     TODO: performs a test ensuring that proper recoverability is possible for character
     generation.
     @return True, if the test was passed. Else, false.
     */
    private boolean recoverabilityTest(){
        /*final QuickGenerate GENERATOR = new QuickGenerate();
        for(int i = 0; i < 100; i++){
            switch ((int) (new Random().nextDouble() * 10)) {
                case 0 -> GENERATOR.generate();
                case 1 -> GENERATOR.regenerateName();
                case 2 -> GENERATOR.regeneratePhysicalCharacteristics();
                case 3 -> GENERATOR.regeneratePersonality();
                case 4 -> GENERATOR.setGenerateName(true);
                case 5 -> GENERATOR.setGeneratePhysicalCharacteristics(true);
                case 6 -> GENERATOR.setGeneratePersonality(true);
                case 7 -> GENERATOR.setGenerateName(false);
                case 8 -> GENERATOR.setGeneratePhysicalCharacteristics(false);
                default -> GENERATOR.setGeneratePersonality(false);
            }
        }

         */

        return false;
    }

    /**
     Performs a test ensuring that proper unpredictability is possible for character
     generation.
     @return True, if the test was passed. Else, false.
     */
    private boolean predictabilityTest(){
        QuickGenerate[] generators = new QuickGenerate[10000];
        for(int i = 0; i < generators.length; i++){
            generators[i] = new QuickGenerate();
        }

        for(int i = 0; i < generators.length; i++){
            int count = 0;
            for(int j = 0; j < generators.length; j++){
                if(i != j && generators[i].equals(generators[j]) && (++count > generators.length / 1000)){
                    return false;
                }
            }
        }

        return true;
    }

    /**
     Retrieves the next user command.
     @param showCommands boolean representing whether to display possible commands before
     asking for a command to be entered
     @return the user input
     */
    private String getInput(boolean showCommands){
        System.out.print((showCommands ? CoreFunctions.debuggingCommandList() : "") + "\nEnter command: ");
        return new Scanner(System.in).nextLine();
    }

    /**
     Checks whether or not the given value is an invalid command.
     @param val the command to be checked
     @return True, if the value is an invalid command. Else, false.
     */
    private boolean isInvalidCommand(String val){
        return !val.equalsIgnoreCase("recoverability") && !val.equalsIgnoreCase("predictability")
                && !val.equalsIgnoreCase("return");
    }

    /**
     Alerts the user that a given command was invalid.
     */
    private void alertInvalidCommand(){
        System.out.println("\n-----------------------------------------\n----- The given command was invalid -----\n-----------------------------------------\n");
    }
}
