public class DVD {
    private String title;
    private final double price = 10.50;
    private String productionCompany;
    private int idNum;

    public DVD(String DVDTitle, String prodComp, int numForID){
        title = DVDTitle;
        productionCompany = prodComp;
        idNum = numForID;
    }
    public DVD(DVD copyDVD){
        title = copyDVD.getTitle();
        productionCompany = copyDVD.getProductionCompany();
        idNum = copyDVD.getIDNum();
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String DVDTitle){
        title = DVDTitle;
    }

    public double getPrice(){
        return price;
    }

    public String getProductionCompany(){
        return productionCompany;
    }

    public void setProductionCompany(String companyName){
        productionCompany = companyName;
    }

    public void setIDNum(int num){idNum = num;}

    public String toString(){
        return idNum + ", " + title + ", " + productionCompany + ", " + price;
    }

    public int getIDNum() {
        return idNum;
    }
}
