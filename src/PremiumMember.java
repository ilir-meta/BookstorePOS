public class PremiumMember {
    private String name;
    private String phoneNum;
    private double totalSpent;
    private double monthlyFee = 10.50;
    private String payMethod;
    private boolean feePaid;

    PremiumMember(String memberName, String memberPhone, String methodOfPay){
        name = memberName;
        phoneNum = memberPhone;
        payMethod = methodOfPay;
    }
    PremiumMember(PremiumMember copyMem){
        name = copyMem.getName();
        phoneNum = copyMem.getPhoneNum();
        payMethod = copyMem.getPayMethod();
        totalSpent = copyMem.getTotalSpent();
        feePaid = copyMem.isFeePaid();
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

    public void payMonthlyFee(){
        totalSpent += monthlyFee;
        feePaid = true;
    }

    public boolean isFeePaid(){
        return feePaid;
    }

    public void setFeePaid(boolean b){feePaid = b;}

    public void setPayMethod(String method){
        payMethod = method;
    }

    public String getPayMethod(){
        return payMethod;
    }

    public String toString(){
        return "Name: " + name + "; Phone#: " + phoneNum + "; Total Spent: "
                + totalSpent +"; Pay Method: " + payMethod + "; Is monthly fee paid: "
                + isFeePaid();
    }

    public double getMonthlyFee(){return monthlyFee;}
}
