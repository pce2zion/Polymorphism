package org.example;

public class Jaws extends Movie{
    public Jaws() {
    }

    public Jaws(String name) {
        super("Jaws");
    }

    @Override
    public String getName() {
        return "Jaws";
    }

    @Override
    public String plot() {
        return "Shark eats children and people";
    }
}
