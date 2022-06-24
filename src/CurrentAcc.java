public class CurrentAcc extends Transactions {
    void debit(int amt){
        if(balance - amt > 1000){
            balance -=amt;
            System.out.println("Amount debited");
            checkBalance();
            addStatements(-amt);
        }
        else{
            System.out.println("Unable to process because balance is below limit");
        }
    }
}
