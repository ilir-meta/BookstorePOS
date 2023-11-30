public class CD {
    private String title;
    private final double price = 8.95;
    private String artist;
    private int idNum;

    CD(String CDTitle, String CDArtist, int numForID) {
        title = CDTitle;
        artist = CDArtist;
        idNum = numForID;
    }

    CD(CD copyCD) {
        title = copyCD.getTitle();
        artist = copyCD.getArtist();
        idNum = copyCD.getIDNum();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String CDTitle) {
        title = CDTitle;
    }

    public double getPrice() {
        return price;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artistName) {
        artist = artistName;
    }

    public int getIDNum() {
        return idNum;
    }

    public void setIDNum(int num) {
        idNum = num;
    }

    public String toString() {
        return idNum + ", " + title + ", " + artist + ", " + price;
    }

}
