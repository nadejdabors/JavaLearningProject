package com.tekwillacademy.filemanagementservice;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.file.Files;

public class InputFileReaadManager{
     public static void printDataFromAFile(File file){
          FileReader fileReader = null;

          try {
               fileReader = new FileReader(file);

               int ch;
               while ((ch = fileReader.read() )!= -1){
                    System.out.print((char) ch);
               }
               System.out.println('\n');
          }catch (IOException e){
               e.printStackTrace();
          }finally {
               try {
                    if(fileReader != null){
                         fileReader.close();
                    }
               }catch (IOException e){
                    e.printStackTrace();
               }
          }

     }
     public static void printDataFromAFile(String filePath){
          FileReader fileReader = null;

          try {
               fileReader = new FileReader(filePath);

               int ch;
               while ((ch = fileReader.read() )!= -1){
                    System.out.print((char) ch);
               }
               System.out.println('\n');
          }catch (IOException e){
               e.printStackTrace();
          }finally {
               try {
                    if(fileReader != null){
                         fileReader.close();
                    }
               }catch (IOException e){
                    e.printStackTrace();
               }
          }

     }
     public static void printDataFromAFileUsingBufferReader(File file){

          BufferedReader bufferedReader = null;
          try {
               bufferedReader = new BufferedReader(new FileReader(file));

               String line;
               while ((line = bufferedReader.readLine())!= null){
                    System.out.println(line);
               }

          }catch (IOException e)
          {
               e.printStackTrace();
          }finally {
               try {
                    if (bufferedReader != null)
                         bufferedReader.close();

               }catch (Exception e)
               {
                    e.printStackTrace();
               }

          }
     }
     public static void printDataFromAFileUsingFiles(File file){

          try {
               System.out.println(Files.readString(file.toPath()));
          }catch (IOException e)
          {
               e.printStackTrace();
          }

     }





}
