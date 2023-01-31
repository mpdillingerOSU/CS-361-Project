package PhysicalCharacteristics;

import Generation.SubGenerator;

import java.util.Random;

public class PhysicalCharacteristicsGenerator extends SubGenerator {
    public PhysicalCharacteristicsGenerator() {
        super("Physical Characteristics");
    }

    @Override
    public String generateContent() {
        final Height HEIGHT = Height.generate();
        final BodyType BODY_TYPE = BodyType.generate();
        final Skin SKIN = Skin.generate();
        final Shoulders SHOULDERS = Shoulders.generate();
        final Eyes EYES = Eyes.generate();
        final Nose NOSE = Nose.generate();
        final Ears EARS = Ears.generate();
        final HairDescriptor HAIR_DESCRIPTOR = HairDescriptor.generate();
        final HairColor HAIR_COLOR = HairColor.generate();
        final Scent SCENT = Scent.generate();

        return switch ((int) (new Random().nextDouble() * 5)) {
            case 0 -> paragraphStyle1(HEIGHT, BODY_TYPE, SKIN, SHOULDERS, EYES, NOSE, EARS, HAIR_DESCRIPTOR, HAIR_COLOR,
                    SCENT);
            case 1 -> paragraphStyle2(HEIGHT, BODY_TYPE, SKIN, SHOULDERS, EYES, NOSE, EARS, HAIR_DESCRIPTOR, HAIR_COLOR,
                    SCENT);
            case 2 -> paragraphStyle3(HEIGHT, BODY_TYPE, SKIN, SHOULDERS, EYES, NOSE, EARS, HAIR_DESCRIPTOR, HAIR_COLOR,
                    SCENT);
            case 3 -> paragraphStyle4(HEIGHT, BODY_TYPE, SKIN, SHOULDERS, EYES, NOSE, EARS, HAIR_DESCRIPTOR, HAIR_COLOR,
                    SCENT);
            default -> paragraphStyle5(HEIGHT, BODY_TYPE, SKIN, SHOULDERS, EYES, NOSE, EARS, HAIR_DESCRIPTOR, HAIR_COLOR,
                    SCENT);
            //TODO: Randomly select a "most important" characteristic, and have it mentioned last. "But, most importantly of all..."
        };
    }

    /**
     Generates a paragraph for the physical characteristics in Style 1.
     @param HEIGHT the height to be used
     @param BODY_TYPE the body type to be used
     @param SKIN the skin to be used
     @param SHOULDERS the shoulders to be used
     @param EYES the eyes to be used
     @param NOSE the nose to be used
     @param EARS the ears to be used
     @param HAIR_DESCRIPTOR the hair descriptor to be used
     @param HAIR_COLOR the hair color to be used
     @param SCENT the scent to be used
     @return a description of the character's physical characteristics
     */
    private String paragraphStyle1(final Height HEIGHT, final BodyType BODY_TYPE, final Skin SKIN,
                                   final Shoulders SHOULDERS, final Eyes EYES, final Nose NOSE, final Ears EARS,
                                   final HairDescriptor HAIR_DESCRIPTOR, final HairColor HAIR_COLOR, final Scent SCENT){
        return "They are " + HEIGHT + (BODY_TYPE == BodyType.LARGE_AND_LOVELY ? ", " : " and ") + BODY_TYPE +
                ", with " + SKIN + " skin and " + SHOULDERS + " shoulders. Their " + EYES +
                " eyes sit divided by " + NOSE.INDEFINITE_ARTICLE + " " + NOSE +
                " nose, and on the sides of their head are a pair of " + EARS +
                " ears. " + capitalize(HAIR_DESCRIPTOR.toString()) + ", " + HAIR_COLOR +
                " hair lays atop their head - while " + SCENT.INDEFINITE_ARTICLE + " " + SCENT + " wafts from their entire being.";
    }

    /**
     Generates a paragraph for the physical characteristics in Style 2.
     @param HEIGHT the height to be used
     @param BODY_TYPE the body type to be used
     @param SKIN the skin to be used
     @param SHOULDERS the shoulders to be used
     @param EYES the eyes to be used
     @param NOSE the nose to be used
     @param EARS the ears to be used
     @param HAIR_DESCRIPTOR the hair descriptor to be used
     @param HAIR_COLOR the hair color to be used
     @param SCENT the scent to be used
     @return a description of the character's physical characteristics
     */
    private String paragraphStyle2(final Height HEIGHT, final BodyType BODY_TYPE, final Skin SKIN,
                                   final Shoulders SHOULDERS, final Eyes EYES, final Nose NOSE, final Ears EARS,
                                   final HairDescriptor HAIR_DESCRIPTOR, final HairColor HAIR_COLOR, final Scent SCENT){
        return capitalize(SCENT.INDEFINITE_ARTICLE) + " " + SCENT + " wafts from their entire being, while " + EYES +
                " eyes lay mounted within a face of " + SKIN + " skin - " + SCENT.INDEFINITE_ARTICLE + " " + NOSE +
                " nose at its center. Higher atop their head lays " + HAIR_DESCRIPTOR + ", " + HAIR_COLOR +
                " hair. They are " + HEIGHT + (BODY_TYPE == BodyType.LARGE_AND_LOVELY ? ", " : " and ") +
                BODY_TYPE + ", with " + SHOULDERS + " shoulders. On the sides of their head are a pair of " +
                EARS + " ears. ";
    }

