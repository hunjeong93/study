package section1;

public class GenericEx {
    public static void main(String[] args) {
//        Box<Toy> toyBox = new Box<>();
//        toyBox.setItem(new miniCar()); // 다형성 적용
//        toyBox.setItem(new superCar()); // 에러

        Box<miniCar> toyBox = new Box<>();
//        Box<superCar> superCarBox = new Box<>(); //에러
    }
}

class Toy {}

class miniCar extends Toy { }
class superCar {}

class Box<T extends Toy>{ // Box클래스를 인스턴스화 할 때 타입으로 Toy 클래스의 하위 클래스만 지정하도록 제한한다.
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}