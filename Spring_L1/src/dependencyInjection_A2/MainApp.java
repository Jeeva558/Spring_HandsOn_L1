package dependencyInjection_A2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp 
{
public static void main(String[] args) 
{
ApplicationContext ap=new ClassPathXmlApplicationContext("Player.xml");
String[] players= {"player1","player2","player3","player4","player5"};
for(String playerbean:players)
{
	System.out.println("<-----Start----->");
	Player player=(Player) ap.getBean(playerbean);
	System.out.println("PlayerID = "+player.getPlayerId());
	System.out.println("PlayerName = "+player.getPlayerName());
	System.out.println("CountryID = "+player.getCountry().getCountryId());
	System.out.println("CountryName = "+player.getCountry().getCountryName());	
	System.out.println("<-----End----->");
	System.out.println();
}

}


}
