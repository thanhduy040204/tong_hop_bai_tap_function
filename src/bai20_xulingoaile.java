public class bai20_xulingoaile {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try{
            int c=a/b;
            System.out.println("c= "+c);
        }
        catch(Exception ex){
            System.out.println("Có lỗi rồi bu nó ơi....");
            ex.printStackTrace();
        }
        finally{
            System.out.println("Có lỗi hay không lỗi thì đều phải chạy đoanj này");
        }
        System.out.println("Đoạn code này sẽ được chạy");
    }
}
