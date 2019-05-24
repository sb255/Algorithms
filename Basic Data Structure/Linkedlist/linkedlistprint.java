
    /*Printing all the elements of a Linkedlist*/

    static void printLinkedList(SinglyLinkedListNode head) {

        SinglyLinkedListNode n = head; 

        while(n!=null) {
            System.out.println(n.data);
            n = n.next; 
        }

   }
