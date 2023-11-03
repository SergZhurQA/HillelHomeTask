package ua.hille.qaauto.task1;

import java.util.ArrayList;
import java.util.Iterator;


public class ListTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 15; i++) {
            arrayList.add(i);
        }
        System.out.println("Before filter:\n" + arrayList);

        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println("After filter:\n" + arrayList);

    }
}
