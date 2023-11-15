import java.util.Scanner;

/**
 * The Area class represents a rectangular area with a movable point.
 * This class allows you to display the area and move a point within it.
 */
public class Area{
    private int width;
    private int length;
    private int[] position;

    /**
     * Constructs an Area with the specified dimensions.
     *
     * @param width - The width of the area.
     * @param length - The length of the area.
     */
    public Area(int width, int length){
        this.width = width;
        this.length = length;
        this.position = new int[]{0,0};
    }

    /**
     * Display the area with a point represented as 'P' and empty spaces as 'X'.
     */
    public void displayArea(){
        for (int collumn = 0; collumn < length; collumn++){
            for (int rows = 0; rows < width; rows++){
                if(collumn == position[1] && rows == position[0]){
                    System.out.print(" P ");
                }
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Moves the point within the area.
     *
     * @param move The direction to move the point. Use "UP", "DOWN", "LEFT", or "RIGHT".
     */
    public void move(String move){
        int collumn = position[1];
        int row = position[0];

        if(move.equals("UP")){
            collumn -= 1;
        }
        else if(move.equals("DOWN")){
            collumn += 1;
        }
        else if(move.equals("LEFT")){
            row -= 1;
        }
        else if(move.equals("RIGHT")){
            row += 1;
        }

        if(row >= 0 && row < width && collumn >= 0 && collumn < length){
            position[1] = collumn;
            position[0] = row;
        }
    }
}

