class InsuficientBalanceException extends Exception{
    InsuficientBalanceException(String msg){
        super(msg);
    }
}

class BankAccount{
    double bal;
    BankAccount(double bal){
        this.bal=bal;

    }
    void checkBalance(){
        System.out.println("The Balance of Account: "+bal);
    }
    void withdraw(double amount) throws InsuficientBalanceException{
        if(amount>bal) throw new InsuficientBalanceException("Insufficient Balance");
        bal-=amount;
        System.out.println("New balance is: "+ bal);
    }

}

public class ATM {
    public static void main(String[] args) {
        BankAccount b=new BankAccount(4000);
       try{
           b.checkBalance();
           b.withdraw(500);
           b.withdraw(600);
       } catch (InsuficientBalanceException e) {
           System.out.println("error"+e.getMessage());
       }
       b.checkBalance();


    }
}
