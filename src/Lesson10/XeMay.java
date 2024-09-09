package Lesson10;

public class XeMay extends Vehicle{
    private int congSuat;

    public XeMay() {
    }

    public XeMay(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe, int congSuat) {
        super(ID, hangSanXuat, namSanXuat, gia, mauXe);
        this.congSuat = congSuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void khoiDong() {
        System.out.println("Khoi dong xe may");
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                "} " + super.toString();
    }
}
