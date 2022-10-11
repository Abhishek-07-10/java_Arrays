public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++){
            int ch = arr[n-1];
            for(int j = n-1 ; j >= 1 ; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = ch;
        }
        
        for(int x : arr){
                System.out.print(x);
        }
        System.out.println();
    }
}
