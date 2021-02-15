public class GB_Part1 {

    public static void main (String [] args) {
        byte b = 1;
        boolean bool;
        boolean boolPN;
        short s = 22334;
        float f;
        double d = 321565.1321654d;
        char c = 'G';
        long l = 23423423;
        int i = 1;

        f = multiplication (1.1f, 2.2f, 3.3f,3.4f);
        bool = checkingNumbers(1, 8);
        polarityPrint(-2);
        boolPN = polarityBool(0);
        printHello("Михаил");
        printLeapYear(801);

    }
    static float multiplication (float a, float b, float c, float d){
        return a*(b+(c/d));
    }

    static boolean checkingNumbers (int a, int b){
        if (a+b>=10 ){
            if (a+b<=20 )
                return true;
            else
                return false;
        }
        else
            return false;
    }

    static void polarityPrint (int a){
        if (a>=0 )
            System.out.println("Число " + a + " положительное");
        else
            System.out.println("Число " + a + " отрицательное");
    }

    static boolean polarityBool (int a){
        if (a >= 0 )
            return true;
        return false;
    }

    static void printHello (String name){
        System.out.println("Привет, " + name + "!");
    }

    static void printLeapYear (int year){
        if ((year % 4) == 0){
            if ((year % 100) > 0){
                System.out.println(year + " год високосный.");
            }
            else if (((year / 100) % 4) == 0){
                System.out.println(year + " год високосный.");
            }
            else
                System.out.println(year + " год не високосный.");
        }
        else
            System.out.println(year + " год не високосный.");
    }

}
