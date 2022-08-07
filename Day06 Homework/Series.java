public class Series extends Film {
    private int numberOfEpisodes;
    private int averageDuration;
    // averageDuration by minute

    public Series(String id, String title, genre Genre, double ranking, int numberOfEpisodes, int averageDuration) {
        this.id = id;
        this.title = title;
        this.Genre = Genre;
        this.ranking = ranking;
        this.numberOfEpisodes = numberOfEpisodes;
        this.averageDuration = averageDuration;
        }

    public int getNumberOfEpisodes(){
        return this.numberOfEpisodes;
    }
    
    public void setNumberOfEpisodes(int numberOfEpisodes){
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public int getAverageDuration(){
        return this.averageDuration;
    }
    
    public void setAverageDuration(int averageDuration){
        this.averageDuration = averageDuration;
    }
    
    public boolean hasKeywordTitleSeries(String keyword) {
        boolean result = this.title.contains(keyword);
        return result;
    }

    static void mangGiamDanSeries(Series[] seriesDetail){
        Series temp;
        for( int i= 0; i < seriesDetail.length -1; i++){
            for(int j= i + 1; j < seriesDetail.length; j++){
                if(seriesDetail[i].ranking > seriesDetail[j].ranking){
                    temp = seriesDetail[i];
                    seriesDetail[i] = seriesDetail[j];
                    seriesDetail[j] = temp;
                }
            }
        }
}
}
