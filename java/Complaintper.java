package a.svecw.original;

public class Complaintper {
    //listing all credentials filled in complaint permissions xml
    String name,regno,hostel,roomno,complaint,phone;
    //creating corresponding parameterised constructor with all credentials as parameters


    public Complaintper(String name, String regno, String hostel, String roomno, String complaint,String phone) {
        this.name = name;
        this.regno = regno;
        this.hostel = hostel;
        this.roomno = roomno;
        this.complaint = complaint;
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

    public String getHostel() {
        return hostel;
    }

    public void setHostel(String hostel) {
        this.hostel = hostel;
    }

    public String getRoomno() {
        return roomno;
    }

    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }
}
