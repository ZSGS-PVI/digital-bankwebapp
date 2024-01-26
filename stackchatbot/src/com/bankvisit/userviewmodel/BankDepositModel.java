package com.bankvisit.userviewmodel;
import java.util.Stack;

public class BankDepositModel {
    private Stack<Double> depositStack;

    public BankDepositModel() {
        depositStack = new Stack<>();
    }

    public void makeDeposit(double amount) {
        depositStack.push(amount);
    }

    public double getTotalBalance() {
        double totalBalance = 0.0;
        for (double amount : depositStack) {
            totalBalance += amount;
        }
        return totalBalance;
    }
}
