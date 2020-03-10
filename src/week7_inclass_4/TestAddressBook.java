package week7_inclass_4;

import java.util.Scanner;

public class TestAddressBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        AddressBook book1 = new AddressBook(5);

        book1.add("Alan", "Albert road", 0);
        book1.add("Sarah", "Leonard road", 1);
        book1.add("Alfie", "Clarence road", 2);
        book1.add("Ryan", "Johnstown road", 3);
        book1.add("Rachael", "Hillburn road", 4);

        book1.print();
        System.out.println("");
        book1.modify(book1.index_of("Alan"), "Seaview lane");
        book1.print();
        System.out.printf("%s%n", "Please enter a name to search: ");
        book1.search(in.nextLine());
    }
}
