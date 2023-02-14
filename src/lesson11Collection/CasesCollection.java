package lesson11Collection;

import java.util.*;

public class CasesCollection {
    public static void main(String[] args) {
        //Задача1
        System.out.println("Задача1");
        sortList();
        System.out.println();

        //Задача2
        System.out.println("Задача2");
String str = "2. Глагол (الفِعْلُ) - это слово, указывающее на какое-либо событие, произошедшее в одном из времён. Например:\n" +
        "\n" +
        "كَتَبَ   он написал (глагол прошедшего времени)\n" +
        "\n" +
        "جَلَسَ   он сидел (глагол прошедшего времени)\n" +
        "\n" +
        "ضَرَبَ   он бил (глагол прошедшего времени)\n" +
        "\n" +
        "يَكْتُبُ   он пишет (глагол настоящего времени)\n" +
        "\n" +
        "يَجْلِسُ   он сидит (глагол настоящего времени)\n" +
        "\n" +
        "يَضْرِبُ   он бьет (глагол настоящего времени)\n" +
        "\n" +
        "سَيَكْتُبُ   он будет писать (глагол будущего времени)\n" +
        "\n" +
        "سَيَجْلِسُ      он будет сидеть (глагол будущего времени)\n" +
        "\n" +
        "سَيَضْرِبُ  он будет бить (глагол будущего времени)";
uniqWords(str);
        System.out.println();

        //Задача3
        System.out.println("Задача3");
String str2 = "Hello world";
charCounter(str2);
        System.out.println();
    }
    //Задача1
    public static ArrayList<Integer> sortList() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i <= 20; i++) {
            Integer num = random.nextInt();
            nums.add(num);
        }
        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        System.out.println(nums);
    return nums;}
    //Задача2
    public static Set<String> uniqWords(String str){
        str = str.replaceAll("[^a-zA-Zа-яА-Я0-9]", " ");
        List<String> wordsList = List.of(str.split(" "));
        Set<String> setWords = new HashSet<String>();
        setWords.addAll(wordsList);
        System.out.println(setWords);
        return setWords;
    }
    //Задача3
    public static Map<Character, Integer> charCounter(String str){
char[] chrs = str.toCharArray();
Map<Character,Integer> chrsMap = new HashMap<>();
for (char chr: chrs){
    if (chrsMap.get(chr) == null){
        chrsMap.put(chr, 1);
    }else {
       Integer cnt =  chrsMap.get(chr)+1;
        chrsMap.put(chr, cnt);
    }
}
        System.out.println(chrsMap);
        return chrsMap;
    }
}
