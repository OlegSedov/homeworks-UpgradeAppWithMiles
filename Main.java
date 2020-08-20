public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        // В предложенном вами коде была переменная int price, хотя функция принимает переменную cost
        // Пришлось изменить имя переменной на cost
        int cost = 42_369;
        // Соответственно, в service.calculate(price) тоже меняем на (cost)
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}