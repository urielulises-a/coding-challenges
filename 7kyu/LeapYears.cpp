bool IsLeapYear(int year){
  
  bool isLeap = false;
  
  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
    
    isLeap = true;
  }
   return isLeap;
}