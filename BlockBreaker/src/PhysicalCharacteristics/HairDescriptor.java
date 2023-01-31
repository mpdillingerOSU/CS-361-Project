package PhysicalCharacteristics;

import java.util.Random;

public enum HairDescriptor {
    LONG("long", "a"),
    CURLY("curly", "a"),
    SHORT("short", "a"),
    THICK("thick", "a"),
    WAVY("wavy", "a"),
    STRAIGHT("straight", "a"),
    SOFT("soft", "a"),
    FINE("fine", "a"),
    THIN("thin", "a"),
    COARSE("coarse", "a"),
    BRITTLE("brittle", "a"),
    BRIGHT("bright", "a"),
    MATTED("matted", "a"),
    SILKY("silky", "a"),
    TANGLED("tangled", "a"),
    GLOSSY("glossy", "a"),
    WILD("wild", "a"),
    SHAGGY("shaggy", "a"),
    DISHEVELED("disheveled", "a"),
    SMOOTH("smooth", "a"),
    TOUSLED("tousled", "a"),
    WOOLLY("woolly", "a"),
    SHINY("shiny", "a"),
    BRAIDED("braided", "a"),
    ABUNDANT("abundant", "an"),
    BUSHY("bushy", "a"),
    UNKEMPT("unkempt", "an"),
    LOVELY("lovely", "a"),
    UNRULY("unruly", "an"),
    GREASY("greasy", "a"),
    DRY("dry", "a"),
    FRIZZY("frizzy", "a"),
    KINKY("kinky", "a"),
    WIRY("wiry", "a"),
    STIFF("stiff", "a"),
    LUXURIOUS("luxurious", "a"),
    LUXURIANT("luxuriant", "a"),
    STRINGY("stringy", "a"),
    SLEEK("sleek", "a"),
    GRIZZLED("grizzled", "a"),
    DIRTY("dirty", "a"),
    TAWDRY("tawdry", "a"),
    WISPY("wispy", "a"),
    ELEGANT("elegant", "an"),
    BEAUTIFUL("beautiful", "a"),
    PRETTY("pretty", "a"),
    UNCOMBED("uncombed", "an"),
    ROUGH("rough", "a"),
    UNTIDY("untidy", "an");

    public final String NAME;
    public final String INDEFINITE_ARTICLE;

    /**
     Instantiates a [HairDescriptor], with the given name and indefinite article.
     @param NAME name of the hair descriptor
     @param INDEFINITE_ARTICLE indefinite article of the hair descriptor
     */
    HairDescriptor(final String NAME, final String INDEFINITE_ARTICLE){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
    }

    @Override
    public String toString(){
        return NAME;
    }

    /**
     TODO: Returns a procedurally generated [HairDescriptor].
     @return a [HairDescriptor]
     */
    public static HairDescriptor generate(){
        return random();
    }

    /**
     Returns a randomly selected [HairDescriptor].
     @return a [HairDescriptor]
     */
    public static HairDescriptor random(){
        HairDescriptor[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }
}

