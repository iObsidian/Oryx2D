package oryx2D.entity.mob;

import oryx2D.entity.Entity;
import oryx2D.graphics.Screen;
import oryx2D.level.Level;

public abstract class Mob extends Entity {

    protected int dir = 0;

    public void move(int xa, int ya) {

        if (ya < 0) {
            this.dir = 0;
        }
        if (xa > 0) {
            this.dir = 1;
        }
        if (ya > 0) {
            this.dir = 2;
        }
        if (xa < 0) {
            this.dir = 3;
        }

        if (this.collision(0, ya)) {
            this.y += ya;
        }

        if (this.collision(xa, 0)) {
            this.x += xa;
        }
    }


    void shoot(int x, int y, double dir) {
        dir = Math.toDegrees(dir);
        System.out.println("Angle: " + dir);
    }

    //https://www.youtube.com/watch?v=JnZTHn7b4YE
    private boolean collision(int xa, int ya) {

        boolean solid = false;

        for (int c = 0; c < 4; c++) {
            int xt = (((this.x + xa) + ((c % 2) * 2)) - 1) / Level.TILE_SIZE;
            int yt = (((this.y + ya) + ((c / 2) * 2)) - 1) / Level.TILE_SIZE;

            if (this.level.getTile(xt, yt) != null) {
                solid = this.level.getTile(xt, yt).isSolid();
            }

        }

        return !solid;
    }

    @Override
    public abstract void render(Screen screen);
}


