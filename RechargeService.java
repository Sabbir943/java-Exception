/*
* Problem 2: Mobile Recharge System
Scenario: A telecom company provides a mobile recharge service. If a user enters a recharge
amount below the minimum required amount (for example, 10 taka), the system should generate
an exception.
Required Classes
• MobileAccount
• InvalidRechargeAmountException
• RechargeService
Required Methods
• recharge(double amount)
• checkBalance()
Implementation Idea
The MobileAccount class stores the current balance of the user. When the recharge() method is
called, it checks whether the recharge amount is less than the allowed minimum value. If the
amount is invalid, the system throws an InvalidRechargeAmountException. Otherwise, the
balance is updated.
 */
class InvaildRechargeAmountException extends Exception{
    InvaildRechargeAmountException(String msg){
        super(msg);
    }
}

class MobileAccount {
    double balance;
    MobileAccount(double balance){
        this.balance=balance;
    }

    void checkBalance(){
        System.out.println("Current Balance: "+balance+" taka");
    }

    void recharge(double amount) throws InvaildRechargeAmountException{
        if(amount<10){
            throw new InvaildRechargeAmountException("Minimum recharge is 10 taka!");
        }
        balance+=amount;
        System.out.println("Recharge is successful: "+ amount + " taka");
    }
}

public class RechargeService {
    public static void main(String[] args) {
       MobileAccount acc=new MobileAccount(50);
       try{
           acc.checkBalance();
           acc.recharge(20);
           acc.recharge(5);
       }
       catch (InvaildRechargeAmountException e){
           System.out.println("Error "+e.getMessage());
       }
       acc.checkBalance();
    }
}
