package Singleton;

public class Main {
    public static void main(String[] args) {
        //creating obj 1
        AttendanceKeeper attendance1 = AttendanceKeeper.getInstance();
        // Marking attendance
        attendance1.markAttendance(1);

        //creating obj 2
        AttendanceKeeper attendance2 = AttendanceKeeper.getInstance();
        // Marking attendance
        attendance2.markAttendance(0);


        System.out.println("Attendence1 marked by:" + attendance1.keeper);
        System.out.println("Attendence2 marked by:" + attendance2.keeper);
        System.out.println(attendance1==attendance2);
        

    }
}
