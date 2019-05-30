package Rada;

public class Deputat {
    private String name;
    private boolean bribeTaker;

    public Deputat(String name, boolean bribeTaker) {
        this.name = name;
        this.bribeTaker = bribeTaker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBribeTaker() {
        return bribeTaker;
    }

    public void setBribeTaker(boolean bribeTaker) {
        this.bribeTaker = bribeTaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deputat deputat = (Deputat) o;

        if (bribeTaker != deputat.bribeTaker) return false;
        return name != null ? name.equals(deputat.name) : deputat.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (bribeTaker ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", bribeTaker=" + bribeTaker +
                '}';
    }
}
