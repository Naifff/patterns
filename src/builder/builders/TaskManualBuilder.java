package builder.builders;

import builder.cars.Manual;
import builder.components.*;

public class TaskManualBuilder implements Builder{
    private Type type;
    private int seats;
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

    public Manual getResult() {
        return new Manual(type, seats, lifetime, responsible, state);
    }
}
