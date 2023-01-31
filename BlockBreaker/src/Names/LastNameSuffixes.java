package Names;

import java.util.Random;

public final class LastNameSuffixes {
    /**
     An array containing all last name suffixes that are to be used by the
     [NameGenerator] class in the character generation process.
     */
    private static final String[] LIST = new String[]{
            "Foot", "Tree", "Rock", "Cliff", "Bend", "Beard", "Torch", "Bane", "Bottom", "Groves", "Tops", "Brook",
            "Field", "Stone", "Wood", "Fire", "Jump", "Skip", "Trip", "Mane", "Smoke", "Lips", "Nose", "Ears", "Eyes",
            "Hop", "Spell", "Spit", "Spire", "Tower", "House", "Mouth", "Blade", "Whip", "Pot", "Flower", "Ridge",
            "Lake", "Drop", "Glass", "Brow", "Wind", "Water", "Blood", "Clot", "Cloud", "Sky"
    };

    /**
     Returns a randomly selected last name suffix.
     @return [String] representing a last name suffix
     */
    public static String random(){
        return LIST[(int)(new Random().nextDouble() * LIST.length)];
    }
}
