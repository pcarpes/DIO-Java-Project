public class Main {
    public static void main (String[] args) {
        Account ca = new CheckingAccount();
        ca.deposit(100);
        Account sa = new SavingsAccount();
        ca.transfer(100, sa);

        ca.printBankStatement();
        sa.printBankStatement();
    }


}
