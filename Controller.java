import org.jetbrains.annotations.Nullable;

/*** Controller is non-Static object  ***/
//controller: non-static
public class Controller {

    //An Always null  object
    @Nullable
    static Utils.newObject[] objects = new Utils.newObject[]{
            new Utils.newObject(1, "triangle"),
            new Utils.newObject(2, "rectangle"),
            new Utils.newObject(3, "circle"),
    };
    //An Always null  object
    //Note this is not the right wat to initialize arrays
    @Nullable
    static Utils.newObject[] usefulobjects = new Utils.newObject[]{ //@NotNull
            new Utils.newObject(1, "Id"),
            new Utils.newObject(2, "phone"),
            new Utils.newObject(3, "GUID"),
    };

    public Controller(Utils.newObject[] objects) {

    }

    //constructor
    public Controller(String Id, String Phone) {
        System.out.println(usefulobjects[0]);

        /***1.  parse string *** /
         }


         public static newObject[] callNewObject(){

         return objects; // objects has to be non-static
         }


         public static  void main(String args[]){
         //requires the controller class
         /***
         Controller.newObject[] objects = new newObject[]{
         new newObject(1, "triangle"),
         new newObject(2, "rectangle"),
         new newObject(3, "circle"),
         };
         ***/
        /***TODO: uncomment me
         Controller.newObject[] objects ;
         for ( int i=0 ; i<= objects.length; i++)//no: assign then add
         {

         }
         **/
    }

// Demo


//   public static mae
}
