package Menu;

class Klasemen {
    private String rating;
    
    Klasemen (String rating){
        this.rating = rating;
    }
    
    void setRating (String rating){
        this.rating = rating;
    }
    
    void show(){
        System.out.println(this.rating);
    }
}
