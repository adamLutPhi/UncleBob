package Example3;

import org.jetbrains.annotations.NotNull;

public class Singleton {

    /***
     * <p>
     *      @credit:
     *      ref: Singleton
     *      source: https://stackoverflow.com/questions/3319434/singleton-pattern
     *
     * </p>

     * ***/
    static Object instance;

    //member Field Variables

    /**
     * <h2>Note: on naming: if you cannot name it something better than comment it out</h2>
     * <p>
     * (for later for you and other developers to work on)
     *
     * <h3>-Use Comments to tell us what are you expecting (out of the function) <h3/>
     * </p>
     **/
    Singleton() {

    }

    public static @NotNull Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }
        return (Singleton) instance;
    }
}
