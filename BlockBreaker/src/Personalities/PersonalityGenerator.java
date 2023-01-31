package Personalities;

import Generation.SubGenerator;

import java.util.ArrayList;
import java.util.Random;

public final class PersonalityGenerator extends SubGenerator {
    /**
     Instantiates a [PersonalityGenerator], which is used to generate the data concerning
     the personality of a character.
     */
    public PersonalityGenerator() {
        super("Personality");
    }

    @Override
    public String generateContent() {
        final ArrayList<PersonalityTrait> TRAITS = PersonalityTrait.generate(2 + ((int)(new Random().nextDouble() * 3)));
        final PersonalityTrait PRIMARY_TRAIT = TRAITS.remove(0);

        final ArrayList<PersonalityTrait> TRAITS_ON_SAME_SIDE = new ArrayList<>();
        for(int i = 0; i < TRAITS.size();){
            if(TRAITS.get(i).ON_LEFT == PRIMARY_TRAIT.ON_LEFT){
                TRAITS_ON_SAME_SIDE.add(TRAITS.remove(i));
            } else {
                i++;
            }
        }

        String str = "When most people talk about them, the first thing that most people think about is how " +
                PRIMARY_TRAIT + " they are.";

        if(!TRAITS_ON_SAME_SIDE.isEmpty()){
            str += " They are often also said to be " + sentenced(TRAITS_ON_SAME_SIDE) + ".";
            if(!TRAITS.isEmpty()){
                str += " Some do note, however - for what it's worth - that they have also seen them being " + sentenced(TRAITS) + ".";
            }
        } else if(!TRAITS.isEmpty()) {
            str += " However, others have also said that they can be " + sentenced(TRAITS) + ".";
        }

        return str;
    }

    /**
     Returns a list as it would be represented within a written sentence.
     @param TRAITS traits that are to be listed
     @return sentence-style list
     */
    private String sentenced(ArrayList<PersonalityTrait> TRAITS){
        String str = "";
        if(!TRAITS.isEmpty()){
            str += TRAITS.get(0);
            if(TRAITS.size() > 1){
                int i = 1;
                if(TRAITS.size() > 2){
                    for(; i < TRAITS.size() - 1; i++){
                        str += ", " + TRAITS.get(i);
                    }
                    str += ",";
                }
                str += " and " + TRAITS.get(i);
            }
        }
        return str;
    }
}
