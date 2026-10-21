/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testaudioarticle;

/**
 *
 * @author rakan
 */
public class pdfArticle extends Article{
    private boolean isDownloadable;

    public pdfArticle(boolean isDownloadable, String title, String author) {
        super(title, author);
        this.isDownloadable = isDownloadable;
    }

    public boolean isIsDownloadable() {
        return isDownloadable;
    }

    public void setIsDownloadable(boolean isDownloadable) {
        this.isDownloadable = isDownloadable;
    }
    @Override
    String getAuthorTyp() {
        return "Research Article";
    }

  
}
