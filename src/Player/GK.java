package Player;

public class GK extends Player {

    public GK(int number)
    {
        super(number);
    }

    @Override

    public boolean isSuccessful()
    {
        return Math.random() <= 0.8;
    }
}