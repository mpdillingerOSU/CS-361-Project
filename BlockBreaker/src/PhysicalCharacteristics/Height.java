package PhysicalCharacteristics;

import java.util.Random;

public enum Height {
    VERY_SHORT("very short", "a"),
    SHORT("short", "a"),
    AVERAGE("of average height", "an"),
    TALL("tall", "a"),
    VERY_TALL("very tall", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Height], with the given name and indefinite article.
     @param NAME name of the height
     @param INDEFINITE_ARTICLE indefinite article of the height
     */
    Height(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     Returns a procedurally generated [Height].
     @return a [Height]
     */
    public static Height generate(){
        double roll = new Random().nextDouble();
        if(roll < .1){
            return VERY_SHORT;
        } else if(roll < .25){
            return SHORT;
        } else if(roll < .75){
            return AVERAGE;
        } else if(roll < .90){
            return TALL;
        }

        return VERY_TALL;
    }

    /**
     Returns a randomly selected [Height].
     @return a [Height]
     */
    public static Height random(){
        Height[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}
