import Player.Player;

public class Team
{
    String name;
    Player[] player;
    int goal = 0;

    public Team(String name, Player[] player)
    {
        this.name = name;
        this.player = player;
    }
}