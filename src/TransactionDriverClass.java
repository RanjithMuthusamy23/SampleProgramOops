import java.util.*;
public class TransactionDriverClass {
    public static void main(String args[]) {
        int co,val=0;
        Scanner sc = new Scanner(System.in);


        SavingsAcc[] sav = new SavingsAcc[5];
        sav[0] = new SavingsAcc();
        sav[0].setAcc_no("12345");
        sav[0].setName("ranjith");
        sav[0].setAcc_type("savings");
        sav[0].setPin("1111");
        sav[0].setPlace("Kgm");
        sav[0].setContact("9876912345");
        sav[0].setBalance(50000);

        sav[1] = new SavingsAcc();
        sav[1].setAcc_no("27689");
        sav[1].setName("parte");
        sav[1].setAcc_type("savings");
        sav[1].setPin("1222");
        sav[1].setPlace("Hosur");
        sav[1].setContact("8976055123");
        sav[1].setBalance(75000);

        CurrentAcc[] cur = new CurrentAcc[5];
        cur[0] = new CurrentAcc();
        cur[0].setAcc_no("12366");
        cur[0].setName("manoj");
        cur[0].setAcc_type("current");
        cur[0].setPin("0000");
        cur[0].setPlace("bavani");
        cur[0].setContact("932492345");
        cur[0].setBalance(20000);

        cur[1] = new CurrentAcc();
        cur[1].setAcc_no("76891");
        cur[1].setName("Senthil");
        cur[1].setAcc_type("current");
        cur[1].setPin("7685");
        cur[1].setPlace("salem");
        cur[1].setContact("9443212332");
        cur[1].setBalance(30000);

        System.out.println("Account no : ");
        String accNo = sc.next();
        System.out.println("Pin : ");
        String pin = sc.next();
        System.out.println("Savings/Current");
        String accType = sc.next();

        if(accType.equals("savings")) {
            for (int i = 0; i < 2; i++) {
                if(sav[i].getAcc_no().equals(accNo) && sav[i].getPin().equals(pin)){
                    val = i;

                    do {
                        System.out.println("Choose option:\n1.DEBIT\n2.CREDIT\n3.CHECK BALANCE\n4.STATEMENTS");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("DEBIT\nEnter amt to be debited: ");
                                int debitAmt = sc.nextInt();
                                sav[val].debit(debitAmt);
                                break;
                            case 2:
                                System.out.println("CREDIT\nEnter amt to be credited: ");
                                int CreditAmt = sc.nextInt();
                                sav[val].credit(CreditAmt);
                                break;
                            case 3:
                                System.out.println("CHECK BALANCE");
                                sav[val].checkBalance();
                                break;
                            case 4:
                                System.out.println("STATEMENTS");
                                sav[val].viewStatements();
                                break;
                        }
                        System.out.println("Do you want to continue? : ");
                        co = sc.nextInt();
                    } while (co == 1);
                }
                else{
                    System.out.println("Invalid account/pin");
                }
            }
        }
        else{
            for (int i = 0; i < 2; i++) {
                if(cur[i].getAcc_no().equals(accNo) && cur[i].getPin().equals(pin)){
                    val = i;

                    do {
                        System.out.println("Choose option:\n1.DEBIT\n2.CREDIT\n3.CHECK BALANCE\n4.STATEMENTS");
                        int option = sc.nextInt();
                        switch (option) {
                            case 1:
                                System.out.println("DEBIT\nEnter amt to be debited: ");
                                int debitAmt = sc.nextInt();
                                cur[val].debit(debitAmt);
                                break;
                            case 2:
                                System.out.println("CREDIT\nEnter amt to be credited: ");
                                int CreditAmt = sc.nextInt();
                                cur[val].credit(CreditAmt);
                                break;
                            case 3:
                                System.out.println("CHECK BALANCE");
                                cur[val].checkBalance();
                                break;
                            case 4:
                                System.out.println("STATEMENTS");
                                cur[val].viewStatements();
                                break;
                        }
                        System.out.println("Do you want to continue? : ");
                        co = sc.nextInt();
                    } while (co == 1);
                }
                else{
                    System.out.println("Invalid account/pin");
                }
            }
        }


    }
}
