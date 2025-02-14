import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.*;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import static java.util.Arrays.asList;

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
//
//public class Main {
//    public static void main(String[] args) {
//        double glass = 0.5;
//        Scanner scanner = new Scanner(System.in);
//        boolean i = scanner.nextBoolean();
//        if (i == true)
//            System.out.println((int) Math.ceil(glass));
//        else if (i == false)
//            System.out.println((int) Math.floor(glass));
//    }
//}

/*
Четные и нечетные ячейки массива
*/

//public class Main {
//    public static final String ODD = "Нечётный";
//    public static final String EVEN = "Чётный";
//    public static String[] strings = new String[5];
//
//    public static void main(String[] args){
//        strings[0] = EVEN;
//        strings[1] = ODD;
//        strings[2] = EVEN;
//        strings[3] = ODD;
//        strings[4] = EVEN;
//
//        System.out.print("index = 0");
//        System.out.println(" value = " + strings[0]);
//        System.out.print("index = 1");
//        System.out.println(" value = " + strings[1]);
//        System.out.print("index = 2");
//        System.out.println(" value = " + strings[2]);
//        System.out.print("index = 3");
//        System.out.println(" value = " + strings[3]);
//        System.out.print("index = 4");
//        System.out.println(" value = " + strings[4]);
//    }
//}


//смена знака на противоположный

//public class Main {
//    public static int[] array = new int[]{-1, 2, 3, -4, -5};
//
//    public static void main(String[] args) {
//        if (array[0] % 2 == 0) {
//            array[0] = -array[0];
//        }
//        if (array[1] % 2 == 0) {
//            array[1] = -array[1];
//        }
//        if (array[2] % 2 == 0) {
//            array[2] = -array[2];
//        }
//        if (array[3] % 2 == 0) {
//            array[3] = -array[3];
//        }
//        if (array[4] % 2 == 0) {
//            array[4] = -array[4];
//        }
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);
//        System.out.println(array[4]);
//    }
//}

/*
Объединяем массивы
*/

//public class Main {
//    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
//    public static int[] resultArray;
//
//    public static void main(String[] args) {
//        resultArray = new int[firstArray.length + secondArray.length];
//        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);
//        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);
//        for (int i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + ", ");
//        }
//    }
//}

/*
Обратный порядок вывода чисел в масиве
*/

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//
//        int[] data = new int[n];
//        for (int i = 0; i < n; i++) {
//            data[i] = scanner.nextInt();
//        }
//
//        if (n % 2 == 0) {
//            for (int i = data.length - 1; i >= 0; i--) {
//                System.out.println(data[i]);
//            }
//        } else {
//            for (int i = 0; i < data.length; i++) {
//                System.out.println(data[i]);
//            }
//        }
//    }
//}

/*
Минимальное из N чисел Solution
*/

//public class Main {
//    public static int[] array;
//
//    public static void main(String[] args) throws Exception {
//        Scanner console = new Scanner(System.in);
//        int n = console.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = console.nextInt();
//        }
//        int min = array[0];
//
//        for (int i = 1; i < n; i++) {
//            if (array[i] < min)
//
//                min = array[i];
//        }
//        System.out.println(min);
//    }
//}

/*
Минимальное из N чисел Solution
*/

//public class Main {
//public static int[] array;
//
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    int n = Integer.parseInt(scanner.nextLine());
//
//    array = new int[n];
//    for (int i = 0; i < n; i++) {
//        array[i] = Integer.parseInt(scanner.nextLine());
//    }
//
//    int min = array[0];
//    for (int i = 1; i < array.length; i++) {
//        int number = array[i];
//        if (number < min) {
//            min = number;
//        }
//    }
//    System.out.println(min);
//}
//}

/*
Максимальное из N чисел
*/
//
//public class Main {
//    public static int[] array;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = Integer.parseInt(scanner.nextLine());
//
//        array = new int[n];
//        for (int i = 0; array.length > i; i++) {
//            array[i] = Integer.parseInt(scanner.nextLine());
//        }
//
//        int max = array[0];
//        for (int i = 1; array.length > i; i++) {
//            int number = array[i];
//            if (max < number) {
//                max = number;
//            }
//        }
//        System.out.println(max);
//    }
//}

/*
Удаляем одинаковые строки
*/

