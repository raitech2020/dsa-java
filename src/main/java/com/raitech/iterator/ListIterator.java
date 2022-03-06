package com.raitech.iterator;

class ListIterator {
    LinkedList list;
    Link previous;
    Link current;

    ListIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    void reset() {
        previous = null;
        current = list.getFirst();
    }

    boolean atEnd() {
        return (current.next == null);
    }

    void nextLink() {
        previous = current;
        current = current.next;
    }

    Link getPrevious() {
        return previous;
    }

    Link getCurrent() {
        return current;
    }

    void insertAfter(long data) {
        var newLink = new Link(data);
        if (list.isEmpty()) {
            list.setFirst(newLink); // first = newLink
            current = newLink;
        } else {
            // attach newLink in list
            newLink.next = current.next;
            current.next = newLink;
            // move previous and current pointers
            nextLink();
        }
    }

    void insertBefore(long data) {
        var newLink = new Link(data);
        if (previous == null) {
            // attach newLink in list
            newLink.next = list.getFirst();
            list.setFirst(newLink); // first = newLink
            // adjust previous and current links
            reset();
        } else {
            // attach newLink in list
            newLink.next = current;
            previous.next = newLink;
            // previous is already at the right place
            // adjust current link
            current = newLink;
        }
    }

    long deleteCurrent() {
        //Todo: fix it
        return -1;
    }
}
