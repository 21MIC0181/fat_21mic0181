public class FAT {

    public static String checkVotingEligibility(int age) {
        if (age >= 18) {
            return "Eligible to Vote";
        } else {
            return "Not Eligible to Vote";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter age:");
            int age = sc.nextInt();

            String result = checkVotingEligibility(age);
            System.out.println(result);

            System.out.println("Program executed successfully.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            sc.close(); // Close the scanner to avoid resource leak
        }
    }
}