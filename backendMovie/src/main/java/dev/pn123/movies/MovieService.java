package dev.pn123.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// uzywa Repository , komunikuje sie z db
// odczytuje liste movies i zwraca do Api layer
@Service
public class MovieService {

    @Autowired//nie musisz używać new MovieRepository() ani w żaden inny sposób samodzielnie tworzyć obiektu tej klasy.
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies(){

        return movieRepository.findAll();
    }

    //UWAGA!
    public Optional<Movie> singleMovie(String imdbId){
        //findById moze nie znalezc movie, id moze nie istniec
        //Optional jest zeby moglo zwrocic null !!!
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
