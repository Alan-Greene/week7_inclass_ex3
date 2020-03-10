package week7_inclass_4;

public class AddressBook {
    String[] names;
    String[] addresses;
    int n = 0;

    public AddressBook(){
        names = new String[10];
        addresses = new String[10];
        n = 0;
    }

    public AddressBook(int number_of_entries){
        this.names = new String[number_of_entries];
        this.addresses = new String[number_of_entries];
        this.n = 0;
    }

    public void add(String name, String address, int n){
        this.names[n] = name;
        this.addresses[n] = address;
    }

    public int index_of(String contact_name){
        int index_value = 0;
        boolean found = false;

        for (int i = 0; i < this.names.length; i++) {
                if (this.names[i].equals(contact_name)) {
                    index_value = i;
                    found = true;
                }
            }

            if (found){
                return index_value;
            } else {
                return -1;
            }
    }

    public void modify(int index, String address){
        for (int i = 0; i < this.addresses.length; i++){
            if (index <= this.addresses.length) {
                this.addresses[index] = address;
                break;
            } else {
                System.out.println("That index does not exist");
            }
        }
    }

    public void search(String name) {
        boolean found = false;
        int print_index = 0;
        for (int i = 0; i < this.names.length; i++) {
            if (this.names[i].equals(name)){
                print_index = i;
                found = true;
            }
        }

        if (found){
            System.out.printf("Name: %s%n", this.names[print_index]);
            System.out.printf("address: %s%n", this.addresses[print_index]);
        } else {
            System.out.printf("Sorry, the name %s is not in the address book ", name);
        }


    }

    public void print(){
        for (int i = 0; i < this.names.length; i++) {
            System.out.printf("Entry # %d%n", i+1);
            System.out.printf("Name: %s%n", this.names[i]);
            System.out.printf("address: %s%n", this.addresses[i]);
            System.out.println("");
        }

    }
}
