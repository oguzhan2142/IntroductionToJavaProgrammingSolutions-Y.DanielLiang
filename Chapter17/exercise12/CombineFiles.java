package exercise12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CombineFiles {

    public static void main(String[] args) {

        File[] sourceFiles = new File[args.length - 1];
        File targetFile = new File(args[args.length - 1]);


        for (int i = 0; i < sourceFiles.length; i++) {

            sourceFiles[i] = new File(args[i]);
            try{
                FileInputStream inputStream = new FileInputStream(sourceFiles[i]);
                FileOutputStream outputStream = new FileOutputStream(targetFile,true);

                byte [] b = new byte[(int)sourceFiles[i].length()];
                inputStream.read(b);
                outputStream.write(b);

            }catch (IOException e){
                e.printStackTrace();
            }



        }




    }
}
