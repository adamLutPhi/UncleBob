package DesignPatterns;

//import re;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

import static DesignPatterns.Patterns.getSpecificProducer;
import static java.lang.reflect.Array.getLength;
//import static java.util.EnumSet.range;
//import static sun.java2d.pipe.PixelToParallelogramConverter.len;

public class Patterns {

    /*** Default Producer
     * 1. has a task: to be done
     *
     * 2.
     * ***/

    //Field Member Variables
    @NotNull
    static List<Deliverable> deliverables = new ArrayList<Deliverable>();
    @NotNull
    static Map<Integer, String> matchedMap = new HashMap<Integer, String>();
    @NotNull
    static Integer matchedId = 0;
    @NotNull
    static String matchedName = "N/A";


    //not used [issues ]
    //public Integer id;
    //public String name;
    Integer id; // TODO; link id
    String name;  //todo: link name
    //member field variables

    //TODO: linker function [Application level]

    static @NotNull List<Deliverable> getDeliverable(Integer id, String name) { //[]VIP] /// factory // prev: was: `Deliverable`
        ///A producer: makes a deliverable
        //we necessarily  don'ot want the producer, as much as we want their deliverable

        // Search Db criteria to get a valid id
        //1. define a (1)  criterion of search (i.e. an if condition on either : id, or name
        // if name starts with letter a
        // Utils.checkNull();

        DefaultProducer producer = new Patterns.
                SpecificProducer(id, name); /*** VIP Kernel ***/
        Integer numNonNullIdx = 0;
        numNonNullIdx = deliverables.size(); // deliverables <--- makes deliverables `static` [which is should be so it vn get called, globally ]
        //Deliverable [] deliverablesArray = new Deliverable[numNonNullIdx];
        List<Deliverable> myDeliverableList = new ArrayList<Deliverable>();

        Deliverable deliverable = new Deliverable(id, name);

        Integer matchedId = 0;
        String matchedName = "N/A";
        numNonNullIdx++;
        Map<Integer, String> matchedMap = new HashMap<Integer, String>();

        //function: phase1 , phase2

        //Phase1:
        //2. search1: match user Criterion:  match with user input Criterion: where deliverable  has:  id == DesignPatterns.Globals.id , name == DesignPatterns.Globals.name
        /*** if `target` is found ***/
        if (id == Globals.id && name == Globals.name) {
            //target found :
            // return tuple;
            matchedId = id;
            matchedName = name;

            //phase2:
            //2.search2:  further check: the matched  (id, name) with the given list (deliverables here (match any list , in general)
            //Criterion:  which object: that object from `db: with arbitrarily specified :

            //1. DesignPatterns.Globals.id
            //2.DesignPatterns.Globals.name
            /**
             List<Integer, >
             person = {
             id: matchedId,
             name: matchedName
             };
             **/

            matchedMap.put(matchedId, matchedName);

        }
        //TODO: list (deliverables)
        //no
        Deliverable found = deliverables.get(0);
        //  int length = find.length;

        @NotNull List<Deliverable> deliverables = new ArrayList<>();
        @NotNull Deliverable deliveableItem = new Deliverable();

        // phase 2:
        for (int i = 0; i < deliverables.size(); i++) {
            deliveableItem = deliverables.get(i);
            Integer matchId = deliveableItem.Id;
            if (deliverables.get(i).Id != null) {
                //check if they match your criteria
                if (deliverables.get(i).Id == matchedId && deliverables.get(i).name == matchedName) {
                    // Should be api
                    // dsArray[i] -= deliverables[i].Id; //( 20 ) dsArray[i]w

                    // Add item to list
                    deliverables.add(deliveableItem);
                    //return this deliverable
                    //myDeliverableList.add(deliverables[i]);
                    Object x = matchedMap.put(matchedId, matchedName);

                    // System.out.println("Match Found: id: ",String.valueOf( matchedId) , " name: ", matchedName ); //deliverables[i]) ; ///= ;

                }
            }
        }

        //initialize an array with length of `deliverables`
        // double[] dsArray = new double[numNonNullIdx]; // delegate

        //return new Deliverable()
        return deliverables; //matchedMap;
    }

    @NotNull
    public static Deliverable getSpecificProducer(Integer id, String name) { //VIP
        /*** Gets the `correct` SpecificProducer [how? ] by a dbSearch ***/
        //function phase1 phase 2
        // return getMyextractedMap(id, name);
        return new Deliverable(id, name);

        /*** mechanism:
         *
         * List(Integer id, String name) -> Map(Integer id, String name)
         *
         */
    }

