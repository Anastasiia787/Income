public class IncomeService {
        double calculate(int sum){
            double percent = 3;
            double income = sum * percent / 100;

            int limit = 3_000;
            if (income > limit) {
                income = limit;
            }
            return income;
        }
    }

