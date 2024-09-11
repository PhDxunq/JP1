package Lesson11.HoTel;

public interface IHotel {
    public abstract void addCustomer();
    public abstract void deleteCustomoer(int CMND);
    public abstract void calculatePrice(int day,int CMND, String loaiPhong);
}
