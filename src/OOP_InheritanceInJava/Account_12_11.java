package OOP_InheritanceInJava;

import java.util.ArrayList;
import java.util.List;

public class Account_12_11 {
    public static void main(String[] args) {
        Account acc = new Account("143", List.of("6787", "4567"));
        System.out.println(acc.getAccountHolders());
    }
}

class Account {
    private static final String bankName = "MyBank";
    private static int totalAccounts = 0;

    private String accountNumber;
    private List<String> accountHolders;
    private List<Double> transactions;

    public Account(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = accountHolders;
        this.transactions = new ArrayList<>();
        totalAccounts++;
    }


        public String getAccountNumber() {
            return accountNumber;
        }

        public List<String> getAccountHolders() {
            return accountHolders;
        }

        public List<Double> getTransactions() {
            return transactions;
        }

        public void addTransaction(double amount) {
            transactions.add(amount);
        }

        public double getBalance() {
            double balance = 0;
            for (double transaction : transactions) {
                balance += transaction;
            }
            return balance;
        }

        public boolean hasAccountHolder(String accountHolder) {
            return accountHolders.contains(accountHolder);
        }

        public static String getBankName() {
            return bankName;
        }

        public static int getTotalAccounts() {
            return totalAccounts;
        }
    }
