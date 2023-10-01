import DesignPatterns.Deliverable;
import DesignPatterns.Patterns;

class NumberTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
// Runnable: Vanilla
 class simpleRunnable implements Runnable {

    //1. Call Consntructor
     public simpleRunnable(int ID) {myID = ID;}

     public void run() {System.out.println("Thread " + myID + " is running.");}
     private int myID;
 }

 //2.Threading: Runnable
   class javaConcurrentProgram2 {
     public static void main(String[] args) {
         Runnable r = new simpleRunnable(3);
         Thread thread3 = new Thread(r); // thread3 executed r ’s run() method
         thread3.start();
     }
 }

 public class Main {

    public static void main(String[] args) {
       // isEligible( 0 , 65);
        Thread numberThread = new Thread(new NumberTask());
        numberThread.start();
    Utils.Nissan carObject =new Utils.Altima(); //Intellij: makes `Altima` static`

        //producer- deliverable - consumer pattern
    /**
     * <h2>Implementation: SandwichSubArtist as a `SpecificProducer`</h2>
     * <p>From now on, We'd like some new fellow to make our sandwiches
     *
     * </p>
     * assume each order is an atomic by itself
     * **/
        // Implementation:
        //(from the Database (DB): the artist has an `id` and `name`
        Patterns.SpecificProducer sandwichSubArtist = new Patterns.SpecificProducer(1, "Martin Doe");

        /** now the artist has changed his clothes, and is clocked-in, he can commence his work on making som
         * hot and yum sandwiches!**/
        //prompt user, for input

        //we can easily group SandwichId, SandwichName for a deliberable
        // to create a deliverable (Sandwich), we have to (2):
        // Note: we can wrap the F
        // 1. make a new  SandwichId, SandwichName
        Integer SandwichId =1;
        String SandwichName = "Fried Tofu Sandwich - no fries"  ;

        //1.1 an additional stuff might be interesting to add, could be required [business-logic]
        Boolean IsDone  = false; // is that sandwich made, wrapped, ready-to-go, and done?

        // fill-in necessary details:
        // A
        sandwichSubArtist.taskToBeDone( SandwichId, SandwichName); //1, "Fried Tofu Sandwich - no fries");

        //check-in: update: sandwich artist has finished preparing our meal

        //Artisst checks in
        IsDone = Boolean.TRUE;

       Deliverable DeliverableSandwich = sandwichSubArtist.isDone(IsDone, SandwichId, SandwichName ); //TODO: should return deliverable


    }
}
