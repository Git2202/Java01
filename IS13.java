class MultiThreadingFour extends Thread{
    int threadNumber;
    MultiThreadingFour(int tNo){
        this.threadNumber=tNo;
    }
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("Task"+i+" by ThreadNumber "+threadNumber);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
            }
        }
    }
}
public class IS13 {
    public static void main(String[] args){
        for(int i=1;i<8;i++){
            MultiThreadingFour mt1=new MultiThreadingFour(i);
            mt1.start();
        }
    }
    
}
