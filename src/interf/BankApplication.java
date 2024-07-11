package interf;

public class BankApplication implements  BankApplicationInterface{

    private String name;
    private Account[] accounts = new Account[1000];
    private int sizeOfAccounts = 0;

    public BankApplication() {
    }

    public BankApplication(String name ) {
        this.name = name;
    }

    public BankApplication(Account[] accounts, int sizeOfAccounts, String name) {
        this.accounts = accounts;
        this.sizeOfAccounts = sizeOfAccounts;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account a) {
        accounts[sizeOfAccounts] = a;
        sizeOfAccounts++;

    }

    @Override
    public void printAccounts() {
        for (int i = 0; i < sizeOfAccounts; i++) {
            System.out.println(accounts[i]);
        }

    }
    double count = 0;
    int index = 0;

    @Override
    public Account getMaxBalance() {
        for (int i = 0; i < sizeOfAccounts; i++) {
            if (accounts[i].getBalance() > count){
                count = accounts[i].getBalance();
                index = i;
            }

        }
        return accounts[index];
    }
}

