package PhysicalCharacteristics;

import java.util.Random;

public enum Scent {
    FOUL_STENCH("foul stench", "a"),
    SWEET_AROMA("sweet aroma", "a"),
    WOODY_SCENT("woody scent", "a"),
    ODOR_OF_WET_FUR("odor of wet fur", "an"),
    FRAGRANCE_OF_FLOWERS("fragrance of flowers", "a"),
    SOAPY_PERFUME("soapy perfume", "a"),
    WHIFF_OF_ALCOHOL("whiff of alcohol", "a"),
    TANG_OF_ROT("tang of rot", "a");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [Scent], with the given name and indefinite article.
     @param NAME name of the scent
     @param INDEFINITE_ARTICLE indefinite article of the scent
     */
    Scent(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [Scent].
     @return a [Scent]
     */
    public static Scent generate(){
        return random();
    }

    /**
     Returns a randomly selected [Scent].
     @return a [Scent]
     */
    public static Scent random(){
        Scent[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}