    /**
     Generates a paragraph for the physical characteristics in Style 3.
     @param HEIGHT the height to be used
     @param BODY_TYPE the body type to be used
     @param SKIN the skin to be used
     @param SHOULDERS the shoulders to be used
     @param EYES the eyes to be used
     @param NOSE the nose to be used
     @param EARS the ears to be used
     @param HAIR_DESCRIPTOR the hair descriptor to be used
     @param HAIR_COLOR the hair color to be used
     @param SCENT the scent to be used
     @return a description of the character's physical characteristics
     */
    private String paragraphStyle3(final Height HEIGHT, final BodyType BODY_TYPE, final Skin SKIN,
                                   final Shoulders SHOULDERS, final Eyes EYES, final Nose NOSE, final Ears EARS,
                                   final HairDescriptor HAIR_DESCRIPTOR, final HairColor HAIR_COLOR, final Scent SCENT){
        return "The first thing that people notice about them are their piercing " + EYES +
                " eyes, which lay either side of " + NOSE.INDEFINITE_ARTICLE + " " + NOSE + " nose within a face of " +
                SKIN + " skin. Above these eyes sits " + HAIR_DESCRIPTOR + ", " + HAIR_COLOR +
                " hair, and to their sides are " + EARS + " ears. Their head rests upon a set of " + SHOULDERS +
                " shoulders - their frame itself being " + BODY_TYPE + ", and their height " +
                (HEIGHT == Height.AVERAGE ? "average" : HEIGHT) + ". " + capitalize(SCENT.INDEFINITE_ARTICLE) + " " +
                SCENT + " wafts from their entire being.";
    }

    /**
     Generates a paragraph for the physical characteristics in Style 4.
     @param HEIGHT the height to be used
     @param BODY_TYPE the body type to be used
     @param SKIN the skin to be used
     @param SHOULDERS the shoulders to be used
     @param EYES the eyes to be used
     @param NOSE the nose to be used
     @param EARS the ears to be used
     @param HAIR_DESCRIPTOR the hair descriptor to be used
     @param HAIR_COLOR the hair color to be used
     @param SCENT the scent to be used
     @return a description of the character's physical characteristics
     */
    private String paragraphStyle4(final Height HEIGHT, final BodyType BODY_TYPE, final Skin SKIN,
                                   final Shoulders SHOULDERS, final Eyes EYES, final Nose NOSE, final Ears EARS,
                                   final HairDescriptor HAIR_DESCRIPTOR, final HairColor HAIR_COLOR, final Scent SCENT){
        return capitalize(NOSE.toString()) + " sits their nose between eyes of " + EYES + ". Their " + HAIR_DESCRIPTOR +
                ", " + HAIR_COLOR + " hair throned atop a face of " + SKIN + " skin. Their ears, " + EARS + ". " +
                capitalize(SCENT.INDEFINITE_ARTICLE) + " " + SCENT +
                " can be smelt from their breath as it passes beyond the reaches of their " + SHOULDERS +
                " shoulders. But, for those who only care about the simple things, they are " + HEIGHT +
                (BODY_TYPE == BodyType.LARGE_AND_LOVELY ? ", " : " and ") + BODY_TYPE + ".";
    }

    /**
     Generates a paragraph for the physical characteristics in Style 5.
     @param HEIGHT the height to be used
     @param BODY_TYPE the body type to be used
     @param SKIN the skin to be used
     @param SHOULDERS the shoulders to be used
     @param EYES the eyes to be used
     @param NOSE the nose to be used
     @param EARS the ears to be used
     @param HAIR_DESCRIPTOR the hair descriptor to be used
     @param HAIR_COLOR the hair color to be used
     @param SCENT the scent to be used
     @return a description of the character's physical characteristics
     */
    private String paragraphStyle5(final Height HEIGHT, final BodyType BODY_TYPE, final Skin SKIN,
                                   final Shoulders SHOULDERS, final Eyes EYES, final Nose NOSE, final Ears EARS,
                                   final HairDescriptor HAIR_DESCRIPTOR, final HairColor HAIR_COLOR, final Scent SCENT){
        //TODO: fix when we have "average" for either height or body type
        return capitalize(SKIN.toString()) + ", " + SHOULDERS + " shoulders lay mounted atop " +
                HEIGHT.INDEFINITE_ARTICLE + " " + HEIGHT + (BODY_TYPE == BodyType.LARGE_AND_LOVELY ? ", " : " and ") +
                BODY_TYPE + " frame. Supported above it is nestled a face with " + EYES + " eyes, " +
                NOSE.INDEFINITE_ARTICLE + " " + NOSE + " nose, and " + EARS + " ears. " +
                capitalize(HAIR_DESCRIPTOR.toString()) + ", " + HAIR_COLOR + " hair crowns their head - from which " +
                SCENT.INDEFINITE_ARTICLE + " " + SCENT + " can be smelt.";
    }

    /**
     Returns a version of the given [val] with its first character having been
     capitalized.
     @param val the string to be capitalized
     @return the capitalized string
     */
    private String capitalize(String val){
        return val == null || val.isEmpty() ? val : val.substring(0, 1).toUpperCase() + val.substring(1);
    }
}
