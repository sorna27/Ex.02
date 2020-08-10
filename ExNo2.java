/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no2;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int w=10,x=20,y=2,z=4;
        System.out.println("complex number 1:"+w+"+i"+x);
        System.out.println("complex number 2:"+y+"+i"+z);
        complex obj1=new complex();
        obj1.add(w,x,y,z);
        obj1.sub(w,x,y,z);
        obj1.mul(w, x, y, z);
        obj1.div(w, x, y, z);
        
    }
    
}
class complex
{
    int e,f;
    void add(int w,int x,int y,int z)
    {
       e=w+y;
       f=x+z;
       System.out.println("addition:"+e+"+i"+f);
    }
    void sub(int w,int x,int y,int z)
    {
        e=w-y;
        f=x-z;
        System.out.println("subtraction:"+e+"-i"+f);
    }
    void mul(int w,int x,int y,int z)
    {
        e=w*y;
        f=x*z;
        System.out.println("multiplication:"+e+"*i"+f);
    }
    void div(int w,int x,int y,int z)
    {
        e=w/y;
        f=x/z;
        System.out.println("division:"+e+"/i"+f);
    }
     
}