package DesignPatterns;

import org.jetbrains.annotations.NotNull;

//public class IEmployeeFactory {

// The Factory:
/**
 * In Plain English:
 * factory builds products
 * but products has (original) creator
 * and has workers that work on it
 */
//build the public constructor

/***
 *
 * ref: Java - Convert integer to string [duplicate]
 *Source:  https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
 *
 * @credit: Bozho
 ***/

sealed class FactoryPattern extends Pattern permits FactoryPatternImpl {

    //public @NotNull String stringId = "";
    @NotNull
    static Integer number = 111010100;
    @NotNull
    public String stringIdAbstract = "000"; //TODO: implement
    @NotNull
    public String stringPattern = "D*";

    /**
     * <h3>ref: Java - Convert integer to string [duplicate]</h3>
     * Source:  https://stackoverflow.com/questions/5071040/java-convert-integer-to-string
     *
     * @credit: Bozho
     ***/
    //number = Arrays.stream(number).filter(x -> x != 0).toArray();
    public @NotNull String regexPattern = String.valueOf(number);
    /**
     * In Plain English:
     * factory builds products
     * but products has (original) creator
     * and has workers that work on it
     */
    //build the public constructor

    public @NotNull String Digit = "D";

/**
 *
 public interface IEmployeeFactory {
 //get employess (by String Id)
 Employee GetEmployee( String stringId );
 }**/

    // The Factory:
    /***  A phone is a set of Digits: ***/

    public @NotNull String Phone = "D*";
    @NotNull String SqlQuery;
    Boolean isHourlyFlag;
    Integer numFlags;

    FactoryPattern() {

        number = 111010100;
        // String.valueOf(number);
        @NotNull String stringIdAbstract = String.valueOf(number); //"000";
        SqlQuery = "From Db SELECT * where Employee = (stringId , isHourlyFlag , numFlags) ";

    }

    public FactoryPattern(String stringIdAbstract, Boolean isHourlyFlag, String stringIdAbstract1, Integer numFlags) {
        this.GetEmployee(stringIdAbstract, isHourlyFlag, numFlags);
    }

    public static @NotNull Integer getNumber() {
        return number;
    }

    public Employee searchEmployeesBy(String stringId, Boolean isHourlyFlag, Integer numFlags) {

        //get into the database


        if (stringId == "100") {
            this.getRegexPattern();

        }
        throw new UnsupportedOperationException();
    }

    private void getRegexPattern() {

        throw new NullPointerException();
    }

    public void initNumber() {
        if (number == null) {
            number = 0;
        }

    }

    private void incNumber() {
        number = number + 1;
    }

    /*** private Employee GetEmployee(String stringId, Boolean isHourlyFlag, Integer numFlags) {

     //1. Null-check
     if ( this.stringIdAbstract == null){
     //increment number
     // incNumber()
     incNumber();
     //convert the Integer Number into a string [Why?] for ease of use

     stringIdAbstract = Integer.toString(number); //  number; //toString(number);

     }***/
    @NotNull
    private Employee GetEmployee(String stringId, Boolean isHourlyFlag, Integer numFlags) {
        if (this.stringIdAbstract == null) {


            /*** Let's Parse the number  ***/
            this.stringIdAbstract = Integer.toString(number);
        }
        //define a query

        String SqlQuery = "From Db SELECT * where Employee = (stringId , isHourlyFlag , numFlags) ";
        return this.searchEmployeesBy(stringId, isHourlyFlag, numFlags);
    }

//Search Criteria

    public interface IEmployeeFactory {
        //get employees (by String Id)
        Employee GetEmployee(String stringId);
    }

    //todo: do some search, given by the search criteria  [ necessary ,given this context]
    //Criterion function (String  stringId )
    //restrict the search Criteria to Only those things
    // pick up an Employee


    //TODO: search `employees` directly


    //assumes there is a  Db
    /***From Db SELECT stringId , isHourlyFlag , numFlags ***/

    //search Criterion:
    // Find and return
    // Search Employees by:  stringId ,  isHourlyFlag ,  numFlags
    // return new Employee( stringId ,  isHourlyFlag ,  numFlags);
    /***
     return  searchEmployeesBy(stringId ,  isHourlyFlag ,  numFlags);


     }
     public Employee searchEmployeesBy( String stringId , Boolean  isHourlyFlag , Integer   numFlags){

     //for now just
     throw new UnsupportedOperationException();
     }
     public void initNumber()
     {
     //check number
     //1. is the number `null`
     if(  number == null ) {
     number = 0;
     }
     }

     private void  incNumber() {

     number +=  1;

     }

     public static Integer getNumber() {
     return number;
     }
     ***/

    //  public interface IEmployeeFactory {
    //      Employee GetEmployee(String var1);
    // }
}
