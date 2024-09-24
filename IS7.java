/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smv
 */
class Human{
    public void job(){
        System.out.println("Working Professional");
    }
}
class Teacher extends Human{
    public void job(){
        System.out.println("Teacher");
    }
}
class Doctor extends Human{
    public void job(){
        System.out.println("Doctor");
    }
}
public class IS7 {
    public static void main(String[] args){
        Human amar=new Human();
        Teacher babu=new Teacher();
        Doctor chandra=new Doctor();
        Human dinesh=new Doctor();
        amar.job();
        babu.job();
        chandra.job();
        dinesh.job();
    }
}
