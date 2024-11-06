package kadai_015;

public class CarExec_Chapter15 {
    public static void main(String[] args) {
        // 車のインスタンスを生成
        Car_Chapter15 car = new Car_Chapter15();
        
        // ギアチェンジし、その結果を表示する
        car.changeGear(3);
        car.run();
    }
}
