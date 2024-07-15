// about interface

interface C{
    void show();
    void config();
}

public class Main {

    public static void main(String[] args) {

        C obj=new C() {
            public void show() {

            }
            public void config() {

            }
        };
    }
}