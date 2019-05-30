package Rada;

import java.util.List;

public class Partia {
    private List<Deputat> deputates;

    public Partia(List<Deputat> deputates) {
        this.deputates = deputates;
    }

    public List<Deputat> getDeputates() {
        return deputates;
    }

    public void setDeputates(List<Deputat> deputates) {
        this.deputates = deputates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Partia partia = (Partia) o;

        return deputates != null ? deputates.equals(partia.deputates) : partia.deputates == null;
    }

    @Override
    public int hashCode() {
        return deputates != null ? deputates.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Partia{" +
                "deputates=" + deputates +
                '}';
    }
}
