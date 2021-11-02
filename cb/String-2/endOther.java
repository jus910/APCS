public clas endOther{
  public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  if (a.length()<b.length()){
    return endOther(b,a);
  } else {
    return a.substring(a.length()-b.length(),a.length()).equals(b);
  }
}
}
