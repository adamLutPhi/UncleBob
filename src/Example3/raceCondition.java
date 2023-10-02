package Example3;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.TestOnly;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

//import org.junit.Assert;
//import org.junit.Test;

//import static DesignPatterns.Deliverable.exceptionMsg;

/**
 * <h1>Race Condition<h1/>
 * <p>
 * Note: this is the best attempt to get a race condition
 * * How:
 * * by creating large number of thread
 * *
 * * Rule: a better choice to wrap a desired behavior inside a function,
 * * To enhance reusability
 *
 * </p>
 *
 * <p>Rule: People are more drawn to Comments, than real code
 * *
 * * </p>
 *
 * <h3> Crucial Note</h3> this is useful, in a Multi-threaded Scenario
 * <p>
 * /**<h2> Why? </h2>
 *
 * <p>
 * * Because of loop: the worst scenario is infinite loop
 * * i.e. an infinite Memory usage (until we are out of memory)
 * * the plan:
 * * let fire up some 1000 threads,
 * * and hope a race condition will happen
 * * race condition:
 * * when a start of a newer thread starts
 * * before the old thread finishes
 * * warning: this leads to memory leads, but ultimately Out of Memory Exception
 * *
 * </p>
 * <p>
 * * Uncle Bob Tip:
 * * there are other simpler ways to simulate a race condition
 * * -here, it will form a little `resonance` amongst all threads
 * * so, they will not race
 * </p>
 * *<p>
 * *              * For testers:
 * *             * - If you want to simulate the race condition
 * *             * 1. Line-up the threads [How?]:
 * *             *  - Right at the `Race Point`
 * *             *  with semaphones `Anti-thread Lock` structures
 * *             *  to save your threads from getting caught up
 * *             *
 * *</p>
 * *
 * * <p>Footnote:
 * * Cons:
 * * He is using the wrong Strategy
 * *
 * * Pros:
 * * But, at least he is telling us what he is going to do
 * *
 * * -Note:
 * * He could have put this into a function , named
 * * `Attempt race condition` - a better choince
 * * </p>
 * <p>
 * The point:
 * * He should have learned how to create a race condition !
 * * ***
 * ***
 * *
 * <h2>Cannot find symbol assertEquals</h2>
 * <p>
 * source: https://stackoverflow.com/questions/20631621/cannot-find-symbol-assertequals  Is True?
 * <h1>Clarification</h1>
 * <p>The Comments use an optical illusion
 * with repeated patterns , errors emerge </p>
 * which makes your eyes `twist`
 *
 * <p>on the other hand, it's a double-edged sword, because a reader
 * has to read your code  </p>
 *
 * <p>Rule: People are more drawn to Comments, than real code
 * <p>
 * The Issue: If comments are wrong,
 * They will never see the real code
 * <p>
 * There are many ways to make code more `expressive
 * (You are the one in charge)
 * <p>
 * Frankly, it is hard to make this code expressive !
 *
 * </p>
 **/
class raceCondition {
    private Short n = Short.valueOf("0");
/*
public class raceCondition {
    /**
     * <h2>Note:</h2>
     * <p>
     * Here, you can trace the raceCondition
     * this code is for demo purposes,
     * please feel free to uncomment the code for testing purposes
     * </p>
     ***/
//[LearningBlock][1]
//   public WidgetBuilderThread widgetBuilderThread;
// Field Member Variables
//A `thank you` is free: so we would not lose a thing thanking the user (and a way to show respect)
//   String exceptionMsg = "Exception: erroneous input: please recheck input parameters, then retry, thank you.";
//   Short n = 1000;
//  Runnable WidgetBuilderThread;
//

    /**
     * <h3> Crucial Note</h3> this is useful, in a Multi-threaded Scenario
     * <p>
     * /**<h2> Why? </h2>
     *
     * <p>
     * * Because of loop: the worst scenario is infinite loop
     * * i.e. an infinite Memory usage (until we are out of memory)
     * * the plan:
     * * let fire up some 1000 threads,
     * * and hope a race condition will happen
     * * race condition:
     * * when a start of a newer thread starts
     * * before the old thread finishes
     * * warning: this leads to memory leads, but ultimately Out of Memory Exception
     * *
     * </p>
     * <p>
     * * Uncle Bob Tip:
     * * there are other simpler ways to simulate a race condition
     * * -here, it will form a little `resonance` amongst all threads
     * * so, they will not race
     * </p>
     * *<p>
     * *              * For testers:
     * *             * - If you want to simulate the race condition
     * *             * 1. Line-up the threads [How?]:
     * *             *  - Right at the `Race Point`
     * *             *  with semaphores `Anti-thread Lock` structures
     * *             *  to save your threads from getting caught up
     * *             *
     * *</p>
     * *
     * * <p>Footnote:
     * * Cons:
     * * He is using the wrong Strategy
     * *
     * * Pros:
     * * But, at least he is telling us what he is going to do
     * *
     * * -Note:
     * * He could have put this into a function , named
     * * `Attempt race condition` - a better choince
     * * </p>
     * <p>
     * The point:
     * * He should have learned how to create a race condition !
     * * ***
     * ***
     * *
     **/

