 public class GameBoard {

        public static char[][] createBoard(){
            char board[][] =    {   {'*', '*', '*', '*', '*', '*', '*'},
                    {'*', '1', '|', '2', '|', '3', '*'},
                    {'*', '-', '+', '-', '+', '-', '*'},
                    {'*', '4', '|', '5', '|', '6', '*'},
                    {'*', '-', '+', '-', '+', '-', '*'},
                    {'*', '7', '|', '8', '|', '9', '*'},
                    {'*', '*', '*', '*', '*', '*', '*'} };

            return board;
        }

    }


