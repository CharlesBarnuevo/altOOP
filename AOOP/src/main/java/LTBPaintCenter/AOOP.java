package LTBPaintCenter;

public class AOOP
{
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new MainView().setVisible(true);
            }
        });
    }
}
