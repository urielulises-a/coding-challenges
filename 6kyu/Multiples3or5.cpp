inline int solution(int number) 
{
   unsigned int finalSum = 0;
  
  for (int i = 1; i < number; i++){
    
    if (i % 3 == 0 || i % 5 == 0)
      finalSum+= i; 
    
  }
  return finalSum;
}