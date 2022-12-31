package org.example;

public class HealthyHamburger extends  Hamburger{
    public HealthyHamburger() {
    }

    public HealthyHamburger(String breadRollType, String meat, Integer price, String name) {
        super("rye", meat, price, name);
    }
}
