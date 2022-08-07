import java.util.*;

public class HomeworkDay06{

    static void mangGiamDanMovie(Movie[] movieList){
        Movie temp;
        for( int i= 0; i < movieList.length-1; i++){
            for(int j= i + 1; j < movieList.length; j++){
                if(movieList[i].ranking < movieList[j].ranking){
                    temp = movieList[i];
                    movieList[i] = movieList[j];
                    movieList[j] = temp;
                }
            }
        }
    }

    static void mangGiamDanSeries(Series[] seriesDetail){
        Series temp;
        for( int i= 0; i < seriesDetail.length-1; i++){
            for(int j= i + 1; j < seriesDetail.length; j++){
                if(seriesDetail[i].ranking < seriesDetail[j].ranking){
                    temp = seriesDetail[i];
                    seriesDetail[i] = seriesDetail[j];
                    seriesDetail[j] = temp;
                }
            }
        }
    }

    

    public static void main(String[] args){
        // Tạo 2 mảng để quản lý Movie và Series

        Movie[] movieList = new Movie[4];
        
        movieList[0] = new Movie("No.1", "ABC Korea", genre.Romance, 1, 60);
        movieList[1] = new Movie("No.2", "DEF America", genre.Comedy, 3, 90);
        movieList[2] = new Movie("No.3", "GHI UK", genre.Comedy, 2, 45);
        movieList[3] = new Movie("No.4", "KLM Vietnam", genre.Action, 4, 45);

        Series[] seriesDetail = new Series[4];
        seriesDetail[0] = new Series("No.1", "ABC Korea", genre.Romance, 1, 10,60);
        seriesDetail[1] = new Series("No.2", "DEF America", genre.Comedy, 3, 7,90);
        seriesDetail[2] = new Series("No.3", "GHI UK", genre.Comedy, 2, 20,45);
        seriesDetail[3] = new Series("No.4", "KLM Vietnam", genre.Action,4, 10, 45);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Input keyword of movie title");
    String keyword = scanner.nextLine();
    
    
    for (int index = 0; index < movieList.length; index++) {
        Movie m = movieList[index];
        if (m.hasKeywordTitleMovie(keyword)) {
            System.out.println("title: " + m.getTitle());        
        }        
    }

    for (int index = 0; index < movieList.length; index++) {
        Series s = seriesDetail[index];
        if (s.hasKeywordTitleSeries(keyword)) {
            System.out.println("title: " + s.getTitle());        
        }        
    }

    mangGiamDanMovie(movieList);
    System.out.println("Smallest ranking by Movie:" + movieList[0].getTitle() + " " + movieList[0].getRanking());

    mangGiamDanSeries(seriesDetail);
    System.out.println("Smallest ranking by Series:" + seriesDetail[0].getTitle() + " " + seriesDetail[0].getRanking());

    
    scanner.close();

    }
}