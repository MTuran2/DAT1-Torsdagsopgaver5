package Task1;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static void main(String[] args) {
        customers.add(new Customer("Casper", "Christensen","casper2000",32123));
        customers.add(new Customer("Rasmus", "Sørensen","rasm222",62421));
        customers.add(new Customer("Signe", "Petersen","sipetersen2",34500));
        customers.add(new Customer("Peter", "Larsen","ptlarsen2635",23744));
        customers.add(new Customer("Jakob", "Vilhelmsen","vilhelmsen22",95443));
        customers.add(new Customer("Robert", "Kaspersen","kaspersenrobert2",87774));

        //System.out.println(customers);
        printCustomers();
    }
    public static void printCustomers(){
        for(Customer s:customers){
            System.out.println(s);
        }
    }

}