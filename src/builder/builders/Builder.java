package builder.builders;

import builder.components.*;

public interface Builder {
    public void setType(Type type);
    public void setLifetime(Lifetime lifetime);
    public void setResponsible(Responsible responsible);
    public void setState(State state);
}
