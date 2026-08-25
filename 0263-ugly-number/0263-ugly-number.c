
// bool chkPrime(int n);
// bool isUgly(int n) {
//     int count=0;
//     if(n==1)
//         return true;
//     if(n<=0)
//         return false;
//     if(chkPrime(n)==true)
//     {
//         if(n==2 || n==3 ||n==5)
//             return true; 
//         else
//             return false;
//     }
//     for(int i=2;i<=n/2;i++){
//         if(n%i==0)
//         {
//             if(chkPrime(i)==true){
//                 if(i!=2&&i!=3&&i!=5)
//                     count++;}
//         }
//     }
//     return count==0;
// }
// bool chkPrime(int n){
//     int f=0;
//     for(int i=2;i<=n/2;i++){
//         if(n%i==0){
//             f=1;break;
//         }
//     }
//     return f==0;
// }
bool isUgly(int n){
    if(n<=0)
        return false;
    while(n%2==0)
        n/=2;
    while(n%3==0)
        n/=3;
    while(n%5==0)
        n/=5;
    return n==1;
}