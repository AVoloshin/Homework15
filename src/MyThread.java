import java.util.ArrayList;

public class MyThread extends Thread {
    @Override
    public void run() {
        ArrayList<String> threadArray = new ArrayList<>();
        for (int i=1; i<=100; i++){
            if(i%10==0){
                threadArray.add(i+"");
                                    Main.print10(threadArray,i);
                    //Main.threadArray.get(i-10+j);

            }else threadArray.add(i+"");
        }
    }
}
