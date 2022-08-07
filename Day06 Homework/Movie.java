public class Movie extends Film {
protected int duration;    
// duration by minutes

public int getDuration(){
    return this.duration;
}

public void setDuration(int duration){
    this.duration = duration;
}

public Movie(String id, String title, genre Genre, double ranking, int duration) {
    this.id = id;
    this.title = title;
    this.Genre = Genre;
    this.ranking = ranking;
    this.duration = duration;
    }


public boolean hasKeywordTitleMovie(String keyword) {
        boolean result = this.title.contains(keyword);
        return result;
    }

public boolean genreComedy(genre Comedy) {
    boolean result = this.Genre.equals(Comedy);
    return result;
}
        
}
