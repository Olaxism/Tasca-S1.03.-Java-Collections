package sprint_1.tasca_3.nivel_1.ejercici_1.classes;

public class Month {

    private String name;

    public Month (String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{'" + name + '\'' +
                '}';
    }
}