    public raceCondition(Short n) {
        String exceptionMsg = "Exception: an unexpected error occurred, please recheck input, then retry again. ";
        this.n = n;
        // instantiate an object widgetBuilder , of type  `WidgetBuilder`
        WidgetBuilder widgetBuilder = new WidgetBuilder();
        Runnable WidgetBuilderThread = new WidgetBuilderThread(widgetBuilder);


        //for each entry:
        for (int i = 0; i < n; i++) {


            // 1. start a new thread (of type `WidgetBuilderThread` )

            Thread thread = new Thread(WidgetBuilderThread);
            //start: let the fun begins
            try {
                //2. start a new thread
                thread.start();

            } catch (OutOfMemoryError e) {
                //show the user what has happened
                System.out.println(exceptionMsg + "\nMessage Body: " + e.getMessage());

                break; // you break out of  the loop [safe and sound]
            }

            //widgetBuilder = new WidgetBuilder();

        }
    }

/**<h2>Cannot find symbol assertEquals</h2>
 *
 * source: https://stackoverflow.com/questions/20631621/cannot-find-symbol-assertequals ***/
/*** Is True? ***/

    /**
     * <h2>Cannot find symbol assertEquals</h2>
     * *
     * * source: https://stackoverflow.com/questions/20631621/cannot-find-symbol-assertequals
     *
     *
     * <h1>Clarification</h1>
     * <p>The Comments use an optical illusion
     * with repeated patterns , errors emerge </p>
     * which makes your eyes `twist`
     *
     * <p>on the other hand, it's a double-edged sword, because a reader
     * has to read your code  </p>
     *
     * <p>Rule: People are more drawn to Comments, than real code
     * <p>
     * The Issue: If comments are wrong,
     * They will never see the real code
     * <p>
     * There are many ways to make code more `expressive
     * (You are the one in charge)
     * <p>
     * Frankly, it is hard to make this code expressive !
     *
     * </p>
     **/

    @TestOnly  //@Test
    public void getClarification(@NotNull Integer a, @NotNull Integer b) {

        //possible responses are:
        Integer zero = 0;
        Integer minusOne = -1;
        Integer one = 1;

        //AND:
        //ab = a && b  ;  // logical AND
        Integer ab = a & b; //bitwise AND
        Integer ba = b & a; //bitwise AND
        Integer bb = b & b; //bitwise AND
        Integer aa = a & a;

        /** Test, with hamCrest:**/
        //  public void AssertTest() {


        // single input: element wise

        // Assert.assertTrue((a.compareTo(a)) == zero); // a == a ?
        MatcherAssert.assertThat("Assert True: a.compareTo(a)== 0 ", a.compareTo(a) == zero);

        //Assert.assertTrue((a.compareTo(b)) == zero); // a == b ?
        MatcherAssert.assertThat("Assert True: a.compareTo(b) == 0 ", a.compareTo(b) == zero);  // a == b  (?)

        //Assert.assertTrue ((  a.compareTo(b) ) == zero ); // a == b ?
        //ab to ab
        // Assert.assertTrue((ab.compareTo(ab)) == zero); // ab == ab [true == true  : correct] // a == b (?)
        MatcherAssert.assertThat("Assert True: ab.compareTo(ab) == 0  ", (ab.compareTo(ab)) == zero);


        //    Assert.assertTrue(a.compareTo(b) == minusOne); // a < b
        MatcherAssert.assertThat("Assert True: a.compareTo(b) == -1  ", (a.compareTo(b) == minusOne)); // a < b
        //ab to b
        //    Assert.assertTrue((ab.compareTo(b)) == minusOne); // a == b ?
        MatcherAssert.assertThat("Assert True: a.compareTo(b) == -1  ", (ab.compareTo(b)) == minusOne); // a == b ?


        //aa to b
        //Assert.assertTrue((aa.compareTo(b)) == minusOne); // a == b ?
        MatcherAssert.assertThat("Assert True: aa.compareTo(b) == -1  ", (aa.compareTo(b)) == minusOne); // a == b ?

        //ab to b
        //    Assert.assertTrue((b.compareTo(a)) == one); // a == b ?
        MatcherAssert.assertThat("Assert True: aa.compareTo(b) ==  1  ", (b.compareTo(a)) == one); // a == b ?

        //ab to b
        //Assert.assertTrue((ba.compareTo(bb)) == one); // a == b ?
        MatcherAssert.assertThat("assertTrue: ba.compareTo(bb))  ==  1  ", (ba.compareTo(bb)) == one); // a == b ?

        //ab to b
        //  Assert.assertTrue((bb.compareTo(ba)) == one); // a == b ?
        MatcherAssert.assertThat("assertTrue: bb.compareTo(ba) == 1 ", bb.compareTo(ba) == one);
    }
}

//LearningBlock[2]

/**
 * <h2>
 * Builder Pattern</h2>
 * <p>Let's start by creating a wirdget builder:<br>
 * for this,<br>
 * start by the <h3>WidgetBuilder</h3>
 * A stub : it has to be run on a thread, as below
 * </p>
 **/
class WidgetBuilder extends Object {

    public WidgetBuilder() {

    }
}

/**
 * <h2>
 * Widget  Builder Thread Pattern</h2>
 * <p>It is just a thread :<br>
 * For this,<br>
 * Start by the <h3>WidgetBuilder</h3>
 * A stub : it has to be run on a thread, as below
 * </p>
 **/
class WidgetBuilderThread extends Thread {

    public WidgetBuilderThread(Object widgetBuilder) {

    }

}

