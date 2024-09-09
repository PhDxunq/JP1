package Lesson10;

public class OTo extends Vehicle{
    private int soChoNgoi;
    private String kieuDongCo;

    public OTo() {
    }

    public OTo(int ID, String hangSanXuat, int namSanXuat, double gia, String mauXe, int soChoNgoi, String kieuDongCo) {
        super(ID, hangSanXuat, namSanXuat, gia, mauXe);
        this.soChoNgoi = soChoNgoi;
        this.kieuDongCo = kieuDongCo;
    }

    @Override
    public void khoiDong() {
        System.out.println("Khoi dong o to");
    }

    public int choKHach(int soHanhKhach){
        if(soHanhKhach > soChoNgoi){
            return (soHanhKhach - soChoNgoi);
        } else {
            return 0;
        }
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public String getKieuDongCo() {
        return kieuDongCo;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public void setKieuDongCo(String kieuDongCo) {
        this.kieuDongCo = kieuDongCo;
    }

    i

    @Override
    public String toString() {
        return "OTo{" +
                "soChoNgoi=" + soChoNgoi +
                ", kieuDongCo='" + kieuDongCo + '\'' +
                "} " + super.toString();
    }
}
