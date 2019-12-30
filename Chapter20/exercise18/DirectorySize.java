package exercise18;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

public class DirectorySize {
    public static void main(String[] args) {

        System.out.println(getSize(new File("src/exercise18/test")));
    }


    private static long getSize(File directory) {

        long size = 0;

        Queue<File> queue = new ArrayDeque<>();
        queue.add(directory);

        while (!queue.isEmpty()) {

            File file = queue.poll();

            if (file.isFile()) {
                size += file.length();
            } else {
                for (int i = 0; i < file.listFiles().length; i++) {
                    queue.add(file.listFiles()[i]);
                }

            }
        }

        return size;
    }

}
