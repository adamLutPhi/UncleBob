package Example4.schema;

import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.sun.xml.dtdparser.XmlChars;
import com.sun.xml.dtdparser.XmlNames;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.sql.rowset.spi.XmlWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.SQLException;


/**
 * <h3> All life is input, and output,.. and some processing in between.  </h3>
 ***/
public class readXml {
    @Nullable
    public final XmlNames xmlNames = null; //new XmlNames();
    public XmlChars xmlChars;
    //Field member Variables
    @NotNull String exceptionMsg = "EXCEPTION: raised, one of the inputs must be erroneous, please recheck input then retry later.\n";
    int offset;
    //method body
    // dtd parser
    byte[] bytes;
    int length;
    String path;
    //dtd xml variables
    //Sun Micro Systems' xml
    //XmlChars xmlChars;
    FormatSchema schema;
    //jackson's xml - end
    //potentially remove
    @NotNull String str1 = "  \"  first_name \": \"John \", \" last_name\": \"Smith\", \" is_alive\": true \" , age \" : 27, \" " +
            "  address \": { \" street_address \": \"21 2nd Street\", \"  city  \": \"New York\",\"  state \": \"NY\",\"  postal_code \": \"10021-3100 \"" +
            "},\" phone_numbers \": [ {\" type\" : \"home\", \"number\": \"212 555-1234\"}," +
            " {\"type \": \"office\",  \"number\": \"646 555-4567\"}],";
    private ByteArrayInputStream input;

    public readXml() {
        Object xmlNames; // (+)  Adds a constructor\

        /**LearningBlock[1]
         {
         Object o;

         /** LearningBlock
         // XmlNames xmlNames
         {
         //      };
         //XmlWriter getWriter;  //(-) remove prefixes:  public,
         /*  (XmlWriter Object writer;
         Object writer1 = writer) { */
        // }
        //}

        XmlWriter writer1 = getXmlWriter();

        //Intellij :Q . which writer would you like to instantiate?
        // (because there is more than one )


        //Do something Useful


        //Object setWriter;
        // return Signature function name( parameters) {
        //Object o1 = o;

/**[CodingBlock ][1]
 {
 //Do computations with parameter object o:

 //1.integrity check

 //1.1 check object equals object ( ectracted from a  Database)
 if (o.equals(o1)) {
 //write object (to Xml)
 //(XmlWriter writer1) {
 //}
 XmlWriter xmlWriter = new XmlWriter() {
 /**
 * @param caller the {@code RowSet} object (1) that has implemented the
 *               {@code RowSetInternal} interface, (2) with which this writer is
 *               registered, and (3) that called this method internally
 * @return
 * @throws SQLException
 */
        //   @Override
        //    public boolean writeData(RowSetInternal caller) throws SQLException {
        //        return false;
        //     }

        /**
         * @param caller the <code>WebRowSet</code> instance to be written,
         *               for which this <code>XmlWriter</code> object is the writer
         * @param writer the <code>java.io.Writer</code> object that serves
         *               as the output stream for writing <code>caller</code> as
         *               an XML document
         * @throws SQLException
         */
        //         @Override
        //       public void writeXML(WebRowSet caller, Writer writer) throws SQLException {

        //     }
        // };

    }
    //  Object o1 = o;
//        return o;
    //}

    void setWriter(@NotNull Object o) {
    }

    //constructor
    @NotNull Object touchObj(@NotNull Object o) {
        //check
        @NotNull Object tmp = new Object();
        try {
            if (o != null) {
                tmp = o;
                // return o;
            }
        } catch (NullPointerException e) {
            System.out.println(exceptionMsg + "\nException Message: " + e.getMessage());
        }
        return tmp;
    }

    @NotNull
    public XmlWriter getXmlWriter() {
        XmlWriter writer1 = null;
        return writer1;
    }

    // Constructor (JSONPObject `toJson` )
    @NotNull JSONPObject toJson(String str1) throws IOException {/** provides a definition toJson **/
        //(String str, Object o) {
        String str = null;
        JSONPObject jsonpObject = null;

        JsonGenerator jsonGenerator = null;
        Boolean flag = jsonGenerator.canUseSchema(schema);

        //SerializationFeature
        @NotNull SerializerProvider sProvider = null;
        //jsonGenerator

        @NotNull TypeSerializer typeSerializer = null;
        jsonpObject.serializeWithType(jsonGenerator, sProvider, typeSerializer);
        // Object o = new Object(); // defined
        // JSONPObject jsonpObject = new JSONPObject(str, o); //already defined
        // return jsonpObject;

        return null;
    }

    ;

//end of LearningBlock

    //Return writer1;
    //Writer operations

    //Parsing


    //    * @throws IOException

    //    @Override
    //     public void close() throws IOException {
    //     }
    // };


    //jsonString, o);


    //}
    // private void getOutput() {
    //   }

    // }
    // private void setWriter() {} //defined
    ///end
//}
    //;
    //private void
    ///      setWriter(){}};
    //};

//}
    //  }


}




