/*Adding a node to the head of the Linked list*/
/*The inputs are the head and the data to be added to the new head node*/

   static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode n = new SinglyLinkedListNode(data); 

        n.next = llist; 

        return n;  

        
    }

