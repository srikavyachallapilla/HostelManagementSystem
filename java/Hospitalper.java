package a.svecw.original;

public class Hospitalper {
    //listing all credentials filled in hospital permissions xml
    String name,regno,hostel,roomno,reason,hospitalname,date,time,phone;
    //creating corresponding parameterised constructor with all credentials as parameters


    public Hospitalper(String name, String regno, String hostel, String roomno, String reason, String hospitalname, String date, String time,String phone) {
        this.name = name;
        this.regno = regno;
        this.hostel = hostel;
        this.roomno = roomno;
        this.reason = reason;
        this.hospitalname = hospitalname;
        this.date = date;
        this.time = time;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
