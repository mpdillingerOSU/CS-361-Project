package Screens;

public abstract class AlertDialog {
    /**
     Used to construct the [AlertDialog] within the given [context].
     @param context the context where the instance is to be built
     @return a selected command
     */
    public abstract String build(BuildContext context);
}
