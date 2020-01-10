package pro.mori.moriEve;

import pro.mori.eveCore.doom;

public class Application {
    public static void main(String[] args) {
        new doom(Application.class,args)
                .test()
                .test_Class()
                .test_Url()
                .test_Input()
                .test_UrlEcoding()
                .test_UrlPost()
                .run();
    }
}
