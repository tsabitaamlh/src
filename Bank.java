import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean removeAccount(String Number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(Number)) {
                accounts.remove(account);
                return true;
            }
        }
        return false;
    }

    public Account getAccount(String Number) {
        for (Account account : accounts) {
            if (account.getNumber().equals(Number)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}