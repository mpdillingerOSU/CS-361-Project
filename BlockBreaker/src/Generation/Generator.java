package Generation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Generator implements Iterable<SubGenerator>{
    private final ArrayList<SubGenerator> GENERATORS = new ArrayList<>();

    /**
     Instantiates a [Generator], with a varargs of [SubGenerator] that provide the
     instructions used to generate character descriptions.
     @param GENERATORS sub-generators to be used by the instance
     */
    public Generator(SubGenerator... GENERATORS){
        this.GENERATORS.addAll(List.of(GENERATORS));
    }

    /**
     Adds [subGenerator] to the instance. However, if its class is the same as, is a
     parent of, or is a child of a [SubGenerator] already used by the instance, then
     [subGenerator] is not added.
     @param subGenerator sub-generator to be added
     @return True, if subGenerator was added. Else, false.
     */
    public boolean add(SubGenerator subGenerator){
        for(SubGenerator generator : GENERATORS){
            if(subGenerator.getClass().isAssignableFrom(generator.getClass()) ||
                    generator.getClass().isAssignableFrom(subGenerator.getClass())){
                return false;
            }
        }
        GENERATORS.add(subGenerator);
        return true;
    }

    /**
     Removes a [SubGenerator] from the instance that is of the same class as, is a parent
     of, or is a child of the class of [subGenerator]. However, if no such [SubGenerator]
     is used by the instance, then nothing occurs.
     @param subGenerator sub-generator whose class is to be removed
     @return True, if a [SubGenerator] was removed. Else, false.
     */
    public SubGenerator remove(SubGenerator subGenerator){
        for(SubGenerator generator : GENERATORS){
            if(subGenerator.getClass().isAssignableFrom(generator.getClass()) ||
                    generator.getClass().isAssignableFrom(subGenerator.getClass())){
                GENERATORS.remove(generator);
                return generator;
            }
        }
        return null;
    }

    /**
     Generates a character description using the [SubGenerator] objects in use by the
     instance.
     @return list of nodes representing sections of the character description
     */
    public ArrayList<GenerationNode> generate(){
        ArrayList<GenerationNode> nodes = new ArrayList<>();
        for(SubGenerator generator : GENERATORS){
            nodes.add(generator.generate());
        }
        return nodes;
    }

    @Override
    public Iterator<SubGenerator> iterator() {
        return new Iterator<>() {
            private final Iterator<SubGenerator> ITERATOR = GENERATORS.iterator();

            @Override
            public boolean hasNext() {
                return ITERATOR.hasNext();
            }

            @Override
            public SubGenerator next() {
                return ITERATOR.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Unsupported Operation");
            }
        };
    }
}
