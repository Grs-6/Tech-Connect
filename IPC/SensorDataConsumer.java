
import java.io.IOException;
import java.nio.MappedByteBuffer;

public class SensorDataConsumer implements DataConsumer {
    private final MappedByteBuffer buffer;
    private final Renderer renderer;

    public SensorDataConsumer(MappedByteBuffer buffer, Renderer renderer) {
        this.buffer = buffer;
        this.renderer = renderer;
    }

    @Override
    public void consume() throws InterruptedException, IOException {
        while (true) {
            int sensorData = buffer.getInt(0);  // Read data from the beginning of the buffer
            if (sensorData == -1) {
                System.out.println("Consumer received termination signal.");
                break;
            }
            renderer.render(sensorData);
            Thread.sleep(1000);  // Simulate delay for reading data points
        }
    }
}
