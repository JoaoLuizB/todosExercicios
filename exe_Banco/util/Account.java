package util;

public class Account {
    private String accountId;
    private String accHolder;
    private double balance;

    public Account(String accountId, String accHolder, double initialDeposit) {
        this.accountId = accountId;
        this.accHolder = accHolder;
        depositValue(initialDeposit);
    }

    public Account(String accountId, String accHolder) {
        this.accountId = accountId;
        this.accHolder = accHolder;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(String accHolder) {
        this.accHolder = accHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositValue(double deposit){
        this.balance += deposit;
    }

    public void withdrawValue(double withdraw){
        this.balance -= withdraw + 5;
    }

    public String toString(){
        return "Account: "
                + accountId
                + ", Holder: "
                + accHolder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
