/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaudioarticle;

/**
 *
 * @author rakan
 */
public  class AudioArticle extends pdfArticle{
    private String narrator;
    private double duration;

    public AudioArticle(String title, String author, boolean isDownloadable, String narrator, double duration ) {
        super(isDownloadable, title, author);
        this.narrator = narrator;
        if(duration>0)
        this.duration = duration;
        else
            this.duration = 0 ;
    }
    @Override
    public String toString() {
        return super.toString()+ ", Narrator :" + narrator + ", Duration :" + String.format("%.2f", duration)+" hours" ;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if(duration>0)
           this.duration = duration;
        else
            this.duration = 0 ;
    }
    
    
}
