public class Main {
    public static void main(String[] args) {
        IncomeService service = new IncomeService ();
        int sum = 1_999;
        double income = service.calculate(sum);
        System.out.println(income);
    }
}
