package ua.hille.qaauto.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cow {
    String name;

    Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ArrayList<String> cowNames = new ArrayList<>();
        cowNames.add("Bella");
        cowNames.add("Daisy");
        cowNames.add("Penelope");
        cowNames.add("Jersey");
        cowNames.add("Bessie");
        cowNames.add("Clarabelle");
        cowNames.add("Nellie");
        cowNames.add("Bossy");
        cowNames.add("Rosie");
        cowNames.add("Gertie");

        HashMap<String, Cow> farm = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            Cow cow = new Cow(cowNames.get(i));
            farm.put(cow.getName(), cow);
        }

        for (Map.Entry<String, Cow> cow : farm.entrySet()) {
            System.out.println("Cow name: " + cow.getKey() + ", Cow Object: " + cow.getValue());
        }
    }
}
