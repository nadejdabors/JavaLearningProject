package com.tekwillacademy.filemanagementservice;

import javax.imageio.IIOException;
import java.io.*;

public class OutputFileWriterManager {
    public  static void writeContentIntoFileUsingFileWriter(String filePath, String content){
        FileWriter fileWriter = null;
        File file = new File(filePath);
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(fileWriter!=null){
                    fileWriter.close();
                    }
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


    public static void writeContentIntoFileUsingBufferWriter(String filePath,String content){
        BufferedWriter bufferedWriter = null;
        File file = new File(filePath);
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if(bufferedWriter!=null){
                    bufferedWriter.close();
                }
            }catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}


