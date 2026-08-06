/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int st=1;
        int end=n;
        while(true){
            int m=st+(end-st)/2;

            int num=guess(m);
            if(num>0){
                st=m+1;
            }else if(num<0){
                end=m-1;
            }else{
                return m;
            }
        }

        
    }
}