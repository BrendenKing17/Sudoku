package Sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gamestate;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;


    public SudokuGame(GameState gameState, int[][] gridState){
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGamestate() {
        return gamestate;
    }

    public int[] getCopyofGridState() {
        return SudokuUtlilities.copyToNewArray(gridState);
    }

}
