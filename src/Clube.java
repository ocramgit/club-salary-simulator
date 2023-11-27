import java.util.ArrayList;
import java.util.List;

public class Clube {
    private List<Staff> funcionarios = new ArrayList<>();
    private int savingsBalance;
    private int balance;
    private int totalPaid;

    public Clube(int savingsBalance, int balance){
        funcionarios.add(new Presidente(30000));
        funcionarios.add(new Jogador(5000, false));
        funcionarios.add(new Jogador(5000, false));
        funcionarios.add(new Jogador(5000, false));
        funcionarios.add(new Jogador(5000, false));
        funcionarios.add(new ApanhaBolas(0,57, 20));
        funcionarios.add(new Segurança(1700, 9));
        funcionarios.add(new Segurança(1700, 2));
        funcionarios.add(new Contabilista(5500));
        this.savingsBalance = savingsBalance;
        this.balance = balance;
    }

    public Clube() {}

    public void payStaff() {
        for (Staff funcionario : funcionarios) {
            totalPaid += funcionario.salaryPerYear();
            if(balance >= funcionario.salaryPerYear() || savingsBalance >= funcionario.salaryPerYear()) {

                if (balance >= funcionario.salaryPerYear()) {
                    balance -= funcionario.salaryPerYear();
                }

                if (savingsBalance >= funcionario.salaryPerYear()) {
                    savingsBalance -= funcionario.salaryPerYear();
                }
            } else {
                balance -= funcionario.salaryPerYear();
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getSavingsBalance() {
        return savingsBalance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getTotalPaid() {
        return totalPaid;
    }
}
