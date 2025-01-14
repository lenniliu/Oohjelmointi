package teht1_1;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Cat named " + name + " says: Meow!");
    }

    public static void main(String args[]) {
        Cat cat1 = new Cat("Whiskers");
        Cat cat2 = new Cat("Benny");

        cat1.meow();
        cat2.meow();
    }
}
