import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < num; i++) {
            set.add(sc.nextLine());
        }

        List<String> list = new ArrayList<>(set);

        // 길이순 > 알파벳순
        for (int i = 0; i < list.size() - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < list.size(); j++) {
                String s1 = list.get(minIdx);
                String s2 = list.get(j);

                // 길이 비교후 s1보다 짧거나 , 길이가 같으면 알파벳 순서 비교후 s2가 더 작으면 minIdx업데이트
                if (s2.length() < s1.length() || (s2.length() == s1.length() && s2.compareTo(s1) < 0)) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                // 가장 작은값 인덱스와 현재위치의 인덱스값이 다르면 minIdx를 현재인덱스에 저장
                String temp = list.get(i);
                list.set(i, list.get(minIdx));
                list.set(minIdx, temp);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
        sc.close();
    }
}