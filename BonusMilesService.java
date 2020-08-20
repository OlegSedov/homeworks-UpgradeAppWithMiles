public class BonusMilesService {
    // В main.java пришлось немного изменить код, чтобы все заработало.
    // Надеюсь, это не критично, и я все сдлеал правильно :)
    public int calculate(int cost) {
        int percent = 5;
        int miles = cost * percent / 100;
        return miles;
    }
}