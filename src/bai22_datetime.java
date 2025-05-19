import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        //lấy ngày tháng năm
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
        // set ngaỳ tháng năm theo ý muón
        cal.set(Calendar.YEAR, 2025);
        cal.set(Calendar.MONTH, 3);
        cal.set(Calendar.DAY_OF_MONTH, 21);
        //kiểm tra ngày tháng sa khi setup
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("Ngay thang nam sinh: "+namSinh+"/"+thangSinh+"/"+ngaySinh);
        // xuất theo định dạng
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
        //tạo một đối tượng date để get time trong đối tượng cal
        Date d = cal.getTime();
        String s= dinhDang.format(d);
        System.out.println(s);
    }
}
