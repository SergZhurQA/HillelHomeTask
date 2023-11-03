package ua.hille.qaauto.task2;

import java.util.HashSet;

public class HashSetTask {
    public static void main(String[] args) {
        HashSet<Integer> numbersOneToFifteen = new HashSet<>();
        HashSet<Integer> numbersSixteenToTwenty = new HashSet<>();

        for (int i = 1; i <= 15; i++) {
            numbersOneToFifteen.add(i);
        }

        for (int i = 16; i <= 20; i++) {
            numbersSixteenToTwenty.add(i);
        }

        System.out.println("Before merger:\n" + numbersOneToFifteen + "\n" + numbersSixteenToTwenty);

        HashSet<Integer> mergerSet = new HashSet<>(numbersOneToFifteen);
        mergerSet.addAll(numbersSixteenToTwenty);

        System.out.println("After merger:\n" + mergerSet);
    }
}
