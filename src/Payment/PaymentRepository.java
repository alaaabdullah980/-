package Payment;
import java.util.List;

public interface PaymentRepository {
    void save(payment payment);
    payment findById(String id);
    payment findByTripId(String tripId);
    List<payment> findByRiderId(String riderId);
    List<payment> findByStatus(paymentStatus status);
}