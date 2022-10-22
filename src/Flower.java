public class Flower {

    private String name;
    private String flowerColor;
    private String country;
    private float cost;
    int lifeSpan;

    Flower (String name, String flowerColor, String country, float cost, int lifeSpan){
        this.name = name;

        if(flowerColor == null){
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }

        if (country == null){
            this.country = "Россия";
        } else {
            this.country = country;
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        this.lifeSpan = lifeSpan;
    }

    Flower(String name, String flowerColor, String country, float cost){
        this(name, flowerColor, country, cost, 3);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if(flowerColor == null){
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null){
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
}
