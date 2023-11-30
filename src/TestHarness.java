import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TestHarness {
    public static void main(String[] args) {
        //Create the bookstore instance
        Bookstore bookstore = new Bookstore();
        //Obtains most of the user input throughout the program
        Scanner userInString = new Scanner(System.in);
        Scanner userInInt = new Scanner(System.in);
        int userAnswer;

        //Creates the inventory of books, CDs, and DVDs
        bookstore.generateInventory();

        boolean shopping = true;
        int temp=0;

        while(shopping){
            //Generate my logo: Meta Store!
            Logo bookstoreLogo = new Logo();
            bookstoreLogo.printLogo();

            //Show user the list of options(These are the three main functionalities)
            System.out.println("\nWelcome to Meta Books! Please chose one of the options below by " +
                    "typing in the number of the option");
            System.out.println("\t 1. Start an Order");
            System.out.println("\t 2. Register a Member & Other Member Options");
            System.out.println("\t 3. Calculate Profit from Monthly Fee for Meta Books");
            System.out.println("\t 4. Exit");

            userAnswer = userInInt.nextInt();

            //Takes user to another menu based off previous answer choice
            switch(userAnswer){
                case 1:
                    //Before starting the order we make sure to check if customer is a member
                    System.out.println("If you are a current member, type in your phone number. If not type 0");


                    //Store member information in separate variable
                    Scanner customerIn = new Scanner(System.in);
                    String customerPhoneNum = customerIn.nextLine();

                    boolean noCheckout = true;
                    //Menu for adding items, removing items, and finishing the order
                    while(noCheckout) {
                        System.out.println("\nSelect from the following options to edit your order");
                        System.out.println("\t 1. Add a Book to Order");
                        System.out.println("\t 2. Add a CD to Order");
                        System.out.println("\t 3. Add a DVD to Order");
                        System.out.println("\t 4. Remove a Book from Order");
                        System.out.println("\t 5. Remove a CD from Order");
                        System.out.println("\t 6. Remove a DVD from Order");
                        System.out.println("\t 7. Check Current Order");
                        System.out.println("\t 8. Complete Order");

                        userAnswer = userInInt.nextInt();
                        switch (userAnswer) {
                            //Add a book to order
                            case 1:
                                System.out.println("\n");
                                bookstore.printBookInventory();
                                System.out.println("Enter the number of the option to select a book");

                                userAnswer = userInInt.nextInt();
                                bookstore.addBookOrder(userAnswer);
                                break;
                            //Add a CD to Order
                            case 2:
                                System.out.println("\n");
                                bookstore.printCDInventory();
                                System.out.println("Enter the number of the option to select a CD");

                                userAnswer = userInInt.nextInt();
                                bookstore.addCDOrder(userAnswer);
                                break;
                            //Add a DVD to Order
                            case 3:
                                System.out.println("\n");
                                bookstore.printDVDInventory();
                                System.out.println("Enter the number of the option to select a DVD");

                                userAnswer = userInInt.nextInt();
                                bookstore.addDVDOrder(userAnswer);
                                break;
                            //Remove a book from order
                            case 4:
                                System.out.println("\nSelect which of the following books to remove");
                                bookstore.printBookOrders();

                                userAnswer = userInInt.nextInt();
                                bookstore.cancelBookOrder(userAnswer);
                                break;
                            //Remove a CD from order
                            case 5:
                                System.out.println("\nSelect which of the following CDs to remove");
                                bookstore.printCDOrders();

                                userAnswer = userInInt.nextInt();
                                bookstore.cancelCDOrder(userAnswer);
                                break;
                            //Remove a DVD from order
                            case 6:
                                System.out.println("\nSelect which of the following DVDs to remove");
                                bookstore.printDVDOrders();

                                userAnswer = userInInt.nextInt();
                                bookstore.cancelDVDOrder(userAnswer);
                                break;
                            //Print current items in the order
                            case 7:
                                System.out.println("\n");
                                bookstore.displayCurrentOrder();
                                break;
                            //Finish checkout
                            case 8:
                                noCheckout = false;
                                break;
                        }
                    }
                    break;
                //This menu deals with all Membership related functionalities
                case 2:
                    System.out.println("\nSelect one of the following member options");
                    System.out.println("\t 1. Register a member");
                    System.out.println("\t 2. Lookup Member Information");
                    System.out.println("\t 3. Pay monthly fee");

                    userAnswer = userInInt.nextInt();
                    switch(userAnswer){
                        //Process to register a new member
                        case 1:
                            //Premium or normal membership
                            System.out.println("\n Do you want to be a premium member. Type 1 for yes and 0 for no");
                            int membType = userInInt.nextInt();

                            //Get new member's name
                            String newName;
                            System.out.println("What is the customer name?");
                            newName = userInString.nextLine();

                            //Get new member's phone number
                            String newPhoneNum;
                            System.out.println("Please enter 10-digit customer phone number");
                            newPhoneNum = userInString.nextLine();

                            if(membType == 1){
                                //Get premium member's preferred payment method
                                System.out.println("What is your preferred method of payment?" +
                                        "Type 'cash', 'card', or 'check'");
                                String methodOfPay = userInString.nextLine();
                                //Create Premium member
                                bookstore.addPremiumMember(newName, newPhoneNum, methodOfPay);
                            }else {
                                //Create normal member
                                bookstore.addMember(newName, newPhoneNum);
                            }
                            break;
                        case 2:
                            //Ask if searching for premium or normal member?
                            System.out.println("Is this a premium member lookup. Type 1 for yes and 0 for no");
                            membType = userInInt.nextInt();
                            System.out.println("Please enter the 10-digit phone number for the member");
                            newPhoneNum = userInString.nextLine();

                            //Disaply member info to screen
                            if (membType == 1){
                                bookstore.lookupPremiumMember(newPhoneNum);
                            }else{
                                bookstore.lookupMember(newPhoneNum);
                            }
                            break;
                        case 3:
                            System.out.println("Please enter the phone # of premium member to pay monthly fee");
                            String phoneNum = userInString.nextLine();
                            bookstore.payMonthFee(phoneNum);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nAmount of Money Made from Premium Member's Monthly Fee");
                    System.out.println("Total: " + bookstore.monthlyFeeProfits());
            }

        }
    }
}