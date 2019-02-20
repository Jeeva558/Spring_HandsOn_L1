package basics_A2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig
{
@Bean
public Movie movie()
{
	return new Movie();
}
}
