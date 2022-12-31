package org.example;

public class Encanto extends Movie{
    public Encanto() {
    }

    public Encanto(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Encanto";
    }

    @Override
    public String plot() {
       return"A tale about love, family and magic";
    }
}
