package proxy.downloader;

import proxy.library.Task;
import proxy.library.ThirdPartyHelpdeskLib;

import java.util.HashMap;

public class HelpdeskDownloader {
    private ThirdPartyHelpdeskLib api;

    public HelpdeskDownloader(ThirdPartyHelpdeskLib api) {
        this.api = api;
    }

    public void loadTaskPage(String taskId) {
        Task task = api.getTask(taskId);
        System.out.println("\n-------------------------------");
        System.out.println("Task page");
        System.out.println("ID: " + task.id);
        System.out.println("Title: " + task.title);
        System.out.println("Task: " + task.data);
        System.out.println("-------------------------------\n");
    }

    public void loadAllTasks() {
        HashMap<String, Task> list = api.allTasks();
        System.out.println("\n-------------------------------");
        System.out.println("All tasks");
        for (Task task : list.values()) {
            System.out.println("ID: " + task.id + " / Title: " + task.title);
        }
        System.out.println("-------------------------------\n");
    }
}
