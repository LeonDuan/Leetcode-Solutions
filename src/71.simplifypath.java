class Solution {
    public String simplifyPath(String path) {
        if(path.charAt(path.length()-1) == '/' && !path.equals("/")){
            path = path.substring(1, path.length() - 1);
        }
        else{
            path = path.substring(1);
        }

        String[] dir = path.split("/");
        ArrayList<String> simResult = new ArrayList<>();

        for(int i = 0; i < dir.length; i++){
            String cur = dir[i];
            if(cur.equals(".") || cur.equals("")){

            }
            else if(cur.equals("..")){
                if(simResult.size() != 0) {
                    simResult.remove(simResult.size() - 1);
                }
            }
            else{
                simResult.add(cur);
            }
        }

        String result_str = "";
        for(String s : simResult){
            result_str = result_str + "/" + s ;
        }
        if(result_str.equals("")) return "/";
        return result_str;
    }
}