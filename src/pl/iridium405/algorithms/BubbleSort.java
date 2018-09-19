package pl.iridium405.algorithms;

public class BubbleSort {

    public void bubbleSortAsc(int[] tab) {
        int temp;
        int flag = 1;

        while (flag > 0) {
            flag = 0;
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = temp;
                    flag++;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }


    public void bubbleSortDesc(int[] tab) {
        int temp;
        int flag = 1;

        while(flag > 0) {
            flag = 0;
            for (int i = tab.length-1; i > 0; i--) {
                if(tab[i] > tab[i-1]) {
                    temp = tab[i-1];
                    tab[i-1] = tab[i];
                    tab[i] = temp;
                    flag++;
                }
            }
        }

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i] + " ");
        }
    }

}