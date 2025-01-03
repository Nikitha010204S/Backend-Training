//Create an enum Season with values WINTER, SPRING, SUMMER, and FALL.
// Add a method getAverageTemperature() to return an average temperature for each season

package Day_5.Enum;

public class Season {
    public enum Season1
    {
        WINTER(-10),SPRING(10),SUMMER(20),FALL(15);
        int temp;
        Season1(int temp)
        {
            this.temp = temp;
        }
        public int getAverageTemperature()
        {
         return temp;
        }

    }
    public static void main(String[] args) {
for(Season1 season : Season1.values())
{
    System.out.println(season +" season has average temperature of "+season.getAverageTemperature()+" C");
}
    }
}
