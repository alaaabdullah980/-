package User;

public class Rider {
    private String id;
    private double walletBalance;

    public Rider(String id, double walletBalance) {
        this.id = id;
        this.walletBalance = walletBalance;
    }

    public String getId() { return id; }

    public double getWalletBalance() { return walletBalance; }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }
}