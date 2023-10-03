package DesignPatterns;//In Java: classes cannot be static

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Globals<name, id> {


    // map:
    /***
     latent variable:  Function.identity
     list.stream()
     .collect(Collectors.toMap(Object::getId, Function.identity()));
     ***/
    // Object -> custom object
    //defines a wrapper

    public static volatile Integer id = 1010011; //get set

    /*** public static volatile  ***/
    //potential issues : unused
    public static volatile String name = "Frater Adam";// get set

    /*** getname ***/
    public static String getName() { // ok
        return Globals.name;
    }


    //potential issues : unused id [had `Intellij` suggest: the way it is viewed (by others) ]

    //Properties(2):
    //1. Id

    /*** public static volatile  ***/
    //1. Id

    //Namwe
    //set-get
    // Name

    /*** setname ***/
    public static void setName(String name) {
        Globals.name = name;
    }

    /*** setname ***/

    public static Integer getId() { // ok
        return Globals.id;
    }

    /*** setId ***/
    public static void setId(String name) {
        Globals.id = id;
    }

    public static void setId(Integer id) {
        Globals.id = id;
    }
    //Id
    //set-get
    // get () -> Globals.Id;


    //setter

    /*
        getId(){
            return Id;
        }
        */
    /*
    public Integer getId()
    {return id;}
    public String getName()
    {return name;}
    */
    // a in lambda java 8  mapr from f -to-> g
    //public Map<Integer, String > convertListAfterJava8(List<<Object>> list) {
   /*
    public Map<Integer, String > convertListAfterJava8(List<<Object>> list) {

        Map<Integer, String> map = list.stream()
                .collect(Collectors.toMap(Pattern.pair.id=id,Pattern.pair.name=name); // , Function.identity()));
        return map;
    }
    */
    //working !
    @NotNull
    public Map<Integer, String> getMap(Integer id, String name) {

        Map<Integer, String> map = new HashMap<>();
        map.put(id, name);
        //     Map<Integer, Object> map = list.stream()
        //             .collect(Collectors.toMap( (Pattern::getName, Function.identity(), (k, k2) -> k, Pattern.pair::new));
        //      .collect(Collectors.toMap(Object::getClass(), Function.identity();););
        return map;
    }


}