    /***  double[] ds = new double[numNonNull2]; // delegate
     *
     *
     * gets delivrables, functionally
     ***/
//////////////////////////////////////////////////////////////////////////////////////////
//String names ="";///

    //                           (idFlags =0101010, String "name")
    //public void
    @NotNull
    public static List<Deliverable> getDeliverables(Integer id, String name) {/// factory
        Deliverable.getDeliverable(id, name);

        Integer numNonNullIdx = 0;
        numNonNullIdx = deliverables.size(); // deliverables
        //Deliverable [] deliverablesArray = new Deliverable[numNonNullIdx];
        List<Deliverable> myDeliverableList = new ArrayList<Deliverable>();
        Integer _sum = 0;
        //initialize an array with length of `deliverables`
        // double[] dsArray = new double[numNonNullIdx]; // delegate

        for (int i = 0; i < deliverables.size(); i++) {
            if (deliverables.get(i).Id != null) {


                // should be api
                // dsArray[i] -= deliverables[i].Id; //( 20 ) dsArray[i]w
                numNonNullIdx++;
                myDeliverableList.add(deliverables.get(i));

                System.out.println(); //deliverables[i]) ; ///= ;
            }
        }

        return myDeliverableList;
    }

    @NotNull
    public HashMap<Integer, String> getMyextractedMap(Integer id, String name) {
        // phase 1
        //phase 2
        //assign
        this.id = id;
        this.name = name;
        //throw new UnsupportedOperationException();
        //return zip(id,name);
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(id, name);
        return map;
    }

//}
// new Pattern.pair(Globals.id, Globals.name); //makes pair `1static`

    // ( Globals.getId() Globals.getName() ;) ;//  {id, name}();
    // }

    ///list(zip(a,b))
    //which will give list of tuples. If you want list of lists, you can go:

    ///       [[i,j] for i,j in zip(a,b)]

    /*** returns a specific Producer ***/
    @NotNull
    public SpecificProducer getProducer(Integer Id, String name) {
        return new SpecificProducer(Id, name);
    }

    //Note: get
    //DefaultProducer.getMyextractedMap(Integer id, String name)
    abstract static class DefaultProducer {
        protected static String name;
        static SpecificDeliverable[] deliverables;
        protected Integer id;


        //dummy variable: replace with length of list

        //
        @NotNull
        private static Map<Integer, String> getMyextractedMap(@NotNull Integer id, @NotNull String name) {

            Map<Integer, String> matchedMap = new HashMap<Integer, String>(); //new:tip: insert the tilda `~` instead of the collection's signature


            //function: phase1 , phase2

            //Phase1:
            //1. search1: match user Criterion:  match with user input Criterion: where deliverable  has:  id == DesignPatterns.Globals.id , name == DesignPatterns.Globals.name
            /*** if `target` found ***/
            if (id == Globals.id && name == Globals.name) {
                //target found :
                // return tuple;
                matchedId = id;
                matchedName = name;

                //phase2:
                //
                //2.search2:  further check: the matched  (id, name) with the given list (deliverables here (match any list , in general)
                //Criterion:  which object: that object from `db: with arbitrarily specified :

                //1. DesignPatterns.Globals.id
                //2.DesignPatterns.Globals.name
                /**
                 List<Integer, >
                 person = {
                 id: matchedId,
                 name: matchedName
                 };
                 **/

                matchedMap.put(matchedId, matchedName);

            }

            // phase 3: Find every element in the given map, which matches the
            for (int i = 0; i < deliverables.length; i++) {
                if (deliverables[i] != null) {
                    if (deliverables[i].id == matchedId && deliverables[i].name == matchedName) {
                        // should be api
                        // dsArray[i] -= deliverables[i].Id; //( 20 ) dsArray[i]w

                        //return this deliverable
                        //myDeliverableList.add(deliverables[i]);
                        matchedMap.put(matchedId, matchedName);

                        // System.out.println("Match Found: id: ",String.valueOf( matchedId) , " name: ", matchedName ); //deliverables[i]) ; ///= ;

                    }
                }

            }
            // Integer _sum = 0;
            //initialize an array with length of `deliverables`
            // double[] dsArray = new double[numNonNullIdx]; // delegate


            return matchedMap;

        }

        // Define a (set of) deliverables

        /***todo: implement loop Idea (for arrays
         *
         for(int i = 0;i<doubles.length;i++){
         if (doubles[i] != null) {
         numNonNull++;
         ds[i] = doubles;

         }
         }
         ***/

