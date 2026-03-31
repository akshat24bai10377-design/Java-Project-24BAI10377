# Habit Tracker (Java)

## Introduction

This project is a simple Habit Tracker built using Java. I created it as part of my BYOP (Bring Your Own Project) to solve a real problem I personally face — staying consistent with daily habits like studying, working out, or reducing distractions.

The idea is simple: if you can track your habits and see your streak, it becomes easier to stay consistent.

---

## Features

* Add new habits
* View all habits
* Mark habits as completed for the day
* Track streak count
* Data is saved in a file (`habits.txt`)

---

## How It Works

The program is menu-driven and runs in the terminal.

Each habit has:

* A name
* A streak value
* A daily completion status

When a habit is marked as done, its streak increases. The data is stored in a file so it remains saved even after closing the program.

---

## Project Structure

```
HabitTracker/
│── src/
│   ├── Main.java
│   ├── Habit.java
│   ├── HabitManager.java
│── habits.txt
│── README.md
```

---

## How to Run

Make sure Java is installed on your system.

### Step 1: Compile

```
javac src/Main.java src/Habit.java src/HabitManager.java
```

### Step 2: Run

```
java -cp src Main
```

---

## Technologies Used

* Java
* Object-Oriented Programming (Classes and Objects)
* ArrayList
* File Handling

---

## Challenges Faced

While building this project, I faced some issues with file handling, especially when loading data correctly from the file. It took some debugging to fix the format and make sure everything loads properly.

Also, implementing the streak logic so that it behaves correctly required some thinking.

---

## What I Learned

* How to structure a Java project using multiple classes
* Practical use of ArrayList
* File handling in Java
* Writing a menu-driven program

---

## Future Improvements

* Add a GUI using Java Swing
* Add proper date-based tracking
* Show statistics like longest streak

---

## Author

Your Name
(BYOP Project Submission)
