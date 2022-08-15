import org.jetbrains.annotations.NotNull;

public abstract class Account implements iAccount {
    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;
    protected int agency;
    protected int number;
    protected double balance;


    public Account() {
        this.agency = Account.STANDARD_AGENCY;
        this.number = SEQUENTIAL++;
    }

    @Override
    public void withdraw(double value) {
        balance = balance - value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, @NotNull Account destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency () {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInformation () {

        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }

}
