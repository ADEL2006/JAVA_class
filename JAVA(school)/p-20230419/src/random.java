import java.util.*;

public class random {
    public static void random(String args[]){
        Random rand = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        // 0부터 20까지의 랜덤한 정수를 100번 생성
        for (int i = 0; i < 100; i++) {
            int num = rand.nextInt(21);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 생성된 수의 횟수를 내림차순으로 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        // 가장 많이 생성된 수부터 5개 출력
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            if (count == 5) break;
            System.out.println(entry.getKey() + " : " + entry.getValue() + "번");
            count++;
        }

    }
}
