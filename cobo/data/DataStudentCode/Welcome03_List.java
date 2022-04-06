// Team Melon :: Justin Mohabir, Jomin Zhang
/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {
   public static void main(String[] args) {
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
      ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
             "station/station_id", "station/state",
             "station/latitude", "station/longitude");
      System.out.println("Total stations: " + allstns.size());

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a state abbreviation: ");
      String state = sc.next();
      double lat = 100.0;
      String id = "";
      System.out.println("Stations in " + state);
      for (WeatherStation ws : allstns) {
         if (ws.isLocatedInState(state)) {
            if (ws.getLat() < lat){
               lat = ws.getLat();
               id = ws.getId();
            }
            System.out.println("  " + ws.getId() + ": " + ws.getName());
         }
      }
      System.out.println("This is the most south: " + id + ": " + lat);
   }
}
