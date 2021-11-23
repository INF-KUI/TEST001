public class Food {
    String foodName;
    double foodPrice;
    String foodDescription;

    static Food[] food =new Food [5];

//设置食物名称
    public static void setFoodName(int op2,String name){
        food[op2].foodName=name;

    }
//设置食物价格
    public static void setFoodPrice(int op2,double price){
        food[op2].foodPrice=price;
    }
//添加(修改)食物描述
    public static void addFoodDescription(int op2,String description){
        food[op2].foodDescription=description;
    }

//删除食物
    public static void deleteFood(int op2){
        food[op2].foodName=" ";
        food[op2].foodPrice=0;
        food[op2].foodDescription=" ";


    }

//搜索食物
    public  void search(Food[] food, String target){

        int ret=foodName.indexOf(target);
        if(ret==-1){
            System.out.println("没有找到你想要的食物");
        }
        else System.out.println("");
    }

//列出所有食物信息
    public static void list(){
        int i;
        for(i=0;i<5;i++){
            System.out.println(i+1+""+food[i].foodName
                    +"\t"+food[i].foodPrice
                    +"\t"+food[i].foodDescription);
        }
    }

//计算统计食物总金额
   public static double calcBills(int order,int num){
        return food[order-1].foodPrice*num;
    }

}

