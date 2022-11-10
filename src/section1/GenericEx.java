package section1;

public class GenericEx {
    public static void main(String[] args) {
//        Box<Toy> toyBox = new Box<>();
//        toyBox.setItem(new miniCar()); // 다형성 적용
//        toyBox.setItem(new superCar()); // 에러

//        Box<miniCar> toyBox = new Box<>();
//        Box<superCar> superCarBox = new Box<>(); //에러

        //인스턴스화
        Box<Toy> toyBox = new Box<>();
        Box<miniCar> miniCarBox = new Box<>();
    }
}
interface Plastic{}
class Toy implements Plastic{}

class miniCar extends Toy implements Plastic{ }
class superCar {}

//class Box<T extends Plastic>{ // Box클래스를 인스턴스화 할 때 타입으로 Toy 클래스의 하위 클래스만 지정하도록 제한한다.
    class Box<T extends Toy & Plastic>{ //특정 클래스를 상속받으면서 동시에 특정 인터페이스를 구현한 클래스만 타입으로 지정할 수 있도록 제한 클래스 먼저 위치
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}