        public void taskToBeDone(Integer id, String name) {
            //solution 2 : make another one [naive] returning `Deliverable` like:
            // Deliverable deliverable = factoryMethodPattern(id, name);

            // Map<Integer, String> matchedMap
            //  List<Deliverable> deliverables
            Deliverable deliverable = factoryMethodPattern(id, name); //TODO: this map is default map: update map type

        }
        // double[] ds = new double[numNonNull]; // delegate
        //loop method function

        /*** returns the factory Method Pattern***/
        @NotNull
        protected Deliverable factoryMethodPattern(Integer id, String name) {

            //1. define return :  a Map<Integer, String>
            //   Map<Integer, String> matchedMap = HashMap<Integer id, String name>();
            //matchedMap
            SpecificDeliverable x = new SpecificDeliverable(id, name); // Makes factory method `non-static` <---------------
            // function ( matchedMap ->  SpecificDeliverable x

            //.///matchedMap = getextractedMap(id, name);
            // .//  return matchedMap;
            return new Deliverable(id, name);
        } //<--


        @NotNull
        public List<Deliverable> checkNew(@NotNull Integer id, @NotNull String name) {


            Deliverable deliverable = new Deliverable();
            List<Deliverable> deliverables = new ArrayList<>();

            //Phase1:
            //2. search1: match user Criterion:  match with user input Criterion: where deliverable  has:  id == DesignPatterns.Globals.id , name == DesignPatterns.Globals.name

            //checkNew then add

            //  / if `target` is  found /
            if (id == Globals.id && name == Globals.name) {
                //target found :
                // return tuple;
                matchedId = id;
                matchedName = name;

                //define new deliverable
                deliverable = new Deliverable(id, name);

                //add to list
                deliverables.add(deliverable);


                for (Deliverable deliverableItem : deliverables) {
                    //add to list
                    deliverables.add(deliverableItem);
                }
            }
            return deliverables;

        }

        @NotNull
        private Map<Integer, String> getextractedMap(@NotNull Integer id, @NotNull String name) {
            //function: phase1 , phase2

            Deliverable deliverable = new Deliverable();
            List<Deliverable> deliverables = new ArrayList<>();

            //Phase1:
            //2. search1: match user Criterion:  match with user input Criterion: where deliverable  has:  id == DesignPatterns.Globals.id , name == DesignPatterns.Globals.name

            //checkNew then add

            //  / if `target` is  found /
            if (id == Globals.id && name == Globals.name) {
                //target found :
                // return tuple;
                matchedId = id;
                matchedName = name;

                //define new deliverable
                deliverable = new Deliverable(id, name);

                //add to list
                deliverables.add(deliverable);


                //phase2:
                //2.search2:  further check: the matched  (id, name) with the given list (deliverables here (match any list , in general)
                //Criterion:  which object: that object from `db: with arbitrarily specified :

                //1. DesignPatterns.Globals.id
                //2.DesignPatterns.Globals.name


                matchedMap.put(matchedId, matchedName);

            }
            //inserted

            Object[] anArray = new Object[2];
            int length = getLength(anArray);

            ////

            //  int length = Array.getLength(anArray);
            for (int i = 0; i < getLength(deliverables); i++) { //TODO: change length into getextractedMap() (or array.reflect function `getLength()
                if (deliverables.get(i) != null) {
                    //
                    if (deliverables.get(i).Id == matchedId && deliverables.get(i).name == matchedName) {
                        // should call an API
                        // dsArray[i] -= deliverables[i].Id; //( 20 ) dsArray[i]w
                        deliverables.add(deliverables.get(i));
                        //return this deliverable
                        //myDeliverableList.add(deliverables[i]);
                        matchedMap.put(matchedId, matchedName);

                        // System.out.println("Match Found: id: ",String.valueOf( matchedId) , " name: ", matchedName ); //deliverables[i]) ; ///= ;

                    }
                }
            }
            return matchedMap;
        }
        //loop
                 /*
                 //return null;
                 int numNonNull = 0;

                 for (int i = 0; i < deliverables.length; i++) {
                 if (deliverables[i] != null) {
                 numNonNull++;
                 System.out.println(deliverables[i]); ///= ;

                 System.out.println(deliverables[i]);
                 }
                 }
                 return x;

                 }
        //}
        //null value
        // requires loop
        /*
            private static SpecificDeliverable[]  deliverables = new SpecificDeliverable[]{
                new SpecificDeliverable(1, "table"),
                new SpecificDeliverable(2, "tennis"),
                new SpecificDeliverable(3, "ball")};
        */

