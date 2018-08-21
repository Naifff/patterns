package visitor.visitor;

import visitor.tasks.*;

public class XMLExportVisitor implements Visitor{
    public String export(Task... args) {
        StringBuilder sb = new StringBuilder();
        for (Task task : args) {
            sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
            sb.append(task.accept(this)).append("\n");
            System.out.println(sb.toString());
            sb.setLength(0);
        }
        return sb.toString();
    }

    public String visitIncident(Incident incident) {
        return "<incident>" + "\n" +
                "    <id>" + incident.getId() + "</id>" + "\n" +
                "    <userId>" + incident.getUserId() + "</userId>" + "\n" +
                "    <officeId>" + incident.getOfficeId() + "</officeId>" + "\n" +
                "</incident>";
    }

    public String visitProblem(Problem problem) {
        return "<problem>" + "\n" +
                "    <id>" + problem.getId() + "</id>" + "\n" +
                "    <userId>" + problem.getUserId() + "</userId>" + "\n" +
                "    <officeId>" + problem.getOfficeId() + "</officeId>" + "\n" +
                "    <typeOfWork>" + problem.getTypeOfWork() + "</typeOfWork>" + "\n" +
                "</problem>";
    }

    public String visitOther(Other other) {
        return "<other>" + "\n" +
                "    <id>" + other.getId() + "</id>" + "\n" +
                "    <userId>" + other.getUserId() + "</userId>" + "\n" +
                "    <officeId>" + other.getOfficeId() + "</officeId>" + "\n" +
                "    <firstCase>" + other.getFirstCase() + "</firstCase>" + "\n" +
                "    <secondCase>" + other.getSecondCase() + "</secondCase>" + "\n" +
                "</other>";
    }

   }
