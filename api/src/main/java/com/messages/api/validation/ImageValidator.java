package com.messages.api.validation;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.net.URL;

public class ImageValidator {
    public boolean isImage(String imageUrl){
        try{
            URL url = new URL(imageUrl);
            ImageIO.read(url.openStream());
            return true;
        } catch(IOException e){
            return false;
        }
    }
}