//public class Main {
//    public static String[] strings;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        strings = new String[6];
//        String[] strings2 = new String[6];
//        for (int i = 0; i < 6; i++) {
//            strings[i] = strings2[i] = scanner.nextLine();
//        }
//        for (int i = 0; i < 6; i++) {
//            for (int n = 0; n < 6; n++) {
//                if (strings[i] != null && i != n && strings[i].equals(strings2[n])) {
//                    strings[i] = null;
//                }
//            }
//        }
//
//        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i] + ", ");
//        }
//    }
//}


/*
Таблица умножения
*/

//public class Main {
//
//    public static int[][] MULTIPLICATION_TABLE;
//
//    public static void main(String[] args) {
//
//        int[][] MULTIPLICATION_TABLE = new int[10][10];
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                MULTIPLICATION_TABLE[i - 1][j - 1] = i * j;
//                System.out.print(MULTIPLICATION_TABLE[i - 1][j - 1]);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}


/*
Треугольный массив
*/

//public class Main {
//
//    public static int[][] result = new int[10][];
//
//    public static void main(String[] args) {
//        for (int i = 0; i < result.length; i++) {
//            result[i] = new int[i + 1];
//            for (int j = 0; j < result[i].length; j++) {
//                result[i][j] = i + j;
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main {
//
//
//    public static void main(String[] args) {
//        int[][] matrix = new int[3][];
//        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
//        matrix[1] = new int[]{1, 2, 3};
//        matrix[2] = new int[]{1};
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++)
//                System.out.print(matrix[i][j] + " ");
//            System.out.println();
//        }
//    }
//}

/*
Создаем двумерный массив (добавление значений в масив)
*/

//public class Main {
//    public static int[][] multiArray;
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//
//        multiArray = new int[n][];
//        for (int i = 0; i < n; i++) {
//            int size = Integer.parseInt(scanner.nextLine());
//            multiArray[i] = new int[size];
//        }
//    }
//}

/*
Создаем мультимассив
*/

//public class Main {
//
//
//    public static int[][][] multiArray = new int[][][]{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}};
//
//    public static void main(String[] args) {
//        for (int i = 0; i < multiArray.length; i++) {
//            for (int j = 0; j < multiArray[i].length; j++) {
//                for (int k = 0; k < multiArray[i][j].length; k++) {
//                    System.out.print(multiArray[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println("----------");
//        }
//    }
//}

/*
Выводим массивы при помощи Arrays.toString
*/

//public class Main {
//
//    public static String[] strings = new String[]{"I", "love", "Java"};
//    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
//
//    public static void main(String[] args) {
//        String i = Arrays.toString(strings);
//            System.out.println(i);
//
//        String j = Arrays.toString(ints);
//            System.out.println(j);
//
//    }
//}

/*
Выводим двумерные массивы
*/

//public class Main {
//
//    public static String[][] strings = new String[][]{{"🙂", "🙂", "🙂", "🙂"}, {"🙃", "🙃", "🙃", "🙃"}, {"😋", "😋", "😋", "😋"}, {"😎", "😎", "😎", "😎"}};
//    public static int[][] ints = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//
//    public static void main(String[] args) {
//        String i = Arrays.deepToString(strings);
//            System.out.println(i);
//
//        String j = Arrays.deepToString(ints);
//            System.out.println(j);
//    }
//}


/*
Сравнение двумерных массивов
*/

//public class Main {
//
//    public static int[][] arrayFirst = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//    public static int[][] arraySecond = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//
//    public static void main(String[] args) {
//        if (Arrays.deepEquals(arrayFirst, arraySecond))
//            System.out.println(true);
//        else
//            System.out.println(false);
//
//    }
//}



/*
Заполняем массив
*/

//public class Main {
//    public static int[] array = new int[20];
//    public static int valueStart = 10;
//    public static int valueEnd = 13;
//
//    public static void main(String[] args) {
//        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//        Arrays.fill(array, 0, firstPart, valueStart);
//        Arrays.fill(array, firstPart, array.length, valueEnd);
//        System.out.println(Arrays.toString(array));
//    }
//}

/*
Делим массив
*/

//public class Main {
//
//    public static int[][] result = new int[2][];
//    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
//
//    public static void main(String[] args) {
//        int firstPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
//        result[0] = Arrays.copyOfRange(array, 0, firstPart);
//        result[1] = Arrays.copyOfRange(array, firstPart, array.length);
//        System.out.println(Arrays.deepToString(result));
//    }
//}

