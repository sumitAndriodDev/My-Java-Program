import java.util.Scanner;
class Constutor{
    public static void main(String arg[])
    {
         int x,y,z,zz;
        System.out.println("Enter value of a:(only Number allowed)");
        x=Scan.scan.scanner.nextInt();
        System.out.println("Enter value of b:(only Number allowed)");
        y=Scan.scan.scanner.nextInt();
        System.out.println("Enter value of c:(only Number allowed)");
        z=Scan.scan.scanner.nextInt();
        System.out.println("Enter value of d:(only Number allowed)");
        zz=Scan.scan.scanner.nextInt();
        ObjectApply obj=new ObjectApply();
        new ObjectApply(x,y);
        new ObjectApply(x,y,z,zz);
        ObjectApply.object(x,y,z);
    }
}
class Scan{
    static public Scan scan=new Scan();
public Scanner scanner = new Scanner(System.in);
}
class ObjectApply{
    public ObjectApply(int a,int b)
    {
        int c=a+b;
        System.out.println("\n"+a+" + "+b+" = "+c);
    }
    public ObjectApply(int a,int b,int ccc,int dd)
    {
        System.out.println("\n\nThis is a example of Constutor Polymorphism");
        int e=a+b+ccc+dd;
        System.out.println(a+" + "+b+"  +  "+ccc+" + "+dd+" = "+e);
    }
    public ObjectApply()
    {
        System.out.println("This is How to make parametarizied Constutor");
    }
    static public void object(int a,int b,int cc)
    {
        int d=a+b+cc;
        System.out.println(a+" + "+b+" + "+cc+" = "+d);
        class Object{
             static Object objC=new Object();
             int i,j,sum=0;
             void printInt()
             {
                System.out.println("\nenter stating value:");
                int bI=Scan.scan.scanner.nextInt();
                i=bI;
                System.out.println("enter ending value:");
                int bJ=Scan.scan.scanner.nextInt();
                j=bJ;
                do{
                    sum=sum+i;
                    i++;
                }while(i!=j+1);
                System.out.println("Sum Of  "+bI+" To "+bJ+"   IS   "+sum);
             }
        }
        Object.objC.printInt();
    }
}