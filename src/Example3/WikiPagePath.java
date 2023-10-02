package Example3;

public class WikiPagePath {

    /*** The object nas to be with the right type ***/
    public String names;
    public String url;
    // public
    //p

    // constructor
    WikiPagePath() {
    }

    public WikiPagePath(String names) {

        this.names = names;
    }

    public WikiPagePath(String names, String url) {

        this.names = names;
        this.url = url;
    }


    public void getWikiPage() {

    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}
