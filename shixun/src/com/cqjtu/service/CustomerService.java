package com.cqjtu.service;

import com.cqjtu.model.Customer;
import com.cqjtu.util.CustomerUtils;

public class CustomerService {
    private  Customer[] csts;
    private int total=0;
    public CustomerService(int index){
        csts=new Customer[index];
    }
    public void dispathRequest(){
        int select= CustomerUtils.checkUserSelect(1,6);
        switch (select) {
            case 1:
                addCustomer();
                break;
            case 2:
                System.out.println("欢迎来到修改用户界面");
                break;
            case 3:
                delCustomer();
                break;
            case 4:
                showCustomers();
                break;
            case 5:
                System.out.println("欢迎来到保存用户界面");
                break;
            case 6:
                System.exit(0);
                break;
        }
    }

    //增加用户
    public void addCustomer(){
        System.out.println("欢迎来到添加用户界面");
        System.out.println("请输入的姓名:");
        String name= CustomerUtils.readUserStr(20);
        System.out.println("请输入的年龄:");
        int age= CustomerUtils.checkUserSelect(1,150);
        System.out.println("请输入的性别:");
        char gender=CustomerUtils.readUserChar('m','f');
        System.out.println("请输入的email:");
        String email=CustomerUtils.readUserStr(40);
        Customer cst =new Customer(name,age,gender,email);
        System.out.println(putCustomerToArray(cst)?"成功":"失败");
    }
    //判断是否增加成功
    public boolean putCustomerToArray(Customer c){
        boolean result=false;
        if(csts.length>1||total<csts.length){
            csts[total++]=c;
            result=true;
        }
        return result;
    }

    //删除用户
    public void delCustomer(){
        while (true){
            System.out.println("欢迎来到删除用户界面，请输入您要删除的用户id：");
            int userSelect = CustomerUtils.checkUserSelect(1,csts.length);

            boolean result=removeCustomerFromArray(userSelect);
            if (!result){
                System.out.println("删除失败");
                break;
            }
            System.out.println("删除成功");
            break;
        }
    }

    public boolean removeCustomerFromArray(int userSelect){
        if(csts[userSelect-1]==null||total==0){
            System.out.println("对不起找不到用户");
            return false;
        }
        System.out.println("您确定要删除吗？(y/n)");
        char c=CustomerUtils.readUserChar('y','n');
        if(c == 'y'){
            csts[userSelect-1]=null;
            for(int i=userSelect-1;i<total;i++){
                csts[i]=csts[i+1];
            }
            total--;
        }else{
            return false;
        }
        return true;
    }


    //显示列表
    public void showCustomers(){
        System.out.println("id"+'\t'+"name"+'\t'+"age"+'\t'+'\t'+"gender"+'\t'+"email");
        for(int i=0;i<total;i++){
            System.out.println((i+1)+"\t"+csts[i]);
        }
    }

}
