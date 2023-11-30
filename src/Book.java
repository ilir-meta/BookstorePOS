public class Book {
    private String title;
    private final double price = 11.99;
    private String author;
    private int idNum;

    public Book(String bookTitle, String bookAuthor, int numForID){
        title = bookTitle;
        author = bookAuthor;
        idNum = numForID;
    }

    public Book(Book copyBook){
        title = copyBook.getTitle();
        author = copyBook.getAuthor();
        idNum = copyBook.getIDNum();
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String bookTitle){
        title = bookTitle;
    }

    public double getPrice(){
        return price;
    }


    public String getAuthor(){
        return author;
    }

    public void setAuthor(String bookAuthor){
        author = bookAuthor;
    }

    public int getIDNum(){return idNum;}

    public void setIDNum(int num){idNum = num;}


    public String toString(){
        return  idNum + ", " + title  + ", " + author + ", " + price;
    }

}
