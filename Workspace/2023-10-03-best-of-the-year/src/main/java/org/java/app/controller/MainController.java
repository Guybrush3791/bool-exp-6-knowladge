package org.java.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.java.app.pojo.Movie;
import org.java.app.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String getIndex(Model model) {
		
		final String name = "Guybrush";
		model.addAttribute("name", name);
		
		return "index";
	}
	
	@GetMapping("/movies")
	public String getMoviesIndex(Model model) {
		
//		String strMovies = "";
//		for (Movie movie : getMovies()) {
//			
//			strMovies += movie.getTitle() + ", ";
//		}
//		strMovies = strMovies.substring(0, strMovies.length() - 2);
		String strMovies = getMovies().stream()
//								.map(m -> m.getTitle())
								.map(Movie::getTitle)
							.collect(Collectors.joining(", "));
				
		model.addAttribute("strMovies", strMovies);
		
		return "movies-index";
	}
	
	@GetMapping("/songs")
	public String getSongsIndex(Model model) {
		
		String strSongs = getSongs().stream()
								.map(Song::getTitle)
							.collect(Collectors.joining(", "));
		
		model.addAttribute("strSongs", strSongs);
		
		return "songs-index";
	}
	
	private List<Movie> getMovies() {
		
		return Arrays.asList(new Movie[] {
				new Movie(1, "movie 1"),
				new Movie(2, "movie 2"),
				new Movie(3, "movie 3"),
				new Movie(4, "movie 4"),
				new Movie(5, "movie 5")
		});
	}
	private List<Song> getSongs() {
		
		return Arrays.asList(new Song[] {
				new Song(1, "song 1"),
				new Song(2, "song 2"),
				new Song(3, "song 3"),
				new Song(4, "song 4"),
				new Song(5, "song 5")
		});
	}
}
