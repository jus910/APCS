public clas xyzThere{
  public boolean xyzThere(String str) {
  for(int i=0;i<str.length()-2;i++){
    if ((str.substring(i,i+3)).equals("xyz")){
      if (i==0 || (str.substring(i-1,i).equals("."))==false ){
        return true;
      } 
    }
  }
  return false;
}

}