/*
Сортировка массива
*/
//
//public class Main {
//
//    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//
//    public static void main(String[] args) {
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//    }
//}

/*
Есть ли кто?
*/

//public class Main {
//
//    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
//    public static int element = 5;
//
//    public static void main(String[] args) {
//        int[] copy = Arrays.copyOf(array, array.length);
//        Arrays.sort(copy);
//        int index = Arrays.binarySearch(copy, element);
//        System.out.println(index >= 0);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int [ ] myArr = {6, 42, 3, 7};
//        int sum=0;
//        for(int x=0; x<myArr.length; x++) {
//            sum += myArr[x];
//        }
//        System.out.println(sum);
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int length = scanner.nextInt();
//        int[] array =  new int[length];
//        int sum = 0;
//        for (int i = 0; i < length; i++) {
//            array[i] = scanner.nextInt();
//
//            if (array[i] % 4 == 0)
//                sum += array[i];
//
//
//        }
//        System.out.println(sum);
//    }
//}

/*
Разделяй понятия
*/
//
//public class Main {
//    public static void main(String[] args) {
//        {printHydrogenInfo();}
//        {printJavaInfo();}
//    }
//
//    public static void printHydrogenInfo()
//    {
//        System.out.println("Водород:");
//        System.out.println("Это химический элемент периодической системы с обозначением H и атомным номером 1.");
//        System.out.println("Является самым легким элементом таблицы.");
//        System.out.println("Водород применяется в:");
//        System.out.println("-Химической промышленности;");
//        System.out.println("-Нефтеперерабатывающей промышленности;");
//        System.out.println("-Авиации;");
//        System.out.println("-Электроэнергетике.");
//    }
//
//
//    public static void printJavaInfo()
//    {
//        System.out.println("Остров Ява:");
//        System.out.println("Входит в состав Индонезии.");
//        System.out.println("На острове зародились государства Матарам, Маджапахит, Демак.");
//        System.out.println("Ява является самым населенным островом в мире:");
//        System.out.println("Общее население — 140 млн. человек.");
//        System.out.println("Плотность населения — 1061 чел/км.кв.");
//        System.out.println("Здесь производят один из знаменитых сортов кофе — Копи Лювак.");
//    }
//
//}

/*
Упорядоченная информация
*/

//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Я — поэт, зовусь я Цветик.");
//        System.out.println("От меня вам всем приветик.");
//    }
//}

//class Main
//{
//    public static void printLines(String text, int count)
//    {
//        for (int i = 0; i < count; i++)
//            System.out.println(text);
//    }
//
//    public static void main(String[] args)
//    {
//        printLines("Привет", 10);
//        printLines("Пока", 20);
//    }
//}

//class Main
//{
//    public static void printLines(String text, int count)
//    {
//        for (int i = 0; i < count; i++)
//            System.out.print(text);
//    }
//
//    public static void main(String[] args)
//    {
//        String text = "Привет";
//        int count = 10;
//        printLines(text, count);
//    }
//}

/*
Любимое блюдо
*/

//public class Main {
//
//    public static void main(String[] args) {
//        String firstName = "Ольга";
//        String lastName = "Киприяновна";
//        String favouriteDish = "Пельмени";
//        printPersonInfo(firstName, lastName, favouriteDish);
//    }
//
//    public static void printPersonInfo(String name, String surname, String meal){
//            String firstName = name;
//            String lastName = surname;
//            String favouriteDish = meal;
//
//        System.out.println("Краткое досье:");
//        System.out.println("Имя: " + name);
//        System.out.println("Фамилия: " + surname);
//        System.out.println("Любимое блюдо: " + meal);
//    }
//
//}

/*
Ливерпульская четверка
*/

//public class Main {
//    public static void main(String[] args) {
//        String navigator = "Джон";
//        String pilot = "Пол";
//        String secondPilot = "Джордж";
//        String flightEngineer = "Ринго";
//        createCrew(navigator, pilot, secondPilot, flightEngineer);
//    }
//
//    public static void createCrew(String navigator, String pilot, String secondPilot, String flightEngineer){
//        System.out.println("Четвёрка, которой предстоит покорить космос:");
//        System.out.println("Штурман: " + navigator);
//        System.out.println("Пилот: " + pilot);
//        System.out.println("Второй пилот: " + secondPilot);
//        System.out.println("Бортинженер: " + flightEngineer);
//    }
//}

/*
Правильный порядок
*/

