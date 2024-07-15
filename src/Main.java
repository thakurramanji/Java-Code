
// interface with Lambda

@FunctionalInterface //which have only one method in interface
interface A {
    void show(int i);
}

public class Main {
    public static void main(String[] args) {

        A obj = (int i) -> System.out.println("in show "+ i);

        obj.show(5);

    }
}

// enum details

//enum Laptop {
//    Mac(100000), Dell(44000), Lenovo(59000), Asus(50000);
//    int price;
//    Laptop(int price) {
//        this.price = price;
//    }
//    public int getPrice() {
//        return price;
//    }
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        for(Laptop l: Laptop.values()) {
//            System.out.println(l.name() + " : "+ l.getPrice());
//        }
//    }
//}
// Abstract keyword
//
//abstract class A {
//    public abstract void show();
//}
//
//class B extends A {
//
//    public void show() {
//
//    }
//}
//
//
//public class Main {
//
//    public static void main(String[] args) {
//
//    }
//}


// about interface
//
//interface C{
//    void show();
//    void config();
//}
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        C obj=new C() {
//            public void show() {
//
//            }
//            public void config() {
//
//            }
//        };
//    }
//}