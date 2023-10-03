package DesignPatterns;

//right click 'seal'

/*** great code : now let us implement ***/
public sealed class Pattern permits FactoryPattern, PatternImpl { //, factoryPattern.FactoryPattern {
    //TODO: fill the abstract class (If necessary)

    public static class pair {

        public static Integer id;
        public static String name;

        //constructor
        public pair(Integer id, String name) {
            Patterns.getDeliverable(id, name);

        }
                /*
                //get-set
                public Constable getPair(){

                    return (id, name;);
                }
                public setPair(Integer id, String name){

                    this.id = id;
                    this.name = name ;

                    return this.{pair.id, pair.name;
                    }
                }
                */

    }

    class container {
        /*** returns a container of (id, name) pair ***/
        int value1, value2;

        //    double value3;
        //Constructor
        container(int id, int name) {
            this.value1 = id;
            this.value2 = name;

        }
    }
}
