package tile_interactive;

import main.GamePanel;

public class IT_Trunk extends InteractiveTile{
    GamePanel gp;

    public IT_Trunk(GamePanel gp, int col, int row) { 
 /*Loads a specific trunk image.
Sets its position in the world based on column and row indices.
The trunk is non-collidable, allowing entities to pass through it.*/
    	
    	
        super(gp, col, row);
        this.gp = gp;
        this.worldX = gp.tileSize * col;
        this.worldY = gp.tileSize * row;

        down1 = setup("/res/tiles_interactive/trunk", gp.tileSize, gp.tileSize);

        solidArea.x = 0;
        solidArea.y = 0;
        solidArea.width = 0;
        solidArea.height = 0;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
    }
}
