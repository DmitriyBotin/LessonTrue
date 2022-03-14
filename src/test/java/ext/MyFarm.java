package ext;

public class MyFarm {

    public static void main(String[] args) {
        Cat oli = new Cat("Oli");


        Cat dog1 = new Cat("Timur");

        oli.eat();
        oli.say();

        dog1.eat();
        dog1.say();
        System.out.println(dog1.getName());
        dog1.setName("Gerald");
        System.out.println(dog1.getName());
        dog1.getColor();
    }
}
