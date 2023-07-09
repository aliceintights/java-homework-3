public class BonusMilesService {

    int price = 4357;
    int miles = 1;
    int bonus = 20;
    int endbonus = (price / bonus);
    public int calculate(int price) {
        int result;
        if (miles < bonus) {
            result = endbonus;
        } else  {
            result = 0;
        }
        return result;
    }
}