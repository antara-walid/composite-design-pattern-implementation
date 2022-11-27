package org.example;

public abstract class Component {
    protected String name;
    protected int level;

    public Component(String name) {
        this.name = name;
    }

    public String tabulation() {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < level; i++) {
            stringBuilder.append("\t");
        }
        return stringBuilder.toString();
    }

    public abstract void display(); // if leaf would display the leaf itself
    // if composite would display all its children
}
