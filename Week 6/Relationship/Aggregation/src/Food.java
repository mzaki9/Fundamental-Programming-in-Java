public class Food {
    private String foodName;
    private String typeofFood;


    public Food (String foodName , String typeofFood){
        this.foodName = foodName;
        this.typeofFood = typeofFood;
    }

    public String getFoodName() {
        return this.foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getTypeofFood() {
        return this.typeofFood;
    }

    public void setTypeofFood(String typeofFood) {
        this.typeofFood = typeofFood;
    }

}
