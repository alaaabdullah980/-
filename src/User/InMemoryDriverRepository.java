package User;

import java.util.HashMap;
import java.util.Map;

public class InMemoryDriverRepository implements DriverRepository {

    private Map<String, Driver> database = new HashMap<>();

    @Override
    public void save(Driver driver) {
        database.put(driver.getId(), driver);
    }

    @Override
    public Driver findById(String id) {
        return database.get(id);
    }
}