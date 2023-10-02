package Example4.schema;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.text.SimpleDateFormat;

public class DateFormat {

    /**
     * <h2> Comments:</h2>
     * Are meant to be useful, entertaining and
     * informative </br>
     * <p>
     * True to tinker a bit with the bit  og course you are reshaped by the traffic
     **/
    ///stick to `static`
    //what: a function, callable by the class  (to itself)
    //the class that to new
    @Contract(" -> new")
    public static @NotNull SimpleDateFormat makeLogFormat() {

        //`Simple Date Format`, is not thread safe,
        // pattern

        // So we need to create each instance independently

        //define a `SimpleDateFormat:<non-thread safe>

        //World

        String FormatpatternWorld = "dd/mm/yyyy ";

        //US
        String FormatpatternUS = " mm/dd/yyyy ";

        return new SimpleDateFormat("DD/mm/yyyy ");

    }
}
