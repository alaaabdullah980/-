package User;

import java.util.HashMap;
import java.util.Map;

public class InMemoryRiderRepository implements RiderRepository {

    private Map<String, Rider> database = new HashMap<>();

    @Override
    public void save(Rider rider) {
        database.put(rider.getId(), rider);
    }

    @Override
    public Rider findById(String id) {
        return database.get(id);
    }
}