package Personalities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum PersonalityTrait {
    //Order, purpose and community < ---------- > Chaos, uncertainty, and the self
    OPTIMISTIC("optimistic", "an", true), PESSIMISTIC("pessimistic",  "a", false),
    IDEALISTIC("idealistic", "an", true), NIHILISTIC("nihilistic",  "a", false),
    FRIENDLY("friendly",  "a", true), DISMISSIVE("dismissive",  "a", false),
    HONEST("honest", "an", true), DISHONEST("dishonest",  "a", false), //TODO: Untrustworthy???
    ASSERTIVE("assertive", "an", true), APPREHENSIVE("apprehensive",  "an",false),
    CONFORMIST("conformist",  "a", true), REBELLIOUS("rebellious",  "a", false),
    LOYAL("loyal",  "a", true), DISLOYAL("disloyal",  "a", false),
    ORGANIZED("organized", "an", true), DISORGANIZED("disorganized",  "a", false),
    CAUTIOUS("cautious",  "a", true), IMPULSIVE("impulsive",  "an",false),
    PATIENT("patient",  "a", true), IMPATIENT("impatient",  "an",false),
    PACIFISTIC("pacifistic", "a", true), VIOLENT("violent",  "a", false),
    OPEN_TO_TRYING_NEW_THINGS("open to trying new things", "an", true), PREFER_TO_STAY_IN_THEIR_COMFORT_ZONE("prefer to stay in their comfort zone",  "a", false),
    HUMBLE("humble",  "a", true), OVERCONFIDENT("overconfident",  "a",false),
    ALTRUISTIC("altruistic", "an", true), SELF_CENTERED("self-centered",  "a", false);
    //TODO: Need more traits...

    public final String NAME;
    public final String INDEFINITE_ARTICLE;
    public final boolean ON_LEFT;

    /**
     (private) Instantiates a [PersonalityTrait], which are used by the
     [PersonalityGenerator] for constructing the personality of a character.
     */
    PersonalityTrait(final String NAME, final String INDEFINITE_ARTICLE, final boolean ON_LEFT){
        this.NAME = NAME;
        this.INDEFINITE_ARTICLE = INDEFINITE_ARTICLE;
        this.ON_LEFT = ON_LEFT;
    }

    /**
     TODO: Returns a procedurally generated personality trait.
     @return a personality trait
     */
    public static PersonalityTrait generate(){
        return random();
    }

    /**
     Returns a randomly selected personality trait.
     @return a personality trait
     */
    public static PersonalityTrait random(){
        PersonalityTrait[] vals = values();
        return vals[(int) (new Random().nextDouble() * vals.length)];
    }

    /**
     Procedurally generates a given number of personality traits whose quantity is equal
     to [count].
     @return a list of personality traits
     */
    public static ArrayList<PersonalityTrait> generate(int count){
        ArrayList<PersonalityTrait> vals = new ArrayList<>(List.of(values()));
        ArrayList<PersonalityTrait> traits = new ArrayList<>();

        //Ensures that we do not have more traits than are possible...
        count = Math.min(count, (vals.size() + 1) / 2);

        for(int i = 0; i < count; i++){
            int index = (int) (new Random().nextDouble() * vals.size());
            traits.add(vals.remove(index));

            //Ensures that its "opposite" personality trait is also removed from the list...
            if(index % 2 == 0){
                vals.remove(index);
            } else {
                vals.remove(index - 1);
            }
        }

        return traits;
    }

    @Override
    public String toString(){
        return NAME;
    }
}
