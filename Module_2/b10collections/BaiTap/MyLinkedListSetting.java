package b10collections.BaiTap;


public class MyLinkedListSetting<E>{
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData()  {
            return data;
        }
    }

    private Node head;
    private int numNode;

    public MyLinkedListSetting() {
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNode++;
    }

    public E getFirst() {
        return (E) head.data;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNode++;
    }

    public E getLast() {
        Node temp = head;

        while (temp.next!=null){
            temp=temp.next;
        }
        return (E) temp.data;
    }

    public void add(E element, int index) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNode++;
    }



    public int size() {
        return numNode;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E remove(int index) {

        if (index < 0 || index > numNode) {
            throw new IllegalArgumentException("index " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            head = head.next;
            numNode--;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNode--;

        }
        return (E) data;
    }

    public boolean remove(E element) {
        if (head.data.equals(element)) {
            remove(0);
            return true;
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNode--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    public MyLinkedListSetting<E> clone() {
        if (numNode == 0) {
            throw new NullPointerException("LinkedList này null");
        }
        Node temp = head;
        MyLinkedListSetting<E> returnMyLinkedListSetting = new MyLinkedListSetting<>();
        returnMyLinkedListSetting.addFirst((E) temp.data);
        temp = temp.next;
        while (temp!= null) {
            returnMyLinkedListSetting.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnMyLinkedListSetting;
    }

    public boolean contains(E element) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.data.equals(element)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element) {
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (temp.data.equals(element)) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }
    public void clear(){
        Node temp=head;
        head=null;
        while (temp.next!=null){
            temp.next=null;
        }
        numNode=0;
    }


}
