package Singleton;

public class AttendanceKeeper {
    private static AttendanceKeeper instance;
    public String keeper;

    //constructor
    private AttendanceKeeper() {
        this.keeper = "Representative";
    }

    // initialize instance-> access point for all clients
    public static AttendanceKeeper getInstance() {
        if (instance == null) {
            instance = new AttendanceKeeper();
        }
        return instance;
    }

    //to mark attendance
    public void markAttendance(int isPresent) {
       if (isPresent==1){
        System.out.println("Marked as present.");
    }
   else{
        System.out.println("Marked as absent.");
    }
       }
        

}
