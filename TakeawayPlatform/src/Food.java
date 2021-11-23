public class Food {
    String foodName;
    double foodPrice;
    String foodDescription;

    static Food food[]=new Food [5];

//设置食物名称
    public void setFoodName(String name){
        this.foodName=name;
    }
//设置食物价格
    public void setFoodPrice(double price){
        this.foodPrice=price;
    }
//添加(修改)食物描述
    public void addFoodDescription(String description){
        this.foodDescription=description;
    }

//计算统计食物金额

//搜索食物
    public  void search(Food food[],String target){

        int ret=foodName.indexOf(target);
        if(ret==-1){
            System.out.println("没有找到你想要的食物");
        }
        else System.out.println("");
    }

//列出所有食物信息
    public static void list(){
        int i=0;
        for(i=0;i<5;i++){
            System.out.println(i+1+""+food[i].foodName
                    +"\t"+food[i].foodPrice
                    +"\t"+food[i].foodDescription);
        }
    }

   public static double calcBills(int order,int num){

        return food[order-1].foodPrice*num;

   }

}

