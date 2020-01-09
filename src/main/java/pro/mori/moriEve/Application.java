package pro.mori.moriEve;

import pro.mori.eveCore.doom;

public class Application {
    public static void main(String[] args) {
        new doom(Application.class,args)
        .test()
        .run();


    }
}
