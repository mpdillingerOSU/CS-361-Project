package PhysicalCharacteristics;

import java.util.Random;

public enum Ears {
    SMALL("small", "a"),
    LARGE("large", "a"),
    BIG("big", "a"),
    DANGLY("dangly", "a"),
    LARGE_LOBED("large-lobed", "a"),
    LONG("long", "a"),
    THIN("thin", "a"),
    PROMINENT("prominent", "a"),
    POINTY("pointy", "a"),
    ROUND("round", "a"),
    SOMEWHAT_FLOPPY("somewhat floppy", "a"),
    PENDULOUS("pendulous", "a"),
    MALFORMED("malformed", "a"),
    ELEGANT("elegant", "an");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Ears], with the given name and indefinite article.
     @param NAME name of the ears
     @param INDEFINITE_ARTICLE indefinite article of the ears
     */
    Ears(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [Ears].
     @return a [Ears]
     */
    public static Ears generate(){
        return random();
    }

    /**
     Returns a randomly selected [Ears].
     @return a [Ears]
     */
    public static Ears random(){
        Ears[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}

