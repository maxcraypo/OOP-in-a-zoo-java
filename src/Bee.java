public class Bee extends Animal {


    public Bee(String name){
        super(name,"pollen");
    }
    public void sleep(String name){
        System.out.println(this.name + " never sleeps");
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

