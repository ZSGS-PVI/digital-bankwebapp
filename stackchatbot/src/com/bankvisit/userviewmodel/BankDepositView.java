package com.bankvisit.userviewmodel;

import java.util.Scanner;

public class BankDepositView {
    public int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Make a Deposit\n2. View Balance\n3. Exit");
        return scanner.nextInt();
    }

    public double getDepositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        return scanner.nextDouble();
    }

    public void displayBalance(double balance) {
        System.out.println("Total Balance: Rs" + balance);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}
