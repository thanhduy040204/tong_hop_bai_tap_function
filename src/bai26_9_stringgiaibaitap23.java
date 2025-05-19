import java.util.Scanner;

public class bai26_9_stringgiaibaitap23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao chuoi: ");
        String input = sc.nextLine();

        // tach 2 chuoi
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();
        StringBuilder specialchars = new StringBuilder();
        //duyet chuoi
        for(int i =0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isDigit(c)){
                so.append(c);
            } else if (Character.isLetter(c)) {
                chuoi.append(c);
            } else{
                specialchars.append(c);
            }
        }
        //in ket qua
        System.out.println("chuoi ky tu: "+chuoi);
        System.out.println("chuoi so : "+so);
        System.out.println("chuoi specialchars: "+specialchars);
    }
}
