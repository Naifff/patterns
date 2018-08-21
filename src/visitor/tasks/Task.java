package visitor.tasks;

import visitor.visitor.Visitor;

public interface Task {
    public void move(int x, int y);
    public void doWork();
    public String accept(Visitor visitor);
}
