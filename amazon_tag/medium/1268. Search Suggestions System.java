class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> result= new ArrayList<>();
        int length = 0;
        while(length<searchWord.length()){
            length++;
            result.add(match(searchWord.substring(0,length),products)); 
        }
        
        return result;
        
    }
    
    private List<String> match(String s, String[] products){
        int size = 0;
        List<String> ms = new ArrayList<>();
        for(String p:products){
            if(p.length()<s.length()){
                continue;
            }
            if(size<3&&(p.substring(0,s.length())).equals(s)){
                size++;
                ms.add(p);
            }
        }
        return ms;
    }
}
