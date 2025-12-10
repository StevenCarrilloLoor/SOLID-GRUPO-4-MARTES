package isp.after;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        DisposableCamera camera = new DisposableCamera();

        System.out.println("Phone actions:");
        phone.turnOn();
        phone.charge();
        phone.turnOff();

        System.out.println("\nDisposable Camera actions:");
        camera.turnOn();
        camera.turnOff();
        System.out.println("Camera cannot be charged (no charge method available).");
    }
}