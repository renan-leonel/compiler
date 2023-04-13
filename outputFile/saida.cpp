#include <iostream>
int main() {
int x  = 1;
int y  = 3;
int a  = 1;
while(x<=y){
a = a*x;
x = x+1;
}
std::cout<<"O fatorial de ";
std::cout<<y;
std::cout<<"eh: ";
std::cout<<a;
std::cout<<"\n";
return 0;
}