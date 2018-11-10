class MyThread extends Thread 
{
    public static void main(String [] args) 
    {
        MyThread t = new MyThread();
        Thread x = new Thread(t);
        x.start(); /* Line 7 */
    }
    public void run() 
    {
        for(int i = 0; i < 3; ++i) 
        {
            System.out.print(i + "..");
        }
    }
}