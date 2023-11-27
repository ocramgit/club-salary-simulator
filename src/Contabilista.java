public class Contabilista extends Staff{

    public Contabilista(int salary) {
        super(salary);
    }

    @Override
    public int salaryPerYear() {
        salaryPerYear = salary*14;
        return salaryPerYear;
    }
}