        class SpecificProducer {
            protected static String name;
            protected Integer id;
        /*
            public SpecificProducer(Integer id, String name) {
                this.id = id;
                this.name = name;

            }
           */

        }

        //great
        class SpecificDeliverable extends Deliverable {

            public static String name;
            public Integer id;
            int numNonNull = 0;

            SpecificDeliverable(Integer id, String name) {
                this.id = id;
                this.name = name;
            }


        }
/////
        /***
         function: phase1 , phase2

         //Phase1:
         //2. search1: match user Criterion:  match with user input Criterion: where deliverable  has:  id == DesignPatterns.Globals.id , name == DesignPatterns.Globals.name
         / if `target` found /
         if (id == Globals.id && name == Globals.name) {
         //target found :
         // return tuple;
         matchedId = id;
         matchedName = name;

         //phase2:
         //2.search2:  further check: the matched  (id, name) with the given list (deliverables here (match any list , in general)
         //Criterion:  which object: that object from `db: with arbitrarily specified :

         //1. DesignPatterns.Globals.id
         //2.DesignPatterns.Globals.name
         /**
         List<Integer, >
         person = {
         id: matchedId,
         name: matchedName
         };

         /

         matchedMap.put(matchedId, matchedName);

         }
         //inserted

         Object[] anArray = new Object[2];
         int length = Array.getLength(anArray);

         ////

         //  int length = Array.getLength(anArray);
         for (int i = 0; i < getLength( deliverables ) ; i++) { //TODO: change length into getextractedMap() (or array.reflect function `getLength()
         if (deliverables[i] != null) {
         if (deliverables[i].id == matchedId && deliverables[i].name == matchedName ) {
         // should be api
         // dsArray[i] -= deliverables[i].Id; //( 20 ) dsArray[i]w

         //return this deliverable
         //myDeliverableList.add(deliverables[i]);
         matchedMap.put(matchedId, matchedName);

         // System.out.println("Match Found: id: ",String.valueOf( matchedId) , " name: ", matchedName ); //deliverables[i]) ; ///= ;

         }
         }
         //loop
         /*
         //return null;
         int numNonNull = 0;

         for (int i = 0; i < deliverables.length; i++) {
         if (deliverables[i] != null) {
         numNonNull++;
         System.out.println(deliverables[i]); ///= ;

         System.out.println(deliverables[i]);
         }
         }
         return x;

         } ***/
    }


    //okay [no Not ok to be alone ]
    static public class SpecificProducer extends DefaultProducer {
        /*** Here is an implementation for `SpecificProducer`
         *
         *  <p> It takes (2) inputs:
         *  1. Integer id
         *  2. String name
         *
         *
         *  </p>
         *
         * ***/
        //}

        //  class SpecificProducer(Integer id, String name) extends DefaultProducer {

        //Field Member Variables

        Integer id;
        String name;

        //Use object: instantiate the producer
        public SpecificProducer(Integer id, String name) {
            super();

            this.id = id;
            this.name = name;
        }

        protected void searchDb(Integer id, String name) {
            /***
             * <p> search by  id
             * how: by using the regular expression:
             </p>
             */
            id = id;
            name = name;

        }

        protected @NotNull Deliverable factoryMethodPattern(Integer id, String name)   //Deliverable factoryMethodPattern(Integer id, String name) //focus on this <-- makes factory non-static //u2: changed to Deliverable
        {
            // Search Db criteria to get a valid id
            //1. define a (1)  criterion of search (i.e. an if condition on either : id, or name
            // if name starts with letter a
            // Utils.checkNull();
            return getDeliverables(id, name).get(0);//  SpecificDeliverable();  bug fixed
        }

        @NotNull
        public Deliverable isDone(boolean BoolFlag, Integer TaskId, String TaskName) {
            @Nullable Deliverable deliverable;
            deliverable = new Deliverable(TaskId, TaskName);
            deliverable = null;
            if (BoolFlag == true) {// if ready, then get deliverable

                //1. assign
                this.id = TaskId;
                this.name = TaskName;

                // Call the  controller method

                // return factoryMethodPattern(TaskId, TaskName);
                deliverable = new Deliverable(TaskId, TaskName);
                // return factoryMethodPattern(deliverable.Id, deliverable.TaskName );

            }
            return deliverable;
        }

    }
    

/*
    @NotNull static SpecificDeliverable[] deliverableRegularExpression = new SpecificDeliverable[]{
            new SpecificDeliverable(1, "table"),
            new SpecificDeliverable(2, "tennis"),
            new SpecificDeliverable(3, "ball")

    };*/


