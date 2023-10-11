package com.tekwillacademy.fileinputoutputstream;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void start() throws Exception {

      //  FileWriter fw = new FileWriter("src/main/java/com/tekwillacademy/fileinputoutputstream/fileWriter.txt",true);

        FileWriter fw = new FileWriter("src/main/java/com/tekwillacademy/fileinputoutputstream/fileWriter.txt");
        fw.write(100);
        fw.write('\n');
        fw.write("Java Learning Program");
        char[] ch = {'a','b','c'};
        fw.write('\n');
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();





    }

}
