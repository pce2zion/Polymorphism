package org.example;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private Integer price;
    private String name;

    private String additional1Name;
    private Integer additional1Price;

    private String additional2Name;
    private Integer additional2Price;

    private String additional3Name;
    private Integer additional3Price;

    private String additional4Name;
    private Integer additional4Price;

    public Hamburger() {
    }

    public Hamburger(String breadRollType, String meat, Integer price, String name) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "breadRollType='" + breadRollType + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public String toBuyBurger(){
        int burgerPrice = this.price;
        return "Your burger " + this.name + " costs " + this.price;
    }
}
