import java.util.ArrayList;
import java.util.Collections;

public class Shared_algorithm {
    protected final ArrayList<Integer> input_temp;
    protected final ArrayList<Integer> cylinders;
    protected final int  head_start;
    protected int Total_Movement;
    Shared_algorithm(ArrayList<Integer> input_cylinders, int head){
        this.input_temp = input_cylinders;
        head_start=head;
        Total_Movement=0;
        cylinders=new ArrayList<>();
    }
    protected void sort(ArrayList<Integer> input_cylinder){
        Collections.sort(input_cylinder);
    }
}
