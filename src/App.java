public class App {
    public static void main(String[] args) throws Exception {
        String[] arr1 = new String[]{"a", "b", "y", "z"};
        String[] arr2 = new String[]{"r", "z", "b", "x"};
        int p = 0;

        for(int i= 0;i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    p=1;
                }
            }
        }
        if(p==0) {
            System.out.println("No duplicates.");
        }
    }
}
