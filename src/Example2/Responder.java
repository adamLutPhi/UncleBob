package Example2;

import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//interface Service
public interface Responder { // abstract class


    // Constructor : No constructor required

    //Research responder pattern
    /*** responder is a part of:
     * Action–domain–responder
     * 1. Action
     * 2. Domain
     * 3. Responder
     *
     * why? responder:
     * what makes it special
     *  Hmm, It is reactive (correct?)
     *
     * - True
     *
     * define a structure
     * how would you respond to a request?
     * What: what is your storyline?
     * What do you  want
     * ( int `Id` , String `name` )
     * where: where do you find them ?
     * already `Hard-coded`
     * - How ?
     *
     * - I respond!
     * -- respond to requests
     *
     * - so , what do you need ?
     *
     *  wait, which  data type, again ?
     * - Bro, how do I know you are real, and serious?
     * - I have my ID
     * -- correct, right answer : pass-through
     * - I take `Integer`
     *
     *  Id = 1 -> Integer
     *
     *  name -> String  <--- regex [implement a regex function ]
     *      build the constructor
     *      I am a builder
     *      of my dream
     *
     * how to make a Union op
     * dream
     *        Union (low , Hi)
     *  p{p} , p{Lu} )
     *
     * Respect code , code respects you
     * Take care of code, so that code takes care of you too --Adam Lutfi
     *
     *
     * \p{L}&&[^\p{Lu}]] lower , not upper case
     * \p{L}&&[\p{Lu}]]  lower , and upper case
     * me:
     * Union op = &&
     *
     * regex Alchemy:
     *
     *    p{Lu} && p{L}
     *    lowerCase + union +   upperCase
     *
     * p{L} && p{Lu}
     *
     * ***/

    public @NotNull String lowerCase = "p{L}";   // unicode - lowercase
    public @NotNull String union = "&&";
    public @NotNull String upperCase = "p{Lu}"; // unicode - uppercase
    public @NotNull String upperAndLower = (lowerCase + union + upperCase); // the true, but regular solution
    public @NotNull String upperAndLower2 = "p{L} && p{Lu}"; // {} can be  simplified to * - the most promising?1
    public @NotNull String upperAndLower3 = "p*L && p*Lu"; //new regex - how about this , too

    /***
     *  <p>
     *      Let us build the Regular Expression
     *      there are many ways to build Regular Expression
     *      1. String upperAndLower2 = "p{L} && p{Lu}";
     *       p{L} && p{Lu}
     *       p*L && p*Lu
     *
     *      java.util.regex.Pattern p = Pattern.compile( upperAndLower3);
     *  </p>
     *
     *   <p>
     *
     * Now let the instance call `compile()` function be:
     *
     *  Instead of   Pattern. compile( )  -It becomes ->  ` p.compile( Regular Expression ) `
     *    -> p.Pattern.matcher
     *  </p>
     */
    // </p>

    //Learning Block [Uncomment/Comment Me]

    // = Pattern.matcher("aaaaab");


//.matcher();
    //  class Responder() {

    //   public void Responder(){

    //    }
    //pi(){}

    // id
    // ====================
    // (user)name  < ----
    // =================
    //password [not now ]
    // name starts with


    //throw new UnsupportedOperationException();

    //criterion

    //1. compile pattern
    public @NotNull Pattern p = Pattern.compile("a*b");
    // letter
    public @NotNull String letterAny = "[a-zA-Z]"; // this is legam
    public @NotNull String unicodeLow = "p{Lu}"; // unicode - lower case
    // unicode is illegal (given this context)
    public @NotNull String unicodeHi = "p{Lu}";    // An uppercase letter (category)  /// unicide - upper case
    public @NotNull Matcher m = p.matcher("aaaaab");
    public @NotNull boolean b = m.matches();

    //System.out.  print().
    ///  System.out.println("$CLASS_NAME$.$METHOD_NAME$");
    public static void main(String[] args) {
        System.out.println("Upper and lower Case: $upperAndLower");

        System.out.println("upper and Lower " + upperAndLower2 + "p{L} && p{Lu}");


        // java.util.regex.Matcher m  = new java.util.regex.Matcher("p{L} && p{Lu}");
        java.util.regex.Pattern p = Pattern.compile(upperAndLower3); //();
        assert upperAndLower2 == upperAndLower3;


    }


}
