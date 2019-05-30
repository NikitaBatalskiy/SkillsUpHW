package Rada;

import java.util.*;

public class Util {
    int random = new Random().nextInt(8) + 1;
    int count = 1;

    public void giveBribe(Map<String, Partia> rada) {
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputat : entry) {
            for (Deputat deputat : nameOfDeputat.getValue().getDeputates()) {

                if (count == random) {
                    deputat.setBribeTaker(true);
                }
                count++;
            }
        }
    }

    public void giveBribesAll(Map<String, Partia> rada) {
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputat : entry) {
            for (Deputat deputat : nameOfDeputat.getValue().getDeputates()) {
                deputat.setBribeTaker(true);

            }
        }
    }

    public Deputat findBribeTakerInRada(Map<String, Partia> rada) {
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputat : entry) {
            for (Deputat deputat : nameOfDeputat.getValue().getDeputates()) {
                if (deputat.isBribeTaker()) return deputat;
            }
        }
        return null;
    }

    public String findPartiaBribeTakers(Map<String, Partia> rada, String bribeTaker) {
        Set<Map.Entry<String, Partia>> entry = rada.entrySet();
        for (Map.Entry<String, Partia> nameOfDeputat : entry) {
            for (Deputat deputat : nameOfDeputat.getValue().getDeputates()) {
                if (Objects.equals(deputat.getName(), bribeTaker))
                    return nameOfDeputat.getKey();
            }
        }
        return null;
    }

    public boolean removeFromPartia(Partia partia, Deputat deputat) {
        return partia.getDeputates().remove(deputat);
    }
}
