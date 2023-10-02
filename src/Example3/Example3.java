package Example3;

public class Example3 {
    /*** <h2>Singleton pattern</h2>
     * Using
     * <p>
     *
     * 1. a naming pattern <br>
     * 2. responder pattern <br>
     *
     *   Here is a comment we would leave</p>
     * ***/
    String names;

    public int compareTo(Object o) {
        /*** <p> Notice the interesting Grammar:</p>
         *
         * " We are greater, because Are The Right Type"
         *
         * -Uncle Bob: this is the Imperial w**d
         * ( Glances back at us)
         *
         *
         *
         * ***/
        if (o instanceof WikiPagePath) {
            WikiPagePath p = (WikiPagePath) o;

            String compressedName = StringUtil.join(
                    names, "");
            String compressedArgumentName = StringUtil.join(
                    p.names, "");
            return compressedName.compareTo(compressedArgumentName);
            //  return 1; // we are greater, because we are the right type

        }
        return 1;
    }


}

//}

