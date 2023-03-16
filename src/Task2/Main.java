package Task2;

public class Main {
    public static void main(String[] args) {
        Cafe c1 = new Cafe();
        c1.loadMenuData();
        //System.out.println(c1.coffeeMenu);

        for (int i = 0; i < c1.coffeeMenu.size(); i++){
            System.out.println(c1.coffeeMenu.get(i));
        }

    }
}