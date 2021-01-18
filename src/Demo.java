import com.model.Shuttle;
import com.model.SpaceX;

public class Demo {
    public static void main(String[] args) {
        Cosmodrome cosmodrome=new Cosmodrome();
        Shuttle shuttle=new Shuttle();
        SpaceX spaceX=new SpaceX();
        System.out.println("Шатл");
        cosmodrome.run(shuttle);
        System.out.println();
        System.out.println("SpaceX");
        cosmodrome.run(spaceX);
    }
}
