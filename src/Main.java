import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите start для запуска программы");
        if (scanner.nextLine().equals("start")){
            MyThread thread = new MyThread();
            MyThread thread1 = new MyThread();
            thread.start();
            thread1.start();
        }

    }
    public synchronized static void print10(ArrayList<String> arrayList, int i){
        System.out.println(Thread.currentThread().getName());
        for(int j=0;j<10;j++){
            System.out.print(arrayList.get(i-10+j)+" ");
        }
        System.out.println();
    }
}
