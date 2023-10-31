package MapCollectionsAndIntroToClassesAndObjectsInJava;

public class BankAccount_Protected_11_18 {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected boolean isSavingsAccount;
}
class Main2{
    public static void main(String[] args) {
        BankAccount_Protected_11_18 acc = new BankAccount_Protected_11_18();
        acc.accountNumber = "Sasha94";
        acc.accountHolderName = "Sasha Duachenko";
        acc.balance = 54.700;
        acc.isSavingsAccount = true;

    System.out.println(acc.accountNumber);
    System.out.println(acc.accountHolderName);
    System.out.println(acc.balance);
    System.out.println(true);
    }
}
