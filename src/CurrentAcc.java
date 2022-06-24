public class CurrentAcc extends Transactions {
    void debit(int amt){
        if(getBalance() - amt > 1000){
            setBalance(getBalance() - amt);
            System.out.println("Amount debited");
            checkBalance();
            addStatements(-amt);
        }
        else{
            System.out.println("Unable to process because balance is below limit");
        }
    }
}
