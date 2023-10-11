package com.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book mihaisBook = new Book("Atomic Habits", "James C.");
        Book alexsBook = new Book("Crime and Punishment", "Feodor D.");
        Book ruxandasBook = new Book("Karamazov Brothers", "Feodor D.");
        Book veronicasBook = new Book("To Kill a Mockingbird", "Harper L.");
        Book mihais2Book = new Book("1984", "George O.");

        mihais2Book.printTheBookDetails();
        mihaisBook.printTheBookDetails();
        alexsBook.printTheBookDetails();
        ruxandasBook.printTheBookDetails();
        veronicasBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(mihaisBook);
        carturestiLibrary.addBook(veronicasBook);
        carturestiLibrary.addBook(ruxandasBook);

        System.out.println(carturestiLibrary.getTheStockStatus());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.addBook(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatus());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(alexsBook));

        carturestiLibrary.deleteABookIfeXISTS(alexsBook);
        System.out.println(carturestiLibrary.getTheStockStatus());

        carturestiLibrary.printAllTheBooks();

        Library victorsLibrary = new Library("Cartier");

        victorsLibrary.addBook(alexsBook);
        victorsLibrary.addBook(ruxandasBook);
        victorsLibrary.addBook(veronicasBook);

        System.out.println(victorsLibrary.getTheStockStatus());
        victorsLibrary.printAllTheBooks();

        Map<String,Library> librariesMap = new HashMap<>();

        librariesMap.put("Str. Stefan cel Mare 136", carturestiLibrary);
        librariesMap.put("Str. Dacia 24/3 ap. 01", victorsLibrary);

        System.out.println(librariesMap.size());

        System.out.println( librariesMap.get("Str. Stefan cel Mare 136").getLibraryName());
        librariesMap.get("Str. Stefan cel Mare 136").printAllTheBooks();
        System.out.println(librariesMap.get("Str. Dacia 24/3 ap. 01").isThereSuchABookInTheStock(veronicasBook));

        for(Map.Entry<String,Library> entry: librariesMap.entrySet()){
            String cheie = entry.getKey();
            Library valoare = entry.getValue();
            System.out.println("Cheia: " + cheie + ", Valoare: " + valoare);
        }


        int[] dataTable = new int[6];
        dataTable[0] = 32342;
        dataTable[1] = 43;
        dataTable[2] = -4;
        dataTable[3] = 6;
        dataTable[4] = -90;
        dataTable[5] = -45;
        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

        int[] dataTableShort = { 3,4,5,54,-2,90};
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));
        System.out.println(IntNumberArrayService.findMin(dataTableShort));
    }
}
