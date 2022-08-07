enum genre{
    Horror,
    Comedy,
    Documentary,
    Romance,
    Action,
    Thriller,
    ScienceFiction;
}

public class Film {
protected String id;
protected String title;
protected genre Genre;
protected Double ranking;   

public String getId(){
    return this.id;
}

public void setId(String id){
    this.id = id;
}

public String getTitle(){
    return this.title;
}

public void setTitle(String title){
    this.title = title;
}



public Double getRanking(){
    return this.ranking;
}

public void setRanking(double ranking){
    this.ranking = ranking;
}

}


