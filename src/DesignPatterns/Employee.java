package DesignPatterns;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @ credit: Dzianis Yafimau
 * ref:Factory Pattern. When to use factory methods?
 * source: https://stackoverflow.com/questions/69849/factory-pattern-when-to-use-factory-methods <br>
 * <p>
 * It is good idea to use factory methods inside object when:<br>
 * <p>
 * 1. Latent Sub-Classes: Object's class doesn't know what exact sub-classes it have to create    <br>
 * 2.  Object's class is designed so that objects it creates were specified by sub-classes        <br>
 * 3. Object's class delegates its duties to auxiliary sub-classes,                               <br>
 * and it does not know what  class will take these duties, exactly.
 * <p>
 * <p>
 * <p>
 * - It is good idea to use abstract factory class when:
 * <p>
 * Your object shouldn't depend on how its inner objects are created and designed
 * Group of linked objects should be used together and you need to serve this constraint
 * Object should be configured by one of several possible families of linked objects that will be a part of your parent object
 * It is required to share child objects showing interfaces only but not an implementation
 * <p>
 * <p>
 * Q. why the BoilerPlate?
 * A. useful when you need several "constructors" with the same parameter type but with different behavior.
 */

public class Employee {


    //Field member Variables

    static Integer ageMin;//  minAge;
    static Integer ageMax;
    public final String stringId;
    //some flags (could be about anything one could think of)
    //New: Employee Name
    public final String Name;
    public Integer age;
    public boolean[] flags;
    public boolean flag;
    @NotNull
    public Boolean isWageHourly = true; //hourlyFlag;
    //define a wage
    Double Wage = 40000.0;
    // private boolean isHourlyFlag;
    @NotNull String exceptionMsg = "Exception: unexpected error: please recheck input ";
    private Boolean[] array;

    public Employee(String stringId, String Name, @NotNull Boolean isHourlyFlag, Integer numFlags) throws Exception {

        //init flag
        this.stringId = stringId;
        this.Name = Name;
        //Set the given flags , then return them
        this.isWageHourly = setWageFlag(isHourlyFlag);
        // set number of other flags, by giving an Integer number
        this.flags = setFlags(numFlags); //isHourlyFlag); //numFlags); //new boolean[numFlags];


        // init Default values
        this.initDefaultValues();
    }

    /*** ***/
    //Why Static: because the object is not explictly given
    public static boolean isEligibleForFullBenefits(Integer age) {
        Boolean flag = false;
        Boolean condition = (ageMin <= age) && (age <= ageMax);
        try {


            if (condition) {
                // return true;
                flag = true;
            } else if (!condition) {
                //    return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception Message: " + e.getMessage() + " ");
        }

        return flag;
        // throw new UnsupportedOperationException();
    }

    /***  Flags (set , get) ***/

    //Employee Constructor
    // realistic
    public void initDefaultValues() {
        ageMin = 0;
        ageMax = 65;
    }

    /**
     * Sets the flags , using the Integer `numFlags`
     **/
    boolean[] setFlags(Integer numFlags) {

        return new boolean[numFlags];
    }
    //

    public boolean[] getFlags() {
        return this.flags;
    }

    /***  Wage (set , get) ***/
    @NotNull Boolean setWageFlag(@NotNull Boolean isHourlyFlag) throws Exception { //flagHourly){
        /**
         * Sets the flags
         *
         * */Boolean boolFlag = false;
        try {
            //isHourlyFlag == false
            //null handling

            //1. invalid parameter is given
            //if the given flag is `null`
            if (isHourlyFlag == null) {
                // then Hourly Flag is set to false , by default
                // this.isHourlyFlag = false;

                // Do Not accept null-able condition
                throw new Exception(exceptionMsg);
                // isHourlyFlag =  this.isWageHourly;

                //this.isWageHourly = isHourlyFlag;

                // 2. valid parameter condition
            } else if (isHourlyFlag == Boolean.TRUE || isHourlyFlag == Boolean.FALSE) {
                this.isWageHourly = isHourlyFlag;
                boolFlag = boolFlag = this.isWageHourly;
            }
            //  boolFlag =  this.isWageHourly;

        } catch (Exception e) {
            System.out.println(exceptionMsg + "\nExceptionBody:" + e);
        }
        //isHourlyFlag == true
        /*
            else if (isHourlyFlag == false) {
                this.isWageHourly = isHourlyFlag;
            } else if (isHourlyFlag == true) {
                this.isWageHourly = isHourlyFlag;
            }
        */
        //Otherwise isHourlyFlag has a valid value

        this.isWageHourly = isHourlyFlag;
        return this.isWageHourly;

    }

    public @NotNull Boolean Boolean(@NotNull Boolean flag) {

        try {

            // Null check
            if (flag == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {

        }
        return this.isWageHourly = flag;

    }

    public void checkFlag(@Nullable Object object) {
        try {

            // Null check
            if (object == null) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            throw new NullPointerException(exceptionMsg + e.getMessage());
        }

    }

    //Public:
    // Getter
    @NotNull
    public Boolean getWageHourly() {
        return this.isWageHourly;
    }

    public Double getWage() {
        return Wage;
    }

    // set
    public void setWage(Double wage) {
        Wage = wage;
    }

    /**
     * Fill Array
     * Ref: Fill array list with object of String[] with SQL table <br>
     * <p>
     * <p>
     * <p>
     * Source: https://stackoverflow.com/questions/33409222/fill-array-list-with-object-of-string-with-sql-table <br>
     * <p>
     * Special Thanks to: @BalusC <br>
     *
     * @return Boolean[] array
     */

    @Nullable Boolean[] initArray(@Nullable Boolean[] array, @Nullable Integer size) {
        try {
            array = new Boolean[size];

        } catch (NullPointerException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return array;
    }

    //Intellij: parameter `isFillAll` is never used [safe-delete]
    @NotNull Boolean[] fillArray(@NotNull Boolean[] array, Boolean isFillAll, @NotNull Integer size) {
        // all values defaults to false

        try {

            if (array == null && !isFillAll) {
                //if array is `not filled`, then f

                @NotNull Boolean[] booleans = new Boolean[size];// / /initArray(array, size);
                this.array = initArray(booleans, size); //Intellij: this function can be neither @Null, nor @Nullable
                return this.array;

            } else if (array != null && isFillAll) {

                return array;
            }
        } catch (
                NullPointerException e) { //otherwise: Upon error, please state the error message, show the message body
            System.out.println(this.exceptionMsg + "\nMessage Body: " + e.getMessage());

        }

        return this.array;
        //Arrays.fill(array);
    }

    public boolean isNotEligbleForFullBenefits() {
        throw new UnsupportedOperationException();
    }
}
