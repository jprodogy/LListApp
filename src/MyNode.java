public class MyNode {
        public int value;
        public MyNode next;

        public MyNode(int data) {
            value = data;
            next = null;
        }


        @Override
        public String toString() {
            return Integer.toString(value);
        }
 }
