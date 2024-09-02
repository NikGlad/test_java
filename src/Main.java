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
//

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
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Введите число1 ");
//        float num = scan.nextFloat();
//
//        System.out.print("Введите число2 ");
//        float num2 = scan.nextFloat();
//
//        float res = num + num2;
//        float res1 = num - num2;
//        float res2 = num * num2;
//        float res3 = num / num2;
//
//
//        System.out.println("Результат ");
//        System.out.println(res + "\n" + res1 + "\n" +res2 + "\n" +res3 + "\n" );
//
//    }
//}

//условные операторы

//public class Main {
//    public static void main(String[] args) {
//        int age = 25;
//        if(age > 0) {
//            if(age > 16) {
//                System.out.println("Welcome!");
//            } else {
//                System.out.println("Too Young");
//            }
//        } else {
//            System.out.println("Error");
//        }
//    }
//}

//условные операторы

//public class Main {
//    public static void main(String[] args) {
//        int age = 25;
//        if(age > 0) {
//            if(age > 16) {
//                System.out.println("Welcome!");
//            } else {
//                System.out.println("Too Young");
//            }
//        } else {
//            System.out.println("Error");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 15, b = 10;
//        if (a > b)  {
//            System.out.println("yes");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int a = 15, b = 10;
//        boolean isHasCar = false;
//        if (isHasCar == false && a != b)  {
//            System.out.println("yes");
//        } else if (a == b) {
//            System.out.println("r");
//        } else {
//            System.out.println("no");
//        }
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите роль ");
//        String role = scanner.nextLine();
//        System.out.println("Введите пароль ");
//        String pass = scanner.nextLine();
//        if(role.equals("Admin") && pass.equals("1")) {
//            System.out.println("Все пользователи ");
//        } else {
//            System.out.println("Привет, как вас зовут ");
//            String name = scanner.nextLine();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//    Scanner scanner = new Scanner(System.in);
//    int num = scanner.nextInt();
//    switch (num){
//        case 1:
//            System.out.println("Ok");
//            break;
//        case 2:
//            System.out.println("Okey");
//            break;
//        case 3:
//            System.out.println("Okeushki");
//            break;
//        default:
//            System.out.println("No");
//    }
//    }
//}

//калькулятор услловные операторы

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 1 число ");
//        int num1 = scanner.nextInt();
//
//        System.out.println("Введите 2 число");
//        int num2 = scanner.nextInt();
//
//        System.out.println("Действие ");
//        String action = scanner.nextLine();
//        action = scanner.nextLine();
//
//        int res;
//
//        switch (action) {
//            case "+":
//                res = num1 + num2;
//                System.out.println("Рузультат" + res);
//                break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("Рузультат" + res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("Рузультат" + res);
//                break;
//            case "/":
//                if(num2 == 0)
//                    System.out.println("Error");
//                else {
//                    res = num1 / num2;
//                    System.out.println("Рузультат" + res);
//                    break;
//                }
//            default:
//                System.out.println("Вы что то не то ввели");
//
//
//
//
//        }
//    }
//}




//Цикл for

//public class Main {
//    public static void main(String[] args) {
//        for(int x = 1; x <=5; x++) {
//            System.out.println(x);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new
//                Scanner(System.in);
//        int n = scanner.nextInt();
//        for (int i = 1; i <=n; i++) {
//            System.out.println("Welcome");
//        }
//    }
//}



/*
Измерим температуру тела
*/
//
//public class Main {
//    private static boolean isHigh;
//    private static boolean isLow;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double bodyTemperature = scanner.nextDouble();
//        isHigh = bodyTemperature > 37;
//        isLow = bodyTemperature < 36;
//        if (isHigh) {
//            System.out.println("температура тела высокая");
//        } else if (isLow) {
//            System.out.println("температура тела низкая");
//        } else {
//            System.out.println("температура тела нормальная");
//        }
//    }
//}

//сравнение строк и строк по ссылке

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string1 = scanner.nextLine();
//        String string2 = scanner.nextLine();
//
//        if (string1.equals(string2)) {
//            System.out.println("строки одинаковые");
//        } else {
//            System.out.println("строки разные");
//        }
//    }
//}

//public class Main {
//    public static String string1 = "Амиго";
//    public static String string2 = string1;
//    public static String string3 = new String(string1);
//
//    public static void main(String[] args) {
//        String same = "ссылки на строки одинаковые";
//        String different = "ссылки на строки разные";
//        if (string1 == string2) {
//            System.out.println(same);
//        }else{
//            System.out.println(different);
//        }
//        if (string2 == string3) {
//            System.out.println(same);
//        }else{
//            System.out.println(different);
//        }
//        if (string1 == string3) {
//            System.out.println(same);
//        }else{
//            System.out.println(different);
//        }
//    }
//}

//public class Main {
//    public static String secret = "AmIGo";
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string1 = scanner.nextLine();
//        if (string1.equalsIgnoreCase(secret)) {
//            System.out.println("доступ разрешен");
//        } else{
//            System.out.println("доступ запрещен");
//        }
//    }
//}

