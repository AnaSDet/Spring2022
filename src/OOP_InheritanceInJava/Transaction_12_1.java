package OOP_InheritanceInJava;

public class Transaction_12_1 {
    public String transactionId;
    public String senderAccount;
    public String receiverAccount;
    public double amount;

    // Default constructor
    public Transaction_12_1() {
    }

    // Constructor with parameters
    public Transaction_12_1(String transactionId, String senderAccount, String receiverAccount, double amount) {
        this.transactionId = transactionId;
        this.senderAccount = senderAccount;
        this.receiverAccount = receiverAccount;
        this.amount = amount;
    }
}


