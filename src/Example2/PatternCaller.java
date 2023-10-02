package Example2;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class PatternCaller {

    /***
     *
     * {0-9} : {0-9} : {0-9} {A-Za-z} {A-Za-z} {0-9}
     *
     * <p>
     *     please do not write cryptic Regular Expression like:
     *     \\d* : \\d* \\w*, \\w* \\d*, \\d*"
     *
     * - Uncle Bob:
     *  The comment is lying
     *  (Sn exagguration)
     *  Because the regex does not only match what the comment says
     *  The point:
     *  - Do not Accept the comments, by their values
     *
     *
     * </p>
     * <p>
     *
     *     this Regular expression "\\d* "
     *
     *
     *     is cryptic
     *     2. hard to comprehend
     *     does not make sense
     *     we cannot work easily with it<br>
     *
     *    but we can write it as:
     *    {0-9}* <br>
     *
     *    which means a `Digit` , <br>
     *    and this is too long
     *    let us shorten it to D*
     *
     *    which means `multiple digits
     *    we can re-write
     *
     *     #Example
     *      a Phone number
     *    has many digits
     *    we can and regular Expression is `Lengthy`, sometimes awkward like \\d*
     *    we can replace this weird notation with something more meaningful as:
     *          Digit
     *         or even more easier, with One Letter: :
     *           D
     *
     *          So,  a phone number is  made out of Digits,
     *          or `Digit`s
     *          that is still long , fine, let us use (D)*
     *
     * </p>
     * ***/
    public @NotNull
    static String regexPattern = "\\d* : \\d* : \\d* \\w*, \\w* \\d*, \\d* ";

    //Warning: copyrighted material
    //1.regex pattern
    //    HH : MM : SS EEE (W)*, (W)* (D)*, (D)*
    public @NotNull String C = "Digit";
    public @NotNull String useFulRegex = "(D)*";
    public @NotNull String phone = "(D)*";
    /***<p>
     * Takeaway:
     * phone number is
     * a word , instead of regular expression like: `\w `
     *
     * let is easy it a bit with:
     *
     *
     * </p>
     *
     *
     *
     * ***/
    public @NotNull String phoneNumber = "D*";

    //1. Constructor
    public PatternCaller() {
    }

    /*** Returns a Pattern  [How?]
     *  Compiles the given regular String expression (formated in RegEx ) [How?]
     *  regexPattern
     *  into a pattern.
     * ***/
    public static @NotNull Pattern compile(@NotNull String regexPattern) {
        // Compiles a Pattern
        //check nullity
        if (regexPattern != null) {
            return Pattern.compile(regexPattern);
        } else {
            return Pattern.compile(regexPattern);
        }
    }
}


