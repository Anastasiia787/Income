public class IncomeService {
        int calculate(int sum){
            int percent = 3;
            int income = sum * percent / 100;

            int limit = 3_000;
            if (income > limit) {
                income = limit;
            }
            return income;
        }
    }

