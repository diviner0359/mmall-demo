package com.mmall.test;

import java.util.Scanner;

/**
 * Created by Diviner on 2018/3/6.
 */
public class T1 {
    private static Object bottle;
    public static void main(String[] args) {
        matchs(1,0);

        while(true){
            Scanner scan = new Scanner(System.in);
            int money=scan.nextInt();
            int bottlesoda,bottle,cap;
            bottlesoda=bottle=cap=money;
            Bottles(bottlesoda,bottle,cap);
        }

    }
    public static void matchs(int x,int num){
        num+=x;
        if(x==100){System.out.println(num);}
        x++;
        if(x<=100){matchs(x,num);}
    }
    public static void Bottles(int bottlesoda,int bottle,int cap){
        if(bottle>=2||cap>=3){
            if(bottle>=2){
                while(bottle>=2){
                    bottle-=1;
                    bottlesoda+=1;
                    cap+=1;
                }
                if(bottle>=2||cap>=3){Bottles(bottlesoda,bottle,cap);}
            }else{
                while(cap>=3){
                    cap-=2;
                    bottlesoda+=1;
                    bottle+=1;
                }
                if(bottle>=2||cap>=3){Bottles(bottlesoda,bottle,cap);}
            }
            if(bottle<2&&cap<3){
                System.out.println("汽水数量:"+bottlesoda);
                System.out.println("瓶子数量:"+bottle);
                System.out.println("瓶盖数量:"+cap);
            }
        }
    }
}
