public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account tsabita = new Account("Tsabita", "1202223090", 100000.0);
        Account amaliah = new Account("Amaliah", "1202229030", 200000.0);
        Account susanto = new Account("Susanto", "1202229340", 300000.0);

        bank.addAccount(tsabita);
        bank.addAccount(amaliah);
        bank.addAccount(susanto);

        System.out.println("Saldo Akun");
        System.out.println("Tsabita: " + tsabita.getBalance());
        System.out.println("Amaliah: " + amaliah.getBalance());
        System.out.println("Susanto: " + susanto.getBalance());

        tsabita.deposit(50000.0);
        boolean withdrawSuccess = amaliah.withdraw(20000.0);

        System.out.println("\nSaldo Akun Tsabita setelah menyetor: " + tsabita.getBalance());
        System.out.println("Saldo Akun Amaliah setelah menarik uang: " + amaliah.getBalance());

        if (withdrawSuccess) {
            System.out.println("\nAkun Amaliah Berhasil Dihapus!");
            bank.removeAccount(amaliah.getNumber());
        } else {
            System.out.println("\nGagal menghapus Akun Amaliah.");
        }

        System.out.println("\nDaftar Semua Akun dalam Bank :");
        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama : " + account.getName() + ", Nomor Akun : " + account.getNumber() + ", Saldo : "
                    + account.getBalance());
        }
    }
}