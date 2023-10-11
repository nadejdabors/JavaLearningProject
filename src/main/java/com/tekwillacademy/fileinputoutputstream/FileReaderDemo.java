package com.tekwillacademy.fileinputoutputstream;

import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
    public static void start() throws Exception {
        File f = new File(("src/main/java/com/tekwillacademy/fileinputoutputstream/fileWriter.txt"));
        FileReader fileReader = new FileReader(f);
        System.out.println(fileReader.read());
        char[] chars = new char[(int)f.length()];
        fileReader.read(chars);
        for (char ch:chars
             ) {
            System.out.println(ch);
        }

        System.out.println("------------------");
        FileReader fileReader1 = new FileReader(f);
        int i = fileReader1.read();
        while (i!=-1){

            System.out.println((char)i );
            i = fileReader1.read();
        }
       // fileReader.close();
    }
}
