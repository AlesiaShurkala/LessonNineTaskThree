import com.model.IStart;

public class Cosmodrome {
    public void run(IStart iStart){
        if (iStart.preStartCheck()){
            iStart.runEngine();
            System.out.println("10 9 8 7 6 5 4 3 2 1 0");
            iStart.start();
        } else {
            System.out.println("Предстартовая проверка провалена!");
        }
    }
}
