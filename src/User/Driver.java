package User;

public class Driver {
    private String id;
    private double walletBalance;

    public Driver(String id, double walletBalance) {
        this.id = id;
        this.walletBalance = walletBalance;
    }

    public String getId() { return id; }

    public double getWalletBalance() { return walletBalance; }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}