public class Food {
    String foodName;
    double foodPrice;
    String foodDescription;



    public void setFoodName(String name){
        this.foodName=name;
    }

    public void setFoodPrice(double price){
        this.foodPrice=price;
    }

    public void addFoodDescription(String description){
        this.foodDescription=description;
    }

//搜索食物方法
    public  void search(String foodName,String target){
        int ret=foodName.indexOf(target);
        if(ret==-1){
            System.out.println("没有找到你想要的食物");
        }
        else System.out.println("");




    }





}

