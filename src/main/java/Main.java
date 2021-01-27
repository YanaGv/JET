import com.yanagv.task.array.entity.CustomArray;
import com.yanagv.task.array.exeption.CustomArrayException;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        CustomArray carray;
        carray = new CustomArray(array);
        System.out.println(carray.getElement(0));
    }
}
