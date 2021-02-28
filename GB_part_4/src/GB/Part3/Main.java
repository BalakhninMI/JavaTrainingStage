package GB.Part3;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static char[][] map;
    static final int SIZE = 4;
    static final int DOTS_TO_WIN = 3;

    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static int countStep=0;

    public static void main(String[] args)
    {

        // Инициализация поля
        initMap();
        // Вывод поля на экран
        printMap();

        // цикл
        while (true)
        {
            // ход человека
            humanTurn();
            countStep++;
            // вывод куда сходил
            printMap();
            // проверка победы
            if (isWinner(DOT_X))
            {
                System.out.println("Победил человек");
                break;
            }
            // проверка ничьи
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }

            // ход ИИ
            aiTurn();
            countStep++;
            // вывод куда сходил
            printMap();
            // проверка победы
            if (isWinner(DOT_O))
            {
                System.out.println("Победил Т-1000");
                break;
            }
            // проверка ничьи
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
        }

    }

    static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int x = 0; x < SIZE; x++)
        {
            for (int y = 0; y < SIZE; y++)
            {
                map[x][y] = DOT_EMPTY;
            }
        }
    }

    static void printMap()
    {
        for (int x = 0; x <= SIZE; x++)
        {
            System.out.print(x + " ");
        }

        System.out.println();

        for (int y = 0; y < SIZE; y++)
        {
            System.out.print((y + 1) + " ");
            for (int column = 0; column < SIZE; column++)
            {
                System.out.print(map[y][column] + " ");
            }
            System.out.println();
        }
    }

    static void humanTurn()
    {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isCellValid(x, y));

        map[y][x] = DOT_X;
    }

    static void aiTurn()
    {
        Random random = new Random();

        int x;
        int y;

        do
        {
            System.out.println("Введите координаты в формате X Y");
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);

        } while (!isCellValid(x, y));

        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));

        map[y][x] = DOT_O;
    }

    static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE)
        {
            return false;
        }
        if (map[y][x] == DOT_EMPTY)
        {
            return true;
        }
        return false;
    }


    // Проверить****
    // Проверить****
    // Проверить****
    // Проверка побед
    static boolean isWinner(char text)
    {
        if (isDiagonals(text))
        {
            return true;
        }

        if (isLines(text))
        {
            return true;
        }
        return false;
    }

    // Проверить****
    // Проверить****
    // Проверить****
    // Проверка линий
    static boolean isLines(char text)
    {
        int countX = 0;
        for (int x = 1; x <= SIZE; x++)
        {
            for (int y = 1; y <= SIZE; y++)
            {
                if (map[x-1][y-1] == text)
                {
                    countX ++;
                }
                else
                {
                    countX = 0;
                }

                if (countX == DOTS_TO_WIN)
                {
                    return true;
                }

            }
        }

        countX=0;
        for (int YY = 1; YY <= SIZE; YY++)
        {
            for (int XX = 1; XX <= SIZE; XX++)
            {
                if (map[XX-1][YY-1] == text)
                {
                    countX++;
                }
                else
                {
                    countX = 0;
                }

                if (countX == DOTS_TO_WIN)
                {
                    return true;
                }

            }
        }
        return false;
    }


    // Проверить****
    // Проверить****
    // Проверить****
    // Проверка диагоналей
    static boolean isDiagonals(char text)
    {
        int countX=0;
        int countY=0;
        //Прямая диагональ
        for (int X = SIZE-1; X >= 0; X--)
        {
            for (int Y = 1; Y <= SIZE-X; Y++)
            {
                if (map[X+Y-1][Y-1] == text)
                {
                    countX++;
                }
                else
                {
                    countX = 0;
                }

                if (countX == DOTS_TO_WIN)
                {
                    return true;
                }

            }

            for (int Y = SIZE-X; Y >= 1; Y--)
            {
                if (map[Y-1][X+Y-1] == text)
                {
                    countY++;
                }
                else
                {
                    countY = 0;
                }

                if (countY == DOTS_TO_WIN)
                {
                    return true;
                }

            }
        }

        //Прямая Обратная
        countX=0;
        countY=0;
        for (int X = 1; X <= SIZE; X++)
        {
            for (int Y = SIZE; Y >= X; Y--)
            {
                if (map[Y-1][SIZE-Y+X-1] == text)
                {
                    countX++;
                }
                else
                {
                    countX = 0;
                }

                if (countX == DOTS_TO_WIN)
                {
                    return true;
                }

            }

            for (int Y = 0; Y <= SIZE-X; Y++)
            {
                if (map[Y+1-1][SIZE-Y-X+1-1] == text)
                {
                    countY++;
                }
                else
                {
                    countY = 0;
                }

                if (countY == DOTS_TO_WIN)
                {
                    return true;
                }

            }
        }
        return false;
    }



    static boolean isMapFull()
    {
        return (countStep==(SIZE*SIZE));
    }

}