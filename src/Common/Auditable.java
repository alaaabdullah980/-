package Common;
import java.time.Instant;

public interface Auditable {
    Instant getCreatedAt();
}