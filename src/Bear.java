public class Bear extends Animal {


    public Bear(String name) {
        super(name, "fish");
    }

    public void sleep(String name) {
        System.out.println(this.name + "hibernates for 4 months");
    }
}