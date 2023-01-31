package UIDisplay;

import Generation.GenerationNode;
import Screens.BuildContext;
import Screens.Screen;

import java.util.Scanner;

public final class GeneratorScreen extends Screen {
    private final QuickGenerate GENERATOR = new QuickGenerate();
    @Override
    public void build(BuildContext context) {
        String command = "generate";

        do {
            System.out.println("\n****************************************************************************************************************************************\n");
            System.out.println("Below is the description for your generated character:\n------------------------------------------------------\n");

            if (command.equalsIgnoreCase("generate")) {
                GENERATOR.generate();
            } else if (command.equalsIgnoreCase("regenerate name")) {
                GENERATOR.regenerateName();
            } else if (command.equalsIgnoreCase("regenerate physical characteristics")) {
                GENERATOR.regeneratePhysicalCharacteristics();
            } else if (command.equalsIgnoreCase("regenerate personality")) {
                GENERATOR.regeneratePersonality();
            } else if (command.equalsIgnoreCase("show name")) {
                GENERATOR.setGenerateName(true);
            } else if (command.equalsIgnoreCase("show physical characteristics")) {
                GENERATOR.setGeneratePhysicalCharacteristics(true);
            } else if (command.equalsIgnoreCase("show personality")) {
                GENERATOR.setGeneratePersonality(true);
            } else if (command.equalsIgnoreCase("hide name")) {
                GENERATOR.setGenerateName(false);
            } else if (command.equalsIgnoreCase("hide physical characteristics")) {
                GENERATOR.setGeneratePhysicalCharacteristics(false);
            } else if (command.equalsIgnoreCase("hide personality")) {
                GENERATOR.setGeneratePersonality(false);
            }

            for (GenerationNode node : GENERATOR) {
                System.out.println("- " + node.NAME + ":\n" + node.CONTENT);
                System.out.println();
            }

            System.out.println("****************************************************************************************************************************************\n");

            boolean toContinue = false;
            while (!toContinue) {
                command = getInput(false);
                if (isInvalidCommand(command)) {
                    while (isInvalidCommand(command)) {
                        alertInvalidCommand();
                        command = getInput(true);
                    }
                }

                if (command.equalsIgnoreCase("generate")
                        || command.equalsIgnoreCase("regenerate name")
                        || command.equalsIgnoreCase("regenerate physical characteristics")
                        || command.equalsIgnoreCase("regenerate personality")) {
                    String question;
                    if (command.equalsIgnoreCase("generate")) {
                        question = "Are you sure that you want to regenerate a completely new description? Doing so will delete the entire current description. (Enter 'yes' or 'no')";
                    } else if (command.equalsIgnoreCase("regenerate name")) {
                        question = "Are you sure that you want to regenerate the 'Name' section? Doing so will delete the current section. (Enter 'yes' or 'no')";
                    } else if (command.equalsIgnoreCase("regenerate physical characteristics")) {
                        question = "Are you sure that you want to regenerate the 'Physical Characteristics' section? Doing so will delete the current section. (Enter 'yes' or 'no')";
                    } else {
                        question = "Are you sure that you want to regenerate the 'Personality' section? Doing so will delete the current section. (Enter 'yes' or 'no')";
                    }

                    toContinue = new SimpleAlert(question).build(context).equalsIgnoreCase("yes");
                } else if(command.equalsIgnoreCase("debug")){
                    context.ROUTE.push(new DebugScreen(), context);
                    System.out.println("\n****************************************************************************************************************************************\n\nWelcome back to the generator screen!");
                } else {
                    toContinue = true;
                }
            }
        } while (!command.equalsIgnoreCase("exit"));

        context.ROUTE.push(new EndScreen(), context);
    }

    /**
     Retrieves the next user command.
     @param showCommands boolean representing whether to display possible commands before
     asking for a command to be entered
     @return the user input
     */
    private String getInput(boolean showCommands){
        System.out.print((showCommands ? CoreFunctions.commandList() : "") + "\nEnter command: ");
        return new Scanner(System.in).nextLine();
    }

    /**
     Checks whether or not the given value is an invalid command.
     @param val the command to be checked
     @return True, if the value is an invalid command. Else, false.
     */
    private boolean isInvalidCommand(String val){
        return !val.equalsIgnoreCase("exit")
                && !val.equalsIgnoreCase("debug")
                && !val.equalsIgnoreCase("generate")
                && !(val.equalsIgnoreCase("regenerate name") && GENERATOR.isGeneratingName())
                && !(val.equalsIgnoreCase("regenerate physical characteristics") && GENERATOR.isGeneratingPhysicalCharacteristics())
                && !(val.equalsIgnoreCase("regenerate personality") && GENERATOR.isGeneratingPersonality())
                && !(val.equalsIgnoreCase("show name") && !GENERATOR.isGeneratingName())
                && !(val.equalsIgnoreCase("show physical characteristics") && !GENERATOR.isGeneratingPhysicalCharacteristics())
                && !(val.equalsIgnoreCase("show personality") && !GENERATOR.isGeneratingPersonality())
                && !(val.equalsIgnoreCase("hide name") && GENERATOR.isGeneratingName())
                && !(val.equalsIgnoreCase("hide physical characteristics") && GENERATOR.isGeneratingPhysicalCharacteristics())
                && !(val.equalsIgnoreCase("hide personality") && GENERATOR.isGeneratingPersonality());
    }

    /**
     Alerts the user that a given command was invalid.
     */
    private void alertInvalidCommand(){
        System.out.println("\n-----------------------------------------\n----- The given command was invalid -----\n-----------------------------------------\n");
    }
}
