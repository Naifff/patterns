package builder;

import builder.builders.TaskBuilder;
import builder.builders.TaskManualBuilder;
import builder.tasks.Task;
import builder.tasks.Manual;
import builder.user.User;

public class Demo {
    public static void main(String[] args) {
        User user = new User();

        TaskBuilder builder = new TaskBuilder();
        user.constructIncident(builder);

        Task task = builder.getResult();
        System.out.println("Task built:\n" + task.getType());

        TaskManualBuilder manualBuilder = new TaskManualBuilder();

        user.constructIncident(manualBuilder);
        Manual taskManual = manualBuilder.getResult();
        System.out.println("\nTask manual built:\n" + taskManual.print());
    }
}
