package UIDisplay;

import Generation.GenerationNode;
import Generation.Generator;
import Names.NameGenerator;
import Personalities.PersonalityGenerator;
import PhysicalCharacteristics.PhysicalCharacteristicsGenerator;

import java.util.ArrayList;
import java.util.Iterator;

public final class QuickGenerate implements Iterable<GenerationNode>{
    private final Generator GENERATOR = new Generator(new NameGenerator(), new PhysicalCharacteristicsGenerator(),
            new PersonalityGenerator());

    private ArrayList<GenerationNode> nodes;
    public boolean generateName = true;
    public boolean generatePhysicalCharacteristics = true;
    public boolean generatePersonality = true;

    /**
     Instantiates a [QuickGenerate], which allows for the quick generation and editing of
     character descriptions. Generates an initial description upon being instantiated.
     */
    public QuickGenerate(){
        generate();
    }

    /**
     Instantiates a new description to be stored by the instance.
     */
    public void generate(){
        nodes = GENERATOR.generate();
    }

    /**
     Returns whether or not the instance is currently generating a name.
     @returns True, if generating a name. Else, false.
     */
    public boolean isGeneratingName(){
        return generateName;
    }

    /**
     Returns whether or not the instance is currently generating physical
     characteristics.
     @returns True, if generating physical characteristics. Else, false.
     */
    public boolean isGeneratingPhysicalCharacteristics(){
        return generatePhysicalCharacteristics;
    }

    /**
     Returns whether or not the instance is currently generating a personality.
     @returns True, if generating a personality. Else, false.
     */
    public boolean isGeneratingPersonality(){
        return generatePersonality;
    }

    /**
     Sets whether or not the instance is currently generating a name.
     @param val boolean representing whether or not the instance is currently generating
     a name.
     */
    public void setGenerateName(boolean val){
        generateName = val;
    }

    /**
     Sets whether or not the instance is currently generating physical characteristics.
     @param val boolean representing whether or not the instance is currently generating
     physical characteristics.
     */
    public void setGeneratePhysicalCharacteristics(boolean val){
        generatePhysicalCharacteristics = val;
    }

    /**
     Sets whether or not the instance is currently generating a personality.
     @param val boolean representing whether or not the instance is currently generating
     a personality.
     */
    public void setGeneratePersonality(boolean val){
        generatePersonality = val;
    }

    /**
     If the instance can currently generate a name, then a new name is regenerated. Else,
     nothing occurs.
     */
    public void regenerateName(){
        if(generateName){
            nodes.set(0, new NameGenerator().generate());
        }
    }

    /**
     If the instance can currently generate physical characteristics, then new physical
     characteristics are regenerated. Else, nothing occurs.
     */
    public void regeneratePhysicalCharacteristics(){
        if(generatePhysicalCharacteristics){
            nodes.set(1, new PhysicalCharacteristicsGenerator().generate());
        }
    }

    /**
     If the instance can currently generate a personality, then a new personality is
     regenerated. Else, nothing occurs.
     */
    public void regeneratePersonality(){
        if(generatePersonality){
            nodes.set(2, new PersonalityGenerator().generate());
        }
    }

    /**
     Helper method that is used to return a list of the nodes whose sub-generators are
     currently being used.
     @return list of nodes that can be used.
     */
    private ArrayList<GenerationNode> usedNodes(){
        ArrayList<GenerationNode> list = new ArrayList<>();

        if(generateName){
            list.add(this.nodes.get(0));
        }

        if(generatePhysicalCharacteristics){
            list.add(this.nodes.get(1));
        }

        if(generatePersonality){
            list.add(this.nodes.get(2));
        }

        return list;
    }

    /**
     Returns whether or not the instance is equal to the other [generator]. They are said
     to be equal if all of their nodes are equal.
     @param generator generator to be compared
     @return True, if equal. Else, false.
     */
    public boolean equals(QuickGenerate generator){
        for(int i = 0; i < nodes.size(); i++){
            if (!nodes.get(i).equals(generator.nodes.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Iterator<GenerationNode> iterator() {
        return new Iterator<>() {
            private final Iterator<GenerationNode> ITERATOR = usedNodes().iterator();

            @Override
            public boolean hasNext() {
                return ITERATOR.hasNext();
            }

            @Override
            public GenerationNode next() {
                return ITERATOR.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Unsupported Operation");
            }
        };
    }
}
