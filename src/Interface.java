interface test {

    String color = "Blue";

    void fillUp();
}


public class Interface implements test {
    public static void main(String[] args) {
        System.out.println(color);

        Interface ex = new Interface();
        ex.fillUp();
    }

    @Override
    public void fillUp() {
        System.out.println("Filled");
    }
}