/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;
import pkg3.MyPackage2;

import pkg3.MyPackage3;
class MyPackage{
	public void display() {
		System.out.println("This msg is from MyPackage class within pkg2");
	}
}
public class IS26 {

	public static void main(String[] args) {
		System.out.println("Package");
		MyPackage mypack1=new MyPackage();
		MyPackage2 mypack2=new MyPackage2();
		MyPackage3 mypack3=new MyPackage3();
		mypack1.display();
		mypack2.display();
		mypack3.display();
	}
}