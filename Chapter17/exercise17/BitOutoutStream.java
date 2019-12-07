package exercise17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BitOutoutStream {

    private int bits;
    private int position;

    private FileOutputStream outputStream;

    public BitOutoutStream(File file) throws FileNotFoundException {
        outputStream = new FileOutputStream(file);
    }


    public void writeBit(char bit) throws IOException {


        bits = bits << 1;

        if (bit == '1') {
            bits = bits | 1;
        }

        position++;

        if (position == 8) {
            outputStream.write((byte) bits);
            position = 0;
            bits = 0;
        }


    }

    public void writeBit(String bit) throws IOException {


        for (int i = 0; i < bit.length(); i++) {
            writeBit(bit.charAt(i));
        }

    }

    public void close() throws IOException {

        if (bits != 0) {

            bits = bits << (8 - position);
            outputStream.write((byte) bits);

        }
        outputStream.close();

    }

}
