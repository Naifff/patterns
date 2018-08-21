package visitor.tasks;

import visitor.visitor.Visitor;

public class Incident implements Task {
    private int id;
    private int userId;
    private int officeId;

    public Incident() {
    }

    public Incident(int id, int userId, int officeId) {
        this.id = id;
        this.userId = userId;
        this.officeId = officeId;
    }

    @Override
    public void move(int userId, int officeId) {
    }

    @Override
    public void doWork() {
    }

    public String accept(Visitor visitor) {
        return visitor.visitIncident(this);
    }

    public int getUserId() {
        return userId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public int getId() {
        return id;
    }
}
