import java.util.Scanner;

public class LoginSuccessful {

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
public void sellerLogin(){

    Scanner input=new Scanner(System.in);
    int op;
    int i=0;

    System.out.println("===欢迎来到杆菌由胃生外卖平台===");
    System.out.println("请选择你对美食的操作？");
    System.out.println("1.我要添加新的食物");
    System.out.println("2.我要删除食物");
    System.out.println("3.我要看看有什么美食");
    System.out.println("4.我要修改食物的属性");
    op = input.nextInt();
    switch (op){
        case 1:
            Food.list();//先列出现有的食物
            System.out.println("添加到几号位？");
            int op2=input.nextInt();
            System.out.println("输入食物名字");
            Food.setFoodName(op2-1,input.next());
            System.out.println("输入食物单价");
            Food.setFoodPrice(op2-1,input.nextDouble());
            System.out.println("输入食物描述");
            Food.addFoodDescription(op2,input.next());
            System.out.println("添加成功");
            break;

        case 2:

            break;
        case 3:

            break;
        case 4:
        }
    }
}




