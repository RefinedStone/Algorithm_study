//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Problem14_2 {
//    public static void main(String[] args) {
//        int n = 15;
//        // 2진수변환
//        String s = Integer.toString(n, 2);
//        System.out.println(s);
//        List<Integer> list = Stream.of(s).map(x -> Integer.parseInt(x)).collect(Collectors.toList());
//        // 1의 갯수세기
//        long oCount = s.chars()
//                .filter(c -> c == '1')
//                .count();
//        System.out.println("1갯수: "+oCount);
//        //0의 갯수 세기
//        long zCount =  list.size()-oCount;
//        //앞쪽에서 가장 오른쪽이 0인 값
//        int indexZero =0;
//        for (int i = 0; i <list.size() ; i++) {
//            //왼쪽부터 가장 오른쪽에 0인값
//            if(list.get(i+1)==1){
//                indexZero =i;
//                list.set(i+1,1);
//                zCount--;
//                oCount++;
//            }
//            for (int j = 0;; j++) {
//                if(list.get(1+i+j)==0){
//
//                }
//            }
//
//
//        }
//
//       /*
//       * 78 -> 1001110
//       * 1,0,0,1,1,1,0  -> 1의 갯수가 4개
//       * 1,0,1,0,0,1,1
//        83 -> 1010011
//       * 15 - > 1 1 1 1 -> 1의 갯수가 4개
//       * 0,1,1,1,1
//       * 1,0,1,1,1
//       *
//       * */
//    }
//
//
//}
