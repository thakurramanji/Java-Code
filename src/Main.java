

// Race condition resolve with synchronized

class Cnt {
    int val;

    public synchronized void inc() {
        val++;
    }
}

class Main {
    public static void main(String[] args) {
        Cnt c = new Cnt();

        Runnable obj1 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.inc();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 10000; i++) {
                c.inc();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join(); // Wait for both threads to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(c.val); // Now the expected output is 20000
    }
}








// our own exception while handling exception
//class RamaException extends Exception {
//    public RamaException(String s) {
//        super(s);
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        int i=30;
//        int j=0;
//
//        try {
//            j = 18/i;
//            if(j==0) {
//                throw new RamaException("Looking Good!!");
//            }
//
//        }
//        catch (RamaException e) {
//            System.out.println("Can not divided by zero--");
//        }
//        catch (Exception e) {
//            System.out.println("someting went wrong...");
//        }
//
//        System.out.println("Bye...");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        int i=0;
//        int j=0;
//        int arr[] = new int[4];
//
//        try {
//            j = 18/i;
//            System.out.println(arr[1]);
//            System.out.println(arr[5]);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Can not divided by zero--");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("be in your limit");
//        }
//        catch (Exception e) {
//            System.out.println("someting went wrong...");
//        }
//
//        System.out.println("Bye...");
//    }
//}

// Lambda function with return type

//@FunctionalInterface
//interface C {
//    int add(int i, int j);
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        C obj = (i,j) -> i+j; // only with functional interface
//
//        int res = obj.add(5,8);
//        System.out.println(res);
//    }
//}


// interface with Lambda

//@FunctionalInterface //which have only one method in interface
//interface A {
//    void show(int i);
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        A obj = (int i) -> System.out.println("in show "+ i);
//
//        obj.show(5);
//
//    }
//}

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