    ///


    ///
    //Check-usefulness
    ///how did we get a static class?
    protected static class MasterApplicationProgram {
        @NotNull Integer n = 10;
        @Nullable Integer[] values; // = new Integer[n];

        public MasterApplicationProgram() { // <-- has potential
            this.n = 10;
            this.values = new Integer[n];

        }

        public void getValues() {
            //TODO: fill-in
        }

        public void searchDb(int id) { //Criteria : only search by id [Vip[Vip]]
            //issue

            //1. search Database: for default products ( dummy products to test model interaction)
            //hardcoded [remove]
            //Integer id = 1;
            //String name = "new thing";


            // DefaultProducer defaultProducer = new SpecificProducer(); // needs controller
            //We have built Controller, for it
            //fix: let the Controller call its static function `getDefaultProducer()`

            /*** Call Controller:
             * Use the `Producer` pattern
             * Let it call `getDefaultProducer
             * ***/
            //default producer : but it has  .taskToBeDone [new variable: used] [Vip]
            //name is from an external factor Db [here: a global variable ]
            DefaultProducer defaultProducer = Controller.getDefaultProducer(id, Globals.getName());
            defaultProducer.taskToBeDone(id, Globals.getName()); //<----makes pattern-name non-static  [remove patterns.name]
        }

        private Deliverable factoryMethodPattern() { //<--crucial function [a better implementation found]
            /*** a factory which implemenets the Deliverables ***/

            throw new UnsupportedOperationException();
        }
    }

    //ok great
    //Check-usefulness
    static public class SpecificDeliverable extends Deliverable { // DefaultProducer {

        /***SPECIFIC TASK CAN BE WRITTEN HERE***/
        public SpecificDeliverable() {
        }

        //constructor
        public SpecificDeliverable(Integer Id, String name) {
            super();
            this.Id = Id;
            this.name = name;

        }
        //Crud

        //1. Create
        public static Deliverable createDeliverable() {
            throw new UnsupportedOperationException();
        }

        //2. Read
        public static Deliverable readDeliverable() {
            throw new UnsupportedOperationException();
        }

        //3. Update
        public static Deliverable updateDeliverable() {

            throw new UnsupportedOperationException();
        }

        //4.Delete
        public static Deliverable deleteDeliverable() {
            throw new UnsupportedOperationException();
        }
        // static public class SpecificDeliverable extends Deliverable //implements Deliverable

    }

    public static class getSpecificProducer extends DefaultProducer {
        public getSpecificProducer(Integer id, String name) {
            super();
            List<Pattern.pair> list = new ArrayList<Pattern.pair>();//(id,name); // NumberContainer>();
            // return new ArrayList (id, name);
            getDeliverable(id, name);
            //return new ArrayList<Pattern.pair>( new HashSet<Integer, String>( id, name));
        }

        @NotNull
        public List<Deliverable> getSpecificProducer() {  // Map<Integer, String> getSpecificProducer() {

            return getDeliverable(Globals.id, Globals.name);

        }

        /*
        public void getSpecificProducer(Integer id, String name) {
            //super();
            // return new ArrayList<Integer, String>(id, name);
          //  getDeliverable(id, name);

        return  new   getDeliverable(Integer id, String name);
}
*/
        @NotNull
        public Deliverable findDeliverablebySpecificProducerToValue() {
            boolean isDone;
            int sandwichId = 0;
            String sandwichName = null;
            if (isDone = true) {
                sandwichId = 1;
                sandwichName = "Fried Tofu Sandwich -no pri";
                //    return getSpecificProducer(sandwichId, sandwichName);
                //getSpecificProducer(sandwichId, sandwichName);

                //  return new Deliverable(sandwichId, sandwichName);
            }
            /// return new Deliverable(sandwichId, sandwichName);
            //  return null;
            return new Deliverable(sandwichId, sandwichName);
        }


/**
 public  class SpecificProducer extends Patterns.DefaultProducer {
 public SpecificProducer(Integer id, String name) {
 super();

 //TODO: fill
 throw new UnsupportedOperationException();

 }
 */

        /*public Deliverable getSpecificDeliverable(Integer sandwichId, String sandwichName){
            return  new Deliverable(sandwichId, sandwichName);
        }*

      //  00public getSpecificProducer(Integer sandwichId, String sandwichName){

           // return getSpecificProducer(sandwichId, sandwichName);
        //}

        public Deliverable isDone(Boolean isDone, Integer sandwichId, String sandwichName) {
            /**SIMULATES a producer finishes a deliverable**/


    }

    ;
}