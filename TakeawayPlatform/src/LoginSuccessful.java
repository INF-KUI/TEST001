import java.util.Scanner;

public class LoginSuccessful {

Food food=new Food();

//买家登陆成功界面
public void buyerLogin() {
    Scanner input = new Scanner(System.in);
    int order;//美食序号
    int num;//美食数量
    double totalAmount;
    int op;
    System.out.println("===欢迎来到干净又卫生外卖平台===");
    System.out.println("请选择你的操作？");
    System.out.println("1.我要点餐");
    System.out.println("2.目前只能点餐");
    op = input.nextInt();
    if (op == 1) {
        System.out.println("你想吃啥?:");
        Food.list();
        System.out.print("请输入你要点的美食编号：");
        order=input.nextInt();
        System.out.print("请输入份数：");
        num= input.nextInt();
        totalAmount=Food.calcBills(order,num);

    }
}

//商家登陆成功界面
void sellerLogin(){

    Scanner input=new Scanner(System.in);
    int op;
    int i=0;

    System.out.println("===欢迎来到杆菌由胃生外卖平台===");
    System.out.println("请选择你对美食的操作？");
    System.out.println("1.我要添加新的食物");
    System.out.println("2.我要删除食物");
    System.out.println("3.我要看看有什么美食");
    System.out.println("4.我要修改食物");
    op = input.nextInt();
    switch (op){
        case 1:



        case 2:
        case 3:

        case 4:
        }
    }
}




