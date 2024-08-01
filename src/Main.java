import java.util.Scanner;

//Основные оперерации, синтаксис

//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print("World");
//        System.out.print("!");
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello\nWorld!");
//    }
//}

/* это
многострочный
комментарий

 */

//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Hello\"\n\tWorld!");
//    }
//}

//Переменные и типы данных

//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Переменные и типы данных");
//
////      int age;
//        int age = 56;
////        age = 55;
//
//
//
//        System.out.println(age);
//        age = 45;
//        System.out.println("Возраст " + age + '.');
//
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Переменные и типы данных");
//
//
////        Как обозначить переменные в зависимоти от длины числа. Для byte меньше всего требуется оперативной памяти и соответственно самое короткое число можно прописать
//        byte age = 56;
//        short num = 22000;
//        int num1 = 220000000;
//        long num2 = 220000000;
//
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println("Переменные и типы данных");
//
////        переменная число с точкой
//        float num = 4.252552f;
//
////        переменная один символ
//        char ch = '5';
//        //        переменная один символ
//        String user_name = "Aleks";
//
////        переменная булевые значения
//        boolean isHappy = false;
//
//        System.out.println(isHappy);
//    }
//}

//// запрос ввода от пользователя
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите ваше имя ");
//        scan.nextLine();
//    }
//}

// запрос ввода от пользователя, добавление введённого в перменную и вывод этой переменной
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите ваше имя ");
//        String username = scan.nextLine();
//        System.out.print("Hi, " + username);
//    }
//}

// запрос ввода от пользователя числовых значений метод int
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//    }
//}

// различные методы для запроса ввода данных
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        byte num1 = scan.nextByte();
//        boolean f = scan.nextBoolean();
//        float a = scan.nextFloat();
//    }
//}

// операция сложения(вычитания, деления, умножения) над числами
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        short num = 5, num2 = 1;
//        int res = num + num2;
//        System.out.println("Результат: " + res);
//    }
//}

// калькулятор
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число1 ");
        float num = scan.nextFloat();

        System.out.print("Введите число2 ");
        float num2 = scan.nextFloat();

        float res = num + num2;
        float res1 = num - num2;
        float res2 = num * num2;
        float res3 = num / num2;


        System.out.println("Результат ");
        System.out.println(res + "\n" + res1 + "\n" +res2 + "\n" +res3 + "\n" );

    }
}

