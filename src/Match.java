import Player.*;

public class Match {

    public static void main(String[] args) {

        Player[] team1 =
                {
                        new GK(0),
                        new DF(1),
                        new DF(2),
                        new DF(3),
                        new DF(4),
                        new MF(5),
                        new MF(6),
                        new MF(7),
                        new MF(8),
                        new FW(9),
                        new FW(10)
                };

        Player[] team2 =
                {
                        new GK(0),
                        new DF(1),
                        new DF(2),
                        new DF(3),
                        new DF(4),
                        new MF(5),
                        new MF(6),
                        new MF(7),
                        new MF(8),
                        new FW(9),
                        new FW(10)
                };



        Team teamA = new Team("Iran", team1);
        Team teamB = new Team("Spain", team2);



        Team[] matchbetween = { teamA , teamB };

        for (int i = 0; i < 90; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                int gkss = 0;
                for (int k = 0; k < 1; k++)
                {
                    if (matchbetween[j].player[k].isSuccessful())
                    {
                        gkss++;
                    }
                }

                int dfss = 0;
                for (int k = 1; k < 5; k++)
                {
                    if (matchbetween[j].player[k].isSuccessful())
                    {
                        dfss++;
                    }
                }

                int mfss = 0;
                for (int k = 5; k < 9; k++)
                {
                    if (matchbetween[j].player[k].isSuccessful())
                    {
                        mfss++;
                    }
                }

                int fwss = 0;
                for (int k = 9; k < 11; k++)
                {
                    if (matchbetween[j].player[k].isSuccessful())
                    {
                        fwss++;
                    }
                }

                if ((gkss == 1) & (dfss >= 3) & (mfss >= 3) & (fwss >= 1))
                {
                    matchbetween[j].goal++;
                }
            }
        }

        System.out.printf(teamA.name + " " + teamA.goal + " : " + teamB.goal + " " + teamB.name );
        System.out.println("");


        if (teamA.goal > teamB.goal)
        {
            System.out.println( teamA.name + " won.");
        }

        if (teamB.goal > teamA.goal)
        {
            System.out.println(teamB.name + " won.");
        }

        if (teamA.goal == teamB.goal)
        {
            System.out.println("No Team Wins.");
        }

    }
}