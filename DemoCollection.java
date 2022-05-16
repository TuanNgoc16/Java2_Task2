import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
public class DemoCollection {
    private String singer;
    private int age;
    private String song;
    private int date_of_manufacture;
    private  int view;
    private int like;

    public DemoCollection (String singer, int age, String song,int date_of_manufacture,int view ,int like) {
        this.singer=singer;
        this.age=age;
        this.song=song;
        this.date_of_manufacture=date_of_manufacture;
        this.view=view;
        this.like=like;
    }
    public String getSinger(){
        return  singer;
    }
    public void setSinger (String singer){
        this.singer=singer;
    }
    public int getAge(){
        return  age;
    }
    public String getSong() {
        return song;
    }
    public int getDate_of_manufacture(){
        return  date_of_manufacture;
    }
    public int getView() {
        return  view;
    }
    public int getLike(){
        return like;
    }

    @Override
    public String toString() {
        return "Singer " +singer + ",Age " + age + ",Song " + song + ",date_of_manufacture " +date_of_manufacture + ",View " + view + ",Like " + like;
    }

    public static class DemoCollection1 {
        public static void main ( String[] args) {
            List<DemoCollection> users = new ArrayList<>();
            users.add(new DemoCollection("Tuan Hung 1",30,"Nam Lay Tay Anh",2017,20000022,210202));
            users.add(new DemoCollection("Ho Ngoc ha 2",30,"Tay Anh",2017,20000022,210202));
            users.add(new DemoCollection("Ho Ngoc 3",30,"Tay Anh",2017,20000022,210202));
            users.forEach( DemoCollection -> {
                System.out.println("Singer: "+ DemoCollection.getSinger() +" ,Age: " + DemoCollection.getAge() +" ,Song: " + DemoCollection.getSong() + " ,Date of manufacture: " + DemoCollection.getDate_of_manufacture() + " ,View: " + DemoCollection.getView() + " ,Like: "  +DemoCollection.getLike() );
            });
            // Remove Index 1
           users.remove(1) ;
            System.out.println("Remove(1) " + users);

            // Clear
            users.clear();
            System.out.println("After clear" + users);
            //IndexOf
            System.out.println("IndexOf " +users.indexOf("1"));
            //lastindex
            System.out.println("lastIndexof " + users.lastIndexOf("Ngoc"));







    }
}



}
