public class GradeCalculator
{
  public static void main(String[] args)
  {
  
    //Users HW Value
    int HWValue_1 = 75;
    int HWValue_2 = 99;
    int HWValue_3 = 80;
    int HWValue_4 = 100;
    //Users Quiz Value
    double QuizValue_1 = 89.2;
    double QuizValue_2 = 98.1;
    //Users Exam Value
    double ExamValue_1 = 87.58;
    //CalculateHWAverage
    int Averagehomeworkgrade = 0;
    Averagehomeworkgrade = (int) (HWValue_1 + HWValue_2 + HWValue_3 + HWValue_4)/4;
    System.out.println(Averagehomeworkgrade);
  


    System.out.println();


  }
}
