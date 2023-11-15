using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stack
{

    public class LinkedStack
    {

        private Node top;
        private int size;

        public LinkedStack()
        {
            top = null;
            size = 0;
        }

        public bool isEmpty()
        {
            return top == null;
        }

        public void Push(int data)
        {
                       
            Node newNode = new Node(data);

            if (top == null) 
            {
                top = newNode;
            }
            else
            {
                newNode.next = top;
                top = newNode;
            }


        }

        public void Pop()
        {

        }

        public int Peek()
        {
            if (isEmpty())
            {
                throw new Exception("Stack is Empty!!");
            }

            return top.data;
        }

        public class Node 
        {
            public int data;
            public Node? next;

            public Node(int data)
            {
                this.data = data;
                this.next = null;
            }
        }

        
    }

    
}
