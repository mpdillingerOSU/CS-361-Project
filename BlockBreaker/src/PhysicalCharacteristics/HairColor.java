package PhysicalCharacteristics;

import java.util.Random;

public enum HairColor {
    AMBER("amber", "an"),
    AUBURN("auburn", "an"),
    HONEY_KISSED("honey-kissed", "a"),
    SILVERY("silvery", "a"),
    BROWN("brown", "a"),
    WHITE("white", "a"),
    GREY("grey", "a"),
    HAZEL_COLORED("hazel-colored", "a"),
    RED("red", "a"),
    BLONDE("blonde", "a"),
    STRAWBERRY("strawberry", "a"),
    STRAWBERRY_BLONDE("strawberry-blonde", "a"),
    ONYX_COLORED("onyx-colored", "an"),
    BLACK("black", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [HairColor], with the given name and indefinite article.
     @param NAME name of the hair color
     @param INDEFINITE_ARTICLE indefinite article of the hair color
     */
    HairColor(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [HairColor].
     @return a [HairColor]
     */
    public static HairColor generate(){
        return random();
    }

    /**
     Returns a randomly selected [HairColor].
     @return a [HairColor]
     */
    public static HairColor random(){
        HairColor[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}

