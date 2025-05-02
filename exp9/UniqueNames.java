import java.util.*;

public class UniqueNames {
    public static void main(String[] args) {
        String[] namesArray = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};
        HashSet<String> nameSet = new HashSet<>(Arrays.asList(namesArray));

        String nameToCheck = "Sourabh";

        System.out.println("Unique names: " + nameSet);
        if (nameSet.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the set.");
        } else {
            System.out.println(nameToCheck + " does not exist in the set.");
        }
    }
}
