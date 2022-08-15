public class SavingsAccount extends Account {
    @Override
    public void printBankStatement () {
        System.out.println("=== Savings Account Statement ===");
        super.printCommonInformation();
    }

}
