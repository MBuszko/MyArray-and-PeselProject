package com.mycompany;


public class MyList<DataType> {
    private MyArrayItem firstItem;
    private MyArrayItem lastItem;
    private int size;

    public void add(DataType data) {
        MyArrayItem<DataType> item = new MyArrayItem<DataType>(data);

        if(this.firstItem == null) {
            this.firstItem = item;
            this.lastItem = item;

        } else {
            this.lastItem.setNext(item);
            this.lastItem = item;
        }

        this.size++;
    }


    public DataType get(int index) {
        if(this.firstItem == null) {
            return null;
        } else {
            MyArrayItem<DataType> current = this.firstItem;
            int i = 0;

            do {
                if(i == index) {
                    return current.getData();
                } else {
                    i++;
                    current = current.getNext();
                }
            } while(current != null);

            return null;
        }
    }


    public int getSize() {
        return this.size;
    }

//    private Object o;
//    private static int counter = 0;
//    //private ListItem lastItem;
//
//
//    /*public void add(Object o) {
//        com.mycompany.ListItem listItem = new com.mycompany.ListItem(o);
//
//        if (this.lastItem != null) {
//            listItem.setNext(this.lastItem);
//        }
//        this.lastItem = listItem;
//    }*/
//
//    private ListItem firstElement;
//    private ListItem lastItem;
//
//
//    public void add(T t) {
//        if (firstElement == null) {
//            this.firstElement = new ListItem(t);
//            this.lastItem = firstElement;
//        } else {
//            lastItem.next = new ListItem(t);
//            lastItem = lastItem.next;
//        }
//    }
//
//    public T get(int i) {
//        int counter = 0;
//        ListItem current = firstElement;
//        while (current.next != null && counter != i) {
//            current = current.next;
//            counter++;
//        }
//        return current.data;
//    }
//
//    public int size() {
//        int answer = 0;
//        ListItem current = firstElement;
//        while (current != null) {
//            answer++;
//            current = current.next;
//        }
//        return answer;
//    }
//
//    private class ListItem {
//
//        private T data;
//        private ListItem next;
//
//        private ListItem(T data) {
//            this.data = data;
//        }
//    }


}
