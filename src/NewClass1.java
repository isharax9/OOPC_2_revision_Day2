
class Outer {

    interface Greeting {

        void greet();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greeting.greet();
    }
}
