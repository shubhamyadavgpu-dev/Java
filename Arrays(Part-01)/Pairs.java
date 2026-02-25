public class Pairs {
    public static void pairs(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            int curr = marks[i];
            for (int j = i + 1; j < marks.length; j++) {
               System.out.print("(" + curr + "," + marks[j] + ") ");

            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int marks[] = { 2, 4, 6, 8, 10 };
        pairs(marks);
    }
}
