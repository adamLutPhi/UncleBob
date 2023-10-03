package DesignPatterns;

import org.jetbrains.annotations.NotNull;

public class Controller {

    //implementation of Controller
    //constructor [cannot be static ]

    /**
     * You can't create a top level static class; that's what the compiler is trying to tell you.
     */
    public Controller() {

        //Define default items
        //Patterns.DefaultProducer defaultProducer = new Patterns.SpecificProducer(); // needs controller
    }

    //get Constructor [static]
    public @NotNull
    static Patterns.DefaultProducer getDefaultProducer(Integer id, String name) {

        //Note: It Should Return Specific Producer
        Patterns.DefaultProducer defaultProducer = new Patterns.getSpecificProducer(id, name); // needs controller <---
        return defaultProducer;
    }
}
