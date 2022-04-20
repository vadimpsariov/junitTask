package model;

public class SavingsAccount {
    private  double annualInterestRate;
    private double savingBalance;
    private String name;

    public SavingsAccount(String name, double savingBalance){
        this.name = name;
        this.savingBalance = savingBalance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public double calculateMonthlyInterest() {
        double temp = ((savingBalance * annualInterestRate) / 12);
        System.out.println(name+" monthly benifit = " + temp);
        savingBalance += temp;
        return savingBalance;
    }
    public double getMonthlyInterest(){
        return ((savingBalance * annualInterestRate) / 12);
    }

    public void modifyInterestRate(double newValue){
        annualInterestRate = newValue;
    }

    public static void transferFunds(SavingsAccount transmitter,SavingsAccount reciever, double sum){
        if (transmitter.savingBalance < sum){
            System.out.println(transmitter.name+" doesn't have this much money!");
            return;
        }
        System.out.println(transmitter.name+" balance before tranzaction = "+transmitter.savingBalance);
        System.out.println(reciever.name+" balance before tranzaction= "+reciever.savingBalance);

        transmitter.savingBalance-=sum;
        reciever.savingBalance+=sum;

        System.out.println(transmitter.name+" balance after tranzaction= "+transmitter.savingBalance);
        System.out.println(reciever.name+" balance after tranzaction= "+reciever.savingBalance);
    }
}
