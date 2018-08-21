package builder.director;

import builder.builders.Builder;
import builder.components.*;

public class User {
    public void constructIncident(Builder builder) {
        builder.setType(Type.INCIDENT);
        builder.setLifetime(new Lifetime(3.0, 0));
        builder.setResponsible(Responsible.SPP);
        builder.setState(new State());
    }

    public void constructProblem(Builder builder) {
        builder.setType(Type.PROBLEM);
        builder.setLifetime(new Lifetime(1.2, 0));
        builder.setResponsible(Responsible.SIIS);
        builder.setState(new State());
    }

    public void constructOther(Builder builder) {
        builder.setType(Type.OTHER);
        builder.setLifetime(new Lifetime(2.5, 0));
        builder.setResponsible(Responsible.OIT);
    }
}
