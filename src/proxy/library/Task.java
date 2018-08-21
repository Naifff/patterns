package proxy.library;

public class Task {
    public String id;
    public String title;
    public String data;

    Task(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random task.";
    }
}
