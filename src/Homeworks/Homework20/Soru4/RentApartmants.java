package Homeworks.Homework20.Soru4;

public class RentApartmants {
    private String name;
    private int roomCount;
    private boolean balconyOrno;

    public RentApartmants(String name, int roomCount, boolean balconyOrno) {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrno(balconyOrno);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrno() {
        return balconyOrno;
    }

    public void setBalconyOrno(boolean balconyOrno) {
        this.balconyOrno = balconyOrno;
    }

}
