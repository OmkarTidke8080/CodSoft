package Project_2;

import java.util.*;


public class StudentGrade
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ------------------Student Grade Calculator------------------- ");

        System.out.println("Enter the marks obtained out of 100 of each subject");

        System.out.println("Physics - ");
        int sub1 = (int) sc.nextFloat();

        System.out.println("Chemistry - ");
        int sub2 = (int) sc.nextFloat();
        
        System.out.println("Maths - ");
        int sub3 = (int) sc.nextFloat();

        System.out.println("Biology - ");
        int sub4 = (int) sc.nextFloat();

        System.out.println("Information Technology - ");
        int sub5 = (int) sc.nextFloat();
    
        Grade grade = new Grade();
       int TotalMarks =  grade.TotalMarks(sub1, sub2, sub3, sub4, sub5);
        float percent = grade.Percent(TotalMarks);

        grade.GradeCalculate(percent);
        
    }
}

class Grade
{

    // calculate total marks function
   int TotalMarks(int sub1, int sub2, int sub3, int sub4, int sub5)
   {
      int TotalMarks =  sub1 + sub2 + sub3 + sub4 + sub5;

      System.out.println("Total marks obtained out off 500 - "+TotalMarks);
      return TotalMarks;
   }

   float Percent(float TotalMarks)
   {
      float percent = 0.0f;

      percent = TotalMarks / 500 * 100;

      return percent;
   }

   void GradeCalculate(float percent)
   {
      if(percent >= 90 && percent < 100)
      {
        System.out.println("Congratulations!!!");
         System.out.println("Your Grade is A+");
      }
      else if(percent >= 80 && percent < 90)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is A");
      }
       else if(percent >= 70 && percent < 80)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is B+");
      }
       else if(percent >= 60 && percent < 70)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is B");
      }
       else if(percent >= 50 && percent < 60)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is C+");
      }
       else if(percent >= 40 && percent < 50)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is C");
      }
       else if(percent >= 35 && percent < 40)
      {
        System.out.println("Congratulations!!!");
        System.out.println("Your Grade is D");
      }
      else if(percent < 35)
      {
        System.out.println("You are Fail");
      }


   }

}

