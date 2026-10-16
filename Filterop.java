import java.util.List;
import java.util.stream.Collectors;

class filterlambda {
    public static void main(String[] args) {

        // Filter: keep only items that pass a defined test
        List<Integer> nums = List.of(5, 12, 8, 3, 20, 7);

        List<Integer> result = nums.stream()
                .filter(n -> n >= 7)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}