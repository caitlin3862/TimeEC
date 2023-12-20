public class TimeRunner {
    public static void main(String[] args) {
        /* Testing tick() method */
        Time time1 = new Time(16, 59, 56);
        System.out.println(time1.info()); // 16:59:56
        time1.tick(); // 57 seconds
        time1.tick(); // 58 seconds
        System.out.println(time1.info()); // 16:59:58
        time1.tick(); // 59 seconds
        time1.tick(); // 0 seconds 0 minutes and 17 hours
        System.out.println(time1.info()); // 17:00:00
        Time time2 = new Time(5, 8, 7);
        System.out.println(time2.info()); // 05:08:07
        time2.tick(); // 8 seconds
        time2.tick(); // 9 seconds
        time2.tick(); // 10 seconds
        System.out.println(time2.info()); // 05:08:10
        Time time3 = new Time(23, 59, 58);
        time3.tick(); // 59 seconds
        time3.tick(); // 60 seconds --> 60 minutes --> 24 hours
        System.out.println(time3.info()); // 00:00:00

        /* Testing add() method */
        Time time4 = new Time(15, 23, 40);
        System.out.println(time4.info()); // 15:23:40
        Time time5 = new Time(8, 27, 32);
        System.out.println(time5.info()); // 08:27:32
        time4.add(time5);
        System.out.println(time4.info()); // 23:51:12
        Time time6 = new Time(3, 45, 8);
        System.out.println(time6.info()); // 03:45:08
        time5.add(time6);
        System.out.println(time5.info()); // 12:12:40
        time4.add(time6);
        System.out.println(time4.info()); // 03:36:20
    }
}
