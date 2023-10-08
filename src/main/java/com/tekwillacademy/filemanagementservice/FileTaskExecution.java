package com.tekwillacademy.filemanagementservice;

import java.io.File;

public class FileTaskExecution {
    public static void main(String[] args) throws Exception{
    File file = new File("src/main/java/com/tekwillacademy/filemanagementservice/text1.txt");
        FileManager.informIfTheTheFileExists(file);
        FileManager.createTheFileIdItDoesNotExist(file);
        FileManager.informIfTheTheFileExists(file);
        FileManager.printTheFileAbsolutePath(file);
        FileManager.printTheFileName(file);
        FileManager.printIfTheFileIsADirectory(file);
        //FileManager.deleteTheFileIfExists(file);

        String filePath = "src/main/java/com/tekwillacademy/filemanagementservice/text.txt";

        OutputFileWriterManager.writeContentIntoFileUsingFileWriter("src/main/java/com/tekwillacademy/filemanagementservice/text.txt","THE cat is eating fish");
        OutputFileWriterManager.writeContentIntoFileUsingBufferWriter("src/main/java/com/tekwillacademy/filemanagementservice/bufferWriter.txt","The dog is eating meat");

        File fileObjectUsedForReading = new File(filePath);
        InputFileReaadManager.printDataFromAFile(fileObjectUsedForReading);
        InputFileReaadManager.printDataFromAFile("src/main/java/com/tekwillacademy/filemanagementservice/bufferWriter.txt");
        InputFileReaadManager.printDataFromAFileUsingBufferReader(fileObjectUsedForReading);
        InputFileReaadManager.printDataFromAFileUsingFiles(fileObjectUsedForReading);
    }
}
