/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class MultiThreadingOne extends Thread{
    public void run(){
       System.out.println("Thread "+Thread.currentThread().getId()+" is running");
    }
}
public class IS10 {
    public static void main(String[] args){
        for(int i=0;i<8;i++){
             MultiThreadingOne mt1=new MultiThreadingOne();
             mt1.start();
        }
    }
    
}
