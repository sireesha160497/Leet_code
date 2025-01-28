public class Main {
    public static void main(String[] args) {
        int[] num = {1,1,0,1,1,1,1,0};
        MaxConsecutiveOnes moc = new MaxConsecutiveOnes();
        System.out.println(moc.findMaxConsecutiveOnes(num));
        int[] c = {123,546,3333,123456,1};
        Find_number_with_Even_digits f = new Find_number_with_Even_digits();
        System.out.println(f.findNumbers(c));
        int[] c2 = {13,-16,0,56,-45};
        SortedSquares sq= new SortedSquares();
        c2 = sq.sortedSquares(c2);
        System.out.print("["+c2[0]);
        for (int i=1;i<c2.length;i++){
            System.out.print(",");
            System.out.print(c2[i]);

        }
        System.out.print("]");
        System.out.println();
    }
}