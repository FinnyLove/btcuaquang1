package btvn;

import btvn.Baitap1;
import btvn.Baitap2;
import btvn.Baitap3;
import java.util.Scanner;

public class Baitap4
{
    public static void menu ()
    {
       System.out.println("b1");
       System.out.println("b2");
       System.out.println("b3");
       Scanner sc = new Scanner(System.in);
       int chon = sc.nextInt();
       switch(chon)
       {
           case 1: Baitap1.ptb1();
           break;
           case 2: Baitap2.ptb2();
           break;
           case 3: Baitap3.tinhtiendien();
           break;
           case 4: break;
           default:  
               System.out.println("nhap sai ");
       }
    }
     public static void main(String[] arg)
   {
       menu();
   }
}
