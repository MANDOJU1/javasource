package study;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("자율 주행 자동차");
        Car aiCar = new AICar();
        aiCar.run();

        Car mulCar = new MunualCar();
        mulCar.run();
    }

}
