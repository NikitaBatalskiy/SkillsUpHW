package HW4;

public class Agregat {
    private int weight;
    private String type;
    private String countryOfCreater;

    public Agregat(int weight, String type, String countryOfCreater) {
        this.weight = weight;
        this.type = type;
        this.countryOfCreater = countryOfCreater;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountryOfCreater() {
        return countryOfCreater;
    }

    public void setCountryOfCreater(String countryOfCreater) {
        this.countryOfCreater = countryOfCreater;
    }
    public void work(){
        System.out.println("I will work");
    }
}
