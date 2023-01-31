package Screens;

public final class BuildContext {
    public final Route ROUTE;

    /**
     Instantiates a [BuildContext] with the given route, and is used to provide data for
     [Screen] and [AlertDialog] instances with their [build] methods.
     @param ROUTE the route of the instance
     */
    public BuildContext(final Route ROUTE){
        this.ROUTE = ROUTE;
    }
}
