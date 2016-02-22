package main;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class HarvestTreeTest {


    @Test
    public void shouldTreeIsEmpty() {
        int[] seed = null;
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew, is(nullValue()));
    }

    @Test
    public void shouldOnlyLeafInTree() {
        int[] seed = {1};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew[0].getValue(), is(1));
    }

    @Test
    public void shouldTwoLeafInTree() {
        int[] seed = {1,2};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew[0].getValue(), is(1));
        assertThat(harvestTree.treeNew[1].getValue(), is(2));
    }

    @Test
    public void shouldThreeLeafInTree() {
        int[] seed = {1,2,3};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew[0].getValue(), is(2));
        assertThat(harvestTree.treeNew[1].getValue(), is(1));
        assertThat(harvestTree.treeNew[2].getValue(), is(3));
    }

    @Test
    public void shouldFourLeafInTree() {
        int[] seed = {1,2,3,4};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew[0].getValue(), is(2));
        assertThat(harvestTree.treeNew[1].getValue(), is(1));
        assertThat(harvestTree.treeNew[2].getValue(), is(3));
        assertThat(harvestTree.treeNew[3].getValue(), is(4));
    }

    @Test
    public void shouldFiveLeafInTree() {
        int[] seed = {1,2,3,4,5};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.treeNew[0].getValue(), is(3));
        assertThat(harvestTree.treeNew[1].getValue(), is(1));
        assertThat(harvestTree.treeNew[2].getValue(), is(2));
        assertThat(harvestTree.treeNew[3].getValue(), is(4));
        assertThat(harvestTree.treeNew[4].getValue(), is(5));
    }

    @Test
    public void shouldGrowMaxIsThreeGrowsInTree() {
        int[] seed = {1,2,3,4,5};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.growMax, is(3));
    }

    @Test
    public void shouldGrowMaxIsTwoGrowsInTree() {
        int[] seed = {1,2,3};
        HarvestTree harvestTree = new HarvestTree(seed);
        harvestTree.stickTree();
        assertThat(harvestTree.growMax, is(2));
    }

}
