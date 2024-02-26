package example.model;

public class SimpleBankAccountWithAtm extends SimpleBankAccount {

    private final int fee;

    public SimpleBankAccountWithAtm(final AccountHolder holder, final double balance, final int fee) {
        super(holder, balance);
        this.fee = fee;
    }

    public void depositWithAtm(final int userID, final double amount) {
        this.deposit(userID, amount - this.fee);
    }

    public void withdrawWithAtm(final int userID, final double amount) {
        this.withdraw(userID, amount + this.fee);
    }
}
