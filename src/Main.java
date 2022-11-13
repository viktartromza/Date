import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Main { // Написать программу для вывода на консоль названия дня недели по введенной дате.
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.YYYY");
        String date = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = format.parse(date);
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));

       LocalDate currentDate = LocalDate.now(); // Написать программу для вывода на экран дату следующего вторника.
        for (int i = 0; i < 7; i++) {
            LocalDate currentDatePlus = currentDate.plusDays(i);
            DayOfWeek currentDayOfWeek = currentDatePlus.getDayOfWeek();
            if (Objects.equals(currentDayOfWeek.toString(), "TUESDAY")) {
                System.out.println(currentDatePlus);
                break;
            }
        }
    }
}