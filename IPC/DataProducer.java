
import java.io.IOException;

public interface DataProducer {
    void produce() throws InterruptedException, IOException;
}
