class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int num = 0;
        String[] arr = polynomial.split(" ");
        
        for(String str : arr){
            if(str.equals("x")){
                x += 1; 
            }else if(str.contains("x")){
            x += Integer.valueOf(str.replace("x",""));
            }else if(!str.equals("+")) {
                num += Integer.valueOf(str);
            }
        }
        if(x == 0){
            return num + "";
        }else if(num == 0){
            return x == 1 ? "x" : x + "x";
        }else {
            return x == 1 ? "x + " + num : x + "x + " + num;
        }
    }
}