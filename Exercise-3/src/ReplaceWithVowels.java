public class ReplaceWithVowels {
   int numofplace;
   String[] namesofplaces;
   ReplaceWithVowels(int num,String[] name ){
    numofplace=num;
    namesofplaces=name;
   }
   public String[] afterRemovingVowel(){
       boolean value=false;
       for(int i=0;i<numofplace;i++) {
           String str = namesofplaces[i];
           str=str.toLowerCase().trim();
           for (int j = 0; j < str.length(); j++) {
               char c = str.charAt(j);
               if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                   str=str.replace(c+"","");
                   value=true;
               }
           }
           namesofplaces[i]=str;
       }
       if(value)
       return namesofplaces;
       return null;
   }
}
