package com.petwaregames.bbw.base;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageCache {

    private static Map<String, BufferedImage> images = new HashMap<>();
    private static final BufferedImage DEFAULT_IMAGE;
    private static final BufferedImage BACKGROUND_IMAGE;


    static {
        Graphics2D g;
        DEFAULT_IMAGE = new BufferedImage(Board.TILE_SIZE, Board.TILE_SIZE, BufferedImage.TYPE_INT_ARGB);
        g = DEFAULT_IMAGE.createGraphics();
        g.setColor(new Color(150, 150, 150));  // Gray
        g.fillRect(0, 0, Board.TILE_SIZE, Board.TILE_SIZE);
        images.put("default", DEFAULT_IMAGE);

        BACKGROUND_IMAGE = new BufferedImage(Board.TILE_SIZE, Board.TILE_SIZE, BufferedImage.TYPE_INT_ARGB);
        g = BACKGROUND_IMAGE.createGraphics();
        g.setColor(new Color(181, 230, 29));  // Lime green
        g.fillRect(0, 0, Board.TILE_SIZE, Board.TILE_SIZE);
        images.put("background", BACKGROUND_IMAGE);
    }


    static public BufferedImage getImage(String imageFilename){
        BufferedImage i;

        if (images.containsKey(imageFilename)){
            i = images.get(imageFilename);
        }
        else {
            // load image file and store in Map
            i = loadImage(imageFilename);
            images.put(imageFilename, i);
        }
        return i;
    }

    /**
     * Loads a graphics file and caches the image.
     *
     *
     * @param imageFilename The filename that holds the image data;
     *                      This is also used as the key for future lookups.
     *                      If the file is not found, or cannot be read, the default image is returned
     * @return The new image object
     */
    static private BufferedImage loadImage(String imageFilename) {
        BufferedImage i = null;
        try {
            // you can use just the filename
            // TODO make the base directory for images configurable
            i = ImageIO.read(new File("./src/main/resources/image/" + imageFilename));
        } catch (IOException exc) {
            System.getLogger(Object.class.getName()).log(System.Logger.Level.ERROR, "Image File not found: " + imageFilename);
            i = DEFAULT_IMAGE;

        }
        return i;
    }

}
