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

