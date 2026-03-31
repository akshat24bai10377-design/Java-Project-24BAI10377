import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            HabitManager manager = new HabitManager();

            try {
                manager.loadFromFile();
            } catch (IOException e) {
                System.out.println("No previous habits found.");
            }

            while (true) {
                System.out.println("\n--- Habit Tracker ---");
                System.out.println("1. Add Habit");
                System.out.println("2. View Habits");
                System.out.println("3. Mark Habit Done");
                System.out.println("4. Save & Exit");

                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter habit name: ");
                        String name = sc.nextLine();
                        manager.addHabit(name);
                    }

                    case 2 -> manager.viewHabits();

                    case 3 -> {
                        manager.viewHabits();
                        System.out.print("Enter habit number: ");
                        int index = sc.nextInt();
                        manager.markHabitDone(index);
                    }

                    case 4 -> {
                        try {
                            manager.saveToFile();
                        } catch (IOException e) {
                            System.out.println("Error saving habits.");
                        }
                        System.out.println("Habits saved. Goodbye!");
                        return;
                    }
                }
            }
        }
    }
}
