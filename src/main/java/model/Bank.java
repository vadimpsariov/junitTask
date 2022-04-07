package model;

import java.util.ArrayList;

public class Bank {
    private double bankAnnualInterestRate;

    private ArrayList<SavingsAccount> arrayOfSavingsAccounts = new ArrayList<>();

    public double getBankAnnualInterestRate() {
        return bankAnnualInterestRate;
    }

    public void setBankAnnualInterestRate(double bankAnnualInterestRate) {
        this.bankAnnualInterestRate = bankAnnualInterestRate;
    }

    public void addToList(SavingsAccount sa) {
        arrayOfSavingsAccounts.add(sa);
    }

    public void addingCheck(SavingsAccount sa) {
        if (sa.getAnnualInterestRate() == bankAnnualInterestRate){
            arrayOfSavingsAccounts.add(sa);
            System.out.println(sa.getName()+" added to the bank");
        }
        else{
            System.out.println("wrong anual interest rate. Can't add to the bank");
        }
    }

    public double calculateGlobalMonthlyInterest() {

        double sumOfAllMoney = 0;

        for (SavingsAccount sa : arrayOfSavingsAccounts) {
            sumOfAllMoney += sa.getSavingBalance();
        }
        System.out.println();
        System.out.println("sum of all Money before calculation= " + sumOfAllMoney);

        sumOfAllMoney += (sumOfAllMoney * bankAnnualInterestRate) / 12;

        return sumOfAllMoney;

    }
}
