package com.tekwillacademy.fileinputoutputstream;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        File file = new File("src/main/java/com/tekwillacademy/fileinputoutputstream/files");
        file.mkdir();
        file.delete();

        File file1 = new File("src/main/java/com/tekwillacademy/");
        String[] s = file1.list();
        for (String s1 :s) {
            System.out.println(s1);

        }


        FileWriterDemo.start();
        FileReaderDemo.start();


    }
}
