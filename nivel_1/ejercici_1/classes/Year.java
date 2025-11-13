package sprint_1.tasca_3.nivel_1.ejercici_1.classes;

import java.util.ArrayList;
import java.util.List;

public class Year {

    private ArrayList<Month> months;

    public Year() {
        this.months = new ArrayList<>();
    }

    public List<Month> getMonths() {
        return months;
    }

    public void addMonth(Month month) {
        if (month == null) {
            System.out.println("Deberia haber algun mes para ser agregado");
        }
        months.add(month);
    }

    @Override
    public String toString() {
        return "Año {" +
                "Meses= " + months +
                '}';
    }
}