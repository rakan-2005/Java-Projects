/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testaudioarticle;

import java.util.ArrayList;

/**
 *
 * @author rakan
 */
public class TestAudioArticle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<AudioArticle>AudioArticle = new ArrayList<AudioArticle>();
        AudioArticle.add(new AudioArticle("Benefits of Reeading","Johnson",true,"Gatsby",8));
        AudioArticle.add(new AudioArticle("Benefits of Writing","Wimmer",true,"Huber",10));
        AudioArticle.add(new AudioArticle("Benefits of Reeading","Caldwell",true,"ROsenthal",9));
        System.out.println("");
        int cout = 1;
        for(AudioArticle aaaa:AudioArticle)
           System.out.println("AudioArticle #"+cout++ +": " +aaaa);
    }
    
}
