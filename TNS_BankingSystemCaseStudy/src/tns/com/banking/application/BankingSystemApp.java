package tns.com.banking.application;



import tns.com.banking.services.BankingService;
import tns.com.banking.services.BankingServiceImpl;
import tns.com.banking.entities.*;

import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingService bankingService = new BankingServiceImpl();
        Scanner sc = new Scanner(System.in);
        int ch;

        do {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List all Accounts of a Customer");
            System.out.println("7. List all Transactions of an Account");
            System.out.println("8. List all Beneficiaries of a Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Customer Details:");
                    System.out.print("Customer ID: ");
                    int customerID = sc.nextInt();
                    sc.nextLine(); // clear buffer
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Address: ");
                    String address = sc.nextLine();
                    System.out.print("Contact: ");
                    String contact = sc.nextLine();

                    Customer c = new Customer(customerID, name, address, contact);
                    bankingService.addCustomer(c);
                    break;

                case 2:
                    System.out.println("Enter Account Details:");
                    System.out.print("Account ID: ");
                    int accountID = sc.nextInt();
                    System.out.print("Customer ID: ");
                    customerID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Account Type (Saving/Current): ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();

                    Account acc = new Account(accountID, customerID, type, balance);
                    bankingService.addAccount(acc);
                    break;

                case 3:
                    System.out.println("Enter Beneficiary Details:");
                    System.out.print("Customer ID: ");
                    customerID = sc.nextInt();
                    System.out.print("Beneficiary ID: ");
                    int beneficiaryID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Beneficiary Name: ");
                    String beneficiaryName = sc.nextLine();
                    System.out.print("Beneficiary Account Number: ");
                    String accountNumber = sc.nextLine();
                    System.out.print("Bank Details: ");
                    String bankDetails = sc.nextLine();

                    Beneficiary b = new Beneficiary(customerID, beneficiaryID, beneficiaryName, accountNumber, bankDetails);
                    bankingService.addBeneficiary(b);
                    break;

                case 4:
                    System.out.println("Enter Transaction Details:");
                    System.out.print("Account ID: ");
                    accountID = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Type (Deposit/Withdrawal): ");
                    String txnType = sc.nextLine();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();

                    Transaction t = new Transaction(accountID, txnType, amount);
                    bankingService.addTransaction(t);
                    break;

                case 5:
                    for (Customer customer : bankingService.getAllCustomers()) {
                        System.out.println("Customer ID: " + customer.getCustomerID() + ", Name: " + customer.getName());
                    }
                    System.out.print("Enter Customer ID to Find: ");
                    customerID = sc.nextInt();
                    Customer foundCustomer = bankingService.findCustomerById(customerID);
                    if (foundCustomer != null) {
                        System.out.println("Customer Found: " + foundCustomer.getName());
                    } else {
                        System.out.println("Customer Not Found.");
                    }
                    break;

                case 6:
                    System.out.print("Enter Customer ID: ");
                    customerID = sc.nextInt();
                    List<Account> accounts = bankingService.getAccountsByCustomerId(customerID);
                    for (Account a : accounts) {
                        System.out.println("Account ID: " + a.getAccountID() + ", Balance: " + a.getBalance());
                    }
                    break;

                case 7:
                    System.out.print("Enter Account ID: ");
                    accountID = sc.nextInt();
                    List<Transaction> txns = bankingService.getTransactionsByAccountId(accountID);
                    for (Transaction txn : txns) {
                        System.out.println("Txn ID: " + txn.getTransactionID() +
                                ", Type: " + txn.getType() +
                                ", Amount: " + txn.getAmount() +
                                ", Timestamp: " + txn.getTimestamp());
                    }
                    break;

                case 8:
                    System.out.print("Enter Customer ID: ");
                    customerID = sc.nextInt();
                    List<Beneficiary> benList = bankingService.getBeneficiariesByCustomerId(customerID);
                    for (Beneficiary ben : benList) {
                        System.out.println("Beneficiary ID: " + ben.getBeneficiaryID() + ", Name: " + ben.getName());
                    }
                    break;

                case 9:
                    System.out.println("Thank you for using the Banking System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (ch != 9);

        sc.close();
    }
}
