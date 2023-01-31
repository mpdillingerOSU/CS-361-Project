package UIDisplay;

import Screens.BuildContext;
import Screens.Screen;

import java.util.Scanner;

public final class StartScreen extends Screen {
    @Override
    public void build(BuildContext context) {
        System.out.print("\n\nWelcome to Block Breaker!\n\nUsing the program, you will be able to continually generate new character descriptions. To do so, simply enter 'generate' at the command prompt. However, for each character description, you may want to edit your description further by using several other commands. Below is a list of all available commands:\n\n" + CoreFunctions.commandList() + "\nPress 'Enter' to generate your first character description.");
        new Scanner(System.in).nextLine();
        context.ROUTE.push(new GeneratorScreen(), context);
    }
}
