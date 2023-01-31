package Screens;

import java.util.ArrayList;

public final class Route {
    private final ArrayList<Screen> SCREENS = new ArrayList<>();

    /**
     Instantiates a [Route], which is a specialized queue used to keep track of the
     [Screen] and [AlertDialog] instances in use.
     */
    public Route(){}

    /**
     Pushes the [screen] onto the route, and builds it.
     @param screen the [Screen] to be pushed onto the route
     @param context the [BuildContext] for the [screen]
     */
    public void push(Screen screen, BuildContext context){
        SCREENS.add(screen);
        screen.build(context);
    }

    /**
     Pops the current the [Screen] off of the route, and returns the route to the
     previous [Screen].
     @return the popped [Screen]
     */
    public Screen pop(){
       Screen screen = current();
       SCREENS.remove(SCREENS.size() - 1);
       return screen;
    }

    /**
     Returns the current [Screen] of the route.
     @return the current [Screen]
     */
    public Screen current(){
        return SCREENS.get(SCREENS.size() - 1);
    }
}
