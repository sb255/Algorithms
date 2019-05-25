   static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        SinglyLinkedListNode head1_ = head1;
        SinglyLinkedListNode head2_ = head2; 


        if(head1_.next!=null && head2_.next==null){
            return false;
        }
        if(head1_.next==null && head2_.next!=null){
            return false;
        }
        while(head1_.next!=null){
            if(head1_.next.data!=head2_.next.data){
                return false;
            }
            if(head1_.next!=null && head2_.next==null){
                return false; 
            }
            head1_ = head1_.next; 
            head2_ = head2_.next; 
        }


        return true; 

    }
