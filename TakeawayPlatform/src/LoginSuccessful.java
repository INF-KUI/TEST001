import java.util.Scanner;

public class LoginSuccessful {

//买家登陆成功界面
public void buyerLogin() {
    Scanner input = new Scanner(System.in);
    int order;//美食序号
    int num;//美食数量
    double totalAmount;
    int op;//操作选择
    int pis;//界面选择
    System.out.println("===欢迎来到干净又卫生外卖平台===");
    System.out.println("请选择你的操作？");
    System.out.println("1.我要点餐");
    System.out.println("2.目前只能点餐");
    op = input.nextInt();
    if (op == 1) {
        //点餐并打印订单详情
        System.out.println("你想吃啥?:");
        Food.list();
        System.out.print("请输入你要点的美食编号：");
        order=input.nextInt();
        System.out.print("请输入份数：");
        num= input.nextInt();
        totalAmount=Food.calcBills(order,num);
        String orderedFoodName=Food.getOrderedFoodName(order);
        System.out.println("订单详情:");
        System.out.printf("食物名      数量");
        System.out.printf("%-10s\n",orderedFoodName);
        System.out.printf("%-6d\n",num);
        System.out.println("总金额:"+totalAmount);
    }
}

//商家登陆成功界面
public void sellerLogin(){

    Scanner input=new Scanner(System.in);

    System.out.println("===欢迎来到杆菌由胃生外卖平台===");
    System.out.println("请选择你对美食的操作？");
    System.out.println("1.我要添加新的食物");
    System.out.println("2.我要删除食物");
    System.out.println("3.我要修改食物的属性");
    System.out.println("4.我要看看有什么美食");
    int op = input.nextInt();
    int op2;    //操作的食物序号
    switch (op){

        case 1://添加新的食物
            Food.list();//先列出现有的食物
            System.out.println("添加到几号位？");
            op2=input.nextInt();
            System.out.println("输入食物名字");
            Food.setFoodName(op2-1,input.next());
            System.out.println("输入食物单价");
            Food.setFoodPrice(op2-1,input.nextDouble());
            System.out.println("输入食物描述");
            Food.addFoodDescription(op2-1,input.next());
            System.out.println("添加成功");
            break;

        case 2://删除食物
            Food.list();
            System.out.println("你要删除几号食物？");
            Food.deleteFood(input.nextInt()-1);
            System.out.println("删除成功！");
            break;
        case 3://修改属性
            Food.list();
            System.out.println("你要修改几号食物？");
            op2=input.nextInt();
            Food.list(op2-1);   //先列出这个食物的信息
            System.out.println("你要修改它的什么属性？");
            System.out.println("1.名称");
            System.out.println("2.单价");
            System.out.println("3.描述");
            int op3=input.nextInt();
            switch (op3) {
                case 1:
                    System.out.println("请输入新的名字：");
                    Food.setFoodName(op2-1,input.nextLine());
                    System.out.println("修改成功！");
                    Food.list(op2-1);
                    break;
                case 2:
                    System.out.println("请输入新的价格：");
                    Food.setFoodPrice(op2-1,input.nextDouble());
                    System.out.println("修改成功！");
                    Food.list(op2-1);
                    break;
                case 3:
                    System.out.println("请输入新的描述：");
                    Food.addFoodDescription(op2-1,input.nextLine());
                    System.out.println("修改成功！");
                    Food.list(op2-1);
                    break;
            }
            break;
        case 4://查看目前所有的食物
            Food.list();
            break;
        }
    }
}




