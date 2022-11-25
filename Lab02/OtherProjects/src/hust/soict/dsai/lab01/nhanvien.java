package hust.soict.dsai.lab01;
public class nhanvien {
    private String tenNhanVien;
    private double luongcoban;
    private double heSoLuong;

    public double LUONG_MAX = 100000.999;
    public double tinhluong() {
        return luongcoban*heSoLuong; 
    }
    public boolean tangLuong (double x){
        heSoLuong += x;
        if (tinhluong() > LUONG_MAX) return false;
        else return true;
    }
    public void inTTin(){
        System.out.println(tenNhanVien);
    }
 }
