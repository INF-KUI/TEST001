import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Account account=new Account();
        Scanner input=new Scanner(System.in);
        Food food=new Food();
    //主界面(退出登陆时也是这个界面)
        int pis=1; //(Program interface selection)程序界面选择

        System.out.println("请选择你的操作:");
        System.out.println("1.账号登陆");
        System.out.println("2.账号注册");
        int op=input.nextInt();
        if(op==1){
        LoginSuccessful loginSuccessful=new LoginSuccessful();
            //登陆且返回登陆成功的账号类型
        int whichAccount=account.registerOrLogin(1);
            System.out.println(whichAccount);

        if(whichAccount==1){
            loginSuccessful.buyerLogin();
        }
        if(whichAccount==2){
            loginSuccessful.sellerLogin();
        }

        }

        if(op==2){
            account.registerOrLogin(2); //注册
        }

    }



}

