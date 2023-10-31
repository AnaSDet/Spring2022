package OOP_InheritanceInJava;

public class Transaction_12_9 {
    public static void main(String[] args) {

    }
}
class Transaction {
    // Static Variables:
    private static int transactionCount = 0;
    private static String bankName;

    // Instance Variables:
    private String transactionId;
    private String accountNumber;
    private double amount;
    private boolean isSuccessful;

    // Constructors:
    public Transaction(String accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.transactionId = "T" + (++transactionCount);
    }

    // Static Methods:
    public static String getBankName() {
        return bankName;
    }

    public static void setBankName(String name) {
        bankName = name;
    }

    // Instance Methods:
    public void processTransaction() {
        if (transactionId.endsWith("2") || transactionId.endsWith("4") ||
                transactionId.endsWith("6") || transactionId.endsWith("8")) {
            isSuccessful = true;
        } else {
            isSuccessful = false;
        }
    }

    public void displayTransactionDetails() {
        System.out.println("Transaction Details:");
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: $" + amount);
        System.out.println("Successful: " + isSuccessful);
    }

    // Additional Static Method:
    public static double calculatePercentage(double percentage, Transaction transaction) {
        if (transaction.isSuccessful) {
            return (percentage / 100) * transaction.amount;
        } else {
            return 0;
        }
    }

    public static int getTransactionCount() {
        return transactionCount;
    }

    public static void main(String[] args) {
        Transaction.setBankName("ABC Bank");

        Transaction transaction1 = new Transaction("1234567890", 100.0);
        transaction1.processTransaction();
        transaction1.displayTransactionDetails();
        System.out.println();

        Transaction transaction2 = new Transaction("9876543210", 200.0);
        transaction2.processTransaction();
        transaction2.displayTransactionDetails();
        System.out.println();

        double percentage1 = Transaction.calculatePercentage(10, transaction1);
        System.out.println("Transaction 1 Percentage: " + percentage1 + "%");

        double percentage2 = Transaction.calculatePercentage(5, transaction2);
        System.out.println("Transaction 2 Percentage: " + percentage2 + "%");

        System.out.println("Total Transactions: " + Transaction.getTransactionCount());
        System.out.println("Bank Name: " + Transaction.getBankName());
    }
}