class Solution {
    public int solution(String[] order) {
        
        int price = 0;
        
        for(int i=0; i<order.length; i++){
            switch(order[i]){
                case "iceamericano", "americanoice" -> price += 4500;
                case "hotamericano", "americanohot" -> price += 4500;
                case "icecafelatte", "cafelatteice" -> price += 5000;
                case "hotcafelatte", "cafelattehot" -> price += 5000;
                case "americano" -> price += 4500;
                case "cafelatte" -> price += 5000;
                case "anything" -> price += 4500;    
            }
        }
        
        return price;
        
    }
}