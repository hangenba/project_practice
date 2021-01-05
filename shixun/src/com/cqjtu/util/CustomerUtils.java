package com.cqjtu.util;



import java.util.*;

public class CustomerUtils {
    public static Scanner input=new Scanner(System.in);
    public static Map[] CustomerList=new HashMap[10];
    public static void List(){
        System.out.println("---------------------");
        System.out.println("1.添加用户");
        System.out.println("2.修改用户");
        System.out.println("3.删除用户");
        System.out.println("4.用户列表");
        System.out.println("5.保存信息");
        System.out.println("6.退出");
        System.out.println("---------------------");
        System.out.print("请选择:");
    }

    public static int checkUserSelect(int minLimit ,int maxLimit){
        int select =0;
        while (true){
            try {
                String s1= input.next();
                select = Integer.parseInt(s1);
            }catch (NumberFormatException e){
                System.out.println("选择错误,重新输入!");
                continue;
            }
            if (select<minLimit || select>maxLimit){
                System.out.println("选择错误，重新输入!");
                continue;
            }
            break;
        }
        return select;

    }



    public static String readUserStr(int maxLimit){
        String line=input.next();
        while(true){
            if (line.length()<1 || line.length()>maxLimit){
                System.out.println("请输入1~"+maxLimit+"个字符");
                continue;
            }
            break;
        }
        return line;
    }

    public static char readUserChar(char c1,char c2){
        char g=0;
        while(true){
            String str = input.next();
            g = str.charAt(0);
            if(g!=c1 && g!=c2){
                System.out.println("男性请输入m，女性请输入f，是不是不认识字？");
                continue;
            }
            break;
        }
        return g;
    }


}
