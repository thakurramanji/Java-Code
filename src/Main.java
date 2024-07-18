import java.util.*;



class Main {
    public static void main(String[] args) {

    }
}


// worked with stream and filer and reduce and map
//
//import java.util.stream.Stream;
//
//
//class Main {
//    public static void main(String[] args) {
//
//        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
////        Stream<Integer> s1 = nums.stream();
////        Stream<Integer> s2 = s1.filter(n -> n%2==0);
////        Stream<Integer> s3 = s2.map(n -> n*2);
////
////        int res = s3.reduce(0, (c,e)->c+e);
//
//        int res = nums.stream()
//                        .filter(n -> n%2==0)
//                                .map(n -> n*2)
//                                        .reduce(0, (c,d) -> c+d);
//        System.out.println(res);
//
//
//
//    }
//}

// forEach use consumer class
//
//import java.util.function.Consumer;
//
//class Main {
//    public static void main(String[] args) {
//
//        Consumer<Integer> con = new Consumer<Integer>() {
//
//            public void accept(Integer n) {
//                System.out.println(n);
//            }
//        };
//
//        List<Integer> nums = Arrays.asList(4,5,9,1,3);
//
//        nums.forEach(con);
//
//    }
//}

// Comparator and comparable

//class Student {
//    int age;
//    String name;
//
//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//}
//
//class Main {
//    public static void main(String[] args) {
//
//        Comparator<Integer> com = new Comparator<Integer>() {
//            public int compare(Integer i, Integer j) {
//                if(i %10 > j%10) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        };
//
//        List<Integer> nums = new ArrayList<>();
//        nums.add(23);
//        nums.add(48);
//        nums.add(11);
//        nums.add(93);
//        nums.add(77);
//        Collections.sort(nums, com);
//
//        System.out.println(nums);


//        Map<String, Integer> mp = new HashMap<>();
//        mp.put("Ramanji", 77);
//        mp.put("Pintu", 99);
//        mp.put("George", 89);
//        mp.put("Richa", 100);
//        System.out.println(mp.get("Ramanji"));



//        Collection<Integer> nums = new TreeSet<Integer>(); // Set // HashSet //
//        nums.add(51);
//        nums.add(82);
//        nums.add(19);
//        nums.add(99);
//        nums.add(77);
//
//        Iterator<Integer> its = nums.iterator();
//
//        while(its.hasNext()) {
//            System.out.println(its.next());
//        }

//        List<Integer> nums = new ArrayList<Integer>();
//        nums.add(5);
//        nums.add(8);
//        nums.add(1);
//        nums.add(9);
//        nums.add(2);
//        nums.add(7);
//        System.out.println(nums.get(3));
//        System.out.println(nums.indexOf(9));
//    }
//}


// Race condition resolve with synchronized

//class Cnt {
//    int val;
//
//    public synchronized void inc() {
//        val++;
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Cnt c = new Cnt();
//
//        Runnable obj1 = () -> {
//            for (int i = 0; i < 10000; i++) {
//                c.inc();
//            }
//        };
//
//        Runnable obj2 = () -> {
//            for (int i = 0; i < 10000; i++) {
//                c.inc();
//            }
//        };
//
//        Thread t1 = new Thread(obj1);
//        Thread t2 = new Thread(obj2);
//
//        t1.start();
//        t2.start();
//
//        try {
//            t1.join();
//            t2.join(); // Wait for both threads to finish
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(c.val); // Now the expected output is 20000
//    }
//}




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