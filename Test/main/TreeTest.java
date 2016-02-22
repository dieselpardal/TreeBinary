package main;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TreeTest {

    @Test
    public void shouldgetValueOfTree() {
        Tree[] miniTree = new Tree[1];
        miniTree[0] = new Tree(1,2,3);
        assertThat(miniTree[0].getValue(), is(1));
    }
    @Test
    public void shouldgetGrowOfTree() {
        Tree[] miniTree = new Tree[1];
        miniTree[0] = new Tree(1,2,3);
        assertThat(miniTree[0].getGrow(), is(2));
    }

    @Test
    public void shouldgetKeyOfTree() {
        Tree[] miniTree = new Tree[1];
        miniTree[0] = new Tree(1,2,3);
        assertThat(miniTree[0].getKey(), is(3));
    }


}
