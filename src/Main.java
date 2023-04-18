import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
/*1.Создать Enum BlackList 3enum (1.Terrorist 2.Extremist 3.Отмывальщики денег)
у Enum есть поля List - List<String> который содержить в себе строки "Name Lastname"
2. Создаем Scanner который принимает одну строку Имя и Фамилия через пробел3.Сравнит ФИО со всеми списками
4.Если совпадение в террористах и экстремистах выводим, что пользователь заблокированесли в отмывальщиках, то добавление в список под наблюдение
и распечатываем список под наблюдением на консоль*/

public class Main {
    public static void main(String[] args) {
        List<String> observation = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name and Lastname");
        String name = sc.nextLine();

        if (BlackList.EXSTREMISTS.getList().contains(name)||BlackList.TERRORISTS.getList().contains(name)){
            System.out.println("This person is blocked");
        }else if (BlackList.OTMYVALSHIK.getList().contains(name)){
            observation.add(name);
            System.out.println("List of people under observation ->" + observation);
        }else {
            System.out.println("Thank you for registration " + name);
        }



        }
    }
