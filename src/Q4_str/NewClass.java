package Q4_str;


class Dog {

    public void bark() {
        System.out.println("Dog Bark");
    }
}

class LionShepherd extends Dog implements Runnable {

    @Override
    public void run() {
        bark();
    }

    @Override
    public void bark() {
        System.out.println("LionShepherd Bark");
    }
}

class Test {

    public static void main(String[] args) {
        LionShepherd l = new LionShepherd();
        Thread t = new Thread(l);
        t.start();
    }
}
