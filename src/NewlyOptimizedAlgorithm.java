import java.util.ArrayList;

public class NewlyOptimizedAlgorithm  extends Shared_algorithm implements Disk_Scheduling_Algorithm {
    NewlyOptimizedAlgorithm(ArrayList<Integer>inputCylinders){
        super(inputCylinders,0);
    }



    @Override
    public ArrayList<Integer> scheduling() {
        cylinders.add(0);
        sort(input_temp);
        cylinders.addAll(input_temp);
        System.out.println("Newly optimized algorithm Total Movement = "+ input_temp.get(input_temp.size()-1));

        return cylinders;
    }
}
