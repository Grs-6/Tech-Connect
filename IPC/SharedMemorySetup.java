
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class SharedMemorySetup {
    public static final String FILE_NAME = "shared_memory.dat";
    public static final int FILE_SIZE = 1024;  // 1KB for simplicity

    public static MappedByteBuffer setupSharedMemory() throws IOException {
        RandomAccessFile file = new RandomAccessFile(FILE_NAME, "rw");
        FileChannel channel = file.getChannel();
        return channel.map(FileChannel.MapMode.READ_WRITE, 0, FILE_SIZE);
    }
}
