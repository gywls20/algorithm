package programmers;

public class MBTI {
    class Solution {
        public static boolean tf=true;
        public String solution(String[] survey, int[] choices) {
            String answer = "";
            char[] result= new char[4];

            int[][] arr = new int [4][2];
            for(int i=0; i<survey.length; i++){
                if(choices[i]!=4){
                    arr[chS(survey[i])][chI2(choices[i])]+=chI(choices[i]);
                    // for(int[] l: arr ){
                    //     for(int j: l){
                    //         System.out.print(j);
                    //     }
                    //     System.out.println();
                    // }// test
                }
                System.out.println();
            }


            for(int i=0; i<4; i++){
                int L, R;
                L=arr[i][0];
                R=arr[i][1];

                if(i==0){
                    if(L>R){
                        result[0]='R';
                    }else if(L<R){
                        result[0]='T';
                    }else{
                        result[0]='R';
                    }
                }else if(i==1){
                    if(L>R){
                        result[1]='C';
                    }else if(L<R){
                        result[1]='F';
                    }else{
                        result[1]='C';
                    }
                }else if(i==2){
                    if(L>R){
                        result[2]='J';
                    }else if(L<R){
                        result[2]='M';
                    }else{
                        result[2]='J';
                    }
                }else if(i==3){
                    if(L>R){
                        result[3]='A';
                    }else if(L<R){
                        result[3]='N';
                    }else{
                        result[3]='A';
                    }
                }
            }

            for(char s: result){
                answer+=s;
            }

            return answer;

        }
        public static int chS (String s){
            int as=0;
            if(s.equals("RT") || s.equals("TR")){
                as=0;
                if(s.equals("TR")){
                    tf=false;
                }else{
                    tf=true;
                }
            }else if(s.equals("CF") || s.equals("FC")){
                as=1;
                if(s.equals("FC")){
                    tf=false;
                }else{
                    tf=true;
                }
            }else if(s.equals("JM") || s.equals("MJ")){
                as=2;
                if(s.equals("MJ")){
                    tf=false;
                }else{
                    tf=true;
                }
            }else if(s.equals("AN") || s.equals("NA")){
                as=3;
                if(s.equals("NA")){
                    tf=false;
                }else{
                    tf=true;
                }
            }
            return as;
        }
        public static int chI (int i){
            int ai=0;
            if(i==1 || i==7){
                ai=3;
            }else if(i==2 || i==6){
                ai=2;
            }else if(i==3 || i==5){
                ai=1;
            }else{
                ai=0;
            }
            return ai;
        }
        public static int chI2 (int i){
            int ai=0;
            if(tf){
                if(i<=3){
                    ai=0;
                }else if(i>=5){
                    ai=1;
                }
            }else{
                if(i<=3){
                    ai=1;
                }else if(i>=5){
                    ai=0;
                }
            }

            return ai;
        }
    }
}
