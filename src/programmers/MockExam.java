class Solution {
    public int[] solution(int[] answers) {
        int[] answer;
        
        int[] arr1=new int[10000];
        int[] arr2=new int[10000];
        int[] arr3=new int[10000];
        int num1 =1;
        
        for(int i=0; i<10000; i++){
            arr1[i]=num1;
            if(num1==5){
                num1=1;
            }else{
                num1++;  
            }
        }
        int[] num2 ={2, 1, 2, 3, 2, 4, 2, 5};
        for(int i=0, j=0; i<10000; i++){
            arr2[i]=num2[j];
            if(j==7){
                j=0;
            }else{
                j++; 
            }
        }
        int[] num3 ={3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        for(int i=0, j=0; i<10000; i++){
            arr3[i]=num3[j];
            if(j==9){
                j=0;
            }else{
                j++;
            }
               
        }
        //System.out.println(arr1[9]+" 2="+arr2[9]+" 3="+arr3[9]);
        int ret1=0, ret2=0, ret3=0;
        for(int i=0; i<answers.length;i++){
            if(answers[i]==arr1[i]){
                ret1++;
            }
            if(answers[i]==arr2[i]){
                ret2++;
            }
            if(answers[i]==arr3[i]){
                ret3++;
            }
            
        }
        answer=new int[1];
        int max=ret1;
        if(ret1< ret2){
            max=ret2;
            if(max< ret3){ // 3
                answer[0]=3;
                return answer;
            }else if(max> ret3){ // 2
                answer[0]= 2;
                return answer;
            }else{ //2,3
                answer=new int[2];
                answer[0]= 2;
                answer[1]=3;
                return answer;
            }
        }else if(max>ret2){ //max = 1
            if(max < ret3){ // 3
                answer[0]= 3;
                return answer;
            }else if(max> ret3){ // 1
                answer[0]= 1;
                return answer;
            }else{ //1,3
                answer=new int[2];
                answer[0]= 1;
                answer[1]=3;
                return answer;
            }
        }else{ //1,2
            if(max< ret3){ // 3
                answer[0]= 3;
                return answer;
            }else if(max> ret3){ // 1,2
                answer=new int[2];
                answer[0]= 1;
                answer[1]=2;
                return answer;
            }else{ //1,2,3
                answer=new int[3];
                answer[0]= 1;
                answer[1]=2;
                answer[2]=3;
                return answer;
            }
        }
        
    }
}
