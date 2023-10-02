package Example5;

import org.jetbrains.annotations.NotNull;

public class Disambiguation {
    /**
     * What's the difference
     * <p>
     * xyzControllerForEfficientHandlingOfStrings
     * XYXControllerForEfficientStorageOfStrings
     * <p>
     * -would you pick the right one from a code completing list?
     * <p>
     * and watch out for symbols like
     * <p>
     * Quote:
     * "Our modern   ideas have gotten pretty good at disambiguating
     * dis-ambiguating 1 and l
     **/
    @NotNull Integer O = 0;
    @NotNull Integer O1 = 1;
//misspelling example

    public void getA(Integer O, Integer OI) {
        Integer a = 1;
        Integer l = 1;
        if (O == 1) {
            a = O1;
        } else {
            //1 = O1; error : mistook 1 with an l
            l = O1;

        }
    }


    //avoid convenient misspellings
/**
 public final void getClass(){ //cannot Override function needs to be final
 //avoid situations whre code will break, if a spelling error fixed.

 getA(O, O1);
 }
 **/

}
