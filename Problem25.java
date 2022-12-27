import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Problem25 {
    public static void main(String[] args) {
        int[] priorities = {2, 1, 3, 2};
        int location = 2;

        //list
        List<Integer> list = Arrays.stream(priorities).boxed().collect(Collectors.toList());
        //que
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            queue.add(priorities[i]);
        }
        System.out.println(queue);


        for (int i = 0; i < queue.size() ; i++) {
            for (int j = 0; j < list.size() ; j++) {
                if(queue.peek()<list.get(i)){
                    queue.add(queue.peek());
                    queue.poll();
                }
            }
        }
        System.out.println(queue);

    }
}
