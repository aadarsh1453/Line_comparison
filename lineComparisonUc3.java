
public class Line_Comparison_UC3 {
    
    public static void main(String[] args) {
        int x1l1 = 2;int x2l1 = 6;int y1l1 = 4;int y2l1 = 9;
        int x1l2 = 2;int x2l2 = 6;int y1l2 = 4;int y2l2 = 8;

        double length_line1 = Math.sqrt(Math.pow(x2l1-x1l1, 2) + Math.pow(y2l1-y1l1, 2));
        System.out.println("Length of line is :"+length_line1);

        double length_line2 = Math.sqrt(Math.pow(x2l2-x1l2, 2) + Math.pow(y2l2-y1l2, 2));
        System.out.println("Length of line is :"+length_line2);

        if(length_line1 == length_line2){
            System.out.println("Length of  both lines are equal");
        }
        else if(length_line1<length_line2){
            System.out.println("Length of  line 1 is less than line 2");
        }
        else{
            System.out.println("Length of line 1 is greater than line 2");
        }
    }
}
