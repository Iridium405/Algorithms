package pl.iridium405.design_patterns.creational.singleton;

public class Singleton {

    //-------------------- MINIMAL vs. THREAD-SAFE ----------------------



//  //-------------------- MINIMAL ----------------------
//
//
//    private static final Singleton INSTANCE = new Singleton();
//
//    public static final Singleton getInstance() {
//        return INSTANCE;
//    }



    //-------------------- THREAD-SAFE ----------------------


    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
