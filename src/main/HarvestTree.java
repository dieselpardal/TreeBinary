package main;

public class HarvestTree {

    private final int GROW_ZERO = 0;
    protected int growMax = 0;
    private int createLeaf = 0;
    private Tree[] seedCode;
    protected Tree[] treeNew;
    ComponentTree auxiliaryTree;

    public HarvestTree(int[] leaf) {
        auxiliaryTree = new ComponentTree();
        if (leaf != null) {
            int lengthLeaf = leaf.length;
            this.createLeaf = 0;
            this.seedCode = new Tree[lengthLeaf];
            this.treeNew = new Tree[lengthLeaf];
            for (int i = 0; i < lengthLeaf; i++) {
                this.seedCode[i] = new Tree(leaf[i], GROW_ZERO, i);
            }
        }
    }

    private Tree[] left(Tree[] subLeaf) {
        int pair = 0;
        if (auxiliaryTree.shouldLeafPair(subLeaf)) pair = 1;
        int key = auxiliaryTree.keyHalf(subLeaf);
        Tree[] temp = new Tree[key - pair];
        for (int f = 0; f < key - pair; f++) {
            temp[f] = subLeaf[f];
        }
        return temp;
    }

    private Tree[] right(Tree[] subLeaf) {
        int odd = 0;
        if (!auxiliaryTree.shouldLeafPair(subLeaf)) odd = 1;
        int key = auxiliaryTree.keyHalf(subLeaf);
        Tree[] temp = new Tree[key];
        for (int f = key + odd; f < subLeaf.length; f++) {
            temp[f - key - odd] = subLeaf[f];
        }
        return temp;
    }

    private void subStickTree(Tree[] leaf, int grow) {
        int leafs = leaf.length;
        int key = auxiliaryTree.halfPreferLeft(leafs);
        if (auxiliaryTree.existLeaf(leafs)) {
            this.treeNew[this.createLeaf++] = new Tree(leaf[key].getValue(), grow, leaf[key].getKey());
            subStickTree(left(leaf), auxiliaryTree.growNew(grow));
            subStickTree(right(leaf), auxiliaryTree.growNew(grow));
        }
        if (grow > this.growMax) this.growMax = grow;
    }

    public void stickTree() {
        if (this.seedCode != null) {
            int grow = GROW_ZERO;
            int leafs = this.seedCode.length;
            int key = auxiliaryTree.halfPreferLeft(leafs);
            if (auxiliaryTree.existLeaf(leafs)) {
                this.treeNew[this.createLeaf++] = new Tree(this.seedCode[key].value, grow, key);
                subStickTree(left(this.seedCode), auxiliaryTree.growNew(grow));
                subStickTree(right(this.seedCode), auxiliaryTree.growNew(grow));
            }
        }
    }

    public void printTreeComplete() {
        if (this.seedCode != null) {
            int leafs = this.seedCode.length;
            int thick = auxiliaryTree.manyThick(this.seedCode);
            System.out.println("Entrada: { " + PrintTree.printLeaf(this.seedCode) + " } ");
            System.out.println(PrintTree.stringRepeat("-", leafs * thick));
            for (int grow = GROW_ZERO; grow <= growMax; grow++) {
                String temp = PrintTree.stringRepeat(" ", this.createLeaf * thick);
                for (int f = 0; f < this.createLeaf; f++) {
                    if (grow == this.treeNew[f].getGrow()) {
                        temp = PrintTree.stringReplaceKey(this.treeNew[f].getKey() * thick, String.valueOf(this.treeNew[f].getValue()), temp);
                    }
                }
                System.out.println(temp);
            }
        }
    }
}
