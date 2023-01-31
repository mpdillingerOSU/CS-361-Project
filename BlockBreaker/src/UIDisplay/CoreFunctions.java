package UIDisplay;

public final class CoreFunctions {
    private CoreFunctions(){}

    /**
     Returns the list of commands that can be used during the generation process.
     @return the list of commands
     */
    public static String commandList(){
        return "Command List:\n'generate' - generate new character description\n'regenerate ' + (section) - regenerates only the given section\n'show ' + (section) - makes the given section visible\n'hide ' + (section) - makes the given section hidden\n'exit' - exit the program\n";
    }

    /**
     Returns the list of commands that can be used during the debugging process.
     @return the list of commands
     */
    public static String debuggingCommandList(){
        return "Command List:\n'recoverability' - unit test for recoverability\n'predictability' - unit test for predictability\n'return' - return to the generator screen\n";
    }
}
