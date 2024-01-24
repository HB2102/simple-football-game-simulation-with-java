package Player;

public class MF extends Player {

    public MF(int number)
    {
        super(number);
    }

    @Override

    public boolean isSuccessful()
    {
        return Math.random() <= 0.4;
    }
}