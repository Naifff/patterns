package builder.builders;

import builder.cars.Task;
import builder.components.*;

public class TaskBuilder implements Builder{
    private Type type;
    private Lifetime lifetime;
    private Responsible responsible;
    private State state;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setLifetime(Lifetime lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    @Override
    public void setState(State state) {
        this.state = state;
    }

    public Task getResult() {
        return new Task(type, lifetime, responsible, state);
    }
}
