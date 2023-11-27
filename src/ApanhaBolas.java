public class ApanhaBolas extends Staff{

    private final int nGames;
    private final int bonus;

    public ApanhaBolas(int salary, int nGames, int bonus) {
        super(salary);
        this.nGames = nGames;
        this.bonus = bonus;
    }


    @Override
    public int salaryPerYear() {
        return nGames * bonus;
    }
}
