package Example4.schema;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.crypto.dsig.Transform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/***
 * Rule (1): to write Implementation note, use: @implNote This is an  implementation.
 * Rule (2): to add link use: {@link thisIsALink}.
 *  Uncle Bob:
 * for an underscore :
 *
 * just put an underscore
 * ***/

/***
 * Title: Java equivalent to C# extension methods
 * source: https://stackoverflow.com/questions/4359979/java-equivalent-to-c-sharp-extension-methods
 * ***/
public abstract class ListDecorator<E> implements List<E> {
    //public final List<A> Listwrapper;

    //Wrapper: In Decorator: a wrapper is a List (of a class A)
    private final List<E> wrapper;// it can be a list of Any A
    /**
     * Note : this is a copy /paste documentation (CHANGE IMMEDIATELY)
     * <h2>ListDecorator</h2>
     * maps
     * Sorts this list according to the order induced by the specified
     * {@link Comparator}.  The sort is <i>stable</i>: this method must not
     * reorder equal elements.
     *
     * <p>All elements in this list must be <i>mutually comparable</i> using the
     * specified comparator (that is, {@code c.compare(e1, e2)} must not throw
     * a {@code ClassCastException} for any elements {@code e1} and {@code e2}
     * in the list).
     *
     * <p>If the specified comparator is {@code null} then all elements in this
     * list must implement the {@link Comparable} interface and the elements'
     * {@linkplain Comparable natural ordering} should be used.
     *
     * <p>This list must be modifiable, but need not be resizable.
     *
     * @param Transform<E, R> transformer the {@code Comparator} used to compare list elements.
     * A {@code null} value indicates that the elements'
     * {@linkplain Comparable natural ordering} should be used
     * @throws ClassCastException            if the list contains elements that are not
     * <i>mutually comparable</i> using the specified comparator
     * @throws UnsupportedOperationException if the list's list-iterator does
     * not support the {@code set} operation
     * @throws IllegalArgumentException      (<a href="Collection.html#optional-restrictions">optional</a>)
     * if the comparator is found to violate the {@link Comparator}
     * contract
     * @implSpec The default implementation obtains an array containing all elements in
     * this list, sorts the array, and iterates over this list resetting each
     * element from the corresponding position in the array. (This avoids the
     * n<sup>2</sup> log(n) performance that would result from attempting
     * to sort a linked list in place.)
     * @implNote This implementation is a stable, adaptive, iterative mergesort that
     * requires far fewer than n lg(n) comparisons when the input array is
     * partially sorted, while offering the performance of a traditional
     * mergesort when the input array is randomly ordered.  If the input array
     * is nearly sorted, the implementation requires approximately n
     * comparisons.  Temporary storage requirements vary from a small constant
     * for nearly sorted input arrays to n/2 object references for randomly
     * ordered input arrays.
     *
     * <p>The implementation takes equal advantage of ascending and
     * descending order in its input array, and can take advantage of
     * ascending and descending order in different parts of the same
     * input array.  It is well-suited  in merging two or more sorted arrays:
     * simply concatenate the arrays and sort the resulting array.
     *
     * <p>The implementation was adapted from Tim Peters's list sort for Python
     * (<a href="http://svn.python.org/projects/python/trunk/Objects/listsort.txt">
     * TimSort</a>).  It uses techniques from Peter McIlroy's "Optimistic
     * Sorting and Information Theoretic Complexity", in Proceedings of the
     * Fourth Annual ACM-SIAM Symposium on Discrete Algorithms, pp 467-474,
     * January 1993.
     * @since 1.8
     */
    @NotNull List<Boolean> result = new ArrayList<>(Arrays.asList(true, false, true));

    // implementation of all the list's methods here...

    public ListDecorator(List<E> wrapper) {
        this.wrapper = wrapper;
    }

    void transformClass(R A, @NotNull C B) {
        /** transforms the inner properties according to some functionality (which is a latent variable).
         *
         **/
        String tmpa = B.a;
        String tmpb = B.b;

        B.b = C.a;
        B.a = C.b;

        C.a = tmpa;
        C.b = tmpb;

    }

    @NotNull
    public ArrayList<R> map(Transform transformer) {
        try {
            ArrayList<R> result = new ArrayList<R>(size());
            //Java: generic
            for (E element : this) {
                //Transform A into `R`
                //me: element is A :  we want it to be(come) R [can we make it?]

                R transformed = (R) (element); //man, we cannot cast this is A,  would castint it into to R work ? //Intellij: Try to generify (thanks Intellij, you're my new friend ;)
                // R transformed =  R.class.cast( element); // [STACKOVERFLOW]
                result.add(transformed);

            }
            return result;// all we want is : THIS
        } catch (NullPointerException e) {
            System.out.println("Null pointer Exception " + e.getMessage());
        }
        // return  result;// R.class.cast(result);
        // return new ListDecorator<R>((List<R>) result) { // use of a generic
        /**
         * @return
         */
        return null;
    }

    // List< Boolean> result = new ArrayList<>(){ true, false};
    public class R {

        static String a;
        static String b;
    }  // oranges

    public class C {
        public static String a;
        public static String b;

    } //unused //apples
}


//P.S.