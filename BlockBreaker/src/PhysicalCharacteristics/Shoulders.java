package PhysicalCharacteristics;

import java.util.Random;

public enum Shoulders {
    BROAD("broad", "a"),
    SLENDER("slender", "a"),
    SQUARE("square", "a"),
    NARROW("narrow", "a"),
    MUSCULAR("muscular", "a"),
    DROOPING("drooping", "a"),
    HUNCHED("hunched", "a"),
    WIDE("wide", "a"),
    FRAIL("frail", "a"),
    SLOPPING("slopping", "a"),
    LARGE("large", "a"),
    SMALL("small", "a"),
    PROMINENT("prominent", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Shoulders], with the given name and indefinite article.
     @param NAME name of the shoulders
     @param INDEFINITE_ARTICLE indefinite article of the shoulders
     */
    Shoulders(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [Shoulders].
     @return a [Shoulders]
     */
    public static Shoulders generate(){
        return random();
    }

    /**
     Returns a randomly selected [Shoulders].
     @return a [Shoulders]
     */
    public static Shoulders random(){
        Shoulders[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}


