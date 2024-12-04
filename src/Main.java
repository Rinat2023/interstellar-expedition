import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Создаем экипаж
        Pilot pilot = new Pilot("Алексей", 100);
        Scientist scientist = new Scientist("Мария", 80);
        Engineer engineer = new Engineer("Иван", 90);

        Random random = new Random();

        for (int hour = 0; hour < 3; hour++) {
            System.out.println("\nЧас " + (hour + 1) + ":");

            int event = random.nextInt(3); // случайное событие
            switch (event) {
                case 0 -> System.out.println("Все идет по плану.");
                case 1 -> {
                    System.out.println("Случилась поломка! Инженеру нужно работать.");
                    engineer.performDuty();
                    engineer.doSpecialDuty();
                }
                case 2 -> {
                    System.out.println("Члены экипажа чувствуют усталость. Все отдыхают.");
                    pilot.rest();
                    scientist.rest();
                    engineer.rest();
                }
            }

            pilot.performDuty();
            pilot.doSpecialDuty();

            scientist.performDuty();
            scientist.doSpecialDuty();

            engineer.performDuty();
            engineer.doSpecialDuty();
        }

        System.out.println("\nДень завершен. Экипаж возвращается к базовым задачам.");
    }
}