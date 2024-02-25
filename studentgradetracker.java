import java.util.Scanner;
public class studentgradetracker
{
    public static void main(String arg[])
    {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter student's number :");
        int numstud= input.nextInt();

        double[] grades= new double [numstud];

        for (int i=0; i<numstud; i++)
        {
            System.out.print("Enter grade for "+(i+1)+" student :");
            grades[i] = input.nextDouble();
        }
        double sum=0;
        for( double grade : grades)
        {
            sum=+grade;
        }
        double average = sum/ numstud;
        
        double highest= findHighestGrade(grades);
        double lowest = findLowestGrade(grades);

        System.out.println("Average grade: "+ average);
        System.out.println("Highest grade : "+ highest);
        System.out.println("Lowest grade :"+ lowest);

        input.close();
    }
    private static double findHighestGrade(double [ ]grades)
    {
         double highest = grades[0];
        for (double grade:grades)
          {
            if (grade >highest)
            {
                highest=grade;
            }
          


           }
       return highest;      
    }

    private static double findLowestGrade(double []grades)
    {
        double lowest = grades[0];
        for( double grade : grades)
        {
            if (grade <lowest)
            {
                lowest = grade;
            }
        }
        return lowest;
    }



        
    
}