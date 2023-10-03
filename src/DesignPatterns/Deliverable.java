package DesignPatterns;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Deliverable {
    //TODO: research Deliverable pattern

    //TODO:
    //the issue there is no definition [Define it]

    @NotNull
    static String exceptionMsg = "EXCEPTION: exception occurred, please recheck input, then retry ";
    public String TaskName;
    //protected Integer id;
    //Test Member Variables
    Integer Id = 0;
    String name = "N/A";
    Integer tasksToFinish = 0;
    String comment = "";

    //Define a Constructor
    //Utils.
    Deliverable() {
    }

    //each Deliverable can be initiated starting with an id , at least
    public Deliverable(Integer id) {
        this.Id = id;

    }

    public Deliverable(Integer id, String name) {
        this.Id = id;
        this.name = name;
    }

    public Deliverable(int id, String name, String comment, Integer tasksToFinish) {
        this.Id = id;
        this.name = name;
        this.comment = comment;
        this.tasksToFinish = tasksToFinish;
    }

    public Deliverable(@NotNull String id, String name) {
        this.Id = Integer.valueOf(id);
        this.name = name;
    }


    public Deliverable(@NotNull String id, String name, Integer tasksToFinish) {
        this.Id = Integer.valueOf(id);
        this.name = name;
        this.tasksToFinish = tasksToFinish;

    }

    /*** Behavior: Crud Ops: create read update delete ***/
    //1. Create
    public @NotNull
    static Deliverable createDeliverable() {
        return new Deliverable();
    }

    //2. Read
    @Contract(pure = true)
    public static @Nullable Deliverable getDeliverable(Integer id) {
        /***ID is Positive ***/
        if (id > 0) {
            return new Deliverable(id);
        }
        //null, unless it actually returns another useful product
        return null;

    }

    ;

    @Contract(pure = true)
    public static @Nullable Deliverable getDeliverable(Integer id, @Nullable String name) {
        //Utils.
        Deliverable retDeliverable = new Deliverable();
        try {
            /***ID is Positive ***/
            if (name != null) {
                if (id > 0) { //&& name != null) //.equals(!null))
                    {
                        retDeliverable = new Deliverable(id, name);
                    }

                } else if (name != null) {
                    //null, unless it actually returns another useful product
                    throw new NullPointerException();
                }
            }

        } catch (NullPointerException e) {

            System.out.println(exceptionMsg + "\nMessageBody: " + e.getMessage());// MAKE : exceptionMsg `static`
        }
        return retDeliverable;
    }

}
