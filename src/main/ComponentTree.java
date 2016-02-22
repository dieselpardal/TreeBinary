package main;

public class ComponentTree {

    private final int DIVISION = 2;
    private final int BEFORE_KEY = 1;
    private final int AFTER_KEY = 1;
    private final int GROW_NEXT = 1;
    private final int LEAF_EMPTY = 0;

    protected  boolean shouldLeafPair(Tree[] subLeaf) {
        return subLeaf.length % DIVISION == 0;
    }

    protected int halfPreferLeft(int leafs) {
        return (leafs + AFTER_KEY) / DIVISION - BEFORE_KEY;
    }

    protected int keyHalf(Tree[] subLeaf) {
        return subLeaf.length / DIVISION;
    }

    protected int growNew(int grow) {
        return grow + GROW_NEXT;
    }

    protected boolean existLeaf(int leafs) {
        return leafs > LEAF_EMPTY;
    }

    protected int manyThick(Tree[] subLeaf) {
        int max = 0;
        int leafs = subLeaf.length;
        for (int i = 0; i < leafs; i++) {
            if (subLeaf[i].value > max) max = subLeaf[i].value;
        }
        return String.valueOf(max).length();
    }

}
