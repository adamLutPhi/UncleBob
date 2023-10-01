import jdk.internal.access.JavaNioAccess;
import org.hamcrest.MatcherAssert;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
//import org.junit.Assert;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * <h2>Warning of Consequences </h2>
 * <p>
 * Note: file uses io
 *
 * <p><h3>The Point</h3>
 * To focus on  Comments, read what they say, and learn
 *
 * <h3>Moral: Don't run, unless you have some time to `spend` </h3>
 * </p>
 ***/

public class Consequences {
    /**
     * <h2>Hmm what does this do?</h2>
     */
    public void testRealBigFile() throws Exception {
        //1.Write
        writeLinesToFile(100);


        //2.response..
        respond();
    }

    public void respond() {
        System.out.println("Responding to other clients' requests");
    }

    public void writeLinesToFile(Integer n) {
        /***<p>a function to write lines</p>  ***/

        try (FileWriter fStream = new FileWriter("greet.txt");
             BufferedWriter info = new BufferedWriter(fStream)) {
            for (int i = 1; i <= n; i++) {
                info.write(String.format("Hello %n = ", n));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void makeLogFormat() {
        System.out.println("Formatted Logging started...");
    }

    ;
};


//me: note: classname is Minuscule

/**
 * class response {
 * private Object wrapper;
 * private String _outputMessage = "default output message ";
 * private Integer bytesSent;
 * <p>
 * // either this:
 * enum PROPERTIES_FILE {readonly, writeonly, readwrite}
 * <p>
 * /**
 * <class> <h2> Response Class</h2>
 * <p>Is Responsible for makingLogFormat</p>
 * </class>
 */
// public response() {
//  }


class simpleDataFormat {

    private static final String PROPERTIES_FILEString = String.valueOf(new PROPERTIES_FILE[]{PROPERTIES_FILE.readonly, PROPERTIES_FILE.writeonly, PROPERTIES_FILE.readwrite});

    //Field Member Variables
    static @NotNull Integer timeAlottedMillis = 10000;
    Integer bytesSent = 100;

    ;
    response recordDumDum = new response();
    //private static  [not a private, nor static ]

    //enum TODO: write here
    // enum PROPERTIES_FILE {readonly, writeonly, readwrite}
    /**
     * Compile error (please keep commented) <br>
     * ERROR: not a statement;
     * /*
     * static {
     * PROPERTIES_FILE = { PROPERTIES_FILE.readonly, PROPERTIES_FILE.writeonly, PROPERTIES_FILE.readwrite};// this will produce a null pointer exception
     * }
     */


//variable declaration:
//
    Integer timeAllowedMillis = 10_000;
    Object output = null;
    //CRUD
    String _outputMessage = " Content: is non-sense (spoiler alert!) new content this week.\n" +
            "It's all about this topic., stay tuned.";
    String responseString = output.toString();
    List<DesignPatterns.E> wrapper;
    /***
     * <h1>Java's equivalent to C# extension methods</h1>
     */
    // source:Java equivalent to C# extension methods https://stackoverflow.com/questions/4359979/java-equivalent-to-c-sharp-extension-methods***/
   /* public static Object output = null;
     enum  PROPERTIES_FILE  { readonly, readWrite, writeonly};

    static Object simpleDataFormat;
    */
    // Field Member Variable
    Calendar calendar = new GregorianCalendar(); //beautiful
    private Date date = new Date();

    public simpleDataFormat(String standardTimeFormat, @NotNull Calendar calendar) throws IOException {

        //Calendar calendar = new GregorianCalendar();

        calendar.getTime();
        this.calendar = calendarGetTime();
        Date date = this.calendar.getTime();

        this.date = date; //setting a date: makes date not final


    }

    simpleDataFormat(String standardTimeFormat) throws IOException {
    }

    /**
     * <class> <h2> Response Class</h2>
     * <p>Is Responsible for makingLogFormat</p>
     * </class>
     *
     * @return
     */
    //final String PROPERTIES_FILE = null;
    //String exceptionMsg = "Exception Message";
    public Calendar getTime() {
        /*** fetches the time, using the calendar ***/


        this.calendar = calendarGetTime();
        Class _class = this.calendar.getClass();


        return this.calendar;
    }

    //Assert illegal start of type
    //void

    // assertSubString ("Content-length: 10000", responseString);
    //{}

    @Contract(value = " -> new", pure = true)
    private @NotNull Calendar calendarGetTime() {
        // return new Calendar.Builder( ).g;
        return getTime();
    }

    //  enum PROPERTIES_FILE  {   PROPERTIES_FILE.readonly,PROPERTIES_FILE.writeonly, PROPERTIES_FILE.readwrite };
    // public response(){}

    //create
    Calendar.Builder createCalendar(Integer year, Integer month, Integer day) {
        // return
        Calendar.Builder builder = new Calendar.Builder().setDate(year, month, day);
        return builder;
    }

    //creates a calendar builder
    Calendar.Builder createCalendar(Integer year, Integer month, Integer day, Integer field, Integer value) {

        Calendar.Builder builder = new Calendar.Builder().set(field, value);

        builder = builder.setDate(year, month, day);
        return builder;

    }

    //response functions

    // void setFileByPath(String pathname){}

    @Contract(" -> new")
    @NotNull Date calendarGetTime(@NotNull Calendar calendar) {
        return calendar.getTime();
    }

    @Contract(" -> new")
    @NotNull Date whatTime() {
        return calendar.getTime();
    }


    public void assertSubString(String String1, String String2) {
        //Assert.assertEquals(String1, String2);
        MatcherAssert.assertThat("Assert Equals: 'String1 == String2'", String1 == String2);

    }

    public simpleDataFormat record(String response) throws Exception {

        //show `response` Message
        System.out.println("response is:" + response);
        System.out.println("making log format response is:");
        String standardTimeFormat = "";
        simpleDataFormat dataFormat = new simpleDataFormat(standardTimeFormat, this.calendar);
        try {
            // Object x = response.makeLogFormat();

            //public method(functions)
            //any function inherits ( a function is an object, too)
            /**
             * x is a function (which is an object, like any, it inherits the following functions:
             x is a function (which is an object, like any, it inherits the following functions:
             x.equals();
             x.toString()
             x.wait();
             **/
        } catch (Exception e) {
            System.out.println("\n Exception: PrintStackTrace: ");
            e.printStackTrace();
            System.out.println(Utils.exceptionMsg + "\n Exception Message: " + e.getMessage());

        }
        //Finally, return dataFormat
        return dataFormat;
    }

    //1. setBody
    File setBody(String path, String content) { //File file, String content){
        //  file) {

        return new File(path, content);
    }
    //2. isReadyToSend
    //Integer bytesSent;

    //Get
    //Decorator Pattern : calling a list of decorators
    //define response

    protected Boolean makeLog(String path, String content) throws IOException {

        //define a response: creates an empty resonse object instance (of class `response` )
        response r = new response(); // this throws IO Exception

        //  }
        Boolean isSuccess = false;

        System.out.println("Formatted Logging started...");
        //logging is success
        isSuccess = true;

        // r field member variables ( properties)
        Integer numBytes = r.bytesSent;

        Date calendarDate = r.calendar.getTime();

        String message = r._outputMessage; //Intellij: makes package-private

        Class aClass = r.wrapper.getClass(); //Intellij: makes package-private


        String contentImproved = r.calendar.getTime().toString() + r.bytesSent.toString() + r._outputMessage.toString();

        //create a new file , from content Information
        File file = new File(message, content);//uses Java.io.File

        //set file's body, using the newly created file, to set the response object instance `r`
        // r.setBody(file);
        r.setBody(path, content); //Built-in response function (we have built)

        /*** response r = new response();***/ //makes response `object` non-static
        r.record(_outputMessage); /***1.edits the record ***/

        System.out.println(r.hashCode());
        //intent to log ...
        System.out.println("Logging, DumDum");
        return true;
    }

    /**
     * <h2>Careful!<h2/>
     * <p>Sometimes lots of files are very questionable, this is one </p>
     **/

    public @NotNull simpleDataFormat makeLogFormat() throws IOException { // throws Exception {

        String standardTimeFormat = "dd/mm/yy : HH:mm:ss Z";

        simpleDataFormat simpleDataFormat1 = new simpleDataFormat(standardTimeFormat);// Adds String, as first Parameter //makes this function non-static

        return simpleDataFormat1;
    }

    void checkProperty() {

        try {
            String propertiesLocation = null;
            String propertiesPath = propertiesLocation + "/" +
                    PROPERTIES_FILEString; //enum is not found in `SimpleDataFormat` [define in scope: simpleDataFormat]
            FileInputStream properiesStream = new FileInputStream(propertiesPath);

            /***Note: this value is way too small for a `long` ***/
            long propertiesStream = 1927083;
            /***Note: Example calls a `JavaNioAccess` Object***/
            JavaNioAccess loadedProperties = null;
            Object x = new Object();
            Boolean isSync = true;
            loadedProperties.load(propertiesStream, isSync, propertiesStream);

        } catch (IOException e) {
        }
    }

    /**
     * <p><h2>Simple Date format is not Thread Safe (why?) </h2>
     * <p>
     * For Static variables:
     * the class level methods : which they have to call <br>
     * Uncle Bob: I am serious,  if you don't know this, you will get
     * You will get caught in some (kind of) update problem.
     * <p>
     * So we need to create each instance , independently
     * <p>
     * TODO: meanswill be don
     * Realized, Don't Do  (that is such an insider knowledge).
     * Now I see the
     * <p>
     * "no body ever does them"
     * I will not check them in - as a code reveiwer.
     * <p>
     * either be done, or deleted before checking
     * <p>
     * why: once you check them in, you will not do them (on the spot)
     *
     * <h1>Amplification </h1>
     * * <p>
     * *     String listItemContet = match.group(3).trim();
     * *                  *
     * *                  * the trim is real
     * *                  * it removes startign spaces
     * *                  * that could cause
     * *
     * * </p>
     * *
     * * <p>Trim: a function, occurs, so often, that people use it
     * * Crucial: semantic (and useful).
     * * JavaDocs: public APIs
     * *
     * * Writing Libraries to consume
     * * inside the team: for them to see
     * * - No need for the mto know
     * * Well, they ought to know the Structure of the code\
     * *
     * * JavaDocs, are for external APIs
     * * even then, make them minimal,  please
     * *
     * * </p>
     * * <h1>Mumbling</h1>
     * * <p>The Programmer: self-tals
     * * A comment, in a catch block
     * * while file does another thing
     * * 1. load up properties file
     * * from the
     * * 2. IO Exception, he catches
     * *
     * *
     * * </p>
     * * FileInputStream propertiesStream
     * * loadedproperties.load(propertiesStream)
     * *
     * *
     * * 1.<h2>what does it mean?</h2>  <contemplative></contemplative>  <br>
     * <p>
     * * 2.<Infodump> Who loads the default values ? defaults</Infodump>  <br>
     * * were they previously loaded or is that yet to come?<when>to call defaults is yet ambiguous </when>  <br>
     * * -<h2>  <selfQuestioning>Was the author trying to remind himself to do it later?(maybe Not!) </selfQuestioning> </h2>  <br>
     * *
     ***/


    // relation(response, simpleDataFormat):

    void isReadyToSend(response response) {
        throw new UnsupportedOperationException();
    }

    public List<DesignPatterns.E> ListDecorator(List<DesignPatterns.E> wrapper) {
        Object wrapper1 = this.wrapper;

        //Wrap (1) wrapper: tofuLettuce, please
        List<DesignPatterns.E> tofuLettuceWrapper = wrapper; //what a Yum Wrapper!
        return wrapper;
    }

    enum PROPERTIES_FILE {readonly, writeonly, readwrite}

    //create a record `DumDum`
    record recordDumDum() { // `no public`: cannot be public
        @Contract(" -> new")
        @NotNull recordDumDum recordDumDum() {
            return new recordDumDum();
        }


    }

    //record is not allowed here


}
//class simpleDataFormat {

//


/**
 * <h3></h3> Assert
 * void assertTrue(bytesSent >10000) {
 * }
 **/
//inner-class response
//}
class response {

    // Integer
    //Curd Ops

    // Create read update delete
    static Integer responsdCognizantTimeout = 100 ;
    // Create Read Update Delete

    String chullachopa  = "?parle Ingles? ";

    String getChullachopa = "Si pas petit a petite";
    String setChullaChupa = "Si no haiChupa Ace Ventura " ;


    String cognizeMetaVerse ="Alpha 30 f0gk-b429-4ifks";
    String cognizeAlaParfaite = "Ala parfaite";
   String  loveMessage ="Frank Sinatra: Strangers in the Night.";
    String getCognizeAlaParfaiteAdd() {
        return "Strangers in the Night";
    }

    String setLaissezAlaParfaite(String loveMessage){
        return loveMessage;
    }

    String removeLaissezAlaParfaite(String s ) {
        return s;
    }

    //loveMessage =

    static Integer timeAlottedMillis = 10000; // static: can be called from the class (this means every object we create can call it, as well)
    public Calendar calendar;
    Object wrapper;
    String _outputMessage = "default output message ";
    Integer bytesSent;
    /**
     * <class> <h2> Response Class</h2>
     * <p>Is Responsible for makingLogFormat</p>
     * </class>
     */


    //
    String filepath = "data.txt";

    //Map<String, >

    /// response() throws IOException {

    //    readFile(this.filepath);
    // }

    response r = new response();

    public response() throws IOException {
        /*** for each file  create a logical record for it ***/
        try {
            readFile(this.filepath);
        } catch (IOException e) {
            System.out.println(Utils.exceptionMsg);
        }

        //    record _record  = new record(); //cannot read record
    }

    /***<p>Allotted Time means the maximum period of time in which all outcomes for a Participant must be achieved.
     * ref:Law Insider Sourcehttps://www.lawinsider.com/dictionary/allotted-time#:~:text=Allotted%20Time%20means%20the%20maximum,a%20Participant%20must%20be%20achieved.</p> ***/

    public String readFile(String filepath) throws IOException {
        File file = new File(filepath);
        return readFileToString(file, StandardCharsets.UTF_8);
    }

    private String readFileToString(File file, Charset utf8) {
        throw new UnsupportedOperationException();
    }

    //void setFile

    public void setFile(@NotNull File file, String pathname, String context) throws FileNotFoundException {

        Object ret = new Object();
        //classically set file and its contents (using the scanner)
        Scanner scanner = new Scanner(new File("poem.txt"));
        String text = scanner.useDelimiter("W*").next();  //"\\A").next(); //A:alpha [i.e. a word] [0 or more characters]
        //scanner.flush (no flush)
        scanner.close(); // Put this call in a finally block

        //1. is it immutable (or mutable?)
        //return new File()
        //1, store file's content
        //check if file is writable
        if (!file.canWrite()) {
            // If not: then, set file to `true`
            file.setWritable(true);
        } else if (file.canWrite()) {
            //but, if file is writable

            //TODO: Write content on file

            //let us write content on file

            /*** file  = new ***/

            throw new UnsupportedOperationException();
        }
    }

    //This overwrites whatever

    /*** file = new ***/
    // return;
    public void record() {
    }

    public void metaXml() throws Exception { // manually written
        /*** meta-data about XmlFile ***/
        //  record obj = new record();
        //1. Encapsulate via a t
        try {
            //  obj =
            record xmlFile(String title, String url) {

            }

        } catch (Exception e) {
            e.printStackTrace();
            String exceptionBody = "Message Body\n";
            System.out.println("body: " + exceptionBody + "\nStackTrace: ");
        }
    }

    public void setBody(@NotNull String path) { //File file, ) {
        //from a file path:
        //create a file
        /** Uncle Bob: Do not forger to use `trim()` function  **/
        File file = new File(path.trim());
    }

    //1. setBody
    File setBody(String path, String content) { //File file, String content){
        //  file) {

        return new File(path, content);
    }

    public void makeLogFormat() {
        System.out.println("Formatted Logging started...");
    }

    public void record(String response) {

        //show `response` Message
        System.out.println("response is:" + response);
        System.out.println("making log format response is:");

        try {
            // Object x = response.makeLogFormat();

            //public method(functions)
            //any function inherits ( a function is an object, too)
            /***
             x.equals();
             x.toString()
             x.wait();
             */
        } catch (Exception e) {
            System.out.println("\n Exception: PrintStackTrace: ");
            e.printStackTrace();
            System.out.println(Utils.exceptionMsg + "\n Exception Message: " + e.getMessage());

        }
    }


    //private Integer timeAllowedMillis;

    //      response() {
    //    }


    /*** <return>Utility method, returns when this. Being closed is true.</return>
     * <warn>Warning:Throws an exception, if the timeout is reached. </warn>
     *
     * <p>  Correction: Wrong description: has been described incorrectly, as it
     *      * There are other ways to return (from this)
     *      *</p>
     *
     * ***/


    //Response:

    //Uncle Bob's Example
    //sync-await
    /// DO NOT USE Long when you could use `Integer`
    public synchronized void waitforClose(Integer timeMillis, Integer timeoutMillis, Boolean isClosed) throws Exception {
        Integer _timeMillis = 0;
        while (!isClosed && timeoutMillis > 0) { //eror ! same condition[intent: not closed ]
            wait(timeMillis);
            _timeMillis -= timeMillis;//Uncle come on
        }
        if (isClosed) { //error [intent= isClosed ]
            throw new Exception("MockResponseSender could not be closed");

        }
    }

    //modified example
    // long is a bit too large to be efficient
    public synchronized void aWaitClose(Integer timeMillis, Integer timeoutMillis, Boolean isClosed) throws Exception {

        try {


            //a loop: to mimic a Mock Responder-Sender situation
            //if timeoutMillis is positive
            while (timeoutMillis > 0) { //!isClosed && timeoutMillis > 0) {

                //check  `isClosed`
                if (!isClosed) {
                    //wait a bit (for the other user (at the end-point) )
                    wait(timeMillis);
                    //do math: subtract  the time spent `timeMillis` off the total allowed time

                    timeAlottedMillis = timeMillis;//Uncle come on
                } else if (isClosed) { // do nothing
                    //if closed: work is done
                    break;// break out of `while` loop
                } else {

                    throw new Exception("MockResponseSender could not be closed");
                }
            }
        } catch (Exception e) {

        }
    }

    /***Issues as a Lead:
     * 1.I don't know if that `loading` actually took place (in the future).
     *
     * 2. what to do instead: just load defaults
     *
     * ***/


    //the coolest cherry on top
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    /**
     * public response() {
     * throw new UnsupportedOperationException();
     * }
     **/
    //public response() {
    //}

    // either this:
    enum PROPERTIES_FILE {readonly, writeonly, readwrite}

};