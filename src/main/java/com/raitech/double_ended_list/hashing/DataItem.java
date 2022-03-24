package com.raitech.double_ended_list.hashing;

class DataItem {
    int data;

    DataItem(int data) {
        this.data = data;
    }

    int getKey() {
        return data;
    }
}
