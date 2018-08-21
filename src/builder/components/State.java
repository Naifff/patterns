package builder.components;

import builder.tasks.Task;

public class State {
    private Task task;

    public void setTask(Task task) {
        this.task = task;
    }

    public void showStatus() {
        if (this.task.getLifetime().isStarted()) {
            System.out.println("Task is started");
        } else {
            System.out.println("Task isn't started");
        }
    }
}
