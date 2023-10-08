package com.tekwillacademy.filemanagementservice;

import java.io.File;
import java.io.IOException;
import java.io.ObjectStreamException;

public class FileManager {
   static boolean createTheFileIdItDoesNotExist(File file){
       try {
           return file.createNewFile();
       }catch (IOException e){
           System.out.println(e.getMessage());
           return false;
       }

   }
    public static void informIfTheTheFileExists(File file){
       if(file.exists()){
           System.out.println("Fisierul exista");
       }else {
           System.out.println("Fisierul nu exista");
       }
    }
    public static void printTheFileName(File file){
        System.out.println("Nume fisierului " + file.getName());
    }
    public static void printTheFileAbsolutePath(File file){
        System.out.println(" Calea  absoluta " + file.getAbsolutePath());
    }
    public static void  printIfTheFileIsADirectory(File file){
     if(file.isFile()){
         System.out.println("Obiectul File reprezinta un fisier");
     }else if(file.isDirectory())
     {
       System.out.println("Obiectul File reprezinta un director");

    }
   }

    public static void deleteTheFileIfExists(File file){
       if(file.exists()){
           file.delete();
           System.out.println("Fisierul file a fost sters cu succes");
       }
       else{
           System.out.println("Fisierul file nu s-a putut sterge ");
       }
    }



}
