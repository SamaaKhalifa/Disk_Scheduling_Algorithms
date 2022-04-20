import java.util.ArrayList;

public class SSTF extends Shared_algorithm implements Disk_Scheduling_Algorithm {

    private final ArrayList<Integer> input_temp;
    SSTF(ArrayList<Integer>inputCylindrs,int head){
        super(inputCylindrs,head);
        input_temp = new ArrayList<>(inputCylindrs);
    }

    int getClosestCylinder (final ArrayList<Integer> list, int head){

        ArrayList<Integer> cyliders = new ArrayList<>(list);
        for (int i = 0; i <cyliders.size() ; i++) {
            cyliders.set(i,Math.abs(cyliders.get(i)-head));
        }

        sort(cyliders);
        return cyliders.get(0);
    }

    @Override
    public ArrayList<Integer> scheduling() {
        int size = input_temp.size();
        int currentHead = head_start;
        cylinders.add(head_start);
        for (int i = 0; i <size ; i++) {
            int closest =getClosestCylinder(input_temp, currentHead);

            Total_Movement += closest;
            if(input_temp.contains(currentHead + closest))
            {
                currentHead = currentHead + closest;
            }
            else
            {
                currentHead = currentHead - closest;
            }
            cylinders.add(currentHead);
            input_temp.remove((Integer) currentHead);
        }

        System.out.println("SSTF algorithm Total Movement = "+ Total_Movement);
        return cylinders;
    }
}
