#include <string>
bool solution(std::string const &str, std::string const &ending) {
  
  int long1 = str.length()-1, long2 = ending.length()-1;
  bool isEqual = true;
  
  for (int i = long1; i>=0; i--){
    
    if(str[i]!= ending[long2]){
      
      isEqual = false;
    } 
    long2--;
    
    if(long2<0){
      break;
    }
  }
  if (ending.size() == 0){
    
    isEqual = true;
  }
  return isEqual;
}