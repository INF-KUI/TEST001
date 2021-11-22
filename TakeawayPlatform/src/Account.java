import java.util.Scanner;

public class Account {



//注册方法
    public int registerOrLogin(int op){
//创建新的对象，有用户名密码属性

    Username user01 = new Username();
    Password pass01 = new Password();


//登陆验证账号密码方法,返回登陆成功的账号类型
if (op == 1)
{
    Scanner input = new Scanner(System.in);
    boolean ifLogin = false;

    System.out.println("==========账号登陆界面==========");
    while (ifLogin == false) {

        System.out.println("请输入你的用户名:");
        String inputUsername = input.next();
        System.out.println("请输入你的密码:");
        String inputPassword = input.next();
        //验证账号密码是否匹配
        //如果是买家账号登陆成功,返回1
        if (user01.buyerUsername.equals(inputUsername)&&pass01.buyerPassword.equals(inputPassword)) {
            ifLogin = true;
            System.out.println();
            return 1;
        }
        //如果是商家账号登陆成功，返回2
        if (user01.sellerUsername.equals(inputUsername)&&pass01.sellerPassword.equals(inputPassword)) {
            ifLogin = true;
            return 2;
        }
        //都没成功说明有错误
        System.out.println("账号或密码错误,请重新登陆：");
    }


}
//注册
if(op==2)
{
//键盘读入的数据(操作选择，用户名密码设置)
            Scanner input = new Scanner(System.in);


//选择操作
            System.out.println("请选择注册账号类型:");
            System.out.println("1.买家账号");
            System.out.println("2.商家账号");

             op = input.nextInt();

            if (op == 1) {
                //买家账号
                System.out.println("==========买家账号注册界面==========");
                System.out.println("请设置你的用户名:");
                user01.setBuyerUsername(input.next());
                System.out.println("请设置你的密码:");
                pass01.setBuyerPassword(input.next());
                System.out.println("注册成功！" + "\n");
                System.out.println("你的用户名是：" + user01.buyerUsername);
                System.out.println("你的密码名是：" + pass01.buyerPassword);

            }
            if (op == 2) {
                //商家账号
                System.out.println("==========商家账号注册界面==========");
                System.out.println("请设置你的用户名:");
                user01.setSellerUsername(input.next());
                System.out.println("请设置你的密码:");
                pass01.setSellerPassword(input.next());
                System.out.println("注册成功！" + "\n");
                System.out.println("你的用户名是：" + user01.getSellerUsername());
                System.out.println("你的密码名是：" + pass01.sellerPassword);
            }
}


            return  0;
        }




}
