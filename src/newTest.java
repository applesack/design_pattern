import java.util.ArrayList;

public class newTest {

    public static void main(String[] args) {


        char list[] = {'a','c','g','y','u'};
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i:list) {
            arrayList.add((char) i);
        }
        arrayList.sort((a,b)-> (int)a-(int)b);
        System.out.println(arrayList.toString());
    }
}
