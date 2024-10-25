import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // задание 2.5

        int m = 234;
        int n = 7;
        int div = m / n;
        System.out.println(div);

        // задание 2.6

        int nsec = 43322;
        int hours = nsec / 3600;
        int min = (nsec % 3600) / 60;
        int sec = (nsec % 3600) % 60;
        System.out.println("С начала дня прошло " + nsec + " секунд, илм же " + hours + " часов, " + min + " минут и " + sec + " секунд");

        // задание 2.13

        StringBuffer strBuffer = new StringBuffer("345");
        strBuffer.reverse();
        System.out.println(strBuffer.toString());

        // задание 2.19

        int numb4 = 4356;
        int digit1 = numb4 / 1000;
        int digit2 = (numb4 / 100) % 10;
        int digit3 = (numb4 / 10) % 10;
        int digit4 = numb4 % 10;
        int summa = digit1 + digit2 + digit3 + digit4;
        int proizv = digit1 * digit2 * digit3 * digit4;
        System.out.println(summa);
        System.out.println(proizv);

        // задание 4.9

        int kmh = 100;
        int ms = 1000;
        int pereovdvms = ms * 3600 / 1000;
        if (kmh > pereovdvms) {
            System.out.println(" kmh > perevodvms");
        } else {
            System.out.println("kmh < pereovdvms");
        }

        // задание 4.10

        int rball = 15;
        int stcub = 10;
        double plball = Math.PI * Math.pow(rball,2);
        int plcub = stcub * 4;
        if (plball > plcub) {
            System.out.println("Площадь круга больше квадрата");
        } else {
            System.out.println("Площадь квадрата больше круга");
        }

        // задание 4.13

        int a = 34;
        int b = 45;
        int c = 56;
        double discriminant = Math.pow(b,2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("Уравнение имеет вещественные корни");
        } else {
            System.out.println("Уравнение не имеет вещественные корни");
        }

        // задание 4.36

        int ti = 3456;
        int loops = ti / 5;
        int difference = ti - (loops * 5);
        switch (difference) {
            case 1, 2, 3:
                System.out.println("Зеленый");
                break;
            case 4, 5, 0:
                System.out.println("Красный");
                break;
        }

        // задание 4.96

        int aa = 34;
        int bb = 56;
        int cc = 45;
        double discrem = Math.pow(bb,2) - 4 * aa * cc;
        if (discrem < 0) {
            System.out.println("Уравнение имеет вещественные корни");
        } else {
            System.out.println("Уравнение не имеет вещественные корни");
            System.out.println("Вот они: ");
            double x1 = (-bb - Math.sqrt(discrem)) / 2 * aa;
            double x2 = (-bb + Math.sqrt(discrem)) / 2 * aa;
            System.out.println(x1);
            System.out.println(x2);
        }

        //задание 4.97

        int h1= 345;
        int h2= 324;
        int h3= 132;
        if (h1 > h2 && h1 > h3){
            System.out.println("h1 наибольшое число");
        } if (h1 < h2 && h1 < h3) {
            System.out.println("h1 наименьшее число");
        } if (h1 < h2 && h1 > h3 || h1 < h3 && h1 > h2) {
            System.out.println("h1 среднее число");
        } if (h2 > h1 && h2 > h3){
            System.out.println("h2 наибольшое число");
        } if (h2 < h1 && h2 < h3) {
            System.out.println("h2 наименьшее число");
        } if (h2 < h1 && h2 > h3 || h2 < h3 && h2 > h1) {
            System.out.println("h2 среднее число");
        } if (h3 > h1 && h3 > h2){
            System.out.println("h3 наибольшое число");
        } if (h3 < h1 && h3 < h2) {
            System.out.println("h3 наименьшее число");
        } if (h3 < h1 && h3 > h2 || h3 < h2 && h3 > h1) {
            System.out.println("h3 среднее число");
        }

        //задание 4.122

        int s1 = 34;
        int s2 = 345;
        int s3 = 543;
        if (Integer.sum(s1, s2) > s3 & Integer.sum(s2, s3) > s1 & Integer.sum(s1, s3) > s2){
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Таких треугольников не бывает");
        }
    }
}