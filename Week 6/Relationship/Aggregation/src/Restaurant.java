public class Restaurant {
    private String restaurantName;
    private Food food;

    public Restaurant(String restaurantName){
        this.restaurantName = restaurantName;
    }

    public String getRestaurantName() {
        return this.restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Food getFood() {
        return this.food;
    }

    public void setFood(Food food) {
        this.food = food;
    }


}
