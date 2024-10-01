/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class TimeTable{
    int year;
    String[]day={"Mon","Tue","Wed","Thu","Fri","Sat"};
    int[]period={1,2,3,4,5,6,7};
    String[]batch={"4MW24CS","4MW23CS","4MW22CS","4MW21CS"};
    String[]subject={"OOPJ","OOPJ Lab"};
    String[]faculty={"Kuthyar Sir","Chitra Madam"};
    String[]sections={"A","B","C"};
    boolean isLab;
    String section;
    TimeTable(int y1,String s1){
        this.year=y1;
        this.section=s1;
    }
    public boolean isLab(){
        return true;
    }
    public void printTimeTable(){
        String heading=year+"-"+batch[year-1];
        System.out.println("Time Table Of Year" + heading + " Section " + section);
    }
     public void printTimeTableA(){
         System.out.println(day[1]+"-"+"Period:"+period[2]+"-"+faculty[0]);
         System.out.println(day[1]+"-"+"Period:"+period[5]+"&"+period[6]+"-"+subject[1]+"-"+faculty[0]);
         System.out.println(day[2]+"-"+"Period:"+period[4]+"-"+faculty[0]);
         System.out.println(day[4]+"-"+"Period:"+period[1]+"-"+faculty[0]);
     }
     public void printTimeTableB(){
         System.out.println(day[2]+"-"+"Period:"+period[1]+"-"+faculty[0]);
         System.out.println(day[3]+"-"+"Period:"+period[0]+"&"+period[1]+"-"+subject[1]+"-"+faculty[0]);
         System.out.println(day[3]+"-"+"Period:"+period[3]+"-"+faculty[0]);
         System.out.println(day[4]+"-"+"Period:"+period[4]+"-"+faculty[0]);
     }
}

public class IS9 {
    public static void main(String[] args){
        TimeTable tt2A=new TimeTable(2,"A");
        TimeTable tt2B=new TimeTable(2,"B");
        tt2A.printTimeTable();
        tt2A.printTimeTableA();
        System.out.println("Day\t1\t2\t3\t4\t5\t6\t7");
        System.out.println(tt2A.day[0]+"\t-\t-\t-\t-\t-\t-\t-");
        System.out.println(tt2A.day[1]+"\t-\t-\t"+tt2A.subject[0]+"\t-\t----Lab---\t-");
        System.out.println(tt2A.day[2]+"\t-\t-\t-\t-\t"+tt2A.subject[0]+"\t-\t-");
        System.out.println(tt2A.day[3]+"\t-\t-\t-\t-\t-\t-\t-");
        System.out.println(tt2A.day[4]+"\t-\t"+tt2A.subject[0]+"\t-\t-\t-\t-\t-");
        System.out.println(tt2A.day[5]+"\t-\t-\t-\t-\t-\t-\t-");
        System.out.println("*------------------*");
        tt2B.printTimeTable();
        tt2B.printTimeTableB();
        System.out.println("Day\t1\t2\t3\t4\t5\t6\t7");
        System.out.println(tt2B.day[0]+"\t-\t-\t-\t-\t-\t-\t-");
        System.out.println(tt2B.day[1]+"\t-\t-\t-\t-\t-\t-\t-");
        System.out.println(tt2B.day[2]+"\t"+tt2B.subject[0]+"\t-\t-\t-\t-\t-\t-");
        System.out.println(tt2B.day[3]+"\t----Lab---\t-\t"+tt2B.subject[0]+"\t-\t-\t-");
        System.out.println(tt2B.day[4]+"\t-\t-\t-\t-\t"+tt2B.subject[0]+"\t-\t-");
        System.out.println(tt2A.day[5]+"\t-\t-\t-\t-\t-\t-\t-");
    }
}
