package tech.ozak.sportmix.dto;

import android.util.Log;

import java.net.URL;

/**
 * This code encapsulates RSS item data.
 * Our application needs title and link data.
 *
 * @author ITCuties
 *
 */
public class RssItem {

    private long articleId;
    private long feedId;
    private String title;
    private String description;
    private String imgLink;
    private String pubDate;
    private URL url;
    private String encodedContent;
    private String feedLink;

    public String getFeedLink() {
        return feedLink;
    }

    public void setFeedLink(String feedLink) {
        this.feedLink = feedLink;
    }

    public long getArticleId() {
        return articleId;
    }

    public void setArticleId(long articleId) {
        this.articleId = articleId;
    }

    public long getFeedId() {
        return feedId;
    }

    public void setFeedId(long feedId) {
        this.feedId = feedId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

       /* //parse description for any image or video links
        if (description.contains("<img ")){
            String img  = description.substring(description.indexOf("<img "));
            String cleanUp = img.substring(0, img.indexOf(">") + 1);
            img = img.substring(img.indexOf("src=") + 5);
         //   int indexOf = img.indexOf("'");
          //  if (indexOf==-1){

            int indexOf = img.indexOf("\"");
           // }
            if (indexOf!=-1){

                img = img.substring(0, indexOf);
            }
            //for haberturk matches ' char.
            else{
                indexOf = img.indexOf("\'");
                img = img.substring(0, indexOf);
            }
            String a=img.replace("100_100","200_200");
            setImgLink(a);
            Log.d("LOGGING RSS XML", "Setting image link: " + img);
            this.description = this.description.replace(cleanUp, "");
        }*/
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getEncodedContent() {
        return encodedContent;
    }

    public void setEncodedContent(String encodedContent) {
        this.encodedContent = encodedContent;
    }
}
