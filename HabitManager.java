import java.io.*;
import java.util.*;

class HabitManager {

    ArrayList<Habit> habits = new ArrayList<>();

    void addHabit(String name) {
        habits.add(new Habit(name, 0, false));
    }

    void viewHabits() {
        if (habits.isEmpty()) {
            System.out.println("No habits added.");
            return;
        }

        for (int i = 0; i < habits.size(); i++) {
            System.out.println(i + ". " + habits.get(i));
        }
    }

    void markHabitDone(int index) {
        if (index >= 0 && index < habits.size()) {
            habits.get(index).markDone();
        } else {
            System.out.println("Invalid habit number.");
        }
    }

    void saveToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("habits.txt"));

        for (Habit h : habits) {
            bw.write(h.name + "," + h.streak + "," + h.completedToday);
            bw.newLine();
        }

        bw.close();
    }

    void loadFromFile() throws IOException {

        File file = new File("habits.txt");
        if (!file.exists()) return;

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String name = data[0];
            int streak = Integer.parseInt(data[1]);
            boolean completed = Boolean.parseBoolean(data[2]);

            habits.add(new Habit(name, streak, completed));
        }

        br.close();
    }

    ArrayList<Habit> getHabits() {
        return habits;
    }
}
