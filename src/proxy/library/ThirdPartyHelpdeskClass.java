package proxy.library;

import java.util.HashMap;

public class ThirdPartyHelpdeskClass implements ThirdPartyHelpdeskLib {
    @Override
    public HashMap<String, Task> allTasks() {
        connectToServer("http://www.noname.com");
        return getRandomTask();
    }

    @Override
    public Task getTask(String taskId) {
        connectToServer("http://www.noname.com/" + taskId);
        return getSomeTask(taskId);
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Task> getRandomTask() {
        System.out.print("Downloading all... ");

        experienceNetworkLatency();
        HashMap<String, Task> hmap = new HashMap<String, Task>();
        hmap.put("task1", new Task("task1", "userh have no LAN"));
        hmap.put("task3", new Task("task3", "PC not started"));
        hmap.put("task999", new Task("task999", "DHCP error"));
        hmap.put("task12345", new Task("task12345", "nothing work"));
        hmap.put("task234567", new Task("task234567", "HELPME AAAAA!!!!!"));

        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Task getSomeTask(String taskId) {
        System.out.print("Downloading task... ");

        experienceNetworkLatency();
        Task task = new Task(taskId, "Some task title");

        System.out.print("Done!" + "\n");
        return task;
    }
}
