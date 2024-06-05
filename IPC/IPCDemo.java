
import java.io.IOException;
import java.nio.MappedByteBuffer;

public class IPCDemo {
    public static void main(String[] args) {
        try {
            MappedByteBuffer buffer = SharedMemorySetup.setupSharedMemory();
            Renderer renderer = new ConsoleRenderer();

            DataProducer producer = new SensorDataProducer(buffer, renderer);
            DataConsumer consumer = new SensorDataConsumer(buffer, renderer);

            Thread producerThread = new Thread(() -> {
                try {
                    producer.produce();
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            });

            Thread consumerThread = new Thread(() -> {
                try {
                    consumer.consume();
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            });

            producerThread.start();
            consumerThread.start();

            producerThread.join();
            consumerThread.join();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
