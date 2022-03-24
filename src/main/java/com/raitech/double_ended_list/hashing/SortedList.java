package com.raitech.double_ended_list.hashing;

class SortedList {
    Link first;

    SortedList() {
        first = null;
    }

    void insert(Link link) {
        Link previous = null;
        Link current = first; // first could be null, if list is empty

        while (current != null && current.getKey() < link.getKey()) {
            previous = current;
            current = current.next;
        }
        if (previous == null) { // empty list
            first = link;
        } else {
            previous.next = link;
        }
        link.next = current;
    }

    /**
     * This function is optimized, since it stops
     * as soon as it finds a link with a larger key than
     * the key which needs to be deleted.
     *
     * @param key
     */
    void delete(int key) {
        if (first == null) { // empty list
            return;
        }
        if (first != null && first.getKey() == key) { // if first needs to be deleted
            first = first.next;
            return;
        }

        Link previous = null;
        Link current = first;

        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) {
                previous.next = current.next;
                current.next = null;
                return; // done
            }
            previous = current;
            current = current.next;
        }
    }

    /**
     * This function is not optimised since it traverses all links
     * even when the list is sorted.
     *
     * @param key
     */
    void delete2(int key) {
        if (first == null) { // empty list
            return;
        }
        if (first != null && first.getKey() == key) { // first needs to be deleted
            first = first.next;
            return;
        }

        Link previous = null;
        Link current = first;

        while (current != null && current.getKey() != key) {
            previous = current;
            current = current.next;
        }
        if (current == null) { // didn't find key
            return;
        }
        previous.next = current.next; // delete current link
    }

    Link find(int key) {
        var current = first;
        while (current != null && current.getKey() <= key) {
            if (current.getKey() == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
