package corejavatest;
//4. Write a custom exception class InsufficientBalanceException. Create a
//   BankAccount class with a withdraw() method that throws this exception
//   when the withdrawal amount exceeds the balance. Demonstrate handling
//   it in main.


class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String msg){
        super(msg);
    }
}
public class BankAccount {

    double balance = 20000 ;


    void withDraw (double amount) throws InsufficientBalanceException{
        if(balance < amount) {
            throw new InsufficientBalanceException("balance is insufficient " + balance);
        }
                balance -= amount;
                System.out.println(amount + " is withdrawen");
                System.out.println("your balance: "+balance);
        }


    static void main() {
        BankAccount bc=new BankAccount();
        try { // handling exception in main
            bc.withDraw(1200);
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        }


    }



}
