package Generation;

public final class GenerationNode {
    public final String NAME;
    public final String CONTENT;

    /**
     (package-private) Instantiates a [GenerationNode], which is created by the
     [Generator] class in order to hold the data of the generated character.
     @param NAME name of the node
     @param CONTENT content of the node
     */
    GenerationNode(final String NAME, final String CONTENT){
        this.NAME = NAME;
        this.CONTENT = CONTENT;
    }

    /**
     Returns whether or not the instance is equal to [node].
     @param node node to be compared
     @return True, if attributes [NAME] and [CONTENT] are equal. Else, false.
     */
    public boolean equals(GenerationNode node){
        return node.NAME.equals(NAME) && node.CONTENT.equals(CONTENT);
    }
}
