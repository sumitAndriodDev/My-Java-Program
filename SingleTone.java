class SingleTone{
    public static void main(String arg[])
    {
        ObjectApply.obj.print();
    }
}
class ObjectApply{
    public static ObjectApply obj=new ObjectApply();
    public void print()
    {
        System.out.println("This is How to make Helper Object");
    }
}