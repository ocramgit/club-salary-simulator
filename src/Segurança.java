public class Segurança extends Staff {
    private final int campInvader;
    private int bonus = 2000;

    public Segurança(int salary, int campInvader) {
        super(salary);
        this.campInvader = campInvader;
    }

    @Override
    public int salaryPerYear() {
        salaryPerYear = salary*14;
        for (int i = 0; i < campInvader; i++) {
            if(bonus >= 1000){
                bonus -= 20;
            }
        }
        return this.salary + bonus;
    }
}
