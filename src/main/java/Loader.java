
import calculator.RouteCalculator;
import core.Station;
import java.util.List;
import logger.AppLogger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import parser.Parser;

public class Loader {

  private static final Marker EXCEPTION = MarkerManager.getMarker("EXCEPTION");

  public static void main(String[] args) {

    RouteCalculator calculator = Parser.getRouteCalculator();
    System.out.println("Программа расчёта маршрутов метрополитена Санкт-Петербурга\n");
    for (; ;) {
      try {
        Station from = Parser.takeStation("Введите станцию отправления:");
        Station to = Parser.takeStation("Введите станцию назначения:");
        List<Station> route = calculator.getShortestRoute(from, to);
        System.out.println("Маршрут:");
        Parser.printRoute(route);
        System.out.println("Длительность: ".concat(
            String.valueOf(RouteCalculator.calculateDuration(route))).concat(" минут"));
      } catch (Exception e) {
        AppLogger.getLogger().error(EXCEPTION, e.getMessage());
        e.printStackTrace();
        break;
      }
    }
  }
}