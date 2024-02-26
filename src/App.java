import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int maior = 0;
        int[] arr = new int[a];
        boolean venceu = true;

        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(i == 0){
                maior = arr[i];
            }
            if(arr[i] > maior){
                venceu = false;
            }
        }

        if(venceu == true){
            System.out.println("S");
        }else{
            System.out.println("N");
        }

        sc.close();
    }
}
