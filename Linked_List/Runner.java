package Linked_List;


public class Runner {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insertAtStart(5);
        list.insertAt(2,50);
        list.remove(1);
        list.show();
    }
}
