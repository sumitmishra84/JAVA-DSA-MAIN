//package LinkList;
//
//public class MyLinkList {
//    private  static  ListNode buildList(){
//        ListNode n1=new ListNode(10);
//        ListNode n2=new ListNode(10);
//        ListNode n3=new ListNode(10);
//        ListNode n4=new ListNode(10);
//        ListNode n5=new ListNode(10);
//        n1.next=n2;
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n5;
//        return  n1;
//    }
//    public  static void printRecursive(ListNode head){
//        if (head==null){
//            System.out.println("null");
//            return;
//        }
//        System.out.print(head.val+"->");
//        printRecursive((head.next));
//    }
//    public static void printList(ListNode head){
//        while(head!=null){
//            System.out.println();
//        }
//    }
//    public static  int linearSearch(ListNode head, int key){
//        int index=-1;
//        return -1;
//    }
//    public  static  ListNode insertFirst(ListNode head, int val){
//        ListNode newNode=new ListNode(val);
//        newNode.next=head;
//        head=newNode;
//        return  head;
//    }
//    public static ListNode insertLast(ListNode head){
//        return  head==null? null:head.next;
//
//    }
//    public static ListNode deleteFirst(ListNode head){
//        if (head==null || head.next==null){
//
//        }
//    }
//}