//public class Main {
//
//    public static void main(String[] args) {
//        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
//        printArray(array);
//        reverseArray(array);
//        printArray(array);
//    }
//
//    public static void reverseArray(int[] array) {
//        for (int i = 0; i < array.length / 2; i++) {
//            int temp = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = temp;
//        }
//    }
//
//    public static void printArray(int[] array) {
//        for (int i : array) {
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }
//}

/*
Универсальный солдат
*/

//public class Main {
//
//    public static void main(String[] args) {
//
//    }
//
//    public static void universalMethod(){
//
//    }
//    public static void universalMethod(String str){
//
//    }
//    public static void universalMethod(String str, String str2){
//
//    }
//    public static void universalMethod(int[][] data, int value){
//
//    }
//    public static void universalMethod(int[] data, int value){
//
//    }
//    public static void universalMethod(int[][][] data, int value){
//
//    }
//    public static void universalMethod(int x, int y){
//
//    }
//    public static void universalMethod(int[][][][] data, int value){
//
//    }
//    public static void universalMethod(int[][][][][] data, int value){
//
//    }
//    public static void universalMethod(int[][][][][][] data, int value){
//
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        Scanner console = new Scanner(System.in);
//        int[] array = new int[10];
//        for (int i = 0; i < 10; i++) {
//            array[i] = console.nextInt();
//        }
//        int min = array[0];
//
//        for (int i = 1; i < 10; i++) {
//            if (array[i] < min)
//
//                min = array[i];
//        }
//        System.out.println(min);
//
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        int n = 0;
//
//        while (n < 5)
//        {
//
//            int m = 0;
//
//            while (m < 10)
//            {
//                System.out.print("Q");
//                m++;
//            }
//
//            System.out.println();
//
//            n++;
//
//        }
//    }
//}

/*
Знакомство с двумерным массивом
*/

//public class Main {
//
//    public static int[][] arrays = new int[2][3];    //создаём двумерный массив длиной 2 и 3
//    public static void main(String[] args) {         // psvm
//        for (int i = 0; i < arrays.length; i++) {    // делаем цикл перебора для первого значения масива, длиной не более длины масива(2)
//            for (int j = 0; j < arrays[i].length; j++) {     // делаем цикл перебора для второго значения масива, длиной не более длины масива(3)
//                arrays[i][j] = 1;                         // присваиваем значение двумерному масиву 1. т.е выведется 5 штук 1
//                System.out.println(arrays[i][j]);         // выводим значение двумерного массива
//            }
//
//        }
//
//    }
//
//    }

/*
Максимальный элемент
*/

//public class Main{
//    public static int[][] array= new int[3][3];   //создаём двумерный массив длиной 3 и 3
//
//    public static void main(String[] args) {      // psvm
//        Scanner sc = new Scanner(System.in);      // считываем с клавиатуры и помещаем в переменную sc
//        int max = Integer.MIN_VALUE;              // создаём переменную max и делаем Минимальную величина типа int. Меньше неё не будет
//
//        for (int i = 0; i < array.length; i++) {   // делаем цикл перебора для первого значения масива, длиной не более длины масива(3)
//            for (int j = 0; j < array[i].length; j++) {   // делаем цикл перебора для второго значения масива, длиной не более длины масива(3)
//                array[i][j] = sc.nextInt();          // присваиваем двумерному массиву значение считанного с клавиатуры, котора помещена в переменную sc
//                if (max < array[i][j]) {          //создаём условие если max < значений двумерного массива,
//                    max = array[i][j];            // то переменная max = значению двумерного массива
//                }
//            }
//
//        }
//        System.out.println(max);            // вывод максимального значения
//    }
//}

/*
Минимальная сумма
*/


