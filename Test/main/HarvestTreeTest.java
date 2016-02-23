package main;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class HarvestTreeTest {


    @Test
    public void shouldTreeIsEmpty() {
        int[] seed = null;
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is(nullValue()));
    }

    @Test
    public void shouldTreeIsOne() {
        int[] seed = {1};
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is("01\n"));
    }
    @Test
    public void shouldTreeIsTwo() {
        int[] seed = {1,2};
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is("01\n  02\n"));
    }

    @Test
    public void shouldTreeIsThree() {
        int[] seed = {1,2,3};
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is("  02\n01  03\n"));
    }

    @Test
    public void shouldTreeIsFour() {
        int[] seed = {1,2,3,4};
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is("  02\n01  03\n      04\n"));
    }

    @Test
    public void shouldTreeIsFive() {
        int[] seed = {1,2,3,4,5};
        HarvestTree harvestTree = new HarvestTree();
        String result =  harvestTree.generateTree(seed);
        assertThat(result, is("    03\n  02  04\n01      05\n"));
    }
}
