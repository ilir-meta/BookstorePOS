public class Member {
    private String name;
    private String phoneNum;
    private double totalSpent;

    Member(String memberName, String memberPhone){
        name = memberName;
        phoneNum = memberPhone;
    }

    public String getName(){
        return name;
    }

    public void setName(String memberName){
        name = memberName;
    }

    public String getPhoneNum(){
        return phoneNum;
    }

    public void setPhoneNum(String num){
        phoneNum = num;
    }

    public double getTotalSpent(){
        return totalSpent;
    }

    public void addToTotalSpent(double amount){
        totalSpent += amount;
    }

    public String toString(){
        return "Name: " + name + "; Phone#: " + phoneNum + "; Total Spent: " + totalSpent;
    }
}
