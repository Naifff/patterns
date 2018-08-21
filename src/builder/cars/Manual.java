package builder.cars;

import builder.components.*;

public class Manual {
    private final Type type;
    private final int seats;
    private final Lifetime lifetime;
    private final Responsible responsible;
    private final State state;

    public Manual(Type type, int seats, Lifetime lifetime, Responsible responsible,
                  State state) {
        this.type = type;
        this.seats = seats;
        this.lifetime = lifetime;
        this.responsible = responsible;
        this.state = state;
    }

    public String print() {
        String info = "";
        info += "Type of task: " + type + "\n";
        info += "Lifetime: count - " + lifetime.getCount() + "; past - " + lifetime.getPast() + "\n";
        info += "Responsible: " + responsible + "\n";
        if (this.state != null) {
            info += "Task: Started" + "\n";
        } else {
            info += "Task: N/A" + "\n";
        }
        return info;
    }
}
