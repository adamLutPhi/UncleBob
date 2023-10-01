//import DesignPatterns.Patterns;

import DesignPatterns.E;
import DesignPatterns.Patterns;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.reflect.Field;
import java.util.*;
public class Utils {

    //public static void main(String arg[])
    @NotNull
    public static String exceptionMsg = "EXCEPTION: please recheck input, ensure the correct datatype is entered, then retry again later";

    @Contract(pure = true)
    public static int @NotNull [] loop(Integer a, Integer b) {

        int[] arr = new int[b];
        for (int i = a; i < b; i++) {
            arr[i] = i;
        }
        return arr;

    }

    public Integer boolToInteger(Boolean _boolean) {
/**
 *
 * Credit:
 * @Jonathan ANTOINE
 * Convert Boolean to int in java
 * source : https://stackoverflow.com/questions/3793650/convert-boolean-to-int-in-java
 * **/

        int myInt = _boolean ? 1 : 0;
        return myInt;

    }


    public @Nullable Object checkNull(@Nullable Object object) {

        Object o = null;
        try {

            // Null check
            if (object == null) {
                throw new NullPointerException();
            } else if (object != null) { //!= null) {
                o = object;
            }
        } catch (NullPointerException e) {
            throw new NullPointerException(exceptionMsg + "\nMessageBody: " + e.getMessage()); // exceptionMsg+ e.getMessage());
        }
        return o;
    }

    public void LinkedList(Collection<? extends E> c){

        List<Double> list = new LinkedList<Double>(Arrays.asList(1.2,1.3,3.2)); //c)); //1.2,1.3,3.2));
    }

    public ArrayList<Integer[]> x(){
        Integer n = 100;

        Scanner scan = null;// = new Scanner();
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        while(n > 0)
        {
            int d = scan.nextInt();
            Integer temp[] = new Integer[d];
            for (int i = 0 ; i < d ; i++)
            {
                int t = scan.nextInt();
                temp[i]=Integer.valueOf(t);

            }
            arrayList.add(temp);
            n--;
        }//n is the size of the ArrayList that has been taken as a user input & d is the size
        //of each individual array.
    return arrayList;

    };

      ///  List<int[]> list = new ArrayList<>();
   // list.stream().map(e -> e + 1); // Can apply a transformation function for a list=  new ArrayList<>();
//
    //    list.stream().map(e -> e + 1); // Can apply a transformation function for e

    public static class newObject {
        private final Integer number;
        private final String name;

        newObject(Integer number, String name) {
            this.number = number;
            this.name = name;
        }
    }

    public class ObjOverrides {
        public static void main(String[] args) {//conflicting type (Return type should not be static
            //

            // n.tyre();
        }
    }

    interface nissan {
    }

    static protected class Nissan implements nissan {
        public void tyre() {
            System.out.println("n-mrf");
        }
    }


   public static class Altima extends Nissan {
        public void tyre() {
            System.out.println("nm-ceat");
        }
    }

    /** the point: A Generic, and  non-optional element
     * (new idea)
     * **/
    static <T> @NotNull LinkedList<T> createLinkedList(T @NotNull ...elements) {
        LinkedList<T> newList = new LinkedList<T>();
        for (T element : elements) {
            newList.add(element);
        }

        return newList;
    }

    static Class<?> getFieldType(String @NotNull [] args, Integer id, String name ) throws ClassNotFoundException, NoSuchFieldException {
        /** Arguments Off the Screen:
         **/
        //rule: for each exception, add it specific Exception
        String TypeFormat = "";
        Class<?> TypeClass =  new Patterns.getSpecificProducer(id, name).getClass();//.class;
        try {
            try {
                try {
                    Class<?> c = Class.forName(args[0]); //raises Exception: ClassNotFoundException
                    Field f = c.getField(args[1]); //raises Exception: NoSuchFieldException

                     TypeClass = f.getType(); //type

                    // The `Type:` is a String (%s)[C-like] , plus a carriage-return (%n)
                    TypeFormat = "Type: %s%n"; // One-liner format

                    System.out.format(TypeFormat, f.getType());


                    // production code should handle these exceptions more gracefully


                } catch (ClassNotFoundException x) {
                    x.printStackTrace();
                } catch (NoSuchFieldException x) {
                    x.printStackTrace();
                }

            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }
            return TypeClass;
        } finally {
            System.out.println(TypeFormat+ TypeClass );
        }
    }
    public List<int[]> getFlagged ;
}
    /*Null-able object declaration
    newObject[] objects = new newObject[]{
            new newObject(1, "triangle"),
            new newObject(2, "rectangle"),
            new newObject(3, "circle"),
    };
    */
