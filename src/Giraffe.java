public class Giraffe extends Animal {

    public Giraffe(String name){
        super(name,"leaves");
    }

    public void eat(String food){
        if(favFood.equals(food)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM " + this.name + " wants more " + food);
        }else{
            System.out.println("YUCK " + this.name + " will not eat " + food);
            sleep(this.name);
        }
    }
}
