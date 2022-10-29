import java.util.Arrays;
import java.util.Scanner;

public class Kuptsovmv_4 {
    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
    }

    //Задание 1. Напишите программу, которая складывает квадраты двух чисел.
    // Используйте метод, который возвращает квадрат переданного ему числа.
    public static void task_1(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Введите первое число:");
        int a= sc.nextInt();

        System.out.println("Введите второе число:");
        int b= sc.nextInt();
        System.out.println(sqr(a)+sqr(b));
    }
    public static int sqr(int a){
        return (a*a);
    }


    //Задание 2. Напишите метод, который возводит заданное число в заданную степень.
    public static void task_2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число:");
        int a= sc.nextInt();
        System.out.println("Введите степень:");
        int b=sc.nextInt();

        System.out.println("число "+a+" в степени "+b+" == "+madeDegree(a,b));
    }
    public static int madeDegree(int a, int b){
        int num=1;
        for (int i = 0; i < b; i++) {
            num*=a;
        }
        return num;
    }

    //Задание 3. Напишите метод, который выводит сообщение о четности или нечетности заданного числа.

    public static void task_3(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите число:");
        int a= sc.nextInt();
        System.out.println(checkParity(a));
    }
    public static String checkParity(int c){
        if (c%2==0){
            return("Чётное");
        }else{
            return("Нечётное");
        }
    }



    //Задание 4. Напишите программу, которая удаляет из заданного массива все нечетные числа (пропусков быть не должно).
    public static void task_4(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите длинну массива:");
        int len= sc.nextInt();

        int []a=new int[len];
        System.out.println("Введите элементы массива");

        for (int i = 0; i < len; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Проверка на наличие нечётных чисел:");
        System.out.println(checkNum(a));
    }
    public static String checkNum(int[]b){
        int cnt=0;
        for (int i = 0; i < b.length ; i++) {
            if (b[i]%2==0){
                cnt++;
            }
        }
        int []c=new int[cnt];
        int j=0;
        for (int i = 0; i <b.length; i++) {
            if (b[i]%2==0){
                c[j]=b[i];
                j++;
            }
        }
        String str= Arrays.toString(c);
        return(str);
    }



    //Задание 5. Напишите программу, которая удаляет из заданного массива все повторы заданного числа (пропусков быть не должно).
    public static void task_5(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите длинну списка:");
        int len=sc.nextInt();
        int []a=new int[len];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i <a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(checkNUM(a)));
    }
    public static int[] checkNUM(int[]c){
        Scanner sc_1=new Scanner(System.in);
        System.out.println("Введите число, которое надо удалить:");
        int b= sc_1.nextInt();
        int cnt=0;
        for (int i = 0; i <c.length; i++) {
            if (c[i]!=b){
                cnt++;
            }
        }
        int []d=new int[cnt];
        int j=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=b){
                d[j]=c[i];
                j++;
            }
        }
        return d;
    }
}
