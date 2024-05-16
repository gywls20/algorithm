import java.util.*;
class Solution {
    public String solution(String new_id) {
        String answer="";
        new_id=new_id.toLowerCase();//no1
        new_id=new_id.replaceAll("[^a-z0-9\\-_.]", ""); //no2
        
        
        String[] newid=new_id.split("");
        ArrayList<String> al = new ArrayList<>();
        
        for(int i=0; i<newid.length; i++){
            if(newid[i].equals(".")){
                for(int j=i+1; j<newid.length; j++){
                    if(newid[j].equals(".")){
                        newid[j]="";
                        
                    }else{
                        break;
                    }
                }
            }
            
        }//no3
        if(newid[0].equals(".")){
            newid[0]="";
        }
        if(newid[newid.length-1].equals(".")){
            newid[newid.length-1]="";
        }//no4
        for(int i=0 , count=0; i<newid.length; i++){
            if(newid[i].equals("")){
                count++;
            }
            if(count==newid.length){
                newid[0]="a";
            }
        }//no5
        
        //공백제거
        for(int i=0; i<newid.length; i++){
            if(!newid[i].equals("")){
                al.add(newid[i]);
            }
        }
        if(al.size()>=16){
            int num= al.size()-15;
            for(int i=1; i<=num; i++){
                al.remove(al.size()-1);
            }
        }
        if(al.get(al.size()-1).equals(".")){
                al.remove(al.size()-1);
            }
        //no6
        if(al.size()<=2){
            for(int i=al.size(); i<3; i++){
                al.add(al.get(al.size()-1));
            }
        }//no7
        System.out.println(al);
        for(int i=0; i<al.size(); i++){
            answer += al.get(i);
        }
        
        return answer;
    }
}
