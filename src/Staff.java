public abstract class Staff extends Clube {

    int salary;
    int salaryPerYear;

    public Staff(int salary) {
        this.salary = salary;
    }

    public abstract int salaryPerYear();

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setSalaryPerYear(int salaryPerYear) {
        this.salaryPerYear = salaryPerYear;
    }

    public int getSalary() {
        return salary;
    }

    public int getSalaryPerYear() {
        return salaryPerYear;
    }
}
