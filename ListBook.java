
import java.util.ArrayList;



public class ListBook {
    static public void main(String arg[])
    {
        ArrayList<BookS> bookDataList=new ArrayList<>();
        bookDataList.add(new BookS("WildLife","sumit","animal"));
        bookDataList.add(new BookS("Experiment of Truth","GandhiJi","BioGraphy"));
        for (BookS elem : bookDataList) {
            System.err.println("Name: "+elem.name+"  Author :"+elem.author+"   Type :"+elem.type);
        }
    }
}
class BookS{
   public String name,author,type;
    BookS(String name,String author,String type){
        this.name=name;
        this.author=author;
        this.type=type;
    }
}