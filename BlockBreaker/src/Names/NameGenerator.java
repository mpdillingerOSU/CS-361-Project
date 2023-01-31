package Names;

import Generation.SubGenerator;

public final class NameGenerator extends SubGenerator {
    /**
     Instantiates a [NameGenerator], which is used to generate the data concerning the
     name of a character.
     */
    public NameGenerator() {
        super("Name");
    }

    @Override
    public String generateContent() {
        String lastName = LastNameRoots.random();

        String lastNameSuffix = LastNameSuffixes.random().toLowerCase();
        while(lastNameSuffix.equalsIgnoreCase(lastName)){
            lastNameSuffix = LastNameSuffixes.random().toLowerCase();
        }

        if(lastName.charAt(lastName.length() - 1) == lastNameSuffix.charAt(0)){
            lastName += lastNameSuffix.substring(1);
        } else {
            lastName += lastNameSuffix;
        }

        return FirstNames.random() + " " + lastName;
    }
}
