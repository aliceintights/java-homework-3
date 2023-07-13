public class BonusMilesService {

    public int calculate(int price) {
        int result;
        int miles = 1;
        int bonus = 20;
        if (miles < bonus) {
            result = price / bonus;
        } else {
            result = 0;
        }
        return result;
    }
}
