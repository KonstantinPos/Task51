public class Main {
    static int a[] = new int[15];
    static int b[] = new int[15];
    static int count = 1;

    public static void main(String[] args) {
        System.out.println("Изначальные данные");
        mas();
        ran();
        System.out.println();
        System.out.println("После преобразования");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < b.length; j++) {
            System.out.print(b[j] + " ");
        }
        System.out.println();
        System.out.println("Список задач");
        for (int i = 0; i < 14; i++) {
            System.out.print("Задание №" + "" + count + ": " + a[i] + "*" + b[i]);
            System.out.println();
            count++;
        }
    }

    //создаем массив из случайных чисел от 2 до 9
    static void mas() {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 7) + 2;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) (Math.random() * 7) + 2;
            System.out.print(b[i] + " ");
        }
    }

    //проверяем имеются повторяющиеся значения или нет (пример 2*3 и 3*2)
    static void ran() {
        for (int i = 1; i < a.length - 1; i++) {
            for (int j = 0; j < b.length; j++) {
                if (((a[i] == b[j]) && (a[j] == b[i])) && (a[i] != b[i])) {
                    a[i] = (int) (Math.random() * 7) + 2;
                    ran();
                }
            }
        }
    }
}