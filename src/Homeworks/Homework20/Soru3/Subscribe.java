package Homeworks.Homework20.Soru3;

public class Subscribe {
    private String name;
    private boolean doYouWannaSub;
    private MemberShip whichMember;

    public Subscribe(String name, boolean doYouWannaSub, MemberShip whichMember) {
        setName(name);
        setDoYouWannaSub(doYouWannaSub);
       setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWannaSub() {
        return doYouWannaSub;
    }

    public MemberShip getWhichMember() {
        return whichMember;
    }

    public void setDoYouWannaSub(boolean doYouWannaSub) {
        this.doYouWannaSub = doYouWannaSub;
    }

    public void setWhichMember(MemberShip whichMember) {
        this.whichMember = whichMember;
    }


    @Override
    public String toString() {
        return "Subscribe{" +
                "name='" + name + '\'' +
                ", doYouWannaSub=" + doYouWannaSub +
                ", whichMember='" + whichMember + '\'' +
                '}';
    }
}
