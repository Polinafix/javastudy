import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Полина on 18.04.2015.
 */
public class Point {
    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    @Override
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    // выводит на экран описание точки
    public void printPoint() {
        System.out.print(this.toString());
    }

    // метод перемещает точку на указанный вектор
    public void movePoint(double a, double b) {
        x = x + a;
        y = y + b;
    }

    // метод изменяет координаты точки на указанные
    public void setPoint(double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создающий точку в начале координат
    public Point(int i) throws IOException {
  /*    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        x = Double.parseDouble(reader.readLine());
        y = Double.parseDouble(reader.readLine());*/
        Scanner scan = new Scanner(System.in);
        x = scan.nextDouble();
        y = scan.nextDouble();
        scan.close();
    }

    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;
    }

    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    // метод проверяющий совпадают ли точки
    public boolean equalsPoint(Point p) {
        if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) { // если объект из аргумента является экземпляром класса Point
            return this.equalsPoint((Point) obj); // вызываем метод сравнения двух точек из этого же класса
        } else {
            throw new ClassCastException(); // иначе вызываем ошибку приведения типов
        }
    }

    @Override
    public int hashCode() {
        return (int)(x+y);
    }

    public String quarter() {
        if (x > 0 && y > 0) {
            return "Первая координатная четверть";
        } else if (x < 0 && y > 0) {
           return "Вторая координатная четверть";
        } else if (x < 0 && y < 0) {
            return "Третья координатная четверть";
        } else if (x > 0 && y < 0){
            return "Четвертая координатная четверть";
        } else {
            return "Начало координат";
        }
    }

    public boolean isSimmetric(Point s) {
/*        if ((this.x + s.x == 0) && (this.y + s.y == 0)){
            return true;
        } else {
            return false;
        }*/
        return (this.x + s.x == 0) && (this.y + s.y == 0);
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        Point p1 = new Point();
        Point p2 = new Point(1, 1);

        System.out.println("Расстояние между точками " + p1 + " и " + p2 + " равно " + p1.length(p2));
        System.out.println("Расстояние между точками " + p1 + " и заданной равно " + p1.length(new Point(0.0, 0.0)));
        /*
        p1.length(p2)
        p1 - текущий экземпляр класса Point (this внутри метода length)
        p2 - экземпляр, с которым сравниваем (аргумент (Point p) внутри метода length)
         */
        System.out.println(p1.quarter());
        System.out.println(p2.quarter());
        Object o = new Point(0.1, 0.1);
        Object b = new ArrayList<>();
        System.out.println(p2.equals(o));
        // System.out.println(p2.equals(b)); // Exception in thread "main" java.lang.ClassCastException: java.util.ArrayList cannot be cast to Point
        // System.out.println(p2.equalsPoint(o));
        System.out.println(p2.equals(new Point(0.0, 0.0)));
        System.out.println(new Point(12.0, 15.0).hashCode());
        System.out.println(p1.isSimmetric(p2));
    }
}

