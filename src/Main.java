public class Main {
    public static void main(String[] args) {
        Clube clube = new Clube(10000, 100000);
        clube.payStaff();
        System.out.println(clube.getBalance());
        System.out.println(clube.getSavingsBalance());

        System.out.println("Total pago em salários e bonus anuais: "+clube.getTotalPaid());
    }
}