package com.mycompany;

/**
 * Created by kornel on 25.05.17.
 */
public class MyArrayItem <DataType> {
    private DataType data;
    private MyArrayItem next;

    public MyArrayItem(DataType data) {
        this.data = data;
    }

    public DataType getData() {
        return data;
    }


    public MyArrayItem getNext() {
        return next;
    }

    public void setNext(MyArrayItem next) {
        this.next = next;
    }
}
