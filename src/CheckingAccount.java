public class CheckingAccount extends Account {

    @Override
    public void printBankStatement() {
        System.out.println ("=== Checking Account Statement ===");
        super.printCommonInformation();
    }
}

