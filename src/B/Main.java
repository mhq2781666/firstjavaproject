package B;
import A.*;
public class Main {
    public static void main(String[] args) {
        manager managers=new manager("管理员",20000);
        worker workers=new worker("工人",10000);

        System.out.println("名字是："+workers.getName()+"==>工资为："+workers.getSalar());
        System.out.println("名字是："+managers.getName()+"==>工资为："+managers.getSalar());
    }
}
