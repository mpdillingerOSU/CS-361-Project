package Names;

import java.util.Random;

public final class FirstNames {
    /**
     An array containing all first names that are to be used by the [NameGenerator] class
     in the character generation process.
     */
    private static final String[] LIST = new String[]{
            "Tom", "Ben", "Abe", "Albus", "Alex", "Arthur", "Blade", "Burton", "Carter", "Connor", "Davy", "Deckard",
            "Donovan", "Garrick", "Ian", "Jack", "Jamie", "Jareth", "Jason", "Jon", "Kirk", "Lando", "Landon",
            "Leonard", "Lex", "Luke", "Mace", "Malcolm", "Max", "Mulder", "Murphy", "Nick", "Patrick", "Peter", "Ray",
            "Roarke", "Sam", "Serling", "Sterling", "Turner", "Verne", "Victor", "Morgan", "Bobby",
            "Sara", "Eva", "Ambrosia", "Sabrina", "Alia", "Anastasia", "Alanna", "Annabeth", "Arabella", "Ariel",
            "Arya", "Avalon", "Belle", "Brienne", "Claire", "Clara", "Clarisse", "Caroline", "Dana", "Diana", "Echo",
            "Elizabeth", "Ellen", "Elora", "Freya", "Harker", "Harley", "Helene", "Isabelle", "Kara", "Korra", "Jules",
            "Lara", "Lucy", "Luna", "Lyra", "Madeleine", "Malka", "Mina", "Molly", "Morgana", "Nova", "Prudence",
            "Quinn", "Raven", "Ravenna", "Raivanna", "Rey", "Valerie", "Willow", "Winona", "Zoe", "Zoey"
    };

    /**
     Returns a randomly selected first name.
     @return [String] representing a first name
     */
    public static String random(){
        return LIST[(int)(new Random().nextDouble() * LIST.length)];
    }
}
