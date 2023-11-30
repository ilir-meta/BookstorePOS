import java.util.ArrayList;
public class Bookstore {
    ArrayList<Book> bookInventory = new ArrayList<Book>();
    ArrayList<CD> CDInventory = new ArrayList<CD>();
    ArrayList<DVD> DVDInventory = new ArrayList<DVD>();
    ArrayList<Book> bookOrders = new ArrayList<Book>();
    ArrayList<CD> CDOrders = new ArrayList<CD>();
    ArrayList<DVD> DVDOrders = new ArrayList<DVD>();
    ArrayList<Member> memberList = new ArrayList<Member>();
    ArrayList<PremiumMember> premiumList = new ArrayList<PremiumMember>();

    int bookNumID;
    int CDNumID;
    int DVDNumID;



    public void addBookOrder(int numID){
        //Copies a book from bookInventory arraylist to bookOrder arraylist
        Book bookToOrder;
        for(Book check : bookInventory) {
            if (check.getIDNum() == numID) {
                bookToOrder = new Book(check);
                bookOrders.add(bookToOrder);
            }
        }
        //Removes book from bookInventory arraylist
        for(int i = 0; i < bookInventory.size(); i++){
            if(bookInventory.get(i).getIDNum() == numID){
                bookInventory.remove(i);
                i++;
            }
        }
    }

    public void addCDOrder(int numID){
        //Copies a CD from CDInventory arraylist to CDOrder arraylist
        CD CDToOrder;
        for(CD check : CDInventory) {
            if (check.getIDNum() == numID) {
                CDToOrder = new CD(check);
                CDOrders.add(CDToOrder);
            }
        }
        //Removes CD from CDInventory arraylist
        for(int i = 0; i < CDInventory.size(); i++){
            if(CDInventory.get(i).getIDNum() == numID){
                CDInventory.remove(i);
                i++;
            }
        }
    }

    public void addDVDOrder(int numID){
        //Copies a DVD from DVDInventory arraylist to DVDOrder arraylist
        DVD DVDToOrder;
        for(DVD check : DVDInventory) {
            if (check.getIDNum() == numID) {
                DVDToOrder = new DVD(check);
                DVDOrders.add(DVDToOrder);
            }
        }
        //Removes DVD from DVDInventory arraylist
        for(int i = 0; i < DVDInventory.size(); i++){
            if(DVDInventory.get(i).getIDNum() == numID){
                DVDInventory.remove(i);
                i++;
            }
        }
    }

    public void incrementBookNumID(){
        bookNumID++;
    }
    public void incrementCDNumID(){
        CDNumID++;
    }
    public void incrementDVDNumID(){
        DVDNumID++;
    }

    public int getBookNumID(){
        return bookNumID;
    }
    public int getCDNumID(){
        return CDNumID;
    }
    public int getDVDNumID(){
        return DVDNumID;
    }

    public void cancelBookOrder(int numID){
        //Copies a book from bookOrders arraylist to bookInventory arraylist
        Book removeBook;
        for(Book check : bookOrders){
            if(check.getIDNum() == numID){
                removeBook = new Book(check);
                bookInventory.add(removeBook);
            }
        }
        //Remove a book from the bookOrders arraylist
        for(int i = 0; i < bookOrders.size(); i++){
            if(bookOrders.get(i).getIDNum() == numID){
                bookOrders.remove(i);
                i++;
            }
        }
    }

    public void cancelCDOrder(int numID){
        //Copies a CD from CDOrders arraylist to CDInventory arraylist
        CD removeCD;
        for(CD check : CDOrders){
            if(check.getIDNum() == numID){
                removeCD = new CD(check);
                CDInventory.add(removeCD);
            }
        }
        //Remove a CD from the CDOrders arraylist
        for(int i = 0; i < CDOrders.size(); i++){
            if(CDOrders.get(i).getIDNum() == numID){
                CDOrders.remove(i);
                i++;
            }
        }
    }

    public void cancelDVDOrder(int numID){
        //Copies a DVD from DVDOrders arraylist to DVDInventory arraylist
        DVD removeDVD;
        for(DVD check : DVDOrders){
            if(check.getIDNum() == numID){
                removeDVD = new DVD(check);
                DVDInventory.add(removeDVD);
            }
        }
        //Remove a DVD from the DVDOrders arraylist
        for(int i = 0; i < DVDOrders.size(); i++){
            if(DVDOrders.get(i).getIDNum() == numID){
                DVDOrders.remove(i);
                i++;
            }
        }
    }

