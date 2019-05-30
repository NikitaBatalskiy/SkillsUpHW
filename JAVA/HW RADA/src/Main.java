import Rada.Deputat;
import Rada.Partia;
import Rada.Util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
//        Set<Country> countries = new TreeSet<>(new SquareComperator());
//        Country ukraine = new Country(630, "Ukraine", 30);
//        Country usa = new Country(15000, "USA", 500);
//        Country germany = new Country(380, "Germany", 39);
//        Country japan = new Country(800, "Japan", 100);
//        countries.add(ukraine);
//        countries.add(usa);
//        countries.add(germany);
//        countries.add(japan);
//        for (Country country: countries){
//            System.out.println(country.toString());
//        }
        Util util = new Util();
        Map<String, Partia> rada = new HashMap<>();
        Deputat deputat1 = new Deputat("Alex", false);
        Deputat deputat2 = new Deputat("Petr", false);
        Deputat deputat3 = new Deputat("Sania", false);
        Deputat deputat4 = new Deputat("Aliesha", false);
        Deputat deputat5 = new Deputat("Vania", false);
        Deputat deputat6 = new Deputat("Vasia", false);
        Deputat deputat7 = new Deputat("Dmitry", false);
        Deputat deputat8 = new Deputat("Konstantin", false);

        List<Deputat> koalitionList = new ArrayList<>();
        koalitionList.add(deputat1);
        koalitionList.add(deputat2);
        koalitionList.add(deputat3);
        koalitionList.add(deputat4);

        List<Deputat> opositionList = new ArrayList<>();
        opositionList.add(deputat5);
        opositionList.add(deputat6);
        opositionList.add(deputat7);
        opositionList.add(deputat8);

        Partia koalition = new Partia(koalitionList);
        Partia oposition = new Partia(opositionList);

        rada.put("koalition", koalition);
        rada.put("oposition", oposition);

        System.out.println();
        System.out.println("Koalition: " + koalition);
        System.out.println("Oposition: " + oposition);
        System.out.println();

        util.giveBribe(rada);
        Deputat deputatBribeTaker = util.findBribeTakerInRada(rada);
        System.out.println("Hey, looks like someone took the bribe. This is " + deputatBribeTaker.getName());
        String bribePartia = util.findPartiaBribeTakers(rada, deputatBribeTaker.getName());
        System.out.println("This deputat is from partia " + bribePartia);
        util.removeFromPartia(rada.get(bribePartia), deputatBribeTaker);
        System.out.println("We removed bribetaker from our partia. Here are all the deputats left in that partia:  " + rada.get(bribePartia));


        util.giveBribesAll(rada);
    }
}
