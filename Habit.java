public class Habit {
    String name;
    int streak;
    boolean completedToday;


    @SuppressWarnings("unused")
    Habit(String name, int streak, boolean completedToday) {
        this.name = name;
        this.streak = streak;
        this.completedToday = completedToday;
    }

    @SuppressWarnings("unused")
    void markDone() {
        if (!completedToday) {
            streak++;
            completedToday = true;
        }
    }

    @Override
    public String toString() {
        return name + " | Streak: " + streak + " | Done today: " + completedToday;
    }
}