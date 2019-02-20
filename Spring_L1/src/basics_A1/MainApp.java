package basics_A1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Movies.xml");
	      Movie mov = (Movie) context.getBean("movie");
	      System.out.println("movieId = "+mov.getMovieId());
	      System.out.println("MovieName = "+mov.getMovieName());
	      System.out.println("MovieActor = "+mov.getMovieActor());
	   }
}
