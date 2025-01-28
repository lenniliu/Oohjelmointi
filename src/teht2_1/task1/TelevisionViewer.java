package teht2_1.task1;

public class TelevisionViewer {


    public static void main(String[] args) {
        Television tv = new Television();
        tv.setChannel(1);

        for (int day = 1; day <= 10; day++) {
            System.out.println("Woke up, day " + day);

            boolean tired = false;

            if (!tv.isOn()) {
                tv.turnOn();

                while (!tired) {
                    System.out.println("Watching channel " + tv.getChannel());
                    tv.setChannel(tv.getChannel() + 1);
                    if (tv.getChannel() % 4 == 0)
                        tired = true;

                }

                tv.turnOff();
                System.out.println("Falling asleep");
            }
        }

    }
}
