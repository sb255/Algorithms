/*Deleting a node from a particular position from a linked list*/
/*Remember the head is at 0th position while counting*/

static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

     SinglyLinkedListNode n = head; 
     int position_ = position; 

    if(head.next==null){
         return head; 
    }

    if(position_==0){
         return head.next; 
    }

    for(int i=0; i<position_-1; i++){
         n = n.next; 
    }

    n.next = n.next.next; 

    return head; 
 }
