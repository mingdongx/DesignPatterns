package org.example.iterator.v4;

/**
 * @author MortonShaw
 * @date 2021/7/14 15:08
 */
class Main {

    public static void main(String[] args) {
        CollectionSelf linkedListSelf = new LinkedListSelf();
        for (int i = 0; i < 15; i++) {
            linkedListSelf.add(i);
        }
        System.out.println(linkedListSelf.size());

        IteratorSelf iterator = linkedListSelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
