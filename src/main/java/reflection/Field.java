package reflection;

import java.util.List;

public class Field {
    String type;
    String name;
    List<String> assigment;
    // если правая часть составная, то мы ее храним как набор инструкций


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAssigment() {
        return assigment;
    }

    public void setAssigment(List<String> assigment) {
        this.assigment = assigment;
    }

    public Field(String type, String name, List<String> assigment) {
        this.type = type;
        this.name = name;
        this.assigment = assigment;
    }
}
