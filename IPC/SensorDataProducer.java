
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.util.Random;

public class SensorDataProducer implements DataProducer {
    private final MappedByteBuffer buffer;
    private final Renderer renderer;

    public SensorDataProducer(MappedByteBuffer buffer, Renderer renderer) {
        this.buffer = buffer;
        this.renderer = renderer;
    }

    @Override
    public void produce() throws InterruptedException, IOException {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int sensorData = random.nextInt(100);  // Simulate sensor data
            buffer.putInt(0, sensorData);  // Write data to the beginning of the buffer
            renderer.render(sensorData);
            Thread.sleep(1000);  // Simulate delay between data points
        }
        buffer.putInt(0, -1);  // Write termination signal
    }
}
