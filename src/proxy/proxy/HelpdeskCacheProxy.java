package proxy.proxy;

import proxy.library.Task;
import proxy.library.ThirdPartyHelpdeskClass;
import proxy.library.ThirdPartyHelpdeskLib;

import java.util.HashMap;

public class HelpdeskCacheProxy implements ThirdPartyHelpdeskLib {
    private ThirdPartyHelpdeskLib nonameService;
    private HashMap<String, Task> cacheTask = new HashMap<String, Task>();
    private HashMap<String, Task> cacheAll = new HashMap<String, Task>();

    public HelpdeskCacheProxy() {
        this.nonameService = new ThirdPartyHelpdeskClass();
    }

    @Override
    public HashMap<String, Task> allTasks() {
        if (cacheTask.isEmpty()) {
            cacheTask = nonameService.allTasks();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cacheTask;
    }

    @Override
    public Task getTask(String taskId) {
        Task task = cacheAll.get(taskId);
        if (task == null) {
            task = nonameService.getTask(taskId);
            cacheAll.put(taskId, task);
        } else {
            System.out.println("Retrieved task '" + taskId + "' from cache.");
        }
        return task;
    }

    public void reset() {
        cacheTask.clear();
        cacheAll.clear();
    }
}
