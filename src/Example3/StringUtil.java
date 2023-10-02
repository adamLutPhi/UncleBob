package Example3;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public class StringUtil {
    @Contract(pure = true)
    public static @NotNull String join(String names, String s) {

        String result = names + s;
        return result;
    }

    //join (call here)

}
