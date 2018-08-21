package visitor.tasks;

import visitor.visitor.Visitor;

public class Problem extends Incident {
    private int typeOfWork;

    public Problem(int id, int userId, int officeId, int typeOfWork) {
        super(id, userId, officeId);
        this.typeOfWork = typeOfWork;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitProblem(this);
    }

    public int getTypeOfWork() {
        return typeOfWork;
    }
}
