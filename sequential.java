// import java.util.*;

// public class sequential {
//     public static List<Integer> sequentialnumber(int low, int high) {
//         final List<Integer> list = new ArrayList<>();
//         String digits = "123456789";

//         for (int i = 1; i <= 9; i++) {
//             for (int j = 0; i + j <= digits.length(); j++) {
//                 String newstring = digits.substring(i, i + j);
//                 int value = Integer.parseInt(newstring);
//                 if (value >= low && value <= high) {
//                     list.add(value);
//                 }
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         sequential ss = new sequential();
//         System.out.println(ss.sequentialnumber(1000, 13000));

//     }
// }
