public class Animal {
    public String name;
    public String favFood;
    static int population;

    public Animal(String name, String favFood) {
        this.name = name;
        this.favFood=favFood;
        population++;
    }


    public void sleep(String name){
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        if(favFood.equals(food)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM " + this.name + " wants more " + food);
        }else{
            System.out.println(this.name + " eats " + food);
            sleep(this.name);
        }
    }

}
