class Solution {
    public int solution(int a, int b, int c, int d) {
        
        int answer = 0;
        
        if(a==b && b==c && c==d && d==a){
            answer = 1111*a;
        }
        
        if(a==b && b==c && c!=d){
            answer = (int)(Math.pow(10*a+d, 2));
        }else if(a==b && b==d && b!=c){
            answer = (int)(Math.pow(10*a+c, 2));
        }else if(b==c && c==d && a!=b){
            answer = (int)(Math.pow(10*b+a, 2));
        }else if(a==c && c==d && a!=b){
            answer = (int)(Math.pow(10*a+b, 2));
        }
        
        if(a==b && b!=c && c==d){
            if(a>c){
                answer = (a+c)*(a-c);
            }else{
                answer = (a+c)*(-a+c);
            }
        }else if(b==c && c!=d && d==a){
            if(b>d){
                answer = (b+d)*(b-d);
            }else{
                answer = (b+d)*(-b+d);
            }
        }else if(a==c && c!=b && b==d){
            if(a>b){
                answer = (a+b)*(a-b);
            }else{
                answer = (a+b)*(-a+b);
            }
        }
        
        if(a==b && b!=c && b!=d && c!=d){
            answer = c*d;
        }else if(b==c && c!=d && c!=a && d!=a){
            answer = a*d;
        }else if(c==d && d!=a && d!=b && a!=b){
            answer = a*b;
        }else if(a==c && c!=b && c!=d && b!=d){
            answer = b*d;
        }else if(b==d && d!=c && d!=a && a!=c){
            answer = a*c;
        }else if(a==d && d!=b && d!=c && c!=b) {
        	answer = b*c;
        }
        
        if(a!=b && a!=c && a!=d){
            if(b!=c && b!= d){
                if(c!=d){
                    if(a<b && a<c && a<d){
                        answer = a;
                    }else if(b<a && b<c && b<d){
                        answer = b;
                    }else if(c<a && c<b && c<d){
                        answer = c;
                    }else if(d<a && d<b && d<c){
                        answer = d;
                    }
                }
            }
        }
 
        return answer;
        
    }
}