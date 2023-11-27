public class Jogador extends Staff {

    private boolean wonLeague;

    public Jogador(int salary, boolean wonLeague) {
        super(salary);
        this.wonLeague = wonLeague;
    }

    @Override
    public int salaryPerYear() {
        salaryPerYear = salary*14;
        int annualUpgrade = (int) (!wonLeague ? salary + (salary * 0.05) : salary + (salary * 0.20));
        return salaryPerYear + annualUpgrade;
    }
}
