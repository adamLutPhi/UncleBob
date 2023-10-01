import DesignPatterns.Deliverable;
import DesignPatterns.Patterns;

class NumberTask implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
 class simpleRunnable implements Runnable {
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
    Utils.Nissan n=new Utils.Micra(); //makes Micra static

        //producer- deliverable - consumer pattern
    /**
     * assume each order is an atomic by itself
     * **/
        // lets
        Patterns.SpecificProducer sandwichSubArtist = new Patterns.SpecificProducer(1, "Martin Doe");

        //prompt user, for input

        Integer SandwichId =1;
        String SandwichName = "Fried Tofu Sandwich - no fries"  ;
        Boolean IsDone  = false;

        // fill-in necessary details:
        // in
        sandwichSubArtist.taskToBeDone( SandwichId, SandwichName); //1, "Fried Tofu Sandwich - no fries");

        //check-in: update: sandwich artist has finished preparing our meal

        //Artisst checks in
        IsDone = Boolean.TRUE;

       Deliverable DeliverableSandwich = sandwichSubArtist.isDone(IsDone, SandwichId, SandwichName ); //TODO: should return deliverable


    }
}
