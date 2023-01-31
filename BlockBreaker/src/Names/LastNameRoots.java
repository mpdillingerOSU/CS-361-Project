package Names;

import java.util.Random;

public final class LastNameRoots {
    //TODO: Before each version submission, ensure that all "roots" and "suffixes" are checked if they can be both
    //TODO: Before each version submission, also check that each "roots" and "suffixes" list does not have duplicates...
    /**
     An array containing all last name roots that are to be used by the [NameGenerator]
     class in the character generation process.
     */
    private static final String[] LIST = new String[]{
            "Light", "Heavy", "Dark", "Black", "White", "Red", "Green", "Blue", "Brown", "Grey", "Yellow", "Fast",
            "Slow", "Pickle", "Onion", "Potato", "Apple", "Fire", "Wind", "Water", "Earth", "Day", "Night", "Sun",
            "Moon", "Dirt", "Pebble", "Pillow", "Honey", "Ridge", "Lake", "Sand", "Blade", "Life", "Death", "Blood",
            "Low", "High", "Mid", "Wiggle", "Cloud", "Sky"
    };

    /**
     Returns a randomly selected last name root.
     @return [String] representing a last name root
     */
    public static String random(){
        return LIST[(int)(new Random().nextDouble() * LIST.length)];
    }
}
