import java.util.Scanner;

public class bai26_6_stringGIAIBAITAP20 {
    /*
        viết chương trình kiểm tra tính hợp lệ của mật khẩu: aaaaaAAAAAA1
        * mật khẩu hợp lệ khi ít nhất có 6 kí tự
        * chứa ít nhất một chữ cái(chữ cái thường hoặc hoa đều được)
        * chứa ít nhất 1 chữ số
        //yêu cầu thứ 2
        - cho người dùng nhập vào mật khẩu để login/ so sánh , nếu đúng thì đăng nhập,
        sai quá 5 lần thì out chương trình
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password="";
        while (true){
            System.out.println("Moi ban thiet lap mat khau('it nhat 6 ki tu, it nhat 1 chu cai, it nhat 1 so'): ");
            String newPassword = sc.nextLine();
            if(checkMK(newPassword)){
                password=newPassword;
                System.out.println("Mat khau moi da duoc thiet lap");
                break;
            }else{
                System.out.println("Mat khau khong hop le");
            }
        }
        int count = 0;
        String login ="";
        while (true){
            System.out.println("Moi ban nhap mat khau: ");
            login = sc.nextLine();
            if(login.equals(password)){
                System.out.println("Ban da dang nhap thanh cong");
                break;
            }else{
                System.out.println("Ban da nhap sai mat khau, vui long nhap lai ");
                System.out.println("Ban con "+ (5-count)+" lan nhap lai");

                count++;
            }
            if(count==5){
                System.out.println("ban da nhap sai qua 5 lan, xin vui long dang nhap sau 3p");
                break;
            }
        }



    }
    public static boolean checkMK(String password){
        // kiem tra do dai
        if(password.length()<6){
            return false;
        }
        boolean hasLetter = false;
        for(char c:password.toCharArray()){
            if(Character.isLetter(c)){
                hasLetter = true;
            }
        }
        if(!hasLetter){
            return false;
        }

        boolean hasNumber = false;
        for(char c:password.toCharArray()){
            if(Character.isDigit(c)){
                hasNumber = true;
            }
        }
        if(!hasNumber){
            return false;
        }
        return true;

    }
}