    public void generateInventory(){
        Book book1 = new Book("The Hunger Games",
                "Suzanne Collins",1);
        bookInventory.add(book1);


        Book book2 = new Book("To Kill a Mockingbird",
                "Harper Lee", 2);
        bookInventory.add(book2);

        Book book3 = new Book("The Book Thief",
                "Markus Zusak",3);
        bookInventory.add(book3);

        Book book4 = new Book("Animal Farm",
                "George Orwell",4);
        bookInventory.add(book4);

        Book book5 = new Book("Gone with the Wind",
                "Margaret Mitchell",5);
        bookInventory.add(book5);

        Book book6 = new Book("The Giving Tree",
                "Shel Silverstein",6);
        bookInventory.add(book6);

        Book book7 = new Book("The Great Gatsby",
                "F. Scott Fitzgerald",7);
        bookInventory.add(book7);

        CD CD1 = new CD("Smells Like Teen Spirit",
                "Nirvana",1);
        CDInventory.add(CD1);

        CD CD2 = new CD("Imagine",
                "John Lennon",2);
        CDInventory.add(CD2);

        CD CD3 = new CD("Sweet Child O'Mine",
                "Guns N' Roses",3);
        CDInventory.add(CD3);

        CD CD4 = new CD("I Will Always Love You",
                "Whitney Houston",4);
        CDInventory.add(CD4);

        CD CD5 = new CD("Born to Run",
                "Bruce Springsteen",5);
        CDInventory.add(CD5);

        CD CD6 = new CD("No Woman No Cry",
                "Bob Marley",6);
        CDInventory.add(CD6);

        CD CD7 = new CD("Every Breath You Take",
                "The Police",7);
        CDInventory.add(CD7);

        DVD DVD1 = new DVD("Avatar",
                "20th Century Studios",1);
        DVDInventory.add(DVD1);

        DVD DVD2 = new DVD("Avengers:Endgame",
                "Walt Disney",2);
        DVDInventory.add(DVD2);

        DVD DVD3 = new DVD("Jurassic Park",
                "Universal Pictures",3);
        DVDInventory.add(DVD3);

        DVD DVD4 = new DVD("John Wick",
                "Lionsgate",4);
        DVDInventory.add(DVD4);

        DVD DVD5 = new DVD("The Lion King",
                "Walt Disney",5);
        DVDInventory.add(DVD5);

        DVD DVD6 = new DVD("Jumanji",
                "Sony Pictures",6);
        DVDInventory.add(DVD6);

        DVD DVD7 = new DVD("Ratatouille",
                "\tWalt Disney",7);
        DVDInventory.add(DVD7);
    }

    public void printBookInventory(){
        System.out.println("List of Books Available\n--------------------------");
        for(int i=0; i<bookInventory.size();i++){
            String toPrint;
            toPrint = bookInventory.get(i).toString();
            System.out.println(toPrint+"\n");
        }
        System.out.println();
    }
    public void printCDInventory(){
        System.out.println("List of CDs(Music) Available\n--------------------------");
        for(int i=0; i<CDInventory.size();i++){
            String toPrint;
            toPrint = CDInventory.get(i).toString();
            System.out.println(toPrint+"\n");
        }
        System.out.println();
    }

    public void printDVDInventory(){
        System.out.println("List of DVDs(Movies) Available\n--------------------------");
        for(int i=0; i<DVDInventory.size();i++){
            String toPrint;
            toPrint = DVDInventory.get(i).toString();
            System.out.println(toPrint+"\n");
        }
        System.out.println();
    }

    public void displayCurrentOrder(){
        System.out.println("<--Here are your order details-->");
        System.out.println("Books");
        for(Book printBook : bookOrders){
            String output = printBook.toString();
            System.out.println(output);
        }

        System.out.println("CDs");
        for(CD printCD : CDOrders){
            String output = printCD.toString();
            System.out.println(output);
        }

        System.out.println("DVDs");
        for(DVD printDVD : DVDOrders){
            String output = printDVD.toString();
            System.out.println(output);
        }
    }

    public void printBookOrders() {
        for(Book bookInOrder : bookOrders){
            String output = bookInOrder.toString();
            System.out.println(output);
        }
    }

    public void printCDOrders() {
        for(CD CDInOrder : CDOrders){
            String output = CDInOrder.toString();
            System.out.println(output);
        }
    }

    public void printDVDOrders() {
        for(DVD DVDInOrder : DVDOrders){
            String output = DVDInOrder.toString();
            System.out.println(output);
        }
    }
    public void addMember(String newName, String newPhoneNum){
        Member addMember = new Member(newName, newPhoneNum);
        memberList.add(addMember);
    }

    public void addPremiumMember(String newName, String newPhoneNum, String newPayMethod){
        PremiumMember addMember = new PremiumMember(newName, newPhoneNum, newPayMethod);
        premiumList.add(addMember);
    }

    public void lookupMember(String phoneNum){
        System.out.println("\nMember\n------------");
        for(Member check : memberList){
            if(check.getPhoneNum().equals(phoneNum)){
                String message = check.toString();
                System.out.println(message);
            }
        }
    }


    public void lookupPremiumMember(String phoneNum) {
        System.out.println("\nPremium Member\n------------");
        for(PremiumMember check : premiumList){
            if(check.getPhoneNum().equals(phoneNum)){
                String message = check.toString();
                System.out.println(message);
            }
        }
    }

    public void payMonthFee(String phoneNum){
        boolean found = false;

        for(int i = 0; i < premiumList.size(); i++){
            if(premiumList.get(i).getPhoneNum().equals(phoneNum)){
                found = true;
                premiumList.get(i).setFeePaid(true);

                premiumList.get(i).addToTotalSpent(premiumList.get(i).getMonthlyFee());

            }
        }

        if(!found){
            System.out.println("No member exists with that number");
        }else{
            System.out.println("Payment Made Successfully!");
        }
    }

    public double monthlyFeeProfits(){
        double total = 0;
        for(PremiumMember check : premiumList){
            total += check.getTotalSpent();
        }

        return total;
    }


}