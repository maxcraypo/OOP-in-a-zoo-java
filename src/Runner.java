public class Runner {


    public static void main(String[] args) {
        Tiger z = new Tiger("tigger");
        //z.eat("bacon");
        Bear x=new Bear("pooh");
        //x.eat("fish");
        Unicorn y=new Unicorn("rarity");
       // y.eat("marshmallows");
        Giraffe r=new Giraffe("gemma");
        //r.sleep("gemma");
        //r.eat("meat");
        //r.eat("leaves");
        Bee v=new Bee("stinger");
        //v.eat("ice cream");
        //v.eat("pollen");
        Zookeeper b = new Zookeeper("zoebot");
        Animal [] animals={z, x, y, r, v};
        Tiger john = new Tiger("john");
        b.feedAnimals("meat",animals);


    }
}
