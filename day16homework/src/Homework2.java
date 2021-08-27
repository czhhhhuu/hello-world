/**
 * @author CZH
 */
public class Homework2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(205, 20);
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setSize(3);
        vehicle.move();
        System.out.println("速度是："+vehicle.getSpeed()+" 体积是："+vehicle.getSize());
        System.out.println("速度是："+vehicle1.getSpeed()+" 体积是："+vehicle1.getSize());
        vehicle.speedDown();
        System.out.println("速度是："+vehicle.getSpeed()+" 体积是："+vehicle.getSize());
        vehicle.speedUp();
        System.out.println("速度是："+vehicle.getSpeed()+" 体积是："+vehicle.getSize());
        System.out.println(vehicle);
        System.out.println(vehicle);
    }


}
