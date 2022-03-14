package ext;

public class Fox extends Animals implements AnimalColor {
    public Fox(String name) {
        super(name);
    }

    public void say (){
        System.out.println("Gav");

    }


    @Override
    public void getColor() {
        System.out.println("Red");
    }
}
