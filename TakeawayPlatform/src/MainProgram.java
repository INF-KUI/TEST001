import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner input=new Scanner(System.in);
        System.out.println("请选择你的操作:");
        System.out.println("1.账号登陆");
        System.out.println("2.账号注册");
        int op=input.nextInt();
        if(op==1){
            account.login();
        }
        if(op==2){
            account.register();
        }




        //买家登陆成功界面
        System.out.println("欢迎来到杆菌由胃生干净又卫生外卖平台");
        System.out.println("请选择你的操作？");
        System.out.println("1.我要点餐");
        System.out.println("2.目前只能点餐");
        op=input.nextInt();
        if (op==1){

        }







    }






}

