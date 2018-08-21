package builder.cars;

import builder.components.*;

public class Task {
    private final Type type;
    private final Lifetime lifetime;
    private final Responsible responsible;
    private final State state;

    public Task(Type type, Lifetime lifetime, Responsible responsible,
                State state) {
        this.type = type;
        this.lifetime = lifetime;
        this.responsible = responsible;
        this.state = state;
        this.state.setTask(this);
    }

    public Type getType() {
        return type;
    }

    public Lifetime getLifetime() {
        return lifetime;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public State getState() {
        return state;
    }
}
