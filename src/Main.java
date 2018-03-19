public class Main {

    public static void main(String[] args) {
        System.out.println("\n=====  Hello, LListApp!  =====\n");

        LList llist = new LList( 10 );
        System.out.println("\ninitial list is 10?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());

        llist.append(20);
        System.out.println("\nappend 20 so 10-20?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());

        llist.append(30);
        System.out.println("\nappend 30 so 10-20-30?:\t" + llist);
        System.out.println("what if remove head?:\t" + llist.next());

        System.out.println(llist.intialize(5,10));

        llist.prepend(6);
        System.out.println(llist);

        llist.insert(4,1);
        System.out.println(llist);

        llist.remove(2);
        System.out.println(llist);

        System.out.println(llist.search(4));
    }
}
