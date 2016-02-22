package main;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ComponentTreeTest {

    @Test
    public void shouldLeafPairValid() {
        Tree[] miniTree = new Tree[2];
        ComponentTree auxiliaryTree = new ComponentTree();
        assertThat(auxiliaryTree.shouldLeafPair(miniTree), is(true));
    }

    @Test
    public void shouldHalfPreferLeftofTree() {
        ComponentTree auxiliaryTree = new ComponentTree();
        assertThat(auxiliaryTree.halfPreferLeft(3), is(1));
    }

    @Test
    public void shouldKeyHalfinTree() {
        Tree[] miniTree = new Tree[2];
        ComponentTree auxiliaryTree = new ComponentTree();
        assertThat(auxiliaryTree.keyHalf(miniTree), is(1));
    }

    @Test
    public void shouldGrowNewofTree() {
        ComponentTree auxiliaryTree = new ComponentTree();
        assertThat(auxiliaryTree.growNew(2), is(3));
    }

    @Test
    public void shouldExistLeafofTreeValid() {
        ComponentTree auxiliaryTree = new ComponentTree();
        assertThat(auxiliaryTree.existLeaf(2), is(true));
    }
    @Test
    public void shouldGenerateThick() {
        ComponentTree auxiliaryTree = new ComponentTree();
        Tree[] miniTree = new Tree[2];
        miniTree[0] = new Tree(2,0,0);
        miniTree[1] = new Tree(13,0,0);
        assertThat(auxiliaryTree.manyThick(miniTree), is(2));
    }
}
