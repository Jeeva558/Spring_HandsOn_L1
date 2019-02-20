package basics_A2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
	public static void main(String[] args) {
	      ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
	      Movie mov =context.getBean(Movie.class);
	      mov.setMovieId("M0002");
	      mov.setMovieActor("Vijay");
	      mov.setMovieName("Sarkar");	     
	      System.out.println("movieId = "+mov.getMovieId());
	      System.out.println("MovieName = "+mov.getMovieName());
	      System.out.println("MovieActor = "+mov.getMovieActor());
	   }
}
