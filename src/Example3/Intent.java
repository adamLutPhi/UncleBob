package Example3;

/**
 * - Object with a Type: is it Right, or Wrong?
 **/

import org.jetbrains.annotations.NotNull;

/**
 * <h1>A wiki </h1>
 * <p><h3>Is made out of articles </h3></p>
 * <footnote>Rule: check if the Incoming object is of the Right Type! </footnote>
 * <p>
 * </>
 ***/


public class Intent {
    /**
     * <h2>To Explain</h2> what an intent is
     ***/

    // Field Member Variables
    @NotNull String exceptionMsg = "Exception: please recheck input, then retry again";
    @NotNull String names = "";

    /**
     * Rule: check if the Incoming object is of the Right Type!
     * Q. what do we return, if this is the wrong type?
     * A. if that is so, we say: this object is greater than the incoming object
     **/
    @NotNull
    public Integer checkIntent(Object o) {
        //condition: a part of relationship (belong to)
        //check: if object o belongs to a WikiPagePath
        if (o instanceof WikiPagePath) {
            WikiPagePath p = (WikiPagePath) o;
            String compressedName = StringUtil.join(names, "");
            String compressedArgumentName = StringUtil.join(p.names, "");

            return compressedArgumentName.compareTo(compressedArgumentName);
        }
        // Update: this condition is returned only if the Wrong Type is Provided if me: Author pre-supposes Correctness:
        // If wrong type is provided: defaults to `1`
        return 1; // Good Line: We are Greater, because we are the Right Type
        /** Now, we , somehow, understand the intent better ***/
    }

    public int compareTo(Object o) {
        Integer bayesArticleDifference = 0;
        try {
            if (o instanceof WikiPagePath) {

                // If (o) object is part of `WikiPagePath`
                WikiPagePath p = (WikiPagePath) o;
                //Then,  read the article, corresponding to it

                @NotNull String compre;

                /***Example(2): Article name difference ***/
                article bayesArticle = new article("Bayes%27_theorem", "https://en.wikipedia.org/wiki/Bayes%27_theorem");

                article bayesEstimateArticle = new article("Bayes_estimator", "https://en.wikipedia.org/wiki/Bayes_estimator");

                //String compressedName = StringUtil.join(
                //       names, "");

                //Define the compressedName to be sent on network,

                @NotNull String compressedName = StringUtil.join(bayesArticle.names, bayesArticle.url);


                //String.equals()
                // the difference (between (2) strings : i.e. difference between the name of (2) wiki articles
                //Integer
                bayesArticleDifference = bayesArticle.names.compareTo(bayesEstimateArticle.names);  // equals(bayesEstimateArticle.names);
                return bayesArticleDifference;
            }
        } catch (Exception e) {
            System.out.println(exceptionMsg);
        }
        return bayesArticleDifference;
    }

    class article {

        String names;
        String url;

        public article(String names, String url) {
            this.names = names;
            this.url = url;
        }
    }
}
