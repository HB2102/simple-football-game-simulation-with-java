package Player;

public class DF extends Player {

    public DF(int number)
    {
        super(number);
    }

    @Override

    public boolean isSuccessful()
    {
        return Math.random() <= 0.6;
    }
}