//public class Main {
//    public static int[][] arrays = new int[3][3];
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[i].length; j++) {
//                arrays[i][j] = sc.nextInt();
//            }
//        }
//        int minSum = Integer.MAX_VALUE;
//        for (int j = 0; j < arrays[0].length; j++) {
//            int currentSum = 0;
//            for (int i = 0; i < arrays.length; i++) {
//                currentSum += arrays[i][j];
//            }
//            if (currentSum < minSum) {
//                minSum = currentSum;
//            }
//        }
//
//        for (int i = 0; i < arrays.length; i++) {
//            int currentSum = 0;
//            for (int j = 0; j < arrays[i].length; j++) {
//                currentSum += arrays[i][j];
//            }
//            if (currentSum < minSum) {
//                minSum = currentSum;
//            }
//
//        }
//        System.out.println(minSum);
//    }
//
//}

/*
Вот это переворот
 */
//public class Main {
//    public static int[][]arrays = new int[3][3];
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[0].length; j++) {
//                arrays[i][j] = scanner.nextInt();
//                }
//            }
//        for (int i = 0; i < arrays.length - 1; i++) {
//            for (int j = i + 1; j < arrays[0].length; j++) {
//                int temp = arrays[i][j];
//                arrays[i][j] = arrays[j][i];
//                arrays[j][i] = temp;
//            }
//        }
//        for (int i = 0; i < arrays.length; i++) {
//            for (int j = 0; j < arrays[0].length; j++) {
//                System.out.print(arrays[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

/*
Пирамида
 */

//public class Main {
//    public static char[][]array;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        array = new char[number][2 * number - 1];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                if (j < array.length - i - 1  || j > array[0].length - array.length + i) {
//                    array[i][j] = ' ';
//                } else{
//                    array[i][j] = '#';
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }
//    }
//
//}


/*
Вырезаем середину
 */

