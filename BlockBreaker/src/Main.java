import Screens.BuildContext;
import Screens.Route;
import UIDisplay.StartScreen;

public final class Main {
    /**
     The main method to be used by the program. Establishes the initial [Route] and the
     initial [BuildContext] for the program.
     @param args used to start the program
     */
    public static void main(String[] args) {
        BuildContext context = new BuildContext(new Route());
        context.ROUTE.push(new StartScreen(), context);
    }
}