package Example4.schema;
/**
 * Extra :
 * check how to import the dtd XML parser
 **/

import com.sun.xml.dtdparser.XmlChars;
import com.sun.xml.dtdparser.XmlNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.xml.validation.Schema;
import javax.xml.validation.Validator;
import javax.xml.validation.ValidatorHandler;
import java.io.ByteArrayInputStream;

public class schema {
    @NotNull String exceptionMsg = "Exception: an error occurred. Please recheck your input ";
    @Nullable Schema schema = new Schema() {
        /**
         * @return
         */
        @Override
        @NotNull
        public Validator newValidator() {
            return null;
        }

        /**
         * @return
         */
        @Override
        @NotNull
        public ValidatorHandler newValidatorHandler() {
            return null;
        }
    }; //formatSchema() ;// {

    // member Field variables (properties)
    XmlNames xmlNames;
    //void input(){
    //}
    XmlChars xmlChars;
    /**
     * void readBytes2(byte[] bytes) { // (-) Constructor Initializer
     * //  new readXml(input, xmlNames).input.readNBytes(bytes, offset, length);
     * throw new UnsupportedOperationException();
     * }
     **/
    @NotNull Integer chars = 0;
    //1. Declare : set input as an instanec
    ByteArrayInputStream input;  //  (-) , (+ ) define input
    /**
     * <h2>Heirarchy detected</h2>
     * <p>
     *
     * </p>
     */

    // Mutable properties
    //1. set a reader a reader

    String output;
    Object getOutput;

    //dtd xml file

    // XmlWriter writer = new XmlWriter(output);

    //Input:

    //@Contract(pure = true)
    //   @Override
    public @Nullable String getSchemaType() {
        //   return new Schema().toString();
        return "";
    }

    //2.instantiate

    /**
     * input =   void ByteArrayInputStream() {  // =
     **/

    //     //3. Initialize

    //new ByteArrayInputStream()

    //    Object ByteArrayInputStream;
    //      Object byteArrayInputStream = ByteArrayInputStream;//()// new XmlReader(); //(+) makes function return void
    //    {
    //     }
    public void readBytes(byte[] bytes) {

        //assign the parameter to the property ( field member variable)
        bytes = bytes;
        ByteArrayInputStream input;

        //bytes are transformed into inputStream byteArray
        //set the ByteArrayInput stream [How?] by using the bytes

        input = new ByteArrayInputStream(bytes);

        //TODO: process input

    }

    void setWaitMilliSeconds(int milliSecs) throws InterruptedException {

        try {
            xmlChars.wait(milliSecs);
        } catch (InterruptedException e) {
            System.out.println(exceptionMsg + "\nCause: " + e.getCause() + "\nStackTrace: " + e.fillInStackTrace());
        }
    }
    //System.out.print(buffer)
    // XmlReader reader = new ByteArrayInputStream( );  // Note: returning new is acceptable

    /** (byte[] bytesBuffer); //; //(-) ';', (+) `()`, (+) `byte[] bytesBuffer, (+) `;` */

    // (byte[] byteArray, int offset, int byteArrayLength)

    // (+) add `Signature` parameters  ,(-) Constructor Parameters,  remove constructor
    //(byte[] dataBytes, int offset, int dataLength);// byte[] dataBytes, int dataLength);

    //Learning Block [ 1 ]
    //Output:
    // String output = ""; //< -- 1.(-) comment

    //1. define object getOutput
    //object
    //1.1 create getOutput

    /**
     Object getOutput = new Object();//2. (+) create `getOutput` 3. instantiate Object **/


    //1.2 initialize(2) : with a function body

    //
    //   getOutput = new getOutput(){}
    //Object getOutput1 = getOutput(//   (-) public, (-) void, (-) no parameters, (+) getOutput -> Object , (+ introduce local variable
    /**    getOutput = new   getOutput() { **/
    /**
     * Which method call would you like:
     * 1.  Create method getOutput()
     * 2.  Create property `output` (most likely)
     * 2.1.Create property output as a readonly
     *
     * **/
}

