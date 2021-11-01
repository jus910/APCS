public class catDog{
  public boolean catDog(String str) {
  int cat=0;
  int dog=0;
  for(int i=0;i<str.length()-2;i=i+1){
    if ((str.substring(i,i+3)).equals("cat")){
      cat++;
    } else if((str.substring(i,i+3)).equals("dog")){
      dog++;
    }
  }
  return cat==dog;
}
}
