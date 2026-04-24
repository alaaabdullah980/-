package User;

import java.util.List;

public interface DriverRepository {
    void save(Driver driver);
    Driver findById(String id);
}