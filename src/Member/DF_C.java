package Member;
import java.util.Random;

public class DF_C implements Member{

    Random random = new Random();

    @Override
    public int GK_stat(int GK_stat) {
        return random.nextInt(100);
    }

    @Override
    public int DF_stat(int DF_stat) {
        return random.nextInt(100);
    }

    @Override
    public int MF_stat(int MF_stat) {
        return random.nextInt(100);
    }

    @Override
    public int FW_stat(int FW_stat) {
        return random.nextInt(100);
    }

    @Override
    public int Condition(int Condition) {
        return random.nextInt(100);
    }

    @Override
    public int Height(int Height) {
        return 173;
    }

    @Override
    public int Weight(int Weight) {
        return 70;
    }
}
