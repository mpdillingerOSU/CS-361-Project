package PhysicalCharacteristics;

import java.util.Random;

public enum BodyType {
    PETITE("petite", "a"),
    SLIM("slim", "a"),
    ATHLETIC("athletic", "an"),
    AVERAGE("of average body type", "an"),
    HUSKY("husky", "a"),
    FULL_FIGURED("full-figured", "a"),
    LARGE_AND_LOVELY("large and lovely", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [BodyType], with the given name and indefinite article.
     @param NAME name of the body type
     @param INDEFINITE_ARTICLE indefinite article of the body type
     */
    BodyType(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [BodyType].
     @return a [BodyType]
     */
    public static BodyType generate(){
        return random();
    }

    /**
     Returns a randomly selected [BodyType].
     @return a [BodyType]
     */
    public static BodyType random(){
        BodyType[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}
