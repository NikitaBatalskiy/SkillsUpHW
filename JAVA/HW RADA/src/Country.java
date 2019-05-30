public class Country  implements Comparable<Country>{
    private int square;
    private String name;
    private long population;

    public Country(int square, String name, long population) {
        this.square = square;
        this.name = name;
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (square != country.square) return false;
        if (population != country.population) return false;
        return name != null ? name.equals(country.name) : country.name == null;
    }

    @Override
    public int hashCode() {
        int result = square;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (population ^ (population >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "square=" + square +
                ", name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(Country country) {
        if (this.population > country.getPopulation()){
            return 1;
        }else if (this.population == country.getPopulation()){
            return 0;
        }else return -1;

    }

}
