public class Zoo {
   private  String name;
    private String food;

    public Zoo(String name) {
        this.name = name;
        this.food = food;
    }

    public void sleep( String name){
        System.out.println(this.name + " sleeps for 8 hours");
    }
    String favoriteFood="bacon";
    public  void eat(String name, String food) {
        if (food.equals(favoriteFood)) {
            System.out.println(this.name + "eats " + this.food);
            System.out.println("YUM " + this.name + " wants more " + this.food);
        } else {
            System.out.println(name + " eats " + this.food);
            sleep(this.name);
        }
    }
}


