package section1;

public class GenericEx {
    public static void main(String[] args) {
        Box<Toy> toyBox = new Box<>();
        toyBox.setItem(new miniCar()); // 다형성 적용
//        toyBox.setItem(new superCar()); // 에러
    }
}

class Toy {}

class miniCar extends Toy { }
class superCar {}

class Box<T>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}