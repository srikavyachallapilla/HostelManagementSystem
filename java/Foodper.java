package a.svecw.original;

public class Foodper {
    //listing all credentials filled in food permissions xml
    String name,regno,roomno,hostel,reason,phone;
    //creating corresponding parameterised constructor with all credentials as parameters

    public Foodper(String name, String regno, String hostel, String roomno, String reason,String phone) {
        this.name = name;
        this.regno = regno;
        this.roomno = roomno;
        this.hostel = hostel;
        this.reason = reason;
        this.phone=phone;
    }

    //Creating getter setter for all credentials
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegno() {
        return regno;
    }

    public void setRegno(String regno) {
        this.regno = regno;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
