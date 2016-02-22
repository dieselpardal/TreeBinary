package main;

public class Tree {

    int value;
    int grow;
    int key;

    public Tree(int value, int grow, int key){
        this.value = value;
        this.grow = grow;
        this.key = key;
    }
    public int getValue() {
        return this.value;
    }
    public int getGrow() {
        return this.grow;
    }
    public int getKey() {
        return this.key;
    }
}