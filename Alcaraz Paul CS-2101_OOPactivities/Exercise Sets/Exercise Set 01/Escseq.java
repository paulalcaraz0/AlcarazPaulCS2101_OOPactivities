public class Escseq {
    public static void main(String[] args) {
        int count = 10; 
        boolean tab = false;

        for (int i = 1; i <= count; i++) {
            int multipleOfSeven = i * 7;
            
            
            if (tab) {
                System.out.println("\t" + multipleOfSeven);
            } else {
                System.out.println(multipleOfSeven);
            }

           
            tab = !tab;
        }
    }
}
