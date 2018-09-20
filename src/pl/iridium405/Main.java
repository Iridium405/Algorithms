package pl.iridium405;

import pl.iridium405.algorithms.BubbleSort;
import pl.iridium405.design_patterns.factory.Lifeform;
import pl.iridium405.design_patterns.factory.LifeformFactory;
import pl.iridium405.design_patterns.singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        int[] tab = new int[] {4, -15, 8, 1, 0, 12, -5, 0, 4, -8, 10, 2, 15};
        int[] tab2 = new int[] {4, -15, 8, 0, 12, -5, -8, 10, 2, 15};

        BubbleSort sort = new BubbleSort();

        sort.bubbleSortAsc(tab);
        System.out.println("----------");
        sort.bubbleSortDesc(tab2);


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance1 = Singleton.getInstance();
                System.out.println("Instance 1: " + instance1.hashCode());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton instance2 = Singleton.getInstance();
                System.out.println("Instance 1: " + instance2.hashCode());
            }
        });

        thread1.start();
        thread2.start();


        Lifeform person = LifeformFactory.getForm("Human", 27, 1.85);
        Lifeform dogo = LifeformFactory.getForm("Dog", 3, 0.70);
        Lifeform spider = LifeformFactory.getForm("Arachnid", 1, 2.60);
        Lifeform lizard = LifeformFactory.getForm("Agama", 2, 0.1);

        System.out.println(person.toString());
        System.out.println(dogo.toString());
        System.out.println(spider.toString());

    }
}