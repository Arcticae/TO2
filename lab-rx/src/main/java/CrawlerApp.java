import io.reactivex.Observable;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;



public class CrawlerApp  {

    private static List<String> TOPICS = Arrays.asList("Agent Cooper", "Sherlock", "Poirot", "Miss Murple", "Detective Monk");


    public static void main(String[] args) throws IOException {
        PhotoCrawler photoCrawler = new PhotoCrawler();
        photoCrawler.resetLibrary();
        //photoCrawler.downloadPhotoExamples();

        //photoCrawler.downloadPhotosForQuery(TOPICS.get(0));
       photoCrawler.downloadPhotosForMultipleQueries(TOPICS);

       // Observable <Integer > stream = Observable.just(1,2,3,4,5);
        //stream.subscribe((Integer something ) -> System.out.println("i accept" + something));
        try{Thread.sleep(1000000);}catch(Exception ex ){}
    }
}