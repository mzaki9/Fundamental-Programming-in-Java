public class App {
    public static void main(String[] args) throws Exception {
    
        Food food = new Food("Ice Cream", "Dessert");
        Restaurant restaurant = new Restaurant("McDonald");

        restaurant.setFood(food);

        System.out.println();
        System.out.println(restaurant.getFood().getFoodName() + " adalah salah satu makanan di " +restaurant.getRestaurantName() + " dengan tipe " + restaurant.getFood().getTypeofFood());
        System.out.println();
        
    
    }
}
