//Abstract class
public abstract class Transactions extends Account{ //inherits Account class
    //Abstract method
    abstract void debit(int amt);
    void credit(int amt){
        setBalance(getBalance() + amt);
        System.out.println("Amount credited");
        checkBalance();
        addStatements(amt);
    }
    void checkBalance(){
        System.out.println("Balance Amount:" + getBalance());
    }
    void updatePin(String newPin){
        setPin(newPin);
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