//public class Main {
//    public static char[][] chars = {
//            {'a', 'b', 'c', 'd', 'e', 'f'},
//            {'j', 'h', 'i', 'j', 'k', 'l'},
//            {'m', 'n', 'o', 'p', 'q', 'r'},
//            {'s', 't', 'u', 'v', 'w', 'x'}};
//
//    public static void main(String[] args) {
//        printArray();
//
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars[0].length; j++) {
//                if (i != 0 && i != chars.length - 1 && j != 0 && j != chars[0].length - 1) {
//                    chars[i][j] = '-';
//                }
//            }
//        }
//
//        printArray();
//    }
//
//    private static void printArray() {
//        for (int i = 0; i < chars.length; i++) {
//            for (int j = 0; j < chars[i].length; j++) {
//                System.out.print(chars[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}
//


//public class Main {
//    public static void main(String[] args) {
//        int[] x = new int[10];
//        for (int i = 0; i < x.length; i++)
//            x[i] = 999;
//        System.out.println(Arrays.toString(x));
//    }
//}



/*
Построим новый жилой комплекс JavaRush Towers
*/

//public class Main {
//    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
//    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
//    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";
//
//    public Main() {
//        System.out.println(SKYSCRAPER_WAS_BUILD);
//    }
//
//    public Main(int countOfFloors) {
//        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + countOfFloors);
//    }
//
//    public Main(String developer) {
//        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        Main skyscraperTower = new Main(50);
//        Main skyscraperSkyline = new Main("JavaRushDevelopment");
//    }
//}

/*
таблица умнажения
*/

//

//public class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i < 10; i++) {
//            for (int j = 2; j < 10; j++) {
//                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
//            }
//            System.out.println();
//        }
//    }
//}


// СПИСКИ И GENERIC


/*
Солнечная система
В 3020 году ученые научились выращивать новые планеты, одну из которых отправили в космос на орбиту Солнца.
Эта планета находится между Землей и Марсом. Реализуй метод createNewPlanet(String),
который должен добавлять переданную планету в список planets сразу после Земли.
Посмотри, как изменился порядок следования планет.
Методы main(), addPlanets() и print() не принимают участие в проверке.
*/

//public class Main {
//    public static ArrayList<String> planets = new ArrayList<>();
//
//    public static void main(String[] args) {
//        addPlanets();
//        print();
//        createNewPlanet("Звезда Смерти");
//        print();
//    }
//
//    public static void createNewPlanet(String planetName) {
//        planets.add(planets.indexOf("Земля") + 1, planetName);
//    }
//
//    public static void addPlanets() {
//        planets.add("Меркурий");
//        planets.add("Венера");
//        planets.add("Земля");
//        planets.add("Марс");
//        planets.add("Юпитер");
//        planets.add("Сатурн");
//        planets.add("Уран");
//        planets.add("Нептун");
//    }
//
//    public static void print() {
//        for (int i = 0; i < planets.size(); i++) {
//            System.out.println(String.format("%s — %d-я планета от Солнца", planets.get(i), (i + 1)));
//        }
//        System.out.println();
//    }
//}

/*
Прощай, Паскаль
В методе main найди и удали язык программирования Pascal из списка programmingLanguages.
*/

//public class Main {
//    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "Java", "Pascal", "JavaScript", "Ruby"));
//
//    public static void main(String[] args) {
//        for (int i = 0; i < programmingLanguages.size(); i++) {
//            if (programmingLanguages.get(i).equals("Pascal")) {
//                programmingLanguages.remove(i);
//                break;
//            }
//        }
//    }
//}

/*
Разбираем пирамиду бокалов
Задача простая: нужно разобрать пирамиду из бокалов, в чем нам поможет метод removeGlassesReverse.
Этот метод должен снимать каждый ряд, начиная сверху (с конца списка). Тебе нужно реализовать этот метод.
В тестировании тебе поможет метод main. Попробуй запустить программу и посмотреть на вывод.
*/
//
//public class Main {
//
//    private static ArrayList<String> initList() {
//        String glassTop     = "       🍷       ";
//        String glassSecond  = "      🍷🍷      ";
//        String glassThird   = "     🍷🍷🍷     ";
//        String glassFourth  = "    🍷🍷🍷🍷    ";
//        String glassFifth   = "   🍷🍷🍷🍷🍷   ";
//        String glassSixth   = "  🍷🍷🍷🍷🍷🍷  ";
//        String glassSeventh = " 🍷🍷🍷🍷🍷🍷🍷 ";
//        String glassEighth  = "🍷🍷🍷🍷🍷🍷🍷🍷";
//        ArrayList<String> list = new ArrayList<>();
//        list.add(glassEighth);
//        list.add(glassSeventh);
//        list.add(glassSixth);
//        list.add(glassFifth);
//        list.add(glassFourth);
//        list.add(glassThird);
//        list.add(glassSecond);
//        list.add(glassTop);
//        return list;
//    }
//
//    public static void print(ArrayList<String> glasses) {
//        for(int i = glasses.size() - 1; i >= 0; i--) {
//            System.out.println(glasses.get(i));
//        }
//    }
//
//    public static void removeGlassesReverse(ArrayList<String> glasses) {
//        System.out.println("Начинаем разбирать пирамиду...");
//
//        for (int i = glasses.size() - 1; i >= 0; i--) {
//            glasses.remove(i);
//        }
//
//        if(glasses.size() == 0) {
//            System.out.println("Пирамида разобрана!");
//        }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> glasses = initList();
//        print(glasses);
//
//        removeGlassesReverse(glasses);
//        print(glasses);
//    }
//}

/*
Вперед в будущее
В классе Solution есть поля number, string и метод main с объявленными в нем переменными.
 Тебе нужно заменить объявления переменных на var, где это возможно.
 Порядок следования переменных не должен меняться.
Пример: Scanner console = new Scanner(System.in);
Заменить на: var console = new Scanner(System.in);
*/

//public class Main {
//private int number = 54;
//        private String string = "string";
//
//        public static void main(String[] args) {
//            int integer = 22;
//            String string = "string";
//            int[] array = new int[5];
//            ArrayList<String> strings = new ArrayList<String>();
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            Integer maxValue = Integer.valueOf(Integer.MAX_VALUE);
//        }
//}

/*
Назад в прошлое
В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
а также починить геттер и сеттер поля intArray.
*/

//public class Main {
//    private var intArray = new int[4];
//
//    public var getIntArray() {
//        return intArray;
//    }
//
//    public void setIntArray(var intArray) {
//        this.intArray = intArray;
//    }
//
//    public static void main(String[] args) {
//        var solution = new Solution();
//        var string = new String("Hello");
//        var stringBuilder = new StringBuilder();
//    }
//}

/*
Shine bright like a diamond
В методе main создаются объекты разных типов.
В некоторых случаях тип элементов объекта можно опустить и просто использовать оператор diamond(<>).
Замени тип элементов объекта на оператор diamond там, где это возможно, не меняя левую часть выражений.
 Порядок следования переменных не должен меняться.
*/

//public class Main {
//
//    public static void main(String[] args) {
//        ArrayList<String> stringArrayList = new ArrayList<String>();
//        Stack<String> stack = new Stack<String>();
//        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
//        var exceptionsList = new ArrayList<Exception>();
//        var filesStack = new Stack<File>();
//    }
//}

/*
Охотники за привидением: в погоне за типами
В методе main создается и заполняется список разными объектами и передается методу checkElementsType(ArrayList<Object>).
Твоя задача — реализовать этот метод, который должен определить тип каждого элемента списка, а также:
Для типа String вызывать printString();
Для типа Integer вызывать printInteger();
Для типа Integer[] вызывать printIntegerArray();
Для всех остальных типов вызывать printUnknown().
Метод main не участвует в проверке.
*/

//public class Main {
//
//    public static void main(String[] args) {
//        var elements = new ArrayList<>();
//        elements.add("Привет");
//        elements.add(10);
//        elements.add(new Integer[15]);
//        elements.add(new LinkageError());
//
//        checkElementsType(elements);
//    }
//
//    public static void checkElementsType(ArrayList<Object> elements) {
//        for (int i = 0; i < elements.size(); i++) {
//            if (elements.get(i) instanceof String) {
//                printString();
//            } else if (elements.get(i) instanceof Integer) {
//                printInteger();
//            } else if (elements.get(i) instanceof Integer[]) {
//                printIntegerArray();
//            } else {
//                printUnknown();
//            }
//        }
//    }
//
//    public static void printString() {
//        System.out.println("Строка");
//    }
//
//    public static void printInteger() {
//        System.out.println("Целое число");
//    }
//
//    public static void printIntegerArray() {
//        System.out.println("Массив целых чисел");
//    }
//
//    public static void printUnknown() {
//        System.out.println("Другой тип данных");
//    }
//}

/*
Выводим в консоли разные типы
В классе Solution есть метод printAnything(ArrayList), который должен принимать список и выводить его содержимое в консоли.
Сейчас на вход принимается только список строк.
Твоя задача исправить метод так, чтобы принимался список с любыми типами данных (для этого нужно удалить соответствующий дженерик).
 Метод main не участвует в проверке.
 */

//public class Main {
//
//    public static void printAnything(ArrayList arrayList) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }
//    }
//
//    public static void main(String[] args) {
//        var arrayList = new ArrayList<>();
//        arrayList.add(15);
//        arrayList.add("Hello");
//        arrayList.add(154);
//        arrayList.add("string");
//
//        printAnything(arrayList);
//    }
//}

// COLLECTION

/*
Оформляем возврат

В классе Solution есть метод arrayToHashSet(String[]),
который должен из переданного массива вернуть HashSet<String> с теми же элементами.
 Метод main не участвует в проверке.
*/

//public class Main {
//    public static void main(String[] args) {
//        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("___________________________________");
//
//        HashSet<String> hashSet = arrayToHashSet(array);
//        for(String s : hashSet) {
//            System.out.println(s);
//        }
//    }
//
//    public static HashSet<String> arrayToHashSet(String[] strings) {
//        HashSet<String> hashSet = new HashSet<>();
//        for (int i = 0; i < strings.length; i++) {
//            hashSet.add(strings[i]);
//        }
//        return hashSet;
//    }
//}

/*
Проверка присутствия
В классе Solution есть метод checkWords(String),
который должен проверять наличие переданного слова в множестве words.
Если слово есть, то выводим в консоль: Слово [переданное слово] есть в множестве
Если нет: Слова [переданное слово] нет в множестве
Метод main не участвует в проверке.
Пример вывода: Слово Java есть в множестве
*/

//public class Main {
//    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));
//
//    public static void checkWords(String word) {
//        if (words.contains(word)) {
//            System.out.println(String.format("Слово %s есть в множестве", word));
//        } else {
//            System.out.println(String.format("Слова %s нет в множестве", word));
//        }
//    }
//
//    public static void main(String[] args) {
//        checkWords("JavaScript");
//        checkWords("Java");
//    }
//}

/*
Выводим в консоли элементы множества
В классе Solution есть метод print(HashSet<String>),
который должен выводить в консоли все элементы множества, используя iterator().
Метод main не участвует в проверке.
*/

//public class Main {
//
//    public static void print(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
//    }
//
//    public static void main(String[] args) {
//        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
//        print(words);
//    }
//}

/*
Переводим итератор в цикл for-each

В классе Solution есть методы printHashSet(HashSet<String>) и printList(ArrayList<String>),
которые выводят все элементы из переданных коллекций — списка и множества — с новой строки.
Твоя задача переписать методы на использование цикла for-each. Метод main не участвует в проверке.
*/

//public class Main {
//
//    public static void printList(ArrayList<String> words) {
//        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
//    }
//
//    public static void printHashSet(HashSet<String> words) {
//        Iterator<String> iterator = words.iterator();
//        while (iterator.hasNext()) {
//            String word = iterator.next();
//            System.out.println(word);
//        }
//    }
//
//    public static void main(String[] args) {
//        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
//        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
//        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
//        printList(wordsList);
//        System.out.println("__________________________________");
//        printHashSet(wordsHashSet);
//    }
//}

/*
Найти и обезвредить

В классе Solution объявлены методы, которые тебе нужно реализовать следующим образом:
removeBugWithFor(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug,
используя цикл for и счетчик.
removeBugWithWhile(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug,
 используя цикл while и метод iterator().
removeBugWithCopy(ArrayList<String>) - должен удалить строку из списка, если она содержит слово bug,
используя цикл for-each и копию списка.
В слове bug может быть разный регистр букв (BUg, BuG, и т.д.).
Метод main реализован для вашего кода и не участвует в проверке.
*/

//public class Main {
//    public static String bug = "bug";
//
//    public static void main(String[] args) {
//        ArrayList<String> words = new ArrayList<>();
//        words.add("Hello world!");
//        words.add("Amigo");
//        words.add("Elly");
//        words.add("Kerry");
//        words.add("Bug");
//        words.add("bug");
//        words.add("Easy ug");
//        words.add("Risha");
//
//        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
//        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
//        ArrayList<String> copyWordsThird = new ArrayList<>(words);
//
//        removeBugWithFor(copyWordsFirst);
//        removeBugWithWhile(copyWordsSecond);
//        removeBugWithCopy(copyWordsThird);
//
//        copyWordsFirst.forEach(System.out::println);
//        String line = "_________________________";
//        System.out.println(line);
//        copyWordsSecond.forEach(System.out::println);
//        System.out.println(line);
//        copyWordsThird.forEach(System.out::println);
//        System.out.println(line);
//    }
//
//    public static void removeBugWithFor(ArrayList<String> list) {
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            if (bug.equalsIgnoreCase(str)) {
//                list.remove(str);
//                i--;
//            }
//        }
//    }
//
//    public static void removeBugWithWhile(ArrayList<String> list) {
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            if (bug.equalsIgnoreCase(str)) {
//                it.remove();
//            }
//        }
//    }
//
//    public static void removeBugWithCopy(ArrayList<String> list) {
//        ArrayList<String> listCopy = new ArrayList<>(list);
//        for (String str : listCopy) {
//            if (bug.equalsIgnoreCase(str)) {
//                list.remove(str);
//            }
//        }
//    }
//}


/*
Преобразование списка во множество

В этой задаче нужно получить количество уникальных слов в списке.
Одним из способов решения является преобразования списка во множество. Как известно,
во множестве все элементы уникальные и размер полученного множества как раз и будет количеством уникальных слов.
Реализуй метод listToSet(ArrayList<String>), который преобразует список строк во множество.
*/

//public class Main {
//
//    public static void main(String[] args) {
//        ArrayList<String> listOfWords = new ArrayList<>(asList(
//                "В свет вышла новая серия книг по программированию на Java: \"Java для начинающих\", \"Java для продолжающих\", \"Java для заканчивающих\""
//                        .split(" ")));
//        System.out.println("Количество слов в списке: " + listOfWords.size());
//        HashSet<String> setOfWords = listToSet(listOfWords);
//        System.out.println("Количество слов во множестве: " + setOfWords.size());
//    }
//
//    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
//        return new HashSet<>(listOfWords);
//    }
//}

// TODO обращение к переменной и к методу из другого класса

class Friend {
    public String name;
    private String mail;
    int age;


    // чтобы обратиться из другого класса(метода) к этому методу  по аргументам (String name, String mail) надо создать такую конструкцию
    public Friend(String name, String mail, int age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    // чтобы обратиться из другого класса(метода) к этому методу и он делал то что в этом методе, надо оставить пустой return
    public String getName1() {
        System.out.println("Фёдор");
        return "";
    }
    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }
}

public class Main {
    public static void main(String[] args) {
        Friend friend = new Friend("Ivan", "Ivan@mail.ru", 38); // в скобках это значения аргументов, котрые присвоены в другом классе
        System.out.println(friend.name); // => Ivan
        System.out.println(friend.getName1());
        System.out.println(friend.getMail()); // => Ivan@mail.ru
        System.out.println(friend.getName()); //=> Ivan
        System.out.println(friend.age); // => 38

    }
}