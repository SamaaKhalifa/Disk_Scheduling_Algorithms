import java.util.ArrayList;

public class C_look_algorithm  extends Shared_algorithm implements Disk_Scheduling_Algorithm {
    private final ArrayList<Integer>input_temp;
    C_look_algorithm(ArrayList<Integer> input_cylinders, int head){
        super(input_cylinders,head);
        input_temp=new ArrayList<>(input_cylinders);
    }
    @Override
    public void scheduling() {
        sort(input_temp);
        int startpoint=0;
        for (int i = 0; i< input_temp.size(); i++){
            if (input_temp.get(i)>head_start){
                startpoint=i-1;
                break;
            }
        }
        int start=head_start;
        for (int i=startpoint;i>=0;i--){
            Total_Movement+=Math.abs(start-input_temp.get(i));
            cylinders.add(input_temp.get(i));
            start=input_temp.get(i);
        }
        for (int i=input_temp.size()-1;i>startpoint;i--){
            Total_Movement+=Math.abs(start-input_temp.get(i));
            cylinders.add(input_temp.get(i));
            start=input_temp.get(i);
        }
        System.out.print("C_look algorithm = ");
        for (Integer cylinder : cylinders) System.out.print(cylinder + " ");
        System.out.print("\t");
        System.out.println("Total Movement = "+Total_Movement);
    }
}
