#include <math.h>
bool narcissistic( int value ){
  
    std::string givenValue = std::to_string(value);
     
    int32_t digitSum = 0;

    for (int i = 0; i < givenValue.size(); i++){

        int32_t actualDigit = int32_t(givenValue.at(i)) - 48;
        digitSum+= pow(actualDigit, givenValue.size());

    }
  
  return (std::to_string(digitSum) == givenValue)? true : false;
  
}