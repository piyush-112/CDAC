using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace AsyncCodeWithDelegates1
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("before");
            Action oDel = Display;
            oDel.BeginInvoke(null, null);
            Console.WriteLine("after");
            Console.ReadLine();
        }
        static void Display()
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called");
        }
    }
}

namespace AsyncCodeWithDelegates2
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("before");
            Action<string> oDel = Display;
            oDel.BeginInvoke("passed string", null, null);
            Console.WriteLine("after");
            Console.ReadLine();
        }
        static void Display(string s)
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called" + s);
        }
    }
}
namespace AsyncCodeWithDelegates3
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("before");
            Func<string,string> oDel = Display;
            //oDel.BeginInvoke("passed string", new AsyncCallback(CallbackFunc), null);
            oDel.BeginInvoke("passed string", CallbackFunc, null);
            Console.WriteLine("after");
            Console.ReadLine();
        }
        static void CallbackFunc(IAsyncResult ar)
        {
            Console.WriteLine("callback func called");
        }

        static string Display(string s)
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called" + s);
            return s.ToUpper();
        }
    }
}
namespace AsyncCodeWithDelegates4
{
    internal class Program
    {
        static void Main1()
        {
            Console.WriteLine("before");
            Func<string, string> oDel = Display;
            //oDel.BeginInvoke("passed string", new AsyncCallback(CallbackFunc), null);
            oDel.BeginInvoke("passed string", delegate(IAsyncResult ar)
            {
                Console.WriteLine("callback func called");
                string retval = oDel.EndInvoke(ar);
                Console.WriteLine(retval);
            }, null);
            

            Console.WriteLine("after");
            Console.ReadLine();
        }
       
        static string Display(string s)
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called" + s);
            return s.ToUpper();
        }
    }
}

namespace AsyncCodeWithDelegates5
{
    internal class Program
    {
        static void Main5()
        {
            Console.WriteLine("before");
            Func<string, string> oDel = Display;
            //oDel.BeginInvoke("passed string", CallbackFunc, "extra data passed");
            //oDel.BeginInvoke("passed string", CallbackFunc, 10);
            oDel.BeginInvoke("passed string", CallbackFunc, oDel);
            Console.WriteLine("after");
            Console.ReadLine();
        }
        static void CallbackFunc(IAsyncResult ar)
        {
            //string lastparam = ar.AsyncState.ToString();
            //int lastparam = (int)ar.AsyncState;
            Func<string, string> oDel =(Func<string, string>) ar.AsyncState;
            Console.WriteLine("callback func called");
            string retval = oDel.EndInvoke(ar);
            Console.WriteLine(retval);
        }

        static string Display(string s)
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called" + s);
            return s.ToUpper();
        }
    }
}


namespace AsyncCodeWithDelegates6
{
    internal class Program
    {
        static void Main()
        {
            Console.WriteLine("before");
            Func<string, string> oDel = Display;
            //oDel.BeginInvoke("passed string", new AsyncCallback(CallbackFunc), null);
            IAsyncResult asyncresult = oDel.BeginInvoke("passed string", null, null);
            Console.WriteLine("after");
            while (!asyncresult.IsCompleted) ;            
            string retval = oDel.EndInvoke(asyncresult);
            Console.WriteLine(retval);
            Console.ReadLine();
        }
      

        static string Display(string s)
        {
            Thread.Sleep(5000);
            Console.WriteLine("display called" + s);
            return s.ToUpper();
        }
    }
}