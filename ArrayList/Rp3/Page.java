package ArrayList.Rp3;

public class Page {

    private int numPage;
    private String text;

    public Page(int numPage, String text) {
        this.numPage = numPage;
        this.text = text;
    }

    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumPage() {
        return numPage;
    }

    @Override
    public String toString() {
        return "Page{" +
                "numPage=" + numPage +
                ", text='" + text + '\'' +
                '}';
    }
}
