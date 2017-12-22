package game;

import java.awt.*;

public class Move {
    private Point startPosition;
    private Point destinationPosition;

    public Move(Point startPosition, Point destinationPosition){
        this.startPosition = startPosition;
        this.destinationPosition = destinationPosition;
    }

    public Point getStartPosition() { return this.startPosition; }
    public Point getDestinationPosition() { return this.destinationPosition; }

}
