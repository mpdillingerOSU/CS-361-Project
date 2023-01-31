package PhysicalCharacteristics;

import java.util.Random;

public enum Nose {
    BULBOUS("bulbous", "a"),
    HOOKED("hooked", "a"),
    SLENDER("slender", "a"),
    THIN("thin", "a"),
    ARCHING("arching", "an"),
    BUTTON("button", "a"),
    CROOKED("crooked", "a"),
    POINTY("pointy", "a"),
    PROMINENT("prominent", "a"),
    ELEGANT("elegant", "an"),
    ROYAL("royal", "a"),
    KINGLY("kingly", "a"),
    QUEENLY("queenly", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Nose], with the given name and indefinite article.
     @param NAME name of the nose
     @param INDEFINITE_ARTICLE indefinite article of the nose
     */
    Nose(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [Nose].
     @return a [Nose]
     */
    public static Nose generate(){
        return random();
    }

    /**
     Returns a randomly selected [Nose].
     @return a [Nose]
     */
    public static Nose random(){
        Nose[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}

