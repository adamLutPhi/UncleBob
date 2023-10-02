package Example2;

/**
 * Gold Nuggets:
 * - it is good to read between the lines.
 **/

import org.jetbrains.annotations.NotNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Example2 {
    /***
     * Informative Comments
     *
     * ***/
    /***
     * This is useful, but it would be much better off
     *
     * if the function were renamed:
     *  responderBeingTested()
     *
     * //Returns an instance of the Responder being tested
     * ***/

    /***Regex Pattern for phone  ***/
    //regexPattern
    public @NotNull String phone = "D*";
    public @NotNull String regexPattern2 = "D*";

    // Pattern.compile(phone);


    //Warning: copyrighted function

    //Regex Pattern class

    //Format a matched:  hh :mm :ss EEE, MMM dd, yyyy
    /**
     * <p> <h3>Solution:</h3>
     * 1. prompt user for input : ask them questions: </br>
     * 1.do you require a unicode? </br>
     * <p>
     * yes (y) -then-> concatenate"1" </br>
     * <p>
     * else then-> concatenate "0" </br>
     * </p>
     *
     * <p> Q. why are we commenting in this way?
     * A. We are using a design pattern</p>
     **/
    //Todo: prompt_user() for input
    @NotNull Integer number = 111010100;

    // Match flags, a bit mask that may include:
    // mnCOMMENTS
    // CASE_INSENSITIVE, MULTILINE, DOITALL, UNICODE_CASE, CANON_EQ, UNIX_LINES, LITERAL, UNICODE_CHARACTER_CLASS and COMMENTS


    // "111 010 100"

    /*** Secret: for your eyes only DO NOT SHARE
     *  int to String
     *  source:https://www.javatpoint.com/java-int-to-string#:~:text=We%20can%20convert%20int%20to,method%2C%20string%20concatenation%20operator%20etc.
     * ***/
    //Here: it is hard-coded, but a real-life scenario:

    //number = Arrays.stream(number).filter(x -> x != 0).toArray();
    public @NotNull String regexPattern = String.valueOf(number);
    @NotNull Integer flags2 = Integer.parseInt(String.valueOf(number));

    //Get `matcher` from pattern.matcher, given `regexPattern` input
    /**
     * <h3>Responder pattern</h3>
     *
     * <p> Note: on the created delegate:
     * <p>
     * <p>
     * abstract void responderBeingTested( responderInstance );
     * but we write a simple
     * <p>
     * Responder responderInstance
     * </p>
     **/

    // A Delegate
    Responder responderInstance;
    /***  This method is a factory method ***/

    // Field Member Variable
    //trasily in
    private Pattern pattern; // = new  Pattern();
    /**
     * <h2> Regex Pattern for phone </h2>
     **/


    public @NotNull Matcher actualMatcher = pattern.matcher(regexPattern);

    boolean isMatch = actualMatcher.matches();

    //Uncle Bob's:

    // this is a better example of an information comment
    // two commands: 1. Format 2. Compile (2):

    //1. Format matched hh : mm : ss EEE , MMM dd, yyyy

    //2. Compiles, returns a Pattern

    //let the pattern object compiles the given `regexPattern`
    // it returns a ti
    public @NotNull Pattern timePattern = pattern.compile(regexPattern); // timeMatcher

    Example2() {
        //1. Regex pattern
        // Cannot explicitly call this
        // (Instead, we need to call some public caller which has the same function signature )
        // [why?]: for security reasons, cannot call function explicitly
        // \p{Alpha}*
        // \p{Digit}* \p{Digit}*

        /**
         * <p>
         *     The latest documentation suggests there is only one function to do that:
         *          The Point: ok since the method-function is (most-likely) is static,
         *          then there new is unnecessary.
         *          (In fact, if it were there, it would only obstruct, and not help)
         *          Ref: (Regex) Class Pattern [Java SE 17]
         *          Source: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html#method-detail
         *
         * </p>
         *
         * **/
        //   new  regex.Pattern
        //1. set regex pattern
        /***  <p>
         * This line is a huge problem [why? ]  because it does not explain the regular Expression Tags
         * </p>**/
        // this  is a  `Propriety code` [please do not use this] - For comparison purposes only!
        Pattern pattern = Pattern.compile("\\d* : \\d* : \\d* \\w*, \\w* \\d*, \\d* ", number);


        /** my pattern: feel free to use this (3):
         * 1. More read-able.
         * 2. Up to the point.
         * 3. More memorable.
         * **/
        //Legend:

        // D* Digit 0 up to as much as we want.
        // W* Word: 0 up to as much as we are satisfied.

        Pattern myPattern = Pattern.compile("D* : D* , W*", number);

        /** Now : your turn: make `myPattern, does the same as `pattern` **/

        //pattern = new regexPattern( "\\d* : \\d* : \\d* \\w*, \\w* \\d*, \\d* " , number ) ;

        //define a
        @NotNull String regexPattern = "D*"; // Digit, repeatable.. is it , a number ?!
        Integer number = 111010100;

        // int flags;
        Integer flags = Integer.parseInt(String.valueOf(number));

        /*** the best ***/

        /*** This is an informative comment ***/

        /*** A correct implementation of compile with String Regex, and number ***/
        pattern = Pattern.compile("D*", number);

        Integer flags2 = Integer.parseInt(String.valueOf(number));

        /*** this is   the Informative comment
         * <p> putting names and forms in the right place
         * 1. Singleton
         * 2. Decorator
         * 3. Visitor
         * 4. Composite
         *
         *
         * Uncle Bob:
         * "So when we use `visitation`,
         * We're gonna say yea, that's cool
         * We can discuss the paterns [why?]
         * To use the pattern to solve the problem
         * The pattern will pop up
         * As the design will become
         *
         * You know what to expect inside the code" (2):
         *
         * 1.  Powerful
         * 2.  Important
         *
         * "Now things are modern
         * What happens here :
         * Singleton (later)"
         *</p>
         *
         *
         * <h2>Takeaway:</h2>
         * <h3> It is better to name things correct </h3>
         * </p>
         *
         * <p>Uncle Bob:
         *     " I get it,
         *     Situation forced us to use
         *     a name we don't like,
         *     So we use a better name
         *
         *
         *     the pattern forced us to use it,
         *     but we can control the comment
         *     and make it better.
         *
         *     2. another form of Informative Comment
         *
         *     What this regular expression matches
         *
         *      Matches n
         *      <p>Note:
         *       Regular expressions
         *       Are hideous,
         *       With horrible syntax
         *       No one understands it
         *       -What  a `GobbledGook`!
         *
         *      1. Look at `Emergent Expression
         *
         *      It is good to comment [ Why?]
         *      because the comment will tell you what to do
         *    Here, it will tell you
         *    what the regular expression is matching
         *    see their attempt is to match a timestamp"
         *</p>
         *
         *      <p>
         *      Example2:
         *      matching
         *      hr : mn : sc
         *
         *      mn - day -  year
         *
         *      Probably timezone
         *
         *      </p>
         *      <p>Uncle Bob:
         *          here, we attempt
         *                        to match a timestamp
         *      we match: hours minutes, seconds ,
         *      ( )whatever that is (a timezone Tz )
         *      - It is good when they tell you what to do\
         *      -- (We have a clear vision in front of us)
         *          The regular expression matches much more than that
         *
         *          -" This comment is lying"
         *          (So, it is good to read between the lines)
         *          Regular expression
         *          1. Not only matches the timestamp
         *          2. It also matches more than that
         *          (2. It  matches the Timestamp)
         *
         *          - A two-edged sword"
         *          1. An informative ,
         *          2. A lie
         *
         *
         *      </p>
         *
         *
         * </p>
         * </p>
         * ***/
        pattern = Pattern.compile("D*", number);

        int year = 1992;


        /*** Pass-in
         * 1.regexPattern
         *
         * 2.flags 111010100
         *
         *
         * ***/

        Pattern.compile(regexPattern, flags); // ( "D*", 111010100)

        Pattern.compile(phone, flags);
    }
    //LearningBlock [Uncomment/Comment Me]:

    //  abstract void responderBeingTested;
    //  abstract void responderBeingTested;//responderInstance);

}
