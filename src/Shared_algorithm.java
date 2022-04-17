import java.util.ArrayList;

public class Shared_algorithm {
    protected final ArrayList<Integer> input_cylinders;
    protected final ArrayList<Integer> cylinders;
    protected final int  head_start;
    protected int Total_Movement;
    Shared_algorithm(ArrayList<Integer> input_cylinders, int head){
        this.input_cylinders = input_cylinders;
        head_start=head;
        Total_Movement=0;
        cylinders=new ArrayList<>();
    }
    protected void sort(ArrayList<Integer> input_cylinder){
        for (int i = 0; i< input_cylinder.size(); i++){
            for (int g = i+1; g< input_cylinder.size(); g++){
                if (input_cylinder.get(i)> input_cylinder.get(g)) {
                    int num3= input_cylinder.get(i);
                    input_cylinder.set(i, input_cylinder.get(g));
                    input_cylinder.set(g,num3);
                }
            }
        }
    }
}
