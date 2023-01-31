package PhysicalCharacteristics;

import java.util.Random;

public enum Eyes {
    AMBER("amber", "an"),
    PALE_BLUE("pale blue", "a"),
    BLUE("blue", "a"),
    BROWN("brown", "a"),
    GREY("grey", "a"),
    GREEN("green", "a"),
    HAZEL("hazel", "a"),
    RED("red", "a"),
    PURPLE("purple", "a"),
    YELLOW("yellow", "a"),
    BLACK("black", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Eyes], with the given name and indefinite article.
     @param NAME name of the eyes
     @param INDEFINITE_ARTICLE indefinite article of the eyes
     */
    Eyes(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [Eyes].
     @return a [Eyes]
     */
    public static Eyes generate(){
        return random();
    }

    /**
     Returns a randomly selected [Eyes].
     @return a [Eyes]
     */
    public static Eyes random(){
        Eyes[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}

