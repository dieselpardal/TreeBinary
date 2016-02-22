package main;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PrintTreeTest {

    @Test
    public void shouldPrintStringfOfMinusVisual() {
        PrintTree printTree = new PrintTree();
        assertThat(printTree.stringRepeat("-",3), is("---"));
    }

    @Test
    public void shouldPrintStringReplaceKeyVisual() {
        PrintTree printTree = new PrintTree();
        String temp = "abcdef";
        assertThat(printTree.stringReplaceKey(1, "B", temp), is("aBcdef"));
    }

    @Test
    public void shouldPrintLeafVisual() {
        PrintTree printTree = new PrintTree();
        Tree[] miniTree = new Tree[2];
        miniTree[0] = new Tree(2,0,0);
        miniTree[1] = new Tree(3,0,0);
        assertThat(printTree.printLeaf(miniTree), is("2,3,"));
    }


}
