package UIDisplay;

import Screens.AlertDialog;
import Screens.BuildContext;

import java.util.Scanner;

public final class SimpleAlert extends AlertDialog {
    public final String QUESTION;

    /**
     Instantiates a [SimpleAlert], which extends the [AlertDialog] class, and has the
     user respond to the given [QUESTION] with a simple 'yes'/'no' response.
     @param QUESTION the question to be asked by the instance
     */
    public SimpleAlert(final String QUESTION){
        this.QUESTION = QUESTION;
    }

    @Override
    public String build(BuildContext context) {
        while(true){
            System.out.println("\n" + QUESTION);
            String answer = new Scanner(System.in).nextLine();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
                return answer;
            } else {
                System.out.println("\n-----------------------------------------\n----- The given command was invalid -----\n-----------------------------------------\n");
            }
        }
    }
}
