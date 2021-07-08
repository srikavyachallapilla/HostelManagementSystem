package a.svecw.original;

public class Birthdayper {
    //listing all credentials filled in birthday permissions xml
    String name,regno,hostel,roomno,place,no_of_people,date,phone;
    //creating corresponding parameterised constructor with all credentials as parameters
    public Birthdayper(String name, String regno, String hostel, String roomno, String place, String no_of_people, String date,String phone) {
        this.name = name;
        this.regno = regno;
        this.hostel = hostel;
        this.roomno = roomno;
        this.place = place;
        this.no_of_people = no_of_people;
        this.date = date;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getNo_of_people() {
        return no_of_people;
    }

    public void setNo_of_people(String no_of_people) {
        this.no_of_people = no_of_people;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
