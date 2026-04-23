package Payment;
import Common.Auditable;
import Common.Identifiable;
import java.time.Instant;
import java.util.UUID;

public class payment implements Identifiable, Auditable {
    private final String id;
    private final String tripId;
    private final String riderId;
    private final double amount;
    private final String currency;
    private final paymentMethod method;
    private paymentStatus status;
    private final Instant createdAt;
    private Instant updatedAt;

    public payment(String tripId, String riderId, double amount, String currency, paymentMethod method) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        this.id = UUID.randomUUID().toString();
        this.tripId = tripId;
        this.riderId = riderId;
        this.amount = amount;
        this.currency = currency;
        this.method = method;
        this.status = paymentStatus.PENDING;
        this.createdAt = Instant.now();
        this.updatedAt = createdAt;
    }
    public String getId() { return id; }
    public String getTripId() { return tripId; }
    public String getRiderId() { return riderId; }
    public double getAmount() { return amount; }
    public String getCurrency() { return currency; }
    public paymentMethod getMethod() { return method; }
    public paymentStatus getStatus() { return status; }
    public Instant getCreatedAt() { return createdAt; }
    public Instant getUpdatedAt() { return updatedAt; }
    public void nextStatus() {
        if (status == paymentStatus.PENDING) {
            status = paymentStatus.COMPLETED;
        } else {
            throw new IllegalStateException("Invalid transition");
        }
        updatedAt = Instant.now();
    }
    public void fail() {
        if (status != paymentStatus.PENDING) {
            throw new IllegalStateException("Only from PENDING");
        }
        status = paymentStatus.FAILED;
        updatedAt = Instant.now();
    }
    public void markRefunded() {
        if (status != paymentStatus.COMPLETED) {
            throw new IllegalStateException("Only from COMPLETED");
        }
        status = paymentStatus.REFUNDED;
        updatedAt = Instant.now();
    }
}