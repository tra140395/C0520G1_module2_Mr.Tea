package b8cleancode.Baitap;

public class TennisGame {
    static String score = "";
    static int tempScore = 0;

    public static String getScore(String player1Name, String player2Name, int player1_score, int player2_score) {

        if (player1_score == player2_score)

            System.out.println(tiePointResult(player1_score));

        else if (player1_score >= 4 || player2_score >= 4)

            System.out.println(pointResult(player1_score, player2_score));

             else {
                calculation(player1_score,player2_score);
        }
        return score;
    }

    public static String pointResult(int player1_score, int player2_score) {
        int minusResult = player1_score - player2_score;
        if (minusResult == 1)
            score = "Advantage player1";
        else if
        (minusResult == -1) score = "Advantage player2";
        else if
        (minusResult >= 2) score = "Win for player1";
        else
            score = "Win for player2";
        return score;
    }

    public static String tiePointResult(int player1_score) {
        switch (player1_score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
    public static String calculation(int player1_score, int player2_score){
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = player1_score;
            else {
                score += "-";
                tempScore = player2_score;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }


}
