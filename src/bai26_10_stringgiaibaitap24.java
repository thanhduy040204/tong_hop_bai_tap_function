public class bai26_10_stringgiaibaitap24 {
    public static void main(String[] args) {
        String path = "D:/galailaptrinh/music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        System.out.println(lastSlashIndex);
        String fileName = path.substring(lastSlashIndex+1);
        System.out.println(fileName);
        int lastDotIndex = fileName.lastIndexOf('.');
        System.out.println(lastDotIndex);
        String nameOnly = fileName.substring(0, lastDotIndex);
        System.out.println(nameOnly);
    }
}
