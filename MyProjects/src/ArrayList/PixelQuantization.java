package ArrayList;

import java.util.Arrays;

public class PixelQuantization {
    public static void main(String[] args) {

        pixelQuantity();
    }
    public static void pixelQuantity(){
        int [] pixels = {18,35,55,45,58,61,71,77,80,85,89,99,100,101,120,121,130, 135,140, 141,150,160,161,180,199};
//        return new int[]{pixels.length};
        for (int i = 0; i < pixels.length; i++) {
            if(pixels[i]> 10 && pixels[i]<=20)
                pixels[i] = 10;
            else if (pixels[i]> 21 && pixels[i]<=40) {
                System.out.print(30 + " ");
            }
            else if (pixels[i]> 41 && pixels[i]<=60) {
                System.out.print(50 + " ");
            }
            else if (pixels[i]> 61 && pixels[i]<=80) {
                System.out.print(70 + " ");
            }
            else if (pixels[i]> 81 && pixels[i]<=100) {
                System.out.print(90 + " ");
            }
            else if (pixels[i]> 101 && pixels[i]<=120) {
                System.out.print(110 + " ");
            }
            else if (pixels[i]> 121 && pixels[i]<=140) {
                System.out.print(130 + " ");
            }
            else if (pixels[i]> 141 && pixels[i]<=160) {
                System.out.print(150 + " ");
            }
            else if (pixels[i]> 161 && pixels[i]<=180) {
                System.out.print(170 + " ");
            }
            else{
                System.out.print(190 + " ");
            }

        }

    }
}