//кредитный калькулятор

//public class Main
//{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int  amount = scanner.nextInt();
//        for(int i = 0; i < 3; i++) {
//            amount = amount - (int) Math.ceil(amount*0.1);
//
//        }
//        System.out.println(amount);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        String text = " любит меня.";
//
//        Scanner scanner = new Scanner(System.in);
//        String result = scanner.nextLine() + text;
//        int i = 1;
//        while (i <= 10) {
//            System.out.println(result);
//            i++;
//        }
//    }
//}

/*
Суммирование
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        boolean isExit = false;
//        while (!isExit) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                sum = sum + number;
//            } else if (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                if (line.equals("ENTER")) {
//                    isExit = true;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}

/*
Незаполненный прямоугольник
*/

//public class Main {
//    public static void main(String[] args) {
//        int height = 1;
//        while (height <= 10) {
//            int width = 1;
//            while (width <= 20) {
//                if (height == 1 || height == 10) {
//                    System.out.print('Б');
//                } else if (width == 1 || width == 20) {
//                    System.out.print('Б');
//                } else {
//                    System.out.print(' ');
//                }
//                width++;
//            }
//            System.out.println();
//            height++;
//        }
//    }
//}

/*
Показываем, что получаем
*/
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        while (true) {
//            String s = console.nextLine();
//            if (s.equals("enough")) {
//                break;
//            }
//            System.out.println(s);
//        }
//    }
//}

/*
Сумма чисел, не кратных 3
*/

//public class Main {
//    public static void main(String[] args) {
//        int sum = 0;
//        int number = 0;
//        while (number <= 100) {
//            if (number % 3 == 0) {
//                number++;
//                continue;
//            }
//            sum = sum + number;
//            number++;
//        }
//        System.out.println(sum);
//    }
//}

/*
Минимум из введенных чисел
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int min = Integer.MAX_VALUE;
//        while (console.hasNextInt()){
//            int x = console.nextInt();
//            if (x < min);
//            min = x;
//            System.out.println(min);
//        }
//
//    }
//}


/*
Максимум из введенных чисел
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//
//        int max = Integer.MIN_VALUE;
//        while (console.hasNextInt()) {
//            int x = console.nextInt();
//            if (x % 2 == 0 && x > max) {
//                max = x;
//            }
//        }
//        System.out.println(max);
//
//        }
//
//}


/*
Второе минимальное число из введенных
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//
//        int min = Integer.MAX_VALUE;
//        int secondMin = Integer.MAX_VALUE;
//
//        while (console.hasNextInt()) {
//            int tmp = console.nextInt();
//            if (tmp < min) {
//                secondMin = min;
//                min = tmp;
//            } else if (tmp > min && tmp < secondMin) {
//                secondMin = tmp;
//            }
//        }
//
//        System.out.println(secondMin);
//    }
//}


/*
Четные числа
*/

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i < 16; i++)
//            if (i % 2 == 0)
//                System.out.println(i);
//
//    }
//}

/*
Сумма кратных чисел
*/
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        int multiple = scanner.nextInt();
//
//        int sum = 0;
//        for (int i = start; i < end; i++) {
//            if (i % multiple != 0) {
//                continue;
//            }
//            sum = sum + i;
//        }
//            System.out.println(sum);
//    }
//}

//Рисуем на экране с помощью цикла for

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++)
//        {
//            int starCount = 10 - i;
//            for (int j = 0; j < starCount; j++)
//                System.out.print("*");
//            System.out.println();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//                for (int i = 0; i < 10; i++)
//        {
//            int starCount = i + 1;
//            for (int j = 0; j < starCount; j++)
//                System.out.print("8");
//            System.out.println();
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        String s;
//        do
//        {
//            s = console.nextLine();
//        }
//        while (!s.equals("exit"));
//    }
//}

/*
Хорошего не бывает много
*/
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String string = scanner.nextLine();
//        int number = scanner.nextInt();
//
//        do {
//            System.out.println(string);
//            number--;
//        } while (number > 0 && number < 4);
//
//    }
//}

/*
Площадь круга
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int radius = scanner.nextInt();
//        double S = 3.14 * radius * radius;
//        int x = (int)(S);
//        System.out.println(x);
//
//    }
//}

/*
Share a Coke
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int batle = scanner.nextInt();
//        int people = scanner.nextInt();
//        double res = batle * 1.0 / people;
//        System.out.println(res);
//
//    }
//}

/*
Скорость ветра
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int V = scanner.nextInt();
//        int res = (int) Math.round(V * 3.6);
//        System.out.println(res);
//    }
//}

/*
Стакан наполовину пуст или наполовину полон?
*/

public class Main {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean i = scanner.nextBoolean();
        if (i == true)
            System.out.println((int)Math.ceil(glass));
        else if (i == false)
            System.out.println((int)Math.floor(glass));
    }
}

