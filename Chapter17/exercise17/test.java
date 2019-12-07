package exercise17;

import java.io.File;
import java.io.IOException;

public class test {
    public static void main(String[] args) throws IOException {

        File file = new File("/Users/oguzhan/Chapter17/src/exercise17/Exercise17_17.dat");
        BitOutoutStream outoutStream = new BitOutoutStream(file);
        outoutStream.writeBit("0100001001000001001101");

    }
}
