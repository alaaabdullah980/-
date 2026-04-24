package Payment;
import java.util.*;

public class InMemoryPaymentRepository implements PaymentRepository {
    private Map<String, payment> database = new HashMap<>();
    @Override
    public void save(payment payment) {
        database.put(payment.getId(), payment);
    }
    @Override
    public payment findById(String id) {
        return database.get(id);
    }
    @Override
    public payment findByTripId(String tripId) {
        for (payment payment : database.values()) {
            if (payment.getTripId().equals(tripId)) {
                return payment;
            }
        }
        return null;
    }
    @Override
    public List<payment> findByRiderId(String riderId) {
        List<payment> list = new ArrayList<>();
        for (payment p : database.values()) {
            if (p.getRiderId().equals(riderId)) {
                list.add(p);
            }
        }
        return list;
    }
    @Override
    public List<payment> findByStatus(paymentStatus status) {
        List<payment> list = new ArrayList<>();
        for (payment payment : database.values()) {
            if (payment.getStatus() == status) {
                list.add(payment);
            }
        }
        return list;
    }
}