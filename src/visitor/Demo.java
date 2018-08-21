package visitor;

import visitor.tasks.*;
import visitor.visitor.XMLExportVisitor;

public class Demo {
    public static void main(String[] args) {
        Incident problem = new Incident(1, 10, 55);
        Problem incident = new Problem(2, 23, 15, 10);
        Other other = new Other(3, 10, 17, 20, 30);

        export(incident, other);
    }

    private static void export(Task... tasks) {
        XMLExportVisitor exportVisitor = new XMLExportVisitor();
        System.out.println(exportVisitor.export(tasks));
    }
}
