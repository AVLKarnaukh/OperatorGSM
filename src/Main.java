public class Main {
    public static void main(String[] args) {
        int initialAccount = 100;
        int replenishmentAmount = 1100;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }
        int finalAccount = initialAccount + replenishmentAmount + bonus;

        System.out.println("Баланс: " + finalAccount);
        System.out.println("Бонус : " + bonus);


    }
}
