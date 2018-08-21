package proxy.library;

import java.util.HashMap;

public interface ThirdPartyHelpdeskLib {
    public HashMap<String, Task> allTasks();

    public Task getTask(String taskId);
}
