package clases;

public class Habit {
	private int id;
    private int userId;
    private String name;
    private boolean completed;

    public Habit(int id, int userId, String name, boolean completed) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.completed = completed;
    }

    public int getId() { return id; }
    public int getUserId() { return userId; }
    public String getName() { return name; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() { this.completed = true; }
}
