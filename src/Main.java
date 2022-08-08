import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String input = sc.nextLine();
        String[] arr = input.toLowerCase().split(" ");
        for (int i = 0; i < arr.length; i++) {
            if(treeMap.containsKey(arr[i])){
                int value = treeMap.get(arr[i]);
                treeMap.remove(arr[i]);
                treeMap.put(arr[i],value+1 );
            }else{
                treeMap.put(arr[i],1);
            }
        }
        System.out.println("so lan xuat ien cua chuoi la: "+ treeMap);
    }
}
