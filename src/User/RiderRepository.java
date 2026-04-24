package User;

import java.util.List;

public interface RiderRepository {
    void save(Rider rider);
    Rider findById(String id);
}
