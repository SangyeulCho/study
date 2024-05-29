public class Car {
    private final String name;
    private int position;

    public Car(String name){
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return this.name;
    }

    public boolean move(int val){
        if(val < 0 || val > 9){
            return false;
        }
        if(val > 4){
            position++;
        }
        return true;
    }

    public int getPosition(){
        return this.position;
    }
}
