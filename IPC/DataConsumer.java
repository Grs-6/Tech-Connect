
import java.io.IOException;

public interface DataConsumer {
    void consume() throws InterruptedException, IOException;
}
