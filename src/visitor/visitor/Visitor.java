package visitor.visitor;

import visitor.tasks.Problem;
import visitor.tasks.Incident;
import visitor.tasks.Other;

public interface Visitor {
    public String visitIncident(Incident incident);

    public String visitProblem(Problem problem);

    public String visitOther(Other other);
}
