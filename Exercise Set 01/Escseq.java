public class Escseq {
    public static void main(String[] args) {
        int count = 10; // Number of multiples of 7 to print
        boolean tab = false; // To toggle between tab and no tab

        for (int i = 1; i <= count; i++) {
            int multipleOfSeven = i * 7;
            
            // Print with or without a tab depending on the toggle
            if (tab) {
                System.out.println("\t" + multipleOfSeven);
            } else {
                System.out.println(multipleOfSeven);
            }

            // Toggle the tab variable
            tab = !tab;
        }
    }
}
