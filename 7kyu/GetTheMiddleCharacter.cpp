std::string get_middle(std::string input) 
{
  // return the middle character(s)
  
  int length = input.length();
  int half = length/2;
  std::string letters;
  
 	return letters = !(length % 2) ? input.substr(half-1, 2):input.substr(half, 1); 

}