import java.util.Scanner;

class Chef {
    public void makeSpecialDish() {
        System.out.println("Chef is making Special Dish");
    }
}

class ItalianChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Chef is Making Pasta");
    }
}

class ChineseChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Chef is Making Dumplings");
    }
}

class MexicanChef extends Chef {
    @Override
    public void makeSpecialDish() {
        System.out.println("Chef is Making Tacos");
    }
}

public class Program5 {
    public static void main(String[] args) {
        int size, num;
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Enter Number of Chefs: ");
            size = inp.nextInt();
            inp.nextLine();  

            Chef[] ch = new Chef[size];

            System.out.println("1. Mexican Chef \n2. Chinese Chef \n3. Italian Chef");

            for (int i = 0; i < size; i++) {
                System.out.print("Enter your Choice: ");
                if (inp.hasNextInt()) {
                    num = inp.nextInt();
                    inp.nextLine(); 

                    if (num == 1) {
                        ch[i] = new MexicanChef();
                    } else if (num == 2) {
                        ch[i] = new ChineseChef();
                    } else if (num == 3) {
                        ch[i] = new ItalianChef();
                    } else {
                        System.out.println("Invalid Input. Please enter a number between 1 and 3.");
                        i--; 
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    inp.next();  
                    i--;  
                }
            }

            System.out.println("\nCalling Methods:-");
            for (int i = 0; i < ch.length; i++) {
                ch[i].makeSpecialDish();
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            inp.close();  
        }
    }
}
