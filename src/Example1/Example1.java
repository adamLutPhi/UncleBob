package Example1;//import java.util.Arrays;
/**
 * <h2> Rule1:</h2>
 * <p></p>
 * assignment can be neither @Nullable, nor @NotNull
 **/

import DesignPatterns.Employee;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

import static java.lang.reflect.Array.getLength;

public class Example1 {


    //Field Member Variables
    private final Double[] DoubleArray;

    //Please Check to see if the `Employee` is eligible for full benefit

    //set data
    //always Null :S
    @NotNull Integer numNonNull = 0;
    //define a single employee
    @NotNull Employee employee = new Employee("3", " Lin Yu ", true, 0);
    @NotNull String exceptionMsg = "Exception: Please recheck input, then retry ";
    @NotNull Integer id;
    /***
     Ref: Convert boolean to int in Java
     source:https://stackoverflow.com/questions/3793650/convert-boolean-to-int-in-java
     ***/

    //Uncle Bob: given an employee's flag, and emp. Wage hourly
    int empFlag = employee.flag ? 1 : 0;
    int EmpWageHourly = employee.isWageHourly ? 1 : 0;

    /**
     * Employee[] employees = new Employee[]{
     * new Employee("1", "Alex Crew", false, 3),
     * new Employee("2", "Adam Powell's", true, 2),
     * new Employee("3", "Izzy Liz ", true, 0),
     * };
     **/

    //invoke Class Constructor:
    public Example1(@Nullable List<Object> list) throws Exception {

        Double[] ds = getList(list);

        this.DoubleArray = ds;
    }


    //LearningBlock[1]
    //Bug[1]:
    //1. possible Situation(1):
    //1. input: user `list` is null
    //2. output: return is null
    //intellij:hint: Exception is never thrown
    @Nullable
    public Double[] getList(@Nullable List<Object> list) throws Exception {//Intellij: Exception is never thrown

        //define an array of `Double
        @Nullable Double[] ds;// delegate
        ds = new Double[numNonNull];
        try {
            for (int i = 0; i < getLength(list); i++) { // doubles.length; i++) {
                //check: object not null

                if (list.get(i) != null) {
                    //add +1 : count non-null values
                    numNonNull++;

                    // If a list has a valuable value
                    ds[i] = (Double) list.get(i);

                    // print it to the screen, please
                    System.out.println(ds[i]);

                }

            }//end-loop
            // return ds;
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        //  return new ds; //Double[0];
        return ds;
    }
//LearningBlock[1][End]

    public List<Double> getListAt(List<Object> list, Integer i) throws Exception {
        Double[] ds = new Double[numNonNull]; // delegate
        Double matchedValue = 0.0; //false;

        List<Double> dS = new ArrayList<>();//Warning unused

        for (int j = 0; j < getLength(list); j++) { // doubles.length; i++) {
            //check: object not null
            if (list.get(j) != null) {
                //add +1 : count non-null values
                numNonNull++;
                if (j == i) {
                    //save matched value
                    //Assign whatever the value in list
                    //reparse object, into Boolean
                    matchedValue = (Double) list.get(i);
                    // If a list has a valuable value
                    ds[j] = (Double) list.get(j); //assignment can be neither @Nullable, nor @NotNull

                    //last, but not least, add to the List
                    dS.add(matchedValue); //ds[i]);
                    // print it to the screen, please
                    System.out.println(ds[i]);

                }
            }

        }
        return dS;  //matchedValue; //ds;
    }

    //; /// new Employee();
//constructor
    // public UncleBob2() {


    //int my int =  employee.flag ? 1 : 0;


    //Or even a better function
    // It would have been nice if there is a function like this:
    // Note[Intellij]:  static member is accessed(only) via `the instance reference`
    //
    //

    /**  public Example1() throws Exception {

     Example1(){
     throw new UnsupportedOperationException();

     }

     }
     **/

    /***Functional requirement (1):
     * Check to see if the employee is eligible for full benefits:
     *
     ***/
    @NotNull
    public Boolean mainFunction(Integer a) {
        Boolean flag = false;
        Boolean condition = employee.isEligibleForFullBenefits(a);
        try {

            //
            if (condition) {
                //
                // return true;
                flag = true;

            } else if (!condition) { // employee.isNotEligbleForFullBenefits()) {
                //return false;
                flag = false;

            } else {

                throw new RuntimeException(exceptionMsg);
            }
        } catch (NullPointerException e) {
            System.out.println(exceptionMsg + "\nException Body: " + e.getMessage());
        }
        return flag;
    }


    /*** An Unoptimized function for full benefits
     ***/

    /***
     * Check to see if the emplyee is elegible for full-benefits
     ***/
    @NotNull
    public Boolean isEligbleForFullBenefits(Integer minAge, Integer maxAge) {
        Boolean flag = false;
        try {
            if (((empFlag & EmpWageHourly) > 0) && (employee.age > 65)) {

                flag = true;

            } else if (((empFlag & EmpWageHourly) > 0) || (employee.age <= 65)) {
                //return false;
            } else {

                throw new RuntimeException(exceptionMsg);
            }
        } catch (NullPointerException e) {

            System.out.println(exceptionMsg + "\nMessage Body:" + e.getMessage());
        }
        return flag;
    }

    /*** An Unoptimized function <br>
     * for the opposite of employee Ineligible for  full benefits <br>
     ***/
    @NotNull
    public Boolean isEmployeeNotEligible() {

        Boolean flag = false;


        try {
            if (((empFlag & EmpWageHourly) > 0) && (employee.age <= 65)) {
                //return false;

            } else if (((empFlag & EmpWageHourly) > 0) || (employee.age > 65)) {
                //return true;
                flag = true;
            } else {

                throw new RuntimeException(exceptionMsg);
            }
        } catch (NullPointerException e) {
            System.out.println(exceptionMsg + "\nMessage Body: " + e.getMessage());
        }
        return flag;
    }
}
