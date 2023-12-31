package org.java.app.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.java.app.pojo.Movie;
import org.java.app.pojo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
		
		// DAY 1
//		String strMovies = getMovies().stream()
////								.map(m -> m.getTitle())
//								.map(Movie::getTitle)
//							.collect(Collectors.joining(", "));
		List<Movie> movies = getMovies();

		model.addAttribute("movies", movies);

		return "movies-index";
	}

	@GetMapping("/songs")
	public String getSongsIndex(Model model) {

		// DAY 1
//		String strSongs = getSongs().stream()
//								.map(Song::getTitle)
//							.collect(Collectors.joining(", "));
		
		List<Song> songs = getSongs();

		model.addAttribute("songs", songs);

		return "songs-index";
	}

	@GetMapping("/movies/{id}")
	public String getMovieDetails(@PathVariable int id, Model model) {

		Movie movie = getMovies().stream()
							.filter(m -> m.getId() == id)
						.findFirst().get();
		// DAY 1
//		String movieTitle = movie.getTitle();

		model.addAttribute("movie", movie);

		return "movie-details";
	}
	@GetMapping("/songs/{id}")
	public String getSongDetails(@PathVariable int id, Model model) {

		// DAY 1
//		Song song = getSongs().get(id);
//		String songTitle = song.getTitle();
		
		// DAY 2
		Song song = getSongs().stream()
						.filter(s -> s.getId() == id)
					.findFirst().get();

		model.addAttribute("song", song);

		return "song-details";
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
