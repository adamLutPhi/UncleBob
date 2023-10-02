package Example5;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class numberSeries {
    /**
     * <h2>Uncle :</h2>
     * the opposite of Intentional naming
     * 2. provide no clue as to the author's intent
     **/
    //Intellij[auto-complete]: Infer @NotNull on a1
    //BUG[1]: fixed
    public static @NotNull List<Boolean> copyChars(char @NotNull [] a1, char[] a2, @Nullable Integer k) {

        // Boolean[] isEqual = null;

        List<Boolean> isEqual = null;
        isEqual = new ArrayList<>() {
        };
        // isEqual = new Boolean[0];// set to 0 (elements)
        @NotNull final int a1Length = a1.length; //immutable
        Integer i = 0; //mutable variable
        try {
            // Loop
            for (i = 0; i < a1Length; i++) {//Bug[1]:discovered: remove `=` equality by mistake
                //check criterion:
                isEqual.add(checkCharsEqual(a1, a2, k, i));
            }

        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());

        }
        // by default: function returns nothing (hence the void in function's namespace)
        //then, returns isEqual
        return isEqual;
    }

    private static @Nullable Boolean checkCharsEqual(char[] a1, char[] a2, @Nullable Integer k, @NotNull Integer i) { //@Nullable resolve nullity condition
        try {
            if (i == k) { //n
                //at the `special index` swap array values
                a2[i] = a1[i];
                return Boolean.TRUE;
            } else if (i != k) {
                return Boolean.FALSE;
            }
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        //if nothing Expected occurs as Expected: feel free to return null
        return null;
    }
}