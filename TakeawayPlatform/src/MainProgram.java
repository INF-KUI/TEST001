import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner input=new Scanner(System.in);
        //一些初始化，避免空指针异常
        Account.user01.buyerUsername="null1";
        Account.pass01.buyerPassword="null1";
        Account.user01.sellerUsername="null2";
        Account.pass01.sellerPassword="null2";
        for(int i=0;i<5;i++){
            Food.food[i]=new Food();
        }
        for(int i=0;i<5;i++){
            Food.food[i].foodName="";
            Food.food[i].foodPrice=0;
            Food.food[i].foodDescription="无";
        }

    //主界面(退出登陆时也是这个界面)
        int pis=0; //(Program interface selection)程序界面选择
while(pis!=-1){


        System.out.println("请选择你的操作:");
        System.out.println("1.账号登陆");
        System.out.println("2.账号注册");
        System.out.println("3.退出应用");

        int op=input.nextInt();
        if(op==1){

            //登陆且返回登陆成功的账号类型
        int whichAccount=account.registerOrLogin(1);
        if(whichAccount==1){
            LoginSuccessful.buyerLogin();
        }
        if(whichAccount==2){
            LoginSuccessful.sellerLogin();
        }

        }

        if(op==2){
            account.registerOrLogin(2); //注册
            System.out.println("快去登录吧！");
        }
        if (op==3){

            return ;
        }

        }
    }




}

