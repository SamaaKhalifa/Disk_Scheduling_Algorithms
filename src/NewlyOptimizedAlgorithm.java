import java.util.ArrayList;

public class NewlyOptimizedAlgorithm  extends Shared_algorithm implements Disk_Scheduling_Algorithm {
    NewlyOptimizedAlgorithm(ArrayList<Integer>inputCylinders){
        super(inputCylinders,0);
    }



    @Override
    public void scheduling() {
        sort(input_cylinders);

        System.out.print("Newly optimized algorithm = ");
        for (Integer cylinder : input_cylinders) System.out.print(cylinder + " ");
        System.out.print("\t");
        System.out.println("Total Movement = "+input_cylinders.get(input_cylinders.size()-1));

    }
}
