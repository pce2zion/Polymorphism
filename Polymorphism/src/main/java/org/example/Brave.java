package org.example;

public class Brave extends Movie{
    public Brave() {
    }

    public Brave(String name) {
        super("Brave");
    }

    @Override
    public String getName() {
        return "Brave";
    }

    @Override
    public String plot() {
        return "An Irish princess who carves her own future";
    }
}
