public class Food {
    String foodName;
    double foodPrice;
    String foodDescription;


//设置食物名称
    public void setFoodName(String name){
        this.foodName=name;
    }
//设置食物价格
    public void setFoodPrice(double price){
        this.foodPrice=price;
    }
//添加食物描述
    public void addFoodDescription(String description){
        this.foodDescription=description;
    }

//搜索食物
    public  void search(String foodName,String target){
        int ret=foodName.indexOf(target);
        if(ret==-1){
            System.out.println("没有找到你想要的食物");
        }
        else System.out.println("");
    }


//列出所有食物信息
    public void list( ){
for (int i=0;i<5;i++)
        System.out.println();
    }





}

