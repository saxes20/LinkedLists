
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String[] args) {
        LinkedList list = new LinkedList();
        list.insert(list, 1);
        list.insert(list, 2);
        list.insert(list, 3);
        list.insert(list, 4);
        System.out.println(list.getSize(list));
        list.printList(list);
        System.out.println(list.get(list, 2));
        System.out.println(list.find(list, 4));
        list.addFirst(list, 0);
        list.printList(list);
        list.removeHead(list);
        list.printList(list);
    }
}
