unsigned int countBits(unsigned long long n){
  //your code here
  int cont = 0;
  
  while (n!= 0){
    
    if (n % 2 == 1) cont++;
    n/= 2;
  }
  return cont;
}