package week11;

public class ParkingMeterTest {
    public static void main(String[] args) {
        ParkingMeter parkingMeter = new ParkingMeter(60);

        parkingMeter.add(25);
        System.out.println(parkingMeter.timeLeft);

        parkingMeter.tick();
        parkingMeter.tick();

        System.out.println("parkingMeter.isExpired() = " + parkingMeter.isExpired());
        System.out.println("parkingMeter.timeLeft = " + parkingMeter.timeLeft);
    }
}
