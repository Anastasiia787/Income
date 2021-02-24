public class Main {
    public static void main(String[] args) {
        IncomeService service = new IncomeService ();
        int income = service.calculate(1_000);
        System.out.println(income);
    }
}
