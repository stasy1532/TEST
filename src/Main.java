import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){
       // System.out.println("tgggggggggg");

    System.out.println("Введите число 1, 2 или 3: ");
    Scanner inputFigure = new Scanner(System.in);
    int i = inputFigure.nextInt();
    if (1<=i && i<=3){
        System.out.println(i +" in if");
    };
          switch (i) {
              case 1:
              case 2:
              case 3:
                  System.out.println(i + " in switch");
                  break;
          }
    int b ;
          String a="";
          for ( b=5; b>=1; b--) {
                a+= b + " " ;
          }
        System.out.println(a);
    int c;
    int d = 3;
    for (c=1;c<=10;c++){
        System.out.println(d +"*"  + c  + "=" + c*d);
    }
    int r;
    int sum=0;
    for(r=1; r<=100; r++){
        sum+=r;

    }
        System.out.println(sum/(r-1));
    }}
