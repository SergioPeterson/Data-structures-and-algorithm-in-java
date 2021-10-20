public class LinkedList
{
    Node head;

    //Inserting at the end
    public void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }


    //Inserting at the start
    public void insertAtStart(int data)
    {
         Node node = new Node();
         node.data = data;
         node.next = null;
         node.next = head;
         head = node;

    }


    //Inserting at a position
    public void insertAt(int index, int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i = 0 ; i<index-1 ; i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }


    //Deleting an element at a given position
    public void deleteAt(int index)
    {
        if(index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i = 0; i<index-1;i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    //For printing the linked list
    public void show()
    {
        Node node = head;
        while(node != null)
        {
            System.out.println(node.data);
            node = node.next;
        }

    }
}
