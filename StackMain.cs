using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Stack
{
    public class StackMain
    {

        public static void Main(String[] args)
        {
            Console.WriteLine("Initialize a stack");
            LinkedStack linked = new LinkedStack();
            linked.Push(1);
            linked.Push(2);
            linked.Push(3);

            Console.WriteLine("The current top element in the stack: " + linked.Peek());

           
        }

    }
}
