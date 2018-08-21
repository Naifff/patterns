package visitor.tasks;

import visitor.visitor.Visitor;

public class Other implements Task {
    private int id;
    private int userId;
    private int officeId;
    private int firstCase;
    private int secondCase;

    public Other(int id, int userId, int officeId, int firstCase, int secondCase) {
        this.id = id;
        this.userId = userId;
        this.officeId = officeId;
        this.firstCase = firstCase;
        this.secondCase = secondCase;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitOther(this);
    }

    @Override
    public void move(int userId, int officeId) {
    }

    @Override
    public void doWork() {
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getOfficeId() {
        return officeId;
    }

    public int getFirstCase() {
        return firstCase;
    }

    public int getSecondCase() {
        return secondCase;
    }
}
