public abstract class Transactions extends Account{
    abstract void debit(int amt);
    void credit(int amt){
        balance = balance + amt;
        System.out.println("Amount credited");
        checkBalance();
        addStatements(amt);
    }
    void checkBalance(){
        System.out.println("Balance Amount:" + balance);
    }
    void updatePin(String newPin){
        pin = newPin;
    }
    void addStatements(int amt){
        statements[st_count] = amt;
        st_count++;
    }

    void viewStatements(){
        for(int i=0;i<st_count;i++){
            System.out.println(statements[i]);
        }
    }
}
