package model;

public class Main {
    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount("Julian", 2000);
        SavingsAccount sa2 = new SavingsAccount("Nick", 3000);
        SavingsAccount sa3 = new SavingsAccount("Fab", 4000);
        SavingsAccount sa4 = new SavingsAccount("Albert", 5000);
        sa1.setAnnualInterestRate(0.04);
        sa3.setAnnualInterestRate(0.05);
        sa2.setAnnualInterestRate(0.05);
        sa4.setAnnualInterestRate(0.05);
        System.out.println(sa1.calculateMonthlyInterest());
        System.out.println(sa2.calculateMonthlyInterest());
        System.out.println(sa1.getSavingBalance());
        System.out.println(sa2.getSavingBalance());
        System.out.println(sa1.calculateMonthlyInterest());
        System.out.println(sa2.calculateMonthlyInterest());
        System.out.println(sa1.getSavingBalance());
        System.out.println(sa2.getSavingBalance());
        SavingsAccount.transferFunds(sa1,sa2,700);
        System.out.println("TUT"+sa1.getMonthlyInterest());
        Bank bank1 = new Bank();
        bank1.setBankAnnualInterestRate(0.07);
        Bank bank2 = new Bank();
        bank2.setBankAnnualInterestRate(0.05);

        bank1.addingCheck(sa1);
        bank2.addingCheck(sa2);
        bank2.addingCheck(sa3);
        bank2.addingCheck(sa4);

        System.out.println("sum of all Money after calculation= " +bank2.calculateGlobalMonthlyInterest());


    }
}
