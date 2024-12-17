public class Interface_Basic{

    public static void main(String args[]){
    //   Queen q = new Queen();
    //   q.moves();
    Bowler b = new Bowler();
    b.moves();
    }
}

interface CricketPlayer{
    void moves();
}

interface ChessPlayer {
    void moves();
}

//multiple interfaces
class Bowler implements CricketPlayer,ChessPlayer {
    public void moves(){
        System.out.println("Bowler is running very fast");
    }
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("up,down,left,right,diagonal(by 1 step)");
    }
}