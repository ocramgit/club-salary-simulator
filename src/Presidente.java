public class Presidente extends Staff {

    private final int bonus = 50000;

    public Presidente(int salary) {
        super(salary);
    }

    @Override
    public int salaryPerYear() {
        salaryPerYear = salary*14;
        return salaryPerYear + bonus;
    }
}
