package b10collections.BaiTap;

import java.util.Arrays;


public class MyListSetting<E> {
        private int size = 0;
        private static final int DEFAULT_CAPACITY = 10;
        Object elements[];

        public MyListSetting() {
            elements = new Object[DEFAULT_CAPACITY];
        }

        public MyListSetting(int capacity) {
            if (capacity <= 0) {
                elements = new Object[capacity];
            } else
                throw new IllegalArgumentException("capacity " + capacity);
        }

        public int size() {
            return size;
        }

        public void clear() {
            size = 0;
            for (int i = 0; i < elements.length; i++) {
                elements[i] = null;
            }
        }

        public void ensureCapacity(int mincapacity) {
            if (mincapacity >= 0) {
                int newsize = elements.length + mincapacity;
                elements = Arrays.copyOf(elements, newsize);
            } else
                throw new IllegalArgumentException("mincapacity " + mincapacity);

        }

        public boolean add(E element) {
            if (elements.length == size) {
                this.ensureCapacity(5);
            }
            elements[size] = element;
            size++;
            return true;
        }

        public void add(int index, E element) {
            if (index > elements.length) {
                throw new IllegalArgumentException("index " + index);
            } else if (elements.length == size) {
                this.ensureCapacity(5);
            }
            if (elements[index] == null) {
                elements[index] = element;
            } else {
                for (int i = size + 1; i >= index; i--) {
                    elements[i] = elements[i - 1];
                }
                elements[index] = element;
                size++;
            }
        }

        public E get(int index) {
            return (E) elements[index];
        }

        public int indexOf(E element) {
            int index = -1;
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(element)) {
                    return i;
                }
            }
            return index;
        }

        public MyListSetting<E> clone() {
            MyListSetting<E> v = new MyListSetting<>();
            v.elements = Arrays.copyOf(this.elements, this.size);
            v.size = this.size;
            return v;
        }

        public boolean contain(E element) {
            return indexOf(element) >= 0;
        }
        public E remove(int index){
            if (index<0 || index>elements.length){
                throw new IllegalArgumentException("index "+index);
            }
            E element= (E) elements[index];
            for (int i=index;i<size-1;i++){
                elements[i]=elements[i+1];
            }
            elements[size-1]=null;
            size--;
            return element;
        }

    }

