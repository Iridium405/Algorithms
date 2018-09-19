package pl.iridium405;

import pl.iridium405.algorithms.BubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] tab = new int[] {4, -15, 8, 1, 0, 12, -5, 0, 4, -8, 10, 2, 15};
        int[] tab2 = new int[] {4, -15, 8, 0, 12, -5, -8, 10, 2, 15};

        BubbleSort sort = new BubbleSort();

        sort.bubbleSortAsc(tab);
        System.out.println("----------");
        sort.bubbleSortDesc(tab2);
    }
}