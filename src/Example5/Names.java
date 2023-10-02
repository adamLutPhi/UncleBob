package Example5;

/**
 * <h2>Names are everywhere</h2>
 * <p>
 * 1. Name things
 * Do a lot of naming  (in-software)
 * </p>
 * <p>
 * 2. names in :
 * 1. Files and
 * 2. Directories
 * and
 * 3. Programs and
 * 4. Classes and
 * 5. Namespaces
 * </p>
 * <p>
 * 6. variable
 * 7. Arguments
 * </p>
 * <p>
 * Q. why be good with it?
 * A. Because we do so much of it!
 * </p>
 * <p>
 * We probably ought to be good at it.
 * </p>
 *
 *  <h3>4. A rule for the name </h3>
 * <p>
 * Derived from `Tim Ottinger`'s list of naming rules
 * </p>
 * <p>
 * Idea: to Reveal your Intent for naming the name.
 * </p>
 * <h3>Example:</h3>
 * <p>
 * Couple of examples
 * </p>
 **/
public class Names {

    /**<h2>A bad choice of picking d </h2>
     *
     * <p> a name that requires a comment, does not reveal
     * its intent.
     *
     * The name of a variable should tell us
     * the significance of what that variable contains
     *
     * </p>
     *
     * <p>
     *
     *     Q. What's the rule for the length of a variable name, now?
     *     A. Consider the `for loop`:
     *
     *   for ( int i = 0 ; i<10 ;i++ )
     *  {
     *
     *
     *  }
     *
     *     Now, consider this:
     *     it is probably a `no`
     *
     *     There does seem to be a letter variable
     *      (like names)
     *
     *
     *  Q.What is the rule for the length of a variable ?
     *
     *  A. variable: proportional to the size of the Scope
     *  i.e.
     *  Scope is the collection, which variables belong to
     *  each scope has its own variables
     *  (Maybe even a hashmap of <variables, values>)
     *
     * (infer: It is a Context-Driven programming:
     * Where the reuse of the same variable is possible,
     * under different scopes )
     *
     *
     *  Scope1:
     *  name = "company XYZ"
     *  Scope2:
     *  name = "the sea"
     *
     * (notice: how naming changed, radically?)
     * </p>
     *
     * <p>
     *     It's the scope, which is very small like one liner
     *     -" A single letter is fine."
     *
     *   Else, if it's a `Single One-line scope`
     *  </p>
     *   <p>
     *        How about a : one line scope?
     *   </p>
     *
     *
     *   Letter is Great  (Depends)
     *
     *  See, it all depends on ()
     *
     *  1. Line-dependent:
     *
     *   d : a valid name for a date
     *  (If d existed, only if D existed, only on a single line )
     * ---
     * Q.Why:
     * ----
     * -You wouldn't lose the `context`
     * -You wouldn't need the name,
     * --To remind you of anything!
     *
     * -The function call: that generated the name, would be enough.
     *
     *  2. Scope-dependent:
     *  "Long scopes needs long names"
     *
     *  Walk through the heirarchy here
     *
     *  Inside of an if statement
     *
     *  Variables inside the if statement
     *  -- Ought to be very short
     *
     *  - Variables inside of a really tiny while loop
     *  Should be very short
     *
     *  -If you have  a function :
     *  that function is (4) lines long
     *</p>
     * <p>
     * # Variables
     * // The name of a variable should tell use the significance
     * of what that variable contains
     *
     *  - The variables inside of that line should probably be
     *  very short.
     *
     * - Because it's Four lines long
     *
     *  -- Maybe, they'd have to be a little bit Long
     *
     *  Arguments would probably be a little bit longer
     *
     *  Word would probably be good,
     *  For an argument,
     *
     *   Instance variables, live inside the class
     *
     * - They have slightly longer scope
     *
     * - Instance variable should be long-ish,probably
     *
     * Two words:
     * Arguments to a member function
     * - An a (1) word

     * Global functions:
     *
     * Have a huge scope they'd better be very long,
     * Global Variables: have a huge scope
     *
     * So, they should probably be very long
     * Variables should have  a length
     * Proportional to the scope that contains them
     *
     * - Rule for Functions
     *   Exactly the opposite,
     *
     *  The Bigger the scope,
     *  The smaller the name (for a function)
     *
     *  And for very obvious reasons
     *  We would not want to call the open  function
     *
     *  If the name of the Open function
     *  Was open file
     *
     *
     * </p>
     * <p>
     *      <h2>2. Scope-dependent</h2>
     There is an inverse relation shi[ between
     variable lengths!

     1.As the scope of the variable gets larger
     Gets to shrink [why?]
     Because we want to call it more

     --It's a function, lives in a large scope
     -Imagine: It will be called from all over the place )
     --(It will be called a lot)
     -(So,) we want to shrink the name down

     It must be Abstract
     Dealing with high-level abstraction

     2. Moreover,  As the scope (containing the function) decreases
     Since the methods of a class will probably
     Have slightly longer names

     Private functions called by public functions
     Will have longer names

     Private functions called by private functions
     Will have longer names
     i.e.
     ConvertedJsonOfSchema
     - Feel free to continue down the hierarchy

     Extracting until you drop as you'll extract
     Extract and extract
     And all these extracted
     If the function is in a large scope,

     Thus, every time you dig deeper one level, the name gets longer and longer

     Because, the function is getting more precise

     It does something really tiny

     The name of a function is inversely proportional to the size of the scope
     (which it contains)

     Classes:
     The same as functions
     (Changing the tool would matter (OOP or functional)
     Because the level of complexity is persistent

     To recap: classes have (2) main scopes:

     1.Local scope
     2.Global scope

     Have one word

     Global Scope : 1 word names

     2.Local scope
     i.e. for the derived classes
     (Which) Have multiple word names
     i.e. Inner Classes

     Rule:
     As the scope shrinks , the name grows'
     (That's how we control the  `name Length` )
     *
     * In this example
     *
     * </p>
     *
     * **/


    // Mediocre
    /**
     *<h4>d: Is not a bad name, as the scope that it was contained</h4>
     * <h4> It was contained in was small if the scope
     *      If scope was long , then elapsed time is perfectly reasonable</h4>
     **/
    int d; // elapsed time in days

    //The Most-likely (Expectation E(x)) -least effort
    int day;


    //exaggeration (above and Beyond )
    int elapsedTimeInDays;          //define-be specific

    //Me: Do not shy away from not explaining your variables
    //in the function definition/


    //The name of a variable should tell use the significance
    //of what that variable contains


}

