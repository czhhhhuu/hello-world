/**
 * @author CZH
 */
public class Vehicle {
    private int speed;
    private int size;

    public Vehicle() {
    }

    public Vehicle(int speed, int size) {
        this.speed = speed;
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", size=" + size +
                '}';
    }

    public void move(){
        System.out.println("正在移动!");
    }

    public void speedUp(){
        int x = 195;
        if(getSpeed() < x){
            setSpeed(getSpeed()+5);
        }else{
            System.out.println("不能再加速了！");
        }
    }
    public void speedDown(){
        int x = 5;
        if(getSpeed() > x){
            setSpeed(getSpeed()-5);
        }else{
            System.out.println("不能再减速了！");
        }
    }
}
