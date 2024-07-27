public class Kata 
{
  public static int solution(int start, int finish)
  {
    int jumps = 0;
    
    while(start < finish){
      
      if ((start + 3) <= finish) start+= 3;
      
      else start++;
      
      jumps++;
    }

    return jumps;
  }
}