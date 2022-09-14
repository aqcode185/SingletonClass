package javaapplication1;

public class SingletonClass {
private static final SingletonClass object=new SingletonClass();
static int counter=0;
private SingletonClass(){
    counter++;
}
public static SingletonClass showmessage(){
    System.out.println("Object Counter :"+counter);
    return object;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SingletonClass ob=new SingletonClass();
        SingletonClass.showmessage();
        ob=new SingletonClass();
        SingletonClass.showmessage();
    }
    
}