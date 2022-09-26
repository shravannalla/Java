package Assignment10;

public class SListExample {
    public static void main(String[] args) {
        SList<String> list1 = new SList();
        SListIterator iterator1 = list1.iterator();
        iterator1.insert("Shravan");
        iterator1.insert("firstname");
        iterator1.insert("lastname");
        iterator1.insert("kumar");
        iterator1.remove();
        System.out.println(list1);
    }
}
