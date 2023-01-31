package PhysicalCharacteristics;

import java.util.Random;

public enum Skin {
    PORCELAIN("porcelain", "a"),
    PALE_IVORY("pale ivory", "a"),
    IVORY("ivory", "an"),
    PALE_WHITE("pale white", "a"),
    WHITE("white", "a"),
    LIGHT_BEIGE("light beige", "a"),
    BEIGE("beige", "a"),
    LIGHT_BROWN("light brown", "a"),
    OLIVE("olive", "an"),
    BROWN("brown", "a"),
    ALMOND("almond", "an"),
    CHESTNUT("chestnut", "a"),
    DARK_BROWN("dark brown", "a"),
    BLACK("black", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Skin], with the given name and indefinite article.
     @param NAME name of the skin
     @param INDEFINITE_ARTICLE indefinite article of the skin
     */
    Skin(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    /**
     TODO: Returns a procedurally generated [Skin].
     @return a [Skin]
     */
    public static Skin generate(){
        return random();
    }

    /**
     Returns a randomly selected [Skin].
     @return a [Skin]
     */
    public static Skin random(){
        Skin[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }

    @Override
    public String toString(){
        return NAME;
    }
}
