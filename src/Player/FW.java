package Player;

public class FW extends Player {

    public FW(int number)
    {
        super(number);
    }

    @Override

    public boolean isSuccessful()
    {
        return Math.random() <= 0.2;
    